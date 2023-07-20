package com.example.students.Repository;

import com.example.students.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Iterable<Student> getStudentByFullName(String fullName);

}
