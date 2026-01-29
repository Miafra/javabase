package задание2;

import java.util.*;

public class BusRouteCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество остановок:");
        int n = scanner.nextInt();

        String[] cities = new String[n];
        int[] times = new int[n];

        System.out.println("Введите названия остановок и время прибытия для каждой остановки:");
        for (int i = 0; i < n; i++) {
            cities[i] = scanner.next();
            times[i] = scanner.nextInt();
        }

        System.out.println("СХЕМА МАРШРУТА");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s (%02d:00)", cities[i], times[i]);
            if (i < n - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println("");

        int totalTime = 0;
        for (int i = 1; i < n; i++) {
            totalTime += times[i] - times[i - 1];
        }

        System.out.println("Общее время движения: " + totalTime + " часов");
    }
}