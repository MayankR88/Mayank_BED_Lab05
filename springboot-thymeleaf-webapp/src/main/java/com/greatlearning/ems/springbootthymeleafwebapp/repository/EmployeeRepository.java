package com.greatlearning.ems.springbootthymeleafwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.ems.springbootthymeleafwebapp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}