package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("uy4477", "Petr Petr");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.passport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddMethodDoublePassports() {
        Citizen citizen = new Citizen("uy4477", "Petr Petrov");
        Citizen citizen1 = new Citizen("uy4477", "Ivan Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizen1);
        System.out.println();
        assertThat(office.get(citizen1.passport()).username()).isNotEqualTo(citizen1.username());
        assertThat(office.add(citizen1)).isFalse();
    }
}