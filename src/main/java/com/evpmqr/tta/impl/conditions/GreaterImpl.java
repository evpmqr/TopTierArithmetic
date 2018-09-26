package com.evpmqr.tta.impl.conditions;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.interfaces.conditions.Greater;
import com.evpmqr.tta.logic.Condition;

public class GreaterImpl implements Greater{
    @Override
    public Condition computerGreater(NumberImpl n1, NumberImpl n2) {
        return new Condition(() -> Integer.parseInt(n1.getNumber()) > Integer.parseInt(n2.getNumber()));
    }
}
