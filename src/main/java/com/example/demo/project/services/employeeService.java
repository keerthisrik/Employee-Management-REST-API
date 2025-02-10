package com.example.demo.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.project.models.employee;
import com.example.demo.project.repository.employeeRepository;

@Service
public class employeeService {
@Autowired
employeeRepository repo;
public employee addemp(employee e) {
	return this.repo.save(e);
}
public String deleteemp(int id) {
	this.repo.deleteById(id);
	return "deleted successfully: "+ id;
}
public List<employee>getAll(){
	return (List<employee>) this.repo.findAll();
}
public Optional<employee> getById(int id) {
	return this.repo.findById(id);
}
public employee updateemp(employee e) {
	int id=e.getId();
	employee emp=repo.findById(id).get();
	emp.setName(e.getName());
	emp.setEmail(e.getEmail());
	emp.setMobilenumber(e.getMobilenumber());
	emp.setPassword(e.getPassword());
	return this.repo.save(emp);
}
public employee getByEmail(String email) {
	return this.repo.getByEmail(email);
}
}

