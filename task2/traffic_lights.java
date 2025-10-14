package task2;

import java.util.Random;

public class traffic_lights {
    public static void main(String[] args) {
        int color;

        Random random = new Random();
        color = random.nextInt(3);
        if (color == 0){
            System.out.println("Красный");
        } else if (color == 1) {
            System.out.println("Зеленый");
        } else if (color == 2) {
            System.out.println("Желтый");
        }
    }
}
