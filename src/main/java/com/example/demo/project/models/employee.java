package com.example.demo.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
@Email
private String email;
@Size(min = 4,max = 8)
private String password;
private long mobilenumber;

}
