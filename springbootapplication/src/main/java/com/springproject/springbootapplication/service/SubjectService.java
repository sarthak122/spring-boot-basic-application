package com.springproject.springbootapplication.service;

import com.springproject.springbootapplication.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SubjectService {

    Subject saveSubject(Subject subject);
    List<Subject> getAllSubjects();
    List<Subject> saveSubjectsInBulk(List<Subject> subjects);
    List<Subject> findSubjectsByIds(List<Long> ids);

}
