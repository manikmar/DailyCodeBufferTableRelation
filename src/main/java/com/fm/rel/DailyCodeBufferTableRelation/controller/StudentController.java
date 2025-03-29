package com.fm.rel.DailyCodeBufferTableRelation.controller;

import com.fm.rel.DailyCodeBufferTableRelation.entity.Student;
import com.fm.rel.DailyCodeBufferTableRelation.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        logger.info("saveStudent {}",student);
        Student studentData = studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentData);
    }

    @GetMapping("/getStudentsByName/{firstName}")
    public ResponseEntity<List<Student>> getStudentsByFirstName(@PathVariable String firstName) {
        logger.info("firstName {}", firstName);
        List<Student> studentByFirstNameList = studentService.getStudentByFirstName(firstName);
        if (studentByFirstNameList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);  // Return 204 if no students are found
        }
        return new ResponseEntity<>(studentByFirstNameList, HttpStatus.OK);  // Return 200 OK with the list of students
    }

    @GetMapping("/getStudentsByEmail/{mailId}")
    public ResponseEntity<Student> getStudentsByMailId(@PathVariable String mailId) {
        logger.info("mailId {}", mailId);
        Student student = studentService.getStudentEmailAddress(mailId);

        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

}
