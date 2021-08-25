package com.example.demo.service.impl;

import com.example.demo.dto.PyrusDto;
import com.example.demo.dto.ResultDto;
import com.example.demo.service.PyrusSerive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PyrusSeriveImpl implements PyrusSerive {


    @Override
    public ResultDto method(PyrusDto dto) {
        if (dto.isCreatePyrusTask()) {
            log.info("Заявка в Pyrus создана");
        } else {
            log.info("Заявка Pyrus не требуется");
        }
        return new ResultDto();
    }
}
