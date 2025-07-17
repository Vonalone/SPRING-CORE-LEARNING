package com.platform.spring_core_learning.repository;


import com.platform.spring_core_learning.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public void save(Student student){
        students.add(student);
    }
    public List<Student> findAll(){
        return Collections.unmodifiableList(students);
    }
}
