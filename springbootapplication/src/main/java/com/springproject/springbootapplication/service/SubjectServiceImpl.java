package com.springproject.springbootapplication.service;

import com.springproject.springbootapplication.entity.Subject;
import com.springproject.springbootapplication.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService{
    @Autowired
    SubjectRepo subjectRepository;
    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
    @Override
    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subject> saveSubjectsInBulk(List<Subject> subjects) {
        return subjectRepository.saveAll(subjects);
    }
    @Override
    public List<Subject> findSubjectsByIds(List<Long> ids) {
        return subjectRepository.findAllById(ids);
    }
}
