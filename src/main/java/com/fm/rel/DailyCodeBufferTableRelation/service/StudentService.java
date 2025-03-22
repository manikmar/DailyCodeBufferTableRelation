package com.fm.rel.DailyCodeBufferTableRelation.service;

import com.fm.rel.DailyCodeBufferTableRelation.entity.Student;
import com.fm.rel.DailyCodeBufferTableRelation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}
