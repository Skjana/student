package com.sgic.student.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.student.entities.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {

}
