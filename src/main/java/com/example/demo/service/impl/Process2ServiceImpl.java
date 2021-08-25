package com.example.demo.service.impl;

import com.example.demo.dto.CalculateDto;
import com.example.demo.dto.PyrusDto;
import com.example.demo.service.ProcessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("Process2Service")
@Slf4j
public class Process2ServiceImpl implements ProcessService {

    @Override
    public PyrusDto process(CalculateDto dto) {
        log.info("Process2Service");
        return new PyrusDto(false);
    }
}
