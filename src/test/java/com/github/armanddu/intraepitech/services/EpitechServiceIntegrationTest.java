package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.pojos.Dashboard;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by armanddu on 05/08/16 for rest-epitech-client.
 *
 */
public class EpitechServiceIntegrationTest {

    private String token;
    private String login;
    private EpitechService service;

    @BeforeTest
    public void setup() throws IOException {
        ConfigIntegrationTest config = new ConfigIntegrationTest();
        token = config.getToken();
        login = config.getLogin();
        service = config.getSercice(EpitechService.class);
    }

    @AfterTest
    public void tearDown() {

    }

    @Test
    public void test_get_home_with_valid_access_token_returns_data() throws IOException {
        Response<Dashboard> response = service.dashboard(token).execute();
        Assert.assertEquals(response.message(), "OK");
        Assert.assertEquals(response.body().user.login, login);
    }

}