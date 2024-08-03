package com.springproject.springbootapplication.restcontroller;

import com.springproject.springbootapplication.DTO.StudentDTO;
import com.springproject.springbootapplication.entity.Student;
import com.springproject.springbootapplication.entity.Subject;
import com.springproject.springbootapplication.service.StudentService;
import com.springproject.springbootapplication.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @Autowired
    SubjectService subjectService;
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setAddress(studentDTO.getAddress());
        List<Subject> subjects = subjectService.findSubjectsByIds(studentDTO.getSubjectIds());
        student.setSubjects(new ArrayList<>(subjects));
        Student savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PostMapping("/bulk")
    public ResponseEntity<List<Student>> createStudentsInBulk(@RequestBody List<StudentDTO> studentBulkDTOs) {
        List<Student> students = new ArrayList<>();
        for (StudentDTO studentBulkDTO : studentBulkDTOs) {
            Student student = new Student();
            student.setName(studentBulkDTO.getName());
            student.setAddress(studentBulkDTO.getAddress());

            List<Subject> subjects = subjectService.findSubjectsByIds(studentBulkDTO.getSubjectIds());
            student.setSubjects(new ArrayList<>(subjects));

            students.add(student);
        }
        List<Student> savedStudents = studentService.saveStudentsInBulk(students);
        return new ResponseEntity<>(savedStudents, HttpStatus.CREATED);
    }

}
