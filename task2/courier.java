package task2;

public class courier {
    public static void main(String[] args) {
        int flat;
        for (flat = 1; flat <= 50; flat++){
            if (flat >= 1 && flat <= 5){
                System.out.println("Этаж №1 ");
            } else if (flat >= 6 && flat <= 10) {
                System.out.println("Этаж №2 ");
            } else if (flat >= 11 && flat <= 15) {
                System.out.println("Этаж №3");
            } else if (flat >= 16 && flat <= 20) {
                System.out.println("Этаж №4");
            } else if (flat >= 21 && flat <= 25) {
                System.out.println("Этаж №5");
            } else if (flat >= 26 && flat <= 30) {
                System.out.println("Этаж №6");
            } else if (flat >= 31 && flat <= 35) {
                System.out.println("Этаж №7");
            } else if (flat >= 36 && flat <= 40) {
                System.out.println("Этаж №8");
            } else if (flat >= 41 && flat <= 45) {
                System.out.println("Этаж №9");
            } else if (flat >= 46 && flat <= 50) {
                System.out.println("Этаж №10");
            }
            System.out.println("Квартира №" + flat);
            System.out.println("Заказ доставлен");
        }
    }
}
