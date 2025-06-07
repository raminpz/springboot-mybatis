package org.softrami.springbootmybatis.service;

import org.softrami.springbootmybatis.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    Product findById(int id);
    int save(Product product);
    int deleteById(int id);
    int update(Product product);
}
