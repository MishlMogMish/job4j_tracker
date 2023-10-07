package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1});
        list.add(new int[] {2, 3});
        List<Integer> result = ConvertList.convert(list);
        List<Integer> expect = Arrays.asList(1, 2, 3);
        List<Integer> expect1 = Arrays.asList(2, 1, 3);
        assertThat(result).containsAll(expect);
        assertThat(result).containsAll(expect1);
    }
}