package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordValidatorTest {

    @Test
    public void whenPasswordIsValid() {
        String password = "Ln2$mrTY12";
        String expected = "Ln2$mrTY12";
        String result = PasswordValidator.validate(password);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenPasswordIsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(null)
        );
        String expected = "Password can not be null";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordLengthLessThen8() {
        String password = "Ln24mrT";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password length should be [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordLengthMoreThen32() {
        String password = "Ln2$mrTY3245nMdsdfdfPPPg$#dg124531";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password length should be [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasNoUpperCaseLetter() {
        String password = "fg2$bfbbb3245jh";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one uppercase letter";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasNoLowerCaseLetter() {
        String password = "LM2$KNTY3245JM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one lowercase letter";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasNoDigits() {
        String password = "Lbn$KNTYJM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one digit";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasNoSpecialSymbol() {
        String password = "Lbn23KNTYJM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one special symbol";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasSubStringQWERTY() {
        String password = "Lbn23$qWertYNTYJM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: "
                + "qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasSubString12345() {
        String password = "Lbn23$qWer12345YJM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: "
                + "qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasSubStringPassword() {
        String password = "Lbn23$qWePasSwOrdr12345YJM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: "
                + "qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasSubStringAdmin() {
        String password = "Lbn23$qWeaDmInr125YJM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: "
                + "qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    @Test
    public void whenPasswordHasSubStringUser() {
        String password = "Lbn23$qWeaDmIUsERnr125YJM";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: "
                + "qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }
}