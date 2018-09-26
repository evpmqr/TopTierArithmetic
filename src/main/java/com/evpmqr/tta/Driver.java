package com.evpmqr.tta;

import com.evpmqr.tta.arithmetic.Addition;
import com.evpmqr.tta.arithmetic.OperatationHandler;
import com.evpmqr.tta.impl.NumberImpl;

public class Driver {
    public static void main(String[] args) {
        OperatationHandler operatationHandler = new OperatationHandler();
        System.out.println(operatationHandler.setOperator(new Addition(new NumberImpl("10"), new NumberImpl("-5"))).executeOperation(operatationHandler.getOperator()));
    }
}
