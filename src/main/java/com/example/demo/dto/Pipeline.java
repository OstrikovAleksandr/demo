package com.example.demo.dto;

public interface Pipeline<I, O> {

    O execute(I value);

    default <R> Pipeline<I, R> pipe(Pipeline<O, R> source) {
        return value -> source.execute(execute(value));
    }

    static <I, O> Pipeline<I, O> of(Pipeline<I, O> source) {
        return source;
    }
}
