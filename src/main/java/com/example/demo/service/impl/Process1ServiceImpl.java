package com.example.demo.service.impl;

import com.example.demo.dto.CalculateDto;
import com.example.demo.dto.PyrusDto;
import com.example.demo.service.ProcessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("Process1Service")
@Slf4j
public class Process1ServiceImpl implements ProcessService {

    @Override
    public PyrusDto process(CalculateDto dto) {
        log.info("Process1Service");
        return new PyrusDto(true);
    }
}
