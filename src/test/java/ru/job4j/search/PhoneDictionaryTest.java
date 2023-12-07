package ru.job4j.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByPartOfName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("etr");
        assertThat(persons.get(0).surname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenDoesNotFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("mosc");
        assertThat(persons.size()).isEqualTo(0);
    }

    @Test
    public void whenFindByFullName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).surname()).isEqualTo("Arsentev");
    }
}