package com.fm.rel.DailyCodeBufferTableRelation.controller;

import com.fm.rel.DailyCodeBufferTableRelation.entity.Student;
import com.fm.rel.DailyCodeBufferTableRelation.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        logger.info("saveStudent");
        Student studentData = studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentData);
    }
}
