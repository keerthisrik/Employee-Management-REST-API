package com.example.demo.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.project.models.employee;
import com.example.demo.project.services.employeeService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200")
public class employeeController {
@Autowired
employeeService service;
private Object repo;
@PostMapping("/insert")
public employee addEmployee(@RequestBody employee e) {
	return this.service.addemp(e);
}
@DeleteMapping("/delete/{id}")
public String deleteemp(@PathVariable int id) {
	return this.service.deleteemp(id);
	
}
@GetMapping("/getAll")
public List<employee>getAll(){
	return this.service.getAll();
}
@GetMapping("/getbyid/{id}")
public Optional<employee> getById(@PathVariable int id) {
	return this.service.getById(id);
}
@PutMapping("/update")
public employee updateemp(@RequestBody employee e) {
	return this.service.updateemp(e);
}
@GetMapping("/getbyemail/{email}")
public employee getByEmail(@PathVariable String email) {
	return this.service.getByEmail(email);
}
}
