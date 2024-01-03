package ru.job4j.zeal.ru.job4j.optional;

import java.util.Optional;

public class Soundcard {
    private Optional<USB> usb;

    public Soundcard(Optional<USB> usb) {
        this.usb = usb;
    }

    public Optional<USB> getUsb() {
        return usb;
    }
}
