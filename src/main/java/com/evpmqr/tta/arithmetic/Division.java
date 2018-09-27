package com.evpmqr.tta.arithmetic;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.impl.conditions.EqualityImpl;
import com.evpmqr.tta.impl.conditions.GreaterImpl;
import com.evpmqr.tta.interfaces.Operator;
import com.evpmqr.tta.output.Result;

public class Division implements Operator {
    private NumberImpl n1;
    private NumberImpl n2;

    public Division(NumberImpl n1, NumberImpl n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private Result computeDividend() {
        NumberImpl sign = ((Integer.parseInt(n1.getNumber()) < Integer.parseInt(new NumberImpl("0").getNumber())) ^ (Integer.parseInt(n2.getNumber()) < Integer.parseInt(new NumberImpl("0").getNumber()))) ? new NumberImpl("-1") : new NumberImpl("1");
        n1.setNumber("" + Math.abs(Integer.parseInt(n1.getNumber())));
        n2.setNumber("" + Math.abs(Integer.parseInt(n2.getNumber())));

        NumberImpl quotient = new NumberImpl("0");
        while (new GreaterImpl().computerGreater(n1, n2).getBooleanSupplier().getAsBoolean() || new EqualityImpl().computeEquality(n1, n2).getBooleanSupplier().getAsBoolean()) {
            n1.setNumber("" + (Integer.parseInt(n1.getNumber()) - Integer.parseInt(n2.getNumber())));
            quotient.setNumber("" + (Integer.parseInt(quotient.getNumber()) + Integer.parseInt(new NumberImpl("1").getNumber())));
        }

        return new Result(Integer.parseInt(quotient.getNumber()) * Integer.parseInt(sign.getNumber()));
    }

    @Override
    public Result executeOperator() {
        return computeDividend();
    }
}
