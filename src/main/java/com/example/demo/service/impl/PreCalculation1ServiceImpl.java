package com.example.demo.service.impl;

import com.example.demo.dto.CalculateDto;
import com.example.demo.dto.TaskRequestDto;
import com.example.demo.service.PreCalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("PreCalculation1")
@Slf4j
public class PreCalculation1ServiceImpl implements PreCalculationService {

    @Override
    public CalculateDto calculate(TaskRequestDto task) {
        log.info("PreCalculation1");
        return new CalculateDto();
    }
}
