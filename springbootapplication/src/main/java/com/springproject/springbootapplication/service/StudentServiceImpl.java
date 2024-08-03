package com.springproject.springbootapplication.service;

import com.springproject.springbootapplication.entity.Student;
import com.springproject.springbootapplication.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public List<Student> saveStudentsInBulk(List<Student> students) {
        return studentRepository.saveAll(students);
    }
}
