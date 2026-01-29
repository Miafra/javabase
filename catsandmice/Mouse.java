package catsandmice;

public class Mouse {
    private String name;
    private int speed;

    public Mouse(String name, int speed) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("введите имя");
        }
        if (speed < 1 || speed > 10) {
            throw new IllegalArgumentException("Скорость мыши должна быть от 1 до 10");
        }

        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return String.format("Мышь '%s' (скорость: %d)", name, speed);
    }
}