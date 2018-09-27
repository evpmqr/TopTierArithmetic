package com.evpmqr.tta.arithmetic;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.interfaces.Operator;
import com.evpmqr.tta.output.Result;

public class Subtraction implements Operator {
    private NumberImpl n1;
    private NumberImpl n2;

    public Subtraction(NumberImpl n1, NumberImpl n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private Result computeSubtraction() {
        while (!n2.isZero()) {
            NumberImpl borrow = new NumberImpl("" + ((~Integer.parseInt(n1.getNumber())) & (Integer.parseInt(n2.getNumber()))));
            n1.setNumber("" + (Integer.parseInt(n1.getNumber()) ^ Integer.parseInt(n2.getNumber())));
            n2.setNumber("" + (Integer.parseInt(borrow.getNumber()) << Integer.parseInt(new NumberImpl("1").getNumber())));
        }

        return new Result(Integer.parseInt(n1.getNumber()));
    }

    @Override
    public Result executeOperator() {
        return computeSubtraction();
    }
}
