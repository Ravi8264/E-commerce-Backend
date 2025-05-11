package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Customer;
import com.example.Ecommerce.model.Login;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAll();

    Optional<Customer> get(Long id);

    Customer signin(Customer customer);

    Customer upd(Long id, Customer customer);

    void del(Long id);

    Customer findByEmail(String email);

    void login(Login login);
}