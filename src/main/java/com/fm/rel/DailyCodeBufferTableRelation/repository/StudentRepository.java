package com.fm.rel.DailyCodeBufferTableRelation.repository;

import com.fm.rel.DailyCodeBufferTableRelation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public List<Student> findByFirstName(String firstName);

    @Query(
            value="SELECT * FROM student s where s.email_address = :emailId",
            nativeQuery = true
    )
    public Student getStudentEmailAddressNativeNamedParam(@Param("emailId") String emailId);
}
