package com.example.Car.Controller;

import com.example.Car.Model.Student;
import com.example.Car.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }

    @RequestMapping(value = "/getStudent" ,method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){

        Student student=studentService.fetchStudentById(id);

        if (student==null){
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(student);
        }
    }

}
