package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FullSearchTest {

    @Test
    void extractNumber() {
        FullSearch fullSearch = new FullSearch();
        List<Task> tasks = Arrays.asList(
                new Task("1", "First desk"),
                new Task("2", "Second desk"),
                new Task("3", "Third desk")
        );
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
        assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
    }
}