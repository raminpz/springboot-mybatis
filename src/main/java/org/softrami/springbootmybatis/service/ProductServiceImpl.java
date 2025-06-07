package org.softrami.springbootmybatis.service;

import lombok.RequiredArgsConstructor;
import org.softrami.springbootmybatis.mapper.ProductMapper;
import org.softrami.springbootmybatis.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductMapper mapper;
    @Override
    public List<Product> findAll() {
        return mapper.findAll();
    }

    @Override
    public Product findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int save(Product product) {
        return mapper.insert(product);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteById(id);
    }

    @Override
    public int update(Product product) {
        return mapper.update(product);
    }
}
