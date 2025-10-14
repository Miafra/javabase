package task2;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        double weight;
        double height;
        double index;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введите ваш вес: ");
        weight = scanner1.nextDouble();
        System.out.print("Введите ваш рост в метрах: ");
        height = scanner2.nextDouble();

        index = weight / (height * 2);

        if (index <= 16){
            System.out.println("Выраженный дефицит массы тела");
        } else if (index >= 16 && index <= 18.5){
            System.out.println("Дефицит массы тела");
        } else if (index > 18.5 && index <= 25){
            System.out.println("Норма");
        } else if (index > 25 && index <= 30){
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (index > 30 && index <= 35){
            System.out.println("Ожирение 1-й степени");
        } else if (index > 35 && index <= 40){
            System.out.println("Ожирение 2-й степени");
        } else if (index >= 40){
            System.out.println("Ожирение 3-й степени");
        }
    }
}
