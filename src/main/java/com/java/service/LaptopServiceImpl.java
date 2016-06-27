package com.java.service;

import com.java.model.Laptop;
import com.java.repository.LaptopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Shoaib on 2016-06-27.
 */
@Service
public class LaptopServiceImpl implements LaptopService {

  @Autowired
  private LaptopRepository laptopRepo;

  @Override
  public List<Laptop> getAllLapTop() {
    Laptop lap = new Laptop("MacBook Pro","i7 Fastest Ever");
    laptopRepo.save(lap);
    return laptopRepo.findAll();
  }
}
