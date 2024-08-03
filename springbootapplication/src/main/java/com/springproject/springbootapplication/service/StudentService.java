package com.springproject.springbootapplication.service;

import com.springproject.springbootapplication.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    List<Student> saveStudentsInBulk(List<Student> students);
}
