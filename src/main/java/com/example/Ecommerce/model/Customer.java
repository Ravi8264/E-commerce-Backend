package com.example.Ecommerce.model;

import com.example.Ecommerce.model.Enum.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String mobile;
    List<UserRole> roles;
    public Customer(String name, String email, String password, String mobile, List<UserRole> roles) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.roles = roles;
    }




}
