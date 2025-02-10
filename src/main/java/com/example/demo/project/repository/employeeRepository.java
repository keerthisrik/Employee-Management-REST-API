package com.example.demo.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.project.models.employee;
@Repository
public interface employeeRepository extends CrudRepository<employee, Integer> {

	employee getByEmail(String email);

	

}
