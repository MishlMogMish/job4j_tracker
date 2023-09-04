package ru.job4j.inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class JSONReportTest {

    @Test
    void whenTestGenerateMethod() {
        String ln = System.lineSeparator();
        String name = "Report's name";
        String body = "Report's body";
        String expected = "{" + ln
                + "\t + \"name\" : \"Report's name\"," + ln
                + "\t + \"body\" : \"Report's body\"" + ln
                + "}";
        String result = new JSONReport().generate(name, body);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNameIsDavidBodyIsNameSong() {
        String ln = System.lineSeparator();
        String name = "David Gilmor";
        String body = "Shine On You Crazy Diamond";
        String expected = "{" + ln
                + "\t + \"name\" : \"David Gilmor\"," + ln
                + "\t + \"body\" : \"Shine On You Crazy Diamond\"" + ln
                + "}";
        String result = new JSONReport().generate(name, body);
        assertThat(result).isEqualTo(expected);
    }
}