package ru.job4j.collection;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqual() {
        StringCompare comparator = new StringCompare();
        int rsl = comparator.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenLeftLengthLessThenRightLengthResultIsNegative() {
        StringCompare comparator = new StringCompare();
        int rsl = comparator.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThenRightResultIsPositive() {
        StringCompare comparator = new StringCompare();
        int rsl = comparator.compare(
                "Svanidze",
                "Ivanova"
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenSecondCharOfLeftLessThenRightResultIsNegative() {
        StringCompare comparator = new StringCompare();
        int rsl = comparator.compare(
                "Ifanova",
                "Ivanova"
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenSecondCharOfLeftGreaterThenRightResultIsPositive() {
        StringCompare comparator = new StringCompare();
        int rsl = comparator.compare(
                "Ivanova",
                "Iranova"
        );
        assertThat(rsl).isGreaterThan(0);
    }
}