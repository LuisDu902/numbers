package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private Integer n;

    public DivisibleByFilter(Integer n){
        this.n = n;
    }

    public boolean accept(Integer number){
        if(number % n ==0) return true;
        return false;
    }
}
