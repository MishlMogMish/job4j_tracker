package ru.job4j.tracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class ItemAscByNameTest {
    @Test
    public void whenSortListByAscComparator() {
        Item item0 = new Item(0, "ffff");
        Item item1 = new Item(1, "zzz");
        Item item2 = new Item(2, "aaaa");
        Item item3 = new Item(3, "nnnn");
        List<Item> items = Arrays.asList(item0, item1, item2, item3);
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(item2, item0, item3, item1);
        Assertions.assertArrayEquals(expected.toArray(), items.toArray());
    }

    @Test
    public void whenSortListByDescComparator() {
        Item item0 = new Item(0, "ffff");
        Item item1 = new Item(1, "zzz");
        Item item2 = new Item(2, "aaaa");
        Item item3 = new Item(3, "nnnn");
        List<Item> items = Arrays.asList(item0, item1, item2, item3);
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(item1, item3, item0, item2);
        Assertions.assertArrayEquals(expected.toArray(), items.toArray());
    }
}