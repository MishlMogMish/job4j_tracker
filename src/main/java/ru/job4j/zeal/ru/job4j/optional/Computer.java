package ru.job4j.zeal.ru.job4j.optional;

import java.util.Optional;

public class Computer {
    private Optional<Soundcard> soundcard;

    public Computer(Optional<Soundcard> soundcard) {
        this.soundcard = soundcard;
    }

    public Optional<Soundcard> getSoundcard() {
        return soundcard;
    }

    public static void main(String[] args) {
        Optional<Computer> computer = Optional
                .ofNullable(new Computer(Optional
                        .ofNullable(new Soundcard(Optional.ofNullable(new USB("yyy"))))));
        String version = computer
                .flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUsb)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
        System.out.println(version);
    }
}

