package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenException() {
        Fact fact = new Fact();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    fact.calc(-1);
                });
        assertThat(exception.getMessage())
                .isEqualTo("N can not be less then 0");
    }

    @Test
    public void whenProgramIsWorkingRihgt() {
        Fact fact = new Fact();
        int n = 6;
        int expected = 720;
        int result = fact.calc(n);
        assertThat(result).isEqualTo(expected);

    }

}