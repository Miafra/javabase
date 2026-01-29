package mountaineering;

public class Main {
    public static void main(String[] args) {
        // горы
        Mountain everest = new Mountain("Эверест", "Непал/Китай", 8848);
        Mountain elbrus = new Mountain("Эльбрус", "Россия", 5642);
        Mountain matterhorn = new Mountain("Маттерхорн", "Швейцария/Италия", 4478);

        // альпинисты
        Climber climber1 = new Climber("Иван Петров", 25, "Москва, ул. Ленина, 10");
        Climber climber2 = new Climber("Мария Сидорова", 30, "Санкт-Петербург, Невский пр., 20");
        Climber climber3 = new Climber("Алексей Иванов", 28, "Екатеринбург, ул. Мира, 15");
        Climber climber4 = new Climber("Ольга Смирнова", 22, "Казань, ул. Баумана, 5");
        Climber climber5 = new Climber("Дмитрий Козлов", 35, "Новосибирск, Красный пр., 100");
        Climber climber6 = new Climber("Анна Волкова", 27, "Сочи, ул. Набережная, 3");
        Climber climber7 = new Climber("Сергей Николаев", 32, "Владивосток, ул. Светланская, 45");

        // группы
        ClimbingGroup group1 = new ClimbingGroup(everest, 5, true); // набор открыт
        ClimbingGroup group2 = new ClimbingGroup(elbrus, 4, true);  // набор открыт
        ClimbingGroup group3 = new ClimbingGroup(matterhorn, 3, true); // набор открыт

        // 1 группа
        System.out.println("ГРУППА 1 (Эверест)");
        group1.addClimber(climber1);
        group1.addClimber(climber2);
        group1.addClimber(climber3);
        group1.closeRecruitment();
        System.out.println("");

        // 2 группа
        System.out.println("ГРУППА 2 (Эльбрус)");
        group2.addClimber(climber4);
        group2.addClimber(climber5);
        System.out.println("");

        // 3 группа
        System.out.println("ГРУППА 3 (Маттерхорн)");
        System.out.println("набор открыт");

    }
}