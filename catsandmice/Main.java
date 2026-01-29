package catsandmice;

public class Main {
    public static void main(String[] args) {

        // мыши
        Mouse speedyMouse = new Mouse("Спиди", 8);
        Mouse slowMouse = new Mouse("Тормоз", 3);
        Mouse averageMouse = new Mouse("Среднячок", 5);
        Mouse fastMouse = new Mouse("Быстрик", 9);
        Mouse verySlowMouse = new Mouse("Тихоня", 2);

        // коты
        Cat tom = new Cat("Том", 7, 8);
        Cat garfield = new Cat("Гарфилд", 5, 12);
        Cat sylvester = new Cat("Сильвестр", 9, 6);

        // Том
        System.out.println("ТОМ ОХОТИТСЯ ");
        tom.catchMouse(speedyMouse);
        tom.catchMouse(slowMouse);
        tom.catchMouse(averageMouse);
        System.out.println("");

        // Гарфилд
        System.out.println("ГАРФИЛД ОХОТИТСЯ ");
        garfield.catchMouse(fastMouse);
        garfield.catchMouse(verySlowMouse);
        System.out.println("");

        // Сильвестр
        System.out.println("СИЛЬВЕСТР ОХОТИТСЯ ");
        sylvester.catchMouse(speedyMouse);
        sylvester.catchMouse(fastMouse);
        System.out.println("");

        // атака
        garfield.attackCat(tom);
        System.out.println("");
        sylvester.attackCat(garfield);
        System.out.println("");

        // Итоговый отчет
        System.out.println("ИТОГОВЫЙ ОТЧЕТ");

        Cat[] cats = {tom, garfield, sylvester};
        int totalMice = 0;

        for (Cat cat : cats) {
            totalMice += cat.getMouseCount();
            System.out.printf("%s: %d мышей\n", cat.getName(), cat.getMouseCount());
        }

        System.out.println("Всего поймано мышей: " + totalMice);
    }
}