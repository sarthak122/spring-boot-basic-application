package com.springproject.springbootapplication.restcontroller;

import com.springproject.springbootapplication.entity.Subject;
import com.springproject.springbootapplication.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
        Subject savedSubject = subjectService.saveSubject(subject);
        return new ResponseEntity<>(savedSubject, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Subject>> getAllSubjects() {
        List<Subject> subjects = subjectService.getAllSubjects();
        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }
    @PostMapping("/bulk")
    public ResponseEntity<List<Subject>> createSubjectsInBulk(@RequestBody List<Subject> subjects) {
        List<Subject> savedSubjects = subjectService.saveSubjectsInBulk(subjects);
        return new ResponseEntity<>(savedSubjects, HttpStatus.CREATED);
    }
}
