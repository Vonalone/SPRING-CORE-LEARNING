package com.platform.spring_core_learning.service;


import com.platform.spring_core_learning.domain.Student;
import com.platform.spring_core_learning.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository ;

    @Autowired
    public StudentService(StudentRepository studentRepository1){
        this.studentRepository = studentRepository1;
    }
    public void registerStudent(Student student){
        studentRepository.save(student);
    }
    public List<Student> ListStudents(){
        return studentRepository.findAll();
    }
}
