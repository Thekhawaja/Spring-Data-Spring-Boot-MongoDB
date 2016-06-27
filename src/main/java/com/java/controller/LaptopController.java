package com.java.controller;

import com.java.repository.LaptopRepository;
import com.java.model.Laptop;
import com.java.service.LaptopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Shoaib on 2016-06-27.
 */
@RestController
public class LaptopController {

  @Autowired
  private LaptopService laptopService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Laptop> whatsMyName(){
    return laptopService.getAllLapTop();
  }
}
