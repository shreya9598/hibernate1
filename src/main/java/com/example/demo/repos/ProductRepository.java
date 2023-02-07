package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;


//public interface ProductRepository extends CrudRepository<Product, Integer>{
//
//    List<Product> findByName(String name);
//    List<Product> findByNameAndDesc(String name, String desc);
//    List<Product> findByPriceGreaterThan(String price);
//
//
//
//}
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    List<Product> findByName(String name);
    List<Product> findByNameAndDesc(String name, String desc);
    List<Product> findByPriceGreaterThan(String price);



}