package com.evpmqr.tta.arithmetic;

import com.evpmqr.tta.interfaces.Operator;

public class OperatationHandler {

    private Operator operator;

    public OperatationHandler(){}

    public OperatationHandler(Operator operator) {
        this.operator = operator;
    }

    public OperatationHandler setOperator(Operator operator) {
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
