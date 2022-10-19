package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private GenericListFilter filter;

    public ListFilterer(GenericListFilter filter){
        this.filter = filter;
    }

    public List<Integer> filter(List<Integer> list){
        List<Integer> unique = new ArrayList<>();

        for (Integer number : list){
            if (filter.accept(number)){
                unique.add(number);
            }
        }

        return unique;
    }
}
