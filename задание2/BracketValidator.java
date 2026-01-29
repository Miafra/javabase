package задание2;

import java.util.Scanner;
import java.util.Stack;

public class BracketValidator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку сo скобками:");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (char ch : input.toCharArray()) {
            if (ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("все верно");
        } else {
            System.out.println("есть ошибки");
        }
    }
}
