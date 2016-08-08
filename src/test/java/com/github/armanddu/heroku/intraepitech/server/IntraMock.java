package com.github.armanddu.heroku.intraepitech.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableAutoConfiguration
@RestController
public class IntraMock {

  private static final String TOKEN = "42421337";
  private ApplicationContext context = null;

  private final Logger logger = LoggerFactory.getLogger(getClass());

  public void start(String[] args) {
    logger.info("starting server...");
    context = SpringApplication.run(IntraMock.class, args);
    logger.info("server started");
  }

  public void stop() {
    if (context != null) {
      ExitCodeGenerator exit = () -> 0;
      logger.info("stopping server...");
      SpringApplication.exit(context, exit);
      logger.info("server stopped");
    }
  }


  @RequestMapping(value = "/")
  public String home() {
    return "mock intra epitech";
  }

  public static String getToken() {
    return IntraMock.TOKEN;
  }

  public String getPath() {
    return "http://localhost:8080/";
  }

  public static void main(String[] args) {
    SpringApplication.run(IntraMock.class, args);
  }

}
