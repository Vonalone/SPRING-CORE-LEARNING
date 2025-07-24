package com.platform.spring_core_learning.service;

import com.platform.spring_core_learning.domain.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {
    private final List<Operation> operations;

    @Autowired
    public CalculatorService(List<Operation> operations){
        this.operations = operations;
    }
    public double calculate(double a, double b,String Operator){
        for( Operation op : operations){
            if(op.getOperation().equals(Operator)){
                return op.apply(a,b);
            }
        }
        throw new IllegalArgumentException("Unknown Operator "+Operator);
    }
}
