import java.util.Random;
import java.util.Scanner;

public class biggerOrSmaller {
    static void main() {
        int number;
        int hiddenNumber;
        Random random = new Random();
        hiddenNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Отгадайте число, у вас 3 попытки");
        System.out.print("Попытка 1: ");
        number = scanner.nextInt();

        if (hiddenNumber > number ){
            System.out.println("Мое число больше");
        } else if (hiddenNumber < number){
            System.out.println("Мое число меньше");
        } else if (hiddenNumber == number){
            System.out.println("Вы отгадали число!");
            return;
        }

        System.out.print("Попытка 2: ");
        number = scanner.nextInt();

        if (hiddenNumber > number ){
            System.out.println("Мое число больше");
        } else if (hiddenNumber < number){
            System.out.println("Мое число меньше");
        } else if (hiddenNumber == number){
            System.out.println("Вы отгадали число!");
            return;
        }

        System.out.print("Попытка 3: ");
        number = scanner.nextInt();

        System.out.println("");
        System.out.println("Вы не смогли отгадать мое число(((");
        System.out.println("Мое число было: " + hiddenNumber);

    }
}
