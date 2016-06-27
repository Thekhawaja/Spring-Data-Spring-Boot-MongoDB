package com.java.repository;

import com.java.model.Laptop;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by Shoaib on 2016-06-27.
 */

public interface LaptopRepository extends MongoRepository<Laptop, String> {

}
