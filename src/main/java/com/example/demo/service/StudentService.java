package com.example.demo.service;

import com.example.demo.models.PostStudentRequestDto;
import com.example.demo.models.PostStudentResponseDto;

public interface StudentService {
    PostStudentResponseDto createStudent(PostStudentRequestDto requestDto);
}
