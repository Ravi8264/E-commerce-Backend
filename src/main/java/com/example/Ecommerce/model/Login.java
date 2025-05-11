package com.example.Ecommerce.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    private String email;
    private String password;
}
