package com.mySpringCRUDProject.demo.Repo;

import com.mySpringCRUDProject.demo.model.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface StudentRepo extends JpaRepository<StudentInfo, Integer> {



}
