package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    List<Integer> list;
    List<Integer> list3;
    List<Integer> list2;
    @BeforeEach
    public void helper(){
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        list3 = Arrays.asList(1,2,4,2);
        list2 = Arrays.asList(1,3,5,1,3,5);
    }

    @Test
    public void sort() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }

    @Test
    public void another_test() {
        List<Integer> expected = Arrays.asList(1,1,3,3,5,5);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list2);

        Assertions.assertEquals(expected, sorted);
    }

}
