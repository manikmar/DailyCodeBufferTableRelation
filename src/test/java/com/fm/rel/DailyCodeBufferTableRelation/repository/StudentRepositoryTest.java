package com.fm.rel.DailyCodeBufferTableRelation.repository;

import com.fm.rel.DailyCodeBufferTableRelation.entity.Guardian;
import com.fm.rel.DailyCodeBufferTableRelation.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    /*@Test
    public void saveStudent(){
        Guardian guardian = Guardian.builder()
                .name("alen")
                .mobile("7205954211")
                .email("alen@gmail.com")
                .build();
        Student student = Student.builder()
                .firstName("smith")
                .lastName("yonu")
                .emailId("smith1@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }*/
}