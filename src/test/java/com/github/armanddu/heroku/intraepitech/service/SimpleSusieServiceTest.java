package com.github.armanddu.heroku.intraepitech.service;

import com.github.armanddu.heroku.intraepitech.InitTest;
import com.github.armanddu.heroku.intraepitech.InitTest.GetAsync;
import com.github.armanddu.heroku.intraepitech.response.IntraSusie;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class SimpleSusieServiceTest {

  private InitTest config;
  private SusieService service;
  private String token;
  private CountDownLatch cdl;

  @BeforeClass
  public void setUp() throws IOException {
    config = new InitTest();

    config.setUp();
    token = config.getToken();
    RestAdapter adapter =
            new RestAdapter.Builder()
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setEndpoint(config.getMock().getPath())
                    .build();
    service = adapter.create(SusieService.class);
  }

  @AfterClass
  public void tearDown() {
    config.tearDown();
  }

  @Test
  public void getAll() throws InterruptedException {

    cdl = new CountDownLatch(1);
    final GetAsync<List<IntraSusie>> ga = new GetAsync<>();
    service.getAll(token, "2015-01-01", "2015-01-31", "all", new Callback<List<IntraSusie>>() {

      @Override
      public void success(List<IntraSusie> t, Response response) {
        ga.setData(t);
        cdl.countDown();
      }

      @Override
      public void failure(RetrofitError error) {
        ga.setData(null);
        cdl.countDown();
      }
    });
    cdl.await(5, TimeUnit.SECONDS);
    List<IntraSusie> data = ga.getData();
    Assert.assertNotNull(data);
    Assert.assertEquals(data.size(), 2);
  }

  @Test
  public void getById() throws InterruptedException {
    cdl = new CountDownLatch(1);
    final GetAsync<IntraSusie> ga = new GetAsync<>();
    service.getById(token, 42, new Callback<IntraSusie>() {

      @Override
      public void success(IntraSusie t, Response response) {
        ga.setData(t);
        cdl.countDown();
      }

      @Override
      public void failure(RetrofitError error) {
        ga.setData(null);
        cdl.countDown();
      }
    });
    cdl.await(5, TimeUnit.SECONDS);
    IntraSusie data = ga.getData();
    Assert.assertNotNull(data);
    Assert.assertEquals(data.getId(), 42);
    Assert.assertEquals(data.getDescription(), "Bring us pint of beer");
    Assert.assertEquals(data.getColor(), "bitter");
    Assert.assertEquals(data.getDuration(), "42");
    // TODO and so on ...
  }

  @Test
  public void subscribe() {
    // TODO
  }

  @Test
  public void unsubscribe() {
    // TODO
  }
}
