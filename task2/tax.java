package task2;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {

        double salary;
        double tax;
        double finalsalary;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вашу зарплату в кронах: ");
        salary = scanner.nextDouble();

        if (salary <= 18800){
            tax = salary * 0.11;
            finalsalary = salary - tax;
            System.out.println("Ваша зарплата после вычета налога: " + finalsalary);
        } else if (salary > 18800 && salary <= 468700){
            tax = salary * 0.20;
            finalsalary = salary - tax;
            System.out.println("Ваша зарплата после вычета налога: " + finalsalary);
        } else if (salary > 468700 && salary <= 675700) {
            tax = salary * 0.32;
            finalsalary = salary - tax;
            System.out.println("Ваша зарплата после вычета налога: " + finalsalary);
        } else if (salary > 675700) {
            tax = salary * 0.40;
            finalsalary = salary - tax;
            System.out.println("Ваша зарплата после вычета налога: " + finalsalary);
        }
    }
}
