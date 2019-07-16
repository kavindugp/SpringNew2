package com.example.Car.Service;

import com.example.Car.Model.Student;
import com.example.Car.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {

        return studentRepository.save(student);
    }

    public Student fetchStudentById(int id){

       Optional<Student> student= studentRepository.findById(id);

       if (student.isPresent()){
           return student.get();

       }
       else
           return null;
    }
}
