package com.github.armanddu.heroku.intraepitech.server;

public class IntraAuthenticationManager {

    public static String getSuccessful() {
        return String.format("{\"token\": \"%s\"}", IntraMock.getToken());
    }

    public static String getFailure() {
        return null;
    }


}
