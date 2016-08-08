package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.responses.EpitechLoginResponse;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created by armanddu on 04/08/16 for rest-epitech-client.
 *
 */
public class EpitechAuthenticationServiceIntegrationTest {

    private String token;
    private String login;
    private String password;
    private EpitechAuthenticationService service;

    @BeforeTest
    public void setup() throws IOException {
        ConfigIntegrationTest config = new ConfigIntegrationTest();
        token = config.getToken();
        login = config.getLogin();
        password = config.getPassword();
        service = config.getSercice(EpitechAuthenticationService.class);
    }

    @AfterTest
    public void tearDown() {

    }


    @Test
    public void test_connect_with_invalid_credentials_return_error() throws Exception {
        Response<EpitechLoginResponse> response = service.connect("invalid", "invalid").execute();
        Assert.assertNull(response.body());
        Assert.assertFalse(response.isSuccessful());
        Assert.assertEquals(response.message(), "Forbidden");
    }

    @Test
    public void test_connect_with_valid_credentials_return_success() throws Exception {
        Response<EpitechLoginResponse> response = service.connect(login, password).execute();
        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.body().message, "Success");
        Assert.assertEquals(response.body().login, login);
        Assert.assertNotNull(response.body().accessToken);
    }

    @Test
    public void test_valid_token_is_valid() throws IOException {
        Assert.assertTrue(service.isValid(token).execute().isSuccessful());
    }

    @Test
    public void test_invalid_token_is_not_valid() throws IOException {
        Assert.assertFalse(service.isValid("invalid or expired token").execute().isSuccessful());
    }
}