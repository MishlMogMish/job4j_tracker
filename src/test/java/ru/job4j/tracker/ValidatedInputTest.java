package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidatedInputTest {

    @Test
    public void whenUnvalidatedInput() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"one", "1"}
        );
        ValidatedInput input = new ValidatedInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidatedIntInput() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"0", "try1"}
        );
        ValidatedInput input = new ValidatedInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
    }

    @Test
    public void whenValidatedIntAndStrInput() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"0", "try1"}
        );
        ValidatedInput input = new ValidatedInput(out, in);
        int selected = input.askInt("Enter menu:");
        String selected1 = input.askStr("Enter menu:");
        assertThat(selected).isEqualTo(0);
        assertThat(selected1).isEqualTo("try1");
    }

    @Test
    public void whenValidatedSeveralIntAndStrInput() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"0", "try1", "0", "try2", "1"}
        );
        ValidatedInput input = new ValidatedInput(out, in);
        int selected = input.askInt("Enter menu:");
        String selected1 = input.askStr("Enter name:");
        int selected2 = input.askInt("Enter menu:");
        String selected3 = input.askStr("Enter name:");
        int selected4 = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(0);
        assertThat(selected1).isEqualTo("try1");
        assertThat(selected2).isEqualTo(0);
        assertThat(selected3).isEqualTo("try2");
        assertThat(selected4).isEqualTo(1);
    }

    @Test
    public void whenUnvalidatedNegativeIntInput() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"-14"}
        );
        ValidatedInput input = new ValidatedInput(out, in);
        int selected = input.askInt("Enter menu:");
        System.out.println(selected);
        assertThat(selected).isEqualTo(-14);
    }

}