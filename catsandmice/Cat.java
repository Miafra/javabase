package catsandmice;

import java.util.Arrays;

public class Cat {
    private String name;
    private int speed;
    private int weight;
    private Mouse[] caughtMice;
    private int mouseCount;

    private static final int MAX_MICE = 100;

    public Cat(String name, int speed, int weight) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("введите имя кота");
        }
        if (speed < 1 || speed > 20) {
            throw new IllegalArgumentException("Скорость кота должна быть от 1 до 20");
        }
        if (weight < 1 || weight > 30) {
            throw new IllegalArgumentException("Вес кота должен быть от 1 до 30 кг");
        }

        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.caughtMice = new Mouse[MAX_MICE];
        this.mouseCount = 0;
    }

    public boolean catchMouse(Mouse mouse) {
        if (mouse == null) {
            System.out.println("мышей нет");
            return false;
        }

        if (mouseCount >= MAX_MICE) {
            System.out.println("макс. количество мышей");
            return false;
        }

        if (this.speed > mouse.getSpeed()) {
            caughtMice[mouseCount] = mouse;
            mouseCount++;
            System.out.println(name + " поймал мышь " + mouse.getName());
            return true;
        } else {
            System.out.println(name + " не смог догнать мышь " + mouse.getName());
            return false;
        }
    }

    public void attackCat(Cat otherCat) {
        if (otherCat == null) {
            System.out.println("кота не существует");
            return;
        }

        if (otherCat == this) {
            System.out.println("Не может атаковать самого себя");
            return;
        }

        System.out.println("\n" + name + " атакует " + otherCat.name);
        System.out.println(name + ": скорость=" + speed + ", вес=" + weight);
        System.out.println(otherCat.name + ": скорость=" + otherCat.speed + ", вес=" + otherCat.weight);

        if (this.weight > otherCat.weight) {
            System.out.println(name + " тяжелее! Проигрыш");
            stealMice(otherCat);
        } else if (this.weight < otherCat.weight) {
            System.out.println(name + " легче! " + otherCat.name + " побеждает в схватке.");
        } else {
            System.out.println("Коты одного веса. Ничья.");
        }
    }

    private void stealMice(Cat otherCat) {
        int stolenCount = 0;
        Mouse[] remainingMice = new Mouse[MAX_MICE];
        int remainingCount = 0;

        for (int i = 0; i < otherCat.mouseCount; i++) {
            Mouse mouse = otherCat.caughtMice[i];

            // может ли мышь убежать
            if (mouse.getSpeed() > this.speed) {
                System.out.println("  Мышь '" + mouse.getName() + "' убежала");
                remainingMice[remainingCount] = mouse;
                remainingCount++;
            } else if (this.mouseCount < MAX_MICE) {
                this.caughtMice[this.mouseCount] = mouse;
                this.mouseCount++;
                stolenCount++;
                System.out.println(this.getName() + " Украл мышь " + mouse.getName());
            } else {
                System.out.println("  У " + name + " нет места для мыши '" + mouse.getName() + "'");
                remainingMice[remainingCount] = mouse;
                remainingCount++;
            }
        }

        // Обновление массива
        otherCat.caughtMice = remainingMice;
        otherCat.mouseCount = remainingCount;

        System.out.println("Итог: " + name + " украл " + stolenCount +
                " мышей у " + otherCat.name);
    }


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public Mouse[] getCaughtMice() {
        return Arrays.copyOf(caughtMice, mouseCount);
    }

    public int getMouseCount() {
        return mouseCount;
    }

}