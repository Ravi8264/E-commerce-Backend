package com.example.Ecommerce.controller;
import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> get(@PathVariable int id) {
        return productService.get(id);
    }
    @GetMapping("/{id}/image")
    public Optional<Product> getImg(@PathVariable int id) {
        return productService.getImg(id);
    }
    @GetMapping("/search")
    public List<Product> find(@RequestParam("keyword") String keyword) {
        return productService.find(keyword);
    }
    @PostMapping
    public Product add(@RequestBody Product product) {
        return productService.add(product);
    }
    @PutMapping("/{id}")
    public Product upd(@PathVariable int id, @RequestBody Product product) {
        return productService.upd(id, product);
    }
    @DeleteMapping("/{id}")
    public void del(@PathVariable int id) {
        productService.del(id);
    }
}