package com.evpmqr.tta.arithmetic;

import com.evpmqr.tta.interfaces.Operator;

public class OperationHandler {

    private Operator operator;

    public OperationHandler(){}

    public OperationHandler(Operator operator) {
        this.operator = operator;
    }

    public OperationHandler setOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    public Operator getOperator() {
        return operator;
    }

    public int executeOperation(Operator operator) {
        return operator.executeOperator().getResultAsInteger();
    }
}
