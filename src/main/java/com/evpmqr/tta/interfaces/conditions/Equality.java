package com.evpmqr.tta.interfaces.conditions;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.logic.Condition;

public interface Equality {
    Condition computeEquality(NumberImpl n1, NumberImpl n2);
}
