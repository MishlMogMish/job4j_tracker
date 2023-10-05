package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        int[][] result = ConvertList2Array.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result).isDeepEqualTo(expect);
    }

    @Test
    public void when5ElementsThen6() {
        int[][] result = ConvertList2Array.toArray(
                List.of(1, 2, 3, 4, 5),
                2
        );
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 0}
        };
        assertThat(result).isDeepEqualTo(expect);
    }
}