package com.fm.rel.DailyCodeBufferTableRelation.service;

import com.fm.rel.DailyCodeBufferTableRelation.entity.Student;
import com.fm.rel.DailyCodeBufferTableRelation.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        logger.info("saveStudent service");
        return studentRepository.save(student);
    }

    public List<Student> getStudentByFirstName(String firstName){
        List<Student> firstNameList = studentRepository.findByFirstName(firstName);
        logger.info("firstNameList {}",firstNameList);
        return firstNameList;
    }

    public Student getStudentEmailAddress(String emailId){
        logger.info("getStudentEmailAddress ");
        return studentRepository.getStudentEmailAddressNativeNamedParam(emailId);
    }
}
