package com.evpmqr.tta.interfaces.conditions;

import com.evpmqr.tta.impl.NumberImpl;
import com.evpmqr.tta.logic.Condition;


public interface Less {
    Condition compututeLessThan(NumberImpl n1, NumberImpl n2);
}
