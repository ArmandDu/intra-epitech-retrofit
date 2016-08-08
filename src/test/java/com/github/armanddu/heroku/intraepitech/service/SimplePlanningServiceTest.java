package com.github.armanddu.heroku.intraepitech.service;

import com.github.armanddu.heroku.intraepitech.InitTest;
import com.github.armanddu.heroku.intraepitech.InitTest.GetAsync;
import com.github.armanddu.heroku.intraepitech.response.IntraPlanningEntry;
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

public class SimplePlanningServiceTest {


    private InitTest config;
    private PlanningService service;
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
        service = adapter.create(PlanningService.class);
    }

    @AfterClass
    public void tearDown() {
        config.tearDown();
    }

    @Test
    public void getPlanning() throws InterruptedException {
        cdl = new CountDownLatch(1);
        final GetAsync<List<IntraPlanningEntry>> ga = new GetAsync<>();
        service.getPlanning(token, "2015-01-01", "2015-01-31", new Callback<List<IntraPlanningEntry>>() {

            @Override
            public void success(List<IntraPlanningEntry> t, Response response) {
                ga.setData(t);
                System.err.println(response.getBody());
                cdl.countDown();
            }

            @Override
            public void failure(RetrofitError error) {
                ga.setData(null);
                System.err.println(error);
                cdl.countDown();
            }
        });
        cdl.await(5, TimeUnit.SECONDS);
        List<IntraPlanningEntry> data = ga.getData();
        Assert.assertNotNull(data);
        Assert.assertEquals(data.size(), 1);
        IntraPlanningEntry entry = data.get(0);
        Assert.assertNotNull(entry);
        Assert.assertEquals(entry.getActivityCode(), "String");
        Assert.assertEquals(entry.getActivityTitle(), "String");
        Assert.assertEquals(entry.getCodeEvent(), "String");
        Assert.assertEquals(entry.getCodeType(), "String");
        Assert.assertEquals(entry.getDates(), null);
        Assert.assertEquals(entry.getEnd(), "String");
        Assert.assertEquals(entry.getEventNumber(), "0");
        Assert.assertEquals(entry.getEventRegistered(), null);
        Assert.assertEquals(entry.getLocation(), "String");
        Assert.assertEquals(entry.getIsRdv(), "String");
        Assert.assertEquals(entry.getNbHours(), "String");
        Assert.assertEquals(entry.getScolarYear(), "String");
        Assert.assertEquals(entry.getSemester(), 0);
        Assert.assertEquals(entry.getStart(), "String");
        Assert.assertEquals(entry.getTitle(), null);
        Assert.assertEquals(entry.getType(), "String");
        Assert.assertEquals(entry.getTotalRegisteredStudents(), 0);
    }

    @Test
    public void postToken() {
        // TODO
    }
}
