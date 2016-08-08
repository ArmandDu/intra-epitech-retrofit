package com.github.armanddu.heroku.intraepitech.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.armanddu.heroku.intraepitech.response.IntraSusie;

@RestController
public class SusieMock {

  Logger logger = LoggerFactory.getLogger(getClass());


  @RequestMapping(value = "/susies", method = RequestMethod.GET)
  public String getAllSusies(@RequestParam("token") String token,
      @RequestParam("start") String start, @RequestParam("end") String end,
      @RequestParam("get") String type) {
    logger.info("getAllSusies request with token : " + token);
    if (IntraMock.getToken().equals(token)) {
      return IntraSusieManager.getSuccessful();
    } else {
      logger.warn("invalid token: " + token);
      return IntraSusieManager.getFailure();
    }
  }

  @RequestMapping(value = "/susie", method = RequestMethod.GET)
  public IntraSusie getSusie(@RequestParam("token") String token, @RequestParam("id") int id) {
    if (IntraMock.getToken().equals(token)) {
      logger.warn("getSusie request with token: " + token + " and id: " + id);
      IntraSusie susie = new IntraSusie();
      switch (id) {
        case 42:
          logger.info("returning susie with id 42");
          susie.setId(42);
          susie.setColor("bitter");
          susie.setDescription("Bring us pint of beer");
          susie.setDuration("42");
          return susie;

        default:
          logger.warn("invalid id: " + id);
          return susie;
      }
    }
    logger.warn("invalid token: " + token);
    return null;
  }

}
