package com.fm.rel.DailyCodeBufferTableRelation.repository;

import com.fm.rel.DailyCodeBufferTableRelation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
