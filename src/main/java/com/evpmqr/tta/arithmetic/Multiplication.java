package com.evpmqr.tta.arithmetic;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.impl.conditions.GreaterImpl;
import com.evpmqr.tta.interfaces.Operator;
import com.evpmqr.tta.output.Result;

public class Multiplication implements Operator {

    private NumberImpl n1;
    private NumberImpl n2;

    public Multiplication(NumberImpl n1, NumberImpl n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private Result computeMultiplication() {
        NumberImpl res = new NumberImpl("0");
        while (new GreaterImpl().computerGreater(n2, new NumberImpl("0")).getBooleanSupplier().getAsBoolean()) {
            if ((Integer.parseInt(n2.getNumber()) & Integer.parseInt(new NumberImpl("1").getNumber())) != Integer.parseInt(new NumberImpl("0").getNumber())) {//1 0
                res.setNumber("" + (Integer.parseInt(res.getNumber()) + Integer.parseInt(n1.getNumber())));
            }
            n1.setNumber("" + (Integer.parseInt(n1.getNumber()) << Integer.parseInt(new NumberImpl("1").getNumber())));
            n2.setNumber("" + (Integer.parseInt(n2.getNumber()) >> Integer.parseInt(new NumberImpl("1").getNumber())));
        }

        return new Result(Integer.parseInt(res.getNumber()));
    }


    @Override
    public Result executeOperator() {
        return computeMultiplication();
    }
}
