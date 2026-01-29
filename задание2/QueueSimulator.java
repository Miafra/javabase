package задание2;

import java.util.*;

public class QueueSimulator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество очередей:");
        int numberOfQueues = scanner.nextInt();

        System.out.println("Введите количество покупателей:");
        int numberOfBuyers = scanner.nextInt();

        int[] queueTimes = new int[numberOfQueues];
        System.out.println("Введите время обслуживания для каждой очереди:");
        for (int i = 0; i < numberOfQueues; i++) {
            queueTimes[i] = scanner.nextInt();
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < numberOfQueues; i++) {
            queue.offer(i);
        }

        for (int i = 0; i < numberOfBuyers; i++) {
            int minIndex = queue.poll();
            System.out.println("Покупатель " + (i + 1) + " обслуживается в очереди " + (minIndex + 1));
            if (minIndex < numberOfQueues) {
                queue.offer(minIndex + queueTimes[minIndex]);
            } else {
                System.out.println("Ошибка: индекс вне границ массива.");
            }
        }
    }
}