package com.evpmqr.tta.output;

public class Result {
    private Integer integer;

    public Result(Integer integer) {
        this.integer = integer;
    }

    public int getResultAsInteger(){
        return integer.intValue();
    }
}
