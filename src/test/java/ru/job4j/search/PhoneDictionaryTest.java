package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByPartOfName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("etr");
        assertThat(persons.get(0).surname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenDoesNotFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("mosc");
        assertThat(persons.size()).isEqualTo(0);
    }

    @Test
    public void whenFindByFullName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).surname()).isEqualTo("Arsentev");
    }
}