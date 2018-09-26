package com.evpmqr.tta.interfaces.conditions;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.logic.Condition;

public interface Greater {
    Condition computerGreater(NumberImpl n1, NumberImpl n2);
}
