package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UniqueTextTest {

    @Test
    void isEqual() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "My mouse eats a cat";
        assertThat(uniqueText.isEqual(origin, text)).isTrue();
    }

    @Test
    void isNotEqual() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "My mouse eats  cats";
        assertThat(uniqueText.isEqual(origin, text)).isFalse();
    }
}