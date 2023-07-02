package com.hakan.kodluyoruz.repository;


import com.hakan.kodluyoruz.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity,Long> {

}
