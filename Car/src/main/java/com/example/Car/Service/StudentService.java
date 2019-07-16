package com.example.Car.Service;

import com.example.Car.Model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
