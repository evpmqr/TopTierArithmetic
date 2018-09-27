package com.evpmqr.tta;

import com.evpmqr.tta.arithmetic.*;
import com.evpmqr.tta.impl.NumberImpl;

public class Driver {
    public static void main(String[] args) {
        OperationHandler operationHandler = new OperationHandler();
        System.out.println(operationHandler.setOperator(new Addition(new NumberImpl("-5"), new NumberImpl("-5"))).executeOperation(operationHandler.getOperator()));
        System.out.println(operationHandler.setOperator(new Multiplication(new NumberImpl("2"), new NumberImpl("5"))).executeOperation(operationHandler.getOperator()));
        System.out.println(operationHandler.setOperator(new Division(new NumberImpl("4"), new NumberImpl("2"))).executeOperation(operationHandler.getOperator()));
        System.out.println(operationHandler.setOperator(new Subtraction(new NumberImpl("10"), new NumberImpl("3"))).executeOperation(operationHandler.getOperator()));
    }
}
