package com.productapp.service;

import com.productapp.dao.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();
    public Product getById(int id);
    public Product addProduct(Product product);
    public Product updateProduct(int id, Product product);
    public Product deleteProduct(int id);
}
