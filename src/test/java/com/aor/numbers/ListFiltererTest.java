package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    List<Integer> list;

    @BeforeEach
    public void helper(){
        list = Arrays.asList(3, 2, 6, -1, -4, -5, 7);

    }

    @Test
    public void positive_filter() {
        List<Integer> expected = Arrays.asList(3,2,6,7);
        ListFilterer filterer = new ListFilterer(new PositiveFilter());
        List<Integer> actual = filterer.filter(list);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divisible_filter() {
        List<Integer> expected = Arrays.asList(2,6,-4);
        ListFilterer filterer = new ListFilterer(new DivisibleByFilter(2));
        List<Integer> actual = filterer.filter(list);
        Assertions.assertEquals(expected, actual);
    }


}
