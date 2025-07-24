package com.platform.spring_core_learning.domain;

public interface Operation {
    String getOperation();
    double apply(double a, double b);
}
