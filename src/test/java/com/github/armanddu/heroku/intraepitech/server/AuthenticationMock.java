package com.github.armanddu.heroku.intraepitech.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthenticationMock {

  Logger logger = LoggerFactory.getLogger(getClass());

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String connect(@RequestParam("login") String login,
      @RequestParam("password") String password) {
    logger.info("connect request with params : " + login + "&" + password);
    if ("login_x".equals(login) && "azerty".equals(password)) {
     return IntraAuthenticationManager.getSuccessful();
    } else {
      logger.warn("failed to log " + login + "in");
      return IntraAuthenticationManager.getFailure();
    }
  }

  @RequestMapping(value = "/infos", method = RequestMethod.POST)
  public String infos(@RequestParam("token") String token) {
    logger.info("getInfos request with token : " + token);
    if (IntraMock.getToken().equals(token)) {
      return IntraInfoManager.getSuccessful();
    } else {
      logger.warn("invalid token: " + token);
      return IntraInfoManager.getFailure();
    }
  }
}
