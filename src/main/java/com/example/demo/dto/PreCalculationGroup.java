package com.example.demo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Getter
public enum PreCalculationGroup {

    GROUP_1(Stream.of("HALVA", "CREDIT").collect(Collectors.toSet()), "PreCalculation1"),
    GROUP_2(Stream.of("COMMISSIONS").collect(Collectors.toSet()), "PreCalculation2");

    private final Set<String> types;
    private final String serviceName;

    public static PreCalculationGroup of(String type) {
        return Arrays.stream(PreCalculationGroup.values())
                .filter(v -> v.getTypes().contains(type))
                .findFirst()
                .get();
    }
}
