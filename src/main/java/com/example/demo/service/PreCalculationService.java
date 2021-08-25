package com.example.demo.service;

import com.example.demo.dto.CalculateDto;
import com.example.demo.dto.TaskRequestDto;

public interface PreCalculationService {

    CalculateDto calculate(TaskRequestDto task);
}
