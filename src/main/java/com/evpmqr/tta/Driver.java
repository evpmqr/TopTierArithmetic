package com.evpmqr.tta;

import com.evpmqr.tta.arithmetic.Addition;
import com.evpmqr.tta.arithmetic.OperationHandler;
import com.evpmqr.tta.impl.NumberImpl;

public class Driver {
    public static void main(String[] args) {
        OperationHandler operationHandler = new OperationHandler();
        System.out.println(operationHandler.setOperator(new Addition(new NumberImpl("10"), new NumberImpl("-5"))).executeOperation(operationHandler.getOperator()));
    }
}
