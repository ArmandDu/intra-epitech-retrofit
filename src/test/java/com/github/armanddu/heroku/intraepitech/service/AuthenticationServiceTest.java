package com.github.armanddu.heroku.intraepitech.service;

import com.github.armanddu.heroku.intraepitech.InitTest;
import com.github.armanddu.heroku.intraepitech.response.IntraInfo;
import com.github.armanddu.heroku.intraepitech.response.LoginResponse;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AuthenticationServiceTest {


    public static final String HTTP_LOCALHOST_8080 = "http://localhost:8080/";
    private AuthenticationService service;
    private String token = null;
    private CountDownLatch cdl;
    private InitTest config;

    @BeforeClass
    public void setUp() throws IOException {
        config = new InitTest();
        config.setUp();
        RestAdapter adapter =
                new RestAdapter.Builder()
                        .setLogLevel(RestAdapter.LogLevel.FULL)
                        .setEndpoint(HTTP_LOCALHOST_8080)
                        .build();

        service = adapter.create(AuthenticationService.class);
    }

    @AfterClass
    public void tearDown() {
        config.tearDown();
    }

    @Test
    public void connect() throws InterruptedException {
        cdl = new CountDownLatch(1);

        service.connect("login_x", "azerty", new Callback<LoginResponse>() {

            @Override
            public void success(LoginResponse t, Response response) {
                token = t.getToken();
                cdl.countDown();
            }

            @Override
            public void failure(RetrofitError error) {
                token = null;
                cdl.countDown();
            }
        });
        cdl.await(5, TimeUnit.SECONDS);
        Assert.assertEquals(token, config.getToken());
    }

    @Test
    public void getInfos() throws InterruptedException {
        cdl = new CountDownLatch(1);

        final InitTest.GetAsync<IntraInfo> gt = new InitTest.GetAsync<>();

        service.getInfos(config.getToken(), new Callback<IntraInfo>() {

            @Override
            public void success(IntraInfo t, Response response) {
                gt.setData(t);
                cdl.countDown();
            }

            @Override
            public void failure(RetrofitError error) {
                gt.setData(null);
                cdl.countDown();
            }
        });
        cdl.await(5, TimeUnit.SECONDS);
        IntraInfo data = gt.getData();
        Assert.assertNotNull(data);
        Assert.assertEquals(data.getIp(), "String");
        Assert.assertNull(data.getMessage());
        Assert.assertNotNull(data.getBoard());
    }

}
