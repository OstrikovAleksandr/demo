package com.example.demo.service.impl;

import com.example.demo.dto.Pipeline;
import com.example.demo.dto.PreCalculationGroup;
import com.example.demo.dto.ProcessGroup;
import com.example.demo.dto.TaskRequestDto;
import com.example.demo.dto.TaskResponseDto;
import com.example.demo.service.PreCalculationService;
import com.example.demo.service.ProcessService;
import com.example.demo.service.PyrusSerive;
import com.example.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final Map<String, PreCalculationService> preCalculationServices;
    private final Map<String, ProcessService> processServices;
    private final PyrusSerive pyrusSerive;

    @Override
    public TaskResponseDto create(TaskRequestDto request) {
        Random random = new Random();

        long id = random.nextLong();

        new Thread(() -> {
            Pipeline pipeline = build(request);

            pipeline.execute(request);
        }).start();

        return new TaskResponseDto(id);
    }

    private Pipeline build(TaskRequestDto request) {
        PreCalculationGroup preCalculationGroup = PreCalculationGroup.of(request.getType());
        PreCalculationService preCalculationService = preCalculationServices.get(preCalculationGroup.getServiceName());

        ProcessGroup processGroup = ProcessGroup.of(request.getType());
        ProcessService processService = processServices.get(processGroup.getServiceName());

        return Pipeline.of(preCalculationService::calculate)
                .pipe(processService::process)
                .pipe(pyrusSerive::method);


    }
}
