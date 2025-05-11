package com.example.Ecommerce.service;
import com.example.Ecommerce.model.Product;
import java.util.List;
import java.util.Optional;
public interface ProductService {
    List<Product> getAll();
    Optional<Product> get(int id);
    Optional<Product> getImg(int id);
    List<Product> find(String keyword);
    Product add(Product product);
    Product upd(int id, Product product);
    void del(int id);

}