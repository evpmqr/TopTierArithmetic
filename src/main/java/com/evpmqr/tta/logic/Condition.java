package com.evpmqr.tta.logic;

import java.util.function.BooleanSupplier;

public class Condition {
    private BooleanSupplier booleanSupplier;

    public Condition(BooleanSupplier booleanSupplier){
        this.booleanSupplier = booleanSupplier;
    }

    public BooleanSupplier getBooleanSupplier() {
        return booleanSupplier;
    }
}
