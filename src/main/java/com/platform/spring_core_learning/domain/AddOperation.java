package com.platform.spring_core_learning.domain;

import org.springframework.stereotype.Component;

@Component
public class AddOperation implements Operation{


    @Override
    public String getOperation() {
        return "+";
    }

    @Override
    public double apply(double a, double b) {
        return a+b;
    }
}
