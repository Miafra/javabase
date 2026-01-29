package задание2;

import java.util.Scanner;

public class StringReverser {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово:");
        String word = scanner.next();

        for (int i = word.length() - 1; i >= 0; i--) {
            char reversed = word.charAt(i);
            System.out.print(reversed);
        }
    }
}
