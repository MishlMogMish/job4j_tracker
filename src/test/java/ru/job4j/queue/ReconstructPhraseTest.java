package ru.job4j.queue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.*;

public class ReconstructPhraseTest {
    @Test
    public void whenSloganOfLanguageJava() {
        Deque<Character> evenElements = new LinkedList<>(
                Arrays.asList(
                        'S', 'd', 'l', 'l', 'o', '4', 'g', 'r', 'a', 'p', 'n', '9',
                        ' ', 'd', 'o', 'j', 'f', 'g', ' ', '3', 'l', 'f', 'a', 't',
                        'n', '5', 'g', 't', 'u', 'd', 'a', '3', 'g', 'l', 'e', 'j',
                        ' ', 't', 'J', 'o', 'a', '9', 'v', 'w', 'a', 'e', ':', 'b'
                )
        );
        Deque<Character> descendingElements = new LinkedList<>(
                Arrays.asList(
                        'e', 'r', 'e', 'h', 'w', 'y', 'r', 'e', 'v', 'e', ' ', 'n', 'u',
                        'r', ' ', ',', 'e', 'c', 'n', 'o', ' ', 'e', 't', 'i', 'r', 'W', ' '
                )
        );
        String expected = "Slogan of language Java: Write once, run everywhere";
        String result = new ReconstructPhrase(descendingElements, evenElements).getReconstructPhrase();
        assertThat(result).isEqualTo(expected);
    }
}