package com.example.demo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Getter
public enum ProcessGroup {

    GROUP_1(Stream.of("HALVA", "CREDIT").collect(Collectors.toSet()), "Process2Service"),
    GROUP_2(Stream.of("COMMISSIONS").collect(Collectors.toSet()), "Process1Service");

    private final Set<String> types;
    private final String serviceName;

    public static ProcessGroup of(String type) {
        return Arrays.stream(ProcessGroup.values())
                .filter(v -> v.getTypes().contains(type))
                .findFirst()
                .get();
    }
}
