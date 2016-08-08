package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.pojos.User;
import com.github.armanddu.intraepitech.data.pojos.UserGrade;
import com.github.armanddu.intraepitech.data.pojos.UserModuleSummary;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client
 * .
 */
public class EpitechUserServiceTest {

    private String token;
    private EpitechUserService service;
    private String login;

    @BeforeTest
    public void setup() throws IOException {
        TestConfig config = new TestConfig();
        token = config.getToken();
        login = config.getLogin();
        service = config.getSercice(EpitechUserService.class);
    }

    @AfterTest
    public void tearDown() {

    }


    @Test
    public void test_get_me_with_valid_access_token_returns_data() throws IOException {
        Response<User> response = service.me(token).execute();
        Assert.assertEquals(response.message(), "OK");
        Assert.assertEquals(response.body().login, login);
    }

    @Test
    public void test_get_user_me_with_valid_access_token_returns_data() throws IOException {
        Response<User> response = service.getUser(login, token).execute();
        Assert.assertEquals(response.message(), "OK");
        Assert.assertEquals(response.body().login, login);
    }

    @Test
    public void test_get_user_with_valid_access_token_returns_data() throws IOException {
        Response<User> response = service.getUser("ol", token).execute();
        Assert.assertEquals(response.message(), "OK");
        Assert.assertEquals(response.body().login, "ol");
        Assert.assertEquals(response.body().email, "olivier.crouzet@epitech.eu");
        Assert.assertEquals(response.body().firstName, "olivier");
        Assert.assertEquals(response.body().lastName, "crouzet");
        Assert.assertEquals(response.body().title, "olivier crouzet");
        Assert.assertFalse(response.body().admin);
        Assert.assertFalse(response.body().close);
    }

    @Test
    public void test_get_user_modules_with_valid_access_token_returns_data() throws IOException {
        Response<UserModuleSummary> response = service.getMyPastModules(token).execute();
        Assert.assertEquals(response.message(), "OK");
        Assert.assertNotNull(response.body().modules);
    }

    @Test
    public void test_get_user_grades_with_valid_access_token_returns_data() throws IOException {
        Response<UserGrade> response = service.getMyGrades(token).execute();
        Assert.assertEquals(response.message(), "OK");
        Assert.assertNotNull(response.body().grades);
    }
}