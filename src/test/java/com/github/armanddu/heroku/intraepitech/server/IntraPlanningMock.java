package com.github.armanddu.heroku.intraepitech.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntraPlanningMock {

  @RequestMapping(value = "/planning", method = RequestMethod.GET)
  public String getPlanning(@RequestParam("token") String token,
      @RequestParam("start") String start, @RequestParam("end") String end) {
    if (IntraMock.getToken().equals(token)) {
      return IntraPlanningManager.getSuccessful();
    } else {
      return IntraPlanningManager.getFailure();
    }
  }

  @RequestMapping(value = "/token", method = RequestMethod.POST)
  public String postToken(@RequestParam("token") String token/* TODO and so on ... */) {
    if (IntraMock.getToken().equals(token)) {
      // TODO return success
    } else {
      // TODO return failure
    }
    return null;
  }
}
