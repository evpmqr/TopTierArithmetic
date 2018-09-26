package com.evpmqr.tta.impl;

import com.evpmqr.tta.impl.conditions.EqualityImpl;
import com.evpmqr.tta.impl.conditions.GreaterImpl;
import com.evpmqr.tta.impl.conditions.LessImpl;
import com.evpmqr.tta.interfaces.Number;

public class NumberImpl implements Number {
    private String numberInteger;

    public NumberImpl(String numberInteger) {
        this.numberInteger = numberInteger;
    }

    public String getNumber() {
        return numberInteger;
    }

    public void setNumber(String enterpriseInteger) {
        this.numberInteger = enterpriseInteger;
    }

    @Override
    public boolean isPositive() {
        return new GreaterImpl().computerGreater(this, new NumberImpl("0")).getBooleanSupplier().getAsBoolean();
    }

    @Override
    public boolean isNegative() {
        return new LessImpl().compututeLessThan(this, new NumberImpl("0")).getBooleanSupplier().getAsBoolean();
    }

    @Override
    public boolean isZero() {
        return new EqualityImpl().computeEquality(this, new NumberImpl("0")).getBooleanSupplier().getAsBoolean();
    }

}
