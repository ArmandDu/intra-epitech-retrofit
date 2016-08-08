package com.github.armanddu.heroku.intraepitech;

import java.io.IOException;

import com.github.armanddu.heroku.intraepitech.server.IntraMock;


public class InitTest {

  protected IntraMock mock;

  public void setUp() throws IOException {

    mock = new IntraMock();
    String[] args = new String[0];
    mock.start(args);
  }

  public void tearDown() {
    mock.stop();
  }

  public IntraMock getMock() {
    return mock;
  }

  public static class GetAsync<T> {
    T d = null;

    public void setData(T v) {
      d = v;
    }

    public T getData() {
      return d;
    }
  }

  public String getToken() {
    return IntraMock.getToken();
  }

}
