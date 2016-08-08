package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.data.pojos.*;
import okhttp3.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.
 *
 */
public class EpitechActivityServiceIntegrationTest {

    private String token;
    private EpitechActivityService service;
    private Activity piscineDay1;

    @BeforeTest
    public void setup() throws IOException {
        ConfigIntegrationTest config = new ConfigIntegrationTest();
        token = config.getToken();
        service = config.getSercice(EpitechActivityService.class);

        piscineDay1 = new Activity();
        EventInfo event =  new EventInfo();
        piscineDay1.scholarYear = "2007";
        piscineDay1.moduleCode = "B-CPE-042";
        piscineDay1.instanceCode = "PAR-1-1";
        piscineDay1.activityCode = "acti-29";
        event.code = "event-0";
        piscineDay1.events = Collections.singletonList(event);
    }

    @AfterTest
    public void tearDown() {

    }

    @Test
    public void test_get_activities_with_valid_access_token_returns_data() throws IOException {
        Response<List<ActivitySearch>> response = service.searchActivities("2015-01-01", "2015-08-01", 1, token).execute();
        Assert.assertEquals(response.message(), "OK");
        Assert.assertNotNull(response.body());
    }

    @Test
    public void test_get_activity_with_access_token_returns_data() throws IOException {
        Response<Activity> response = service.getActivity(piscineDay1.scholarYear, piscineDay1.moduleCode,
                piscineDay1.instanceCode, piscineDay1.activityCode, token)
                .execute();
        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.body().activityCode, piscineDay1.activityCode);
    }

    @Test
    public void test_get_grade_for_registered_users_for_activity_with_access_token_returns_data() throws IOException {
        Response<List<ActivityGrade>> response = service.getRegisteredUsersGradeForActivity(piscineDay1.scholarYear, piscineDay1.moduleCode,
                piscineDay1.instanceCode, piscineDay1.activityCode, token)
                .execute();
        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void test_get_registered_users_for_activity_with_access_token_returns_data() throws IOException {
        Response<List<RegisteredUser>> response = service.getRegisteredUserForActivity(piscineDay1.scholarYear, piscineDay1.moduleCode,
                piscineDay1.instanceCode, piscineDay1.activityCode, token)
                .execute();
        Assert.assertTrue(response.isSuccessful());
    }

    @Test
    public void test_get_non_existing_event_from_activity_with_access_token_returns_error() throws IOException {
        Response<Event> response = service.getEvent(piscineDay1.scholarYear, piscineDay1.moduleCode,
                piscineDay1.instanceCode, piscineDay1.activityCode,
                piscineDay1.events.get(0).code, token)
                .execute();
        Assert.assertFalse(response.isSuccessful());
    }

    @Test
    public void test_post_token_with_access_token_it() throws IOException {
        Response<ResponseBody> response = service.postToken(piscineDay1.scholarYear, piscineDay1.moduleCode,
                piscineDay1.instanceCode, piscineDay1.activityCode, piscineDay1.events.get(0).code, "4242", token)
                .execute();
        Assert.assertFalse(response.isSuccessful());
    }
}