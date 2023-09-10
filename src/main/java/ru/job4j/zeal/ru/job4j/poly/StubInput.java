package ru.job4j.zeal.ru.job4j.poly;

import ru.job4j.zeal.ru.job4j.poly.Input;

public class StubInput  implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
