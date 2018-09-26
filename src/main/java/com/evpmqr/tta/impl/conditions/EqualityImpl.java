package com.evpmqr.tta.impl.conditions;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.interfaces.conditions.Equality;
import com.evpmqr.tta.logic.Condition;

public class EqualityImpl implements Equality {

    @Override
    public Condition computeEquality(NumberImpl n1, NumberImpl n2) {
        return new Condition(() -> Integer.parseInt(n1.getNumber()) == Integer.parseInt(n2.getNumber()));
    }

}
