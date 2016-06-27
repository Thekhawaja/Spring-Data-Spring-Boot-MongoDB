package com.java.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Shoaib on 2016-06-27.
 */

public class Laptop {

  @Id
  private String id;
  private String laptopName;
  private String laptopModel;

  public Laptop(String laptopName, String laptopModel) {
    this.laptopName = laptopName;
    this.laptopModel = laptopModel;
  }

  public String getLaptopName() {
    return laptopName;
  }

  public void setLaptopName(String laptopName) {
    this.laptopName = laptopName;
  }

  public String getLaptopModel() {
    return laptopModel;
  }

  public void setLaptopModel(String laptopModel) {
    this.laptopModel = laptopModel;
  }
}
