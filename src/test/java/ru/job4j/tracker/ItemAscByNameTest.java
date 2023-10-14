package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class ItemAscByNameTest {
    @Test
    public void whenSortListByAscComparator() {
        List<Item> items = Arrays.asList(
                new Item(1, "ffff"),
                new Item(2, "zzz"),
                new Item(3, "aaaaa"),
                new Item(4, "nnnn")
        );
        items.sort(new ItemAscByName());
        System.out.println(items);
        List<Item> expected = List.of(
                new Item(3, "aaaaa"),
                new Item(1, "ffff"),
                new Item(4, "nnnn"),
                new Item(2, "zzz")
        );
        assertThat(expected.get(0).getName()).isEqualTo(items.get(0).getName());
        assertThat(expected.get(1).getName()).isEqualTo(items.get(1).getName());
        assertThat(expected.get(2).getName()).isEqualTo(items.get(2).getName());
        assertThat(expected.get(3).getName()).isEqualTo(items.get(3).getName());
    }

    @Test
    public void whenSortListByDescComparator() {
        List<Item> items = Arrays.asList(
                new Item(1, "ffff"),
                new Item(2, "zzz"),
                new Item(3, "aaaaa"),
                new Item(4, "nnnn")
        );
        items.sort(new ItemDescByName());
        System.out.println(items);
        List<Item> expected = List.of(
                new Item(2, "zzz"),
                new Item(4, "nnnn"),
                new Item(1, "ffff"),
                new Item(3, "aaaaa")
        );
        assertThat(expected.get(0).getName()).isEqualTo(items.get(0).getName());
        assertThat(expected.get(1).getName()).isEqualTo(items.get(1).getName());
        assertThat(expected.get(2).getName()).isEqualTo(items.get(2).getName());
        assertThat(expected.get(3).getName()).isEqualTo(items.get(3).getName());
    }
}