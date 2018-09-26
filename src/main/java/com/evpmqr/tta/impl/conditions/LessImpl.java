package com.evpmqr.tta.impl.conditions;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.interfaces.conditions.Less;
import com.evpmqr.tta.logic.Condition;

public class LessImpl implements Less {
    @Override
    public Condition compututeLessThan(NumberImpl n1, NumberImpl n2) {
        return new Condition(() -> Integer.parseInt(n1.getNumber()) < Integer.parseInt(n2.getNumber()));
    }
}
