package com.njha.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // @Query("SELECT s from Student s WHERE s.email = ?1") // no need to specify this query
    Optional<Student> findStudentByEmail(String email);
}
