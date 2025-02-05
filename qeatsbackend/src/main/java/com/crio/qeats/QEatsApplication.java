
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats;

import com.crio.qeats.globals.GlobalConstants;
import com.crio.qeats.repositoryservices.RestaurantRepositoryService;
import com.crio.qeats.repositoryservices.RestaurantRepositoryServiceDummyImpl;
import com.crio.qeats.repositoryservices.RestaurantRepositoryServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@Log4j2
public class QEatsApplication {

  public static void main(String[] args) {
    SpringApplication.run(QEatsApplication.class, args);

    // TIP:MODULE_RESTAPI: If your server starts successfully,
    // you can find the following message in the logs.
    log.info("Congrats! Your QEatsApplication server has started");
  }

  /**
   * Fetches a ModelMapper instance.
   *
   * @return ModelMapper
   */
  @Bean // Want a new obj every time
  @Scope("prototype")
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Bean // Want a new obj every time
  // @Scope("prototype")
  public RestaurantRepositoryService restaurantRepositoryService() {
    return new RestaurantRepositoryServiceImpl();
  }

}
