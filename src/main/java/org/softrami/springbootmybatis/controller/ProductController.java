package org.softrami.springbootmybatis.controller;

import lombok.RequiredArgsConstructor;
import org.softrami.springbootmybatis.model.Product;
import org.softrami.springbootmybatis.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productService.findById(id);
    }

    @PostMapping
    public int save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping("/{id}")
    public int update(@PathVariable("id") int id, @RequestBody Product product) {
        // Ensure the ID is set for the update
        return productService.update(product);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable("id") int id) {
        return productService.deleteById(id);
    }

}