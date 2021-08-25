package com.example.demo.service;

import com.example.demo.dto.CalculateDto;
import com.example.demo.dto.PyrusDto;

public interface ProcessService {

    PyrusDto process(CalculateDto dto);
}
