package ru.job4j.zeal.ru.job4j.enumeration;

public enum Status {
    ACCEPTED("Принят") {
        private String message = "Сообщение анонимного класса - приняли тачку";
        @Override
        public String getMessage() {
            return message;
        }
    },
    IN_WORK("В работе") {
        private String message = "Сообщение анонимного класса - работаем";
        @Override
        public String getMessage() {
            return message;
        }
    },
    WAITING("Ожидание") {
        private String message = "Сообщение анонимного класса - ждите";
        @Override
        public String getMessage() {

            return message;
        }
    },
    FINISHED("Работы завершены") {
        private String message = "Сообщение анонимного класса - забирайте";
        @Override
        public String getMessage() {
            return message;
        }
    };

    private String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public abstract String getMessage();

    public static void main(String[] args) {
        System.out.println(Status.FINISHED.getMessage());
    }
}
