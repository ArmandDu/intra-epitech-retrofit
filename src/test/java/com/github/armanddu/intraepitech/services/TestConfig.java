package com.github.armanddu.intraepitech.services;

import com.github.armanddu.intraepitech.config.AcceptJson;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by armanddu on 06/08/16 for rest-epitech-client.

 */

public class TestConfig {

    private static final String DEFAULT_URL = "https://intra.epitech.eu";
    public static final Path PATH = Paths.get("./resource/.intra.passwd");
    private String login;
    private String password;
    private String token;
    private Retrofit retrofit;

    public TestConfig() throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new AcceptJson())
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(DEFAULT_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .client(client)
                .build();

        String[] file = new String(Files.readAllBytes(PATH)).split(":");
        login = file[0];
        password = file[1];
        token = file[2];

        EpitechAuthenticationService authenticationService = retrofit.create(EpitechAuthenticationService.class);
        if (!authenticationService.isValid(token).execute().isSuccessful()) {
            token = authenticationService
                    .connect(login, password)
                    .execute()
                    .body()
                    .accessToken;
            Files.write(PATH, (login + ":" + password + ":" + token).getBytes());
        }
    }

    public String getToken() {
        return token;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public <T> T getSercice(Class<T> service) {
        return retrofit.create(service);
    }
}
