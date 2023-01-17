package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.models.PostStudentRequestDto;
import com.example.demo.models.PostStudentResponseDto;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public PostStudentResponseDto createStudent(PostStudentRequestDto requestDto) {
        if (requestDto.getName() == null) {
            throw new RuntimeException(" mandatory field name is missing");
        }
        Student student = new Student();
        student.setId(requestDto.getId());
        student.setName(requestDto.getName());
        student.setGmail(requestDto.getGmail());
        Student responseEntity = studentRepository.save(student);
        PostStudentResponseDto studentResponseDto = new PostStudentResponseDto();
        studentResponseDto.setId(responseEntity.getId());
        studentResponseDto.setName(responseEntity.getName());
        studentResponseDto.setGmail(responseEntity.getGmail());
        return studentResponseDto;
    }
}
