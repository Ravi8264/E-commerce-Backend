package com.example.Ecommerce.controller;
import com.example.Ecommerce.model.Customer;
import com.example.Ecommerce.model.Login;
import com.example.Ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService custService;
    @GetMapping("/all")
    public List<Customer> getAll() {
        return custService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Customer> get(@PathVariable Long id) {
        return custService.get(id);
    }
    @PostMapping("/signin")
    public Customer signin(@RequestBody Customer customer) {
        return custService.signin(customer);
    }
    @PostMapping("/login")
   public void login(@RequestBody Login login){
        custService.login(login);
    }
    @PutMapping("/{id}")
    public Customer upd(@PathVariable Long id, @RequestBody Customer customer) {
        return custService.upd(id, customer);
    }
    @DeleteMapping("/{id}")
    public void del(@PathVariable Long id) {
        custService.del(id);
    }
    @GetMapping("/email/{email}")
    public Customer getByEmail(@PathVariable String email) {
        return custService.findByEmail(email);
    }

}