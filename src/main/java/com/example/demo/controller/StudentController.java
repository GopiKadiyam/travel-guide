package com.example.demo.controller;


import com.example.demo.models.PostStudentRequestDto;
import com.example.demo.models.PostStudentResponseDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentServiceImpl;

    @PostMapping("/student")
    public PostStudentResponseDto createStudent(@RequestBody PostStudentRequestDto requestDto){
        return studentServiceImpl.createStudent(requestDto);
    }
}
