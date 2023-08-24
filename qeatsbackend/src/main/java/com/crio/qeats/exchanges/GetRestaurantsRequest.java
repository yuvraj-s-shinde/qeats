/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetRestaurantsRequest {

  @NotNull
  @Max(90)
  @Min(-90)
  Double latitude;

  @NotNull
  @Max(180)
  @Min(-180)
  Double longitude;


    // @JsonProperty("searchFor")
  String searchFor = "";
        // private String searchFor;

  public GetRestaurantsRequest(double latitude, double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }
}

