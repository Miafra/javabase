import java.util.Scanner;

public class quiz {
    static void main() {
        int score = 0;
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Викторина");
        System.out.println("");

        System.out.println("Вопрос 1: Какое чило больше 18, но меньше 35?");
        System.out.println("1. 43");
        System.out.println("2. 15");
        System.out.println("3. 22");

        answer = scanner.nextInt();

        if (answer == 3){
            score++;
        }

        System.out.println("Вопрос 2: Джарахов купил 5 яблок и 6 персиков. Сколько у Джарахова фруктов?");
        System.out.println("1. 8");
        System.out.println("2. 11");
        System.out.println("3. 12");

        answer = scanner.nextInt();
        if (answer == 2){
            score++;
        }

        System.out.println("Вопрос 3: В последовательности чисел 2, 4, 8, 16, 32, 64, 128, какое число будет следующим?");
        System.out.println("1. 256");
        System.out.println("2. 129");
        System.out.println("3. 642");

        answer = scanner.nextInt();
        if (answer == 1){
            score++;
        }

        System.out.println("Вопрос 4: Что получится, если разделить 30 на 0,5 и добавите 10?");
        System.out.println("1. 45");
        System.out.println("2. 70");
        System.out.println("3. 0");

        answer = scanner.nextInt();
        if (answer == 2){
            score++;
        }

        System.out.println("Вопрос 5: В каком году началась Вторая мировая война?");
        System.out.println("1. 1941");
        System.out.println("2. 1939");
        System.out.println("3. 1940");

        answer = scanner.nextInt();
        if (answer == 2){
            score++;
        }

        System.out.println("Вопрос 6: Сколько будет 2+2?");
        System.out.println("1. 5");
        System.out.println("2. 69");
        System.out.println("3. 4");

        answer = scanner.nextInt();
        if (answer == 3){
            score++;
        }

        System.out.println("Вопрос 7: Войдя в темную пещеру, Джигурда зажег 11 факелов. 3 из них сразу же погасли. Сколько останется?");
        System.out.println("1. 11");
        System.out.println("2. 8");
        System.out.println("3. 9");

        answer = scanner.nextInt();
        if (answer == 1){
            score++;
        }

        System.out.println("Вопрос 8: Я устала придумывать загадки, поэтому просто ответь 2");
        System.out.println("1. оке");
        System.out.println("2. ну лан");
        System.out.println("3. ок");

        answer = scanner.nextInt();
        if (answer == 2){
            score++;
        }

        System.out.println("Вопрос 9: Сколько месяцев в году имеют 28 дней?");
        System.out.println("1. все");
        System.out.println("2. Февраль");
        System.out.println("3. Декабрь");

        answer = scanner.nextInt();
        if (answer == 1){
            score++;
        }

        System.out.println("Вопрос 10: Вы поставите мне 5?");
        System.out.println("1. Конечно!!");
        System.out.println("2. Нет");
        System.out.println("3. Я подумаю");

        answer = scanner.nextInt();
        if (answer == 1){
            score++;
        }


        System.out.println("Колличество баллов: " + score);

    }
}
