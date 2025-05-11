package com.example.Ecommerce.service.imp;
import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.repository.ProductRepository;
import com.example.Ecommerce.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImp implements ProductService {
    private ProductRepository prodRepo;
    ProductServiceImp(ProductRepository prodRepo) {
        this.prodRepo = prodRepo;
    }
    @Override
    public List<Product> getAll() {
        return prodRepo.findAll();
    }
    @Override
    public Optional<Product> get(int id) {
        return prodRepo.findById(id);
    }
    @Override
    public Optional<Product> getImg(int id) {
        return prodRepo.findById(id);
    }
    @Override
    public List<Product> find(String keyword) {
        return prodRepo.find(keyword);
    }

    @Override
    public Product add(Product product) {
        return prodRepo.save(product);
    }
    @Override
    public Product upd(int id, Product product) {
        product.setId(id);
        return prodRepo.save(product);
    }
    @Override
    public void del(int id) {
        prodRepo.deleteById(id);
    }
}