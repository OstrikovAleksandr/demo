package com.example.demo.service;

import com.example.demo.dto.TaskRequestDto;
import com.example.demo.dto.TaskResponseDto;

public interface TaskService {

    TaskResponseDto create(TaskRequestDto request);
}
