package com.example.Ecommerce.service.imp;
import com.example.Ecommerce.model.Customer;
import com.example.Ecommerce.model.Enum.UserRole;
import com.example.Ecommerce.repository.CustomerRepository;
import com.example.Ecommerce.service.CustomerService;
import org.springframework.stereotype.Service;
import com.example.Ecommerce.model.Login;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {
    private CustomerRepository custRepo;

    CustomerServiceImp(CustomerRepository custRepo) {
        this.custRepo = custRepo;

    }

    @Override
    public List<Customer> getAll() {
        return custRepo.findAll();
    }

    @Override
    public Optional<Customer> get(Long id) {
        return custRepo.findById(id);
    }

    @Override
    public Customer signin(Customer customer) {
        List<UserRole> roles = new ArrayList<>();
        roles.add(UserRole.USER);
        customer.setRoles(roles);
        return custRepo.save(customer);
    }

    @Override
    public Customer upd(Long id, Customer customer) {
        customer.setId(id);
        return custRepo.save(customer);
    }

    @Override
    public void del(Long id) {
        custRepo.deleteById(id);
    }

    @Override
    public Customer findByEmail(String email) {
        return custRepo.findByEmailIgnoreCase(email);
    }

    @Override
    public void login(Login login) {
        // Customer customer = custRepo.findByEmail(login.getEmail());
        System.out.println(custRepo.findByEmailIgnoreCase(login.getEmail()));
        Customer customer = custRepo.findByEmailIgnoreCase(login.getEmail());
        System.out.println("customer   ++++++++++++  " + customer);
        if (customer != null && customer.getPassword().equals(login.getPassword())) {
            System.out.println("success log in.......");
        }
    }

}