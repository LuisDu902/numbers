package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    List<Integer> list;
    List<Integer> list3;
    @BeforeEach
    public void helper(){
        list = Arrays.asList(1,2,4,2,5);
        list3 = Arrays.asList(1,2,4,2);
    }
    @Test
    public void deduplicate() {
        List<Integer> expected = Arrays.asList(1,2,4,5);

        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }
    /*@Test
    public void distinct_bug_8726() {
        /*class stub_dedus implements GenericListSorter{
            @Override
            public List<Integer> sort(List<Integer> list){
                return Arrays.asList(1,2,2,4);
            }
        }
        List<Integer> expected = Arrays.asList(1,2,4);
        ListDeduplicator deduplicator = new ListDeduplicator();
        //GenericListSorter sorter = new stub_dedus();
        //List<Integer> distinct = deduplicator.deduplicate(list3, sorter);

        Assertions.assertEquals(expected, distinct);
    }*/
}
