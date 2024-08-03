package com.springproject.springbootapplication.repository;

import com.springproject.springbootapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
