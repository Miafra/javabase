package mountaineering;

import java.util.Arrays;

public class ClimbingGroup {
    private boolean isRecruiting;
    private Climber[] climbers;
    private Mountain mountain;
    private int climberCount;

    public ClimbingGroup(Mountain mountain, int maxClimbers, boolean isRecruiting) {
        if (mountain == null) {
            throw new IllegalArgumentException("Высота горы не может быть отрицательной");
        }
        if (maxClimbers <= 0) {
            throw new IllegalArgumentException("Максимальное количество альпинистов должно быть положительным");
        }

        this.mountain = mountain;
        this.climbers = new Climber[maxClimbers];
        this.isRecruiting = isRecruiting;
        this.climberCount = 0;
    }

    public boolean addClimber(Climber climber) {
        if (climber == null) {
            System.out.println("введите альпиниста");
            return false;
        }

        if (!isRecruiting) {
            System.out.println("Набор в группу закрыт " + climber.getName());
            return false;
        }

        if (climberCount >= climbers.length) {
            System.out.println("Группа заполнена " + climber.getName());
            return false;
        }

        // повторные альпинитсы
        for (int i = 0; i < climberCount; i++) {
            if (climbers[i] == climber) {
                System.out.println("Альпинист " + climber.getName() + " уже в группе");
                return false;
            }
        }

        climbers[climberCount] = climber;
        climberCount++;
        System.out.println(climber.getName());
        return true;
    }

    public void closeRecruitment() {
        this.isRecruiting = false;
        System.out.println("Набор в группу для восхождения на " + mountain.getName() + " закрыт");
    }

    public void openRecruitment() {
        this.isRecruiting = true;
        System.out.println("Набор в группу для восхождения на " + mountain.getName() + " открыт");
    }

    public boolean isRecruiting() {
        return isRecruiting;
    }

    public Mountain getMountain() {
        return mountain;
    }

    public Climber[] getClimbers() {
        return Arrays.copyOf(climbers, climberCount);
    }

    public int getClimberCount() {
        return climberCount;
    }

    @Override
    public String toString() {
        String status = isRecruiting ? "набор открыт" : "набор закрыт";
        return String.format("Группа для восхождения на %s (%s)\n" +
                        "Количество альпинистов: %d\n" +
                        "Статус набора: %s",
                mountain.getName(), mountain.getCountry(),
                climberCount, status);
    }

    public void printGroupInfo() {
        System.out.println("=".repeat(50));
        System.out.println(this);
        System.out.println("Альпинисты в группе:");
        if (climberCount == 0) {
            System.out.println("  Группа пуста");
        } else {
            for (int i = 0; i < climberCount; i++) {
                System.out.println("  " + (i + 1) + ". " + climbers[i].getName());
            }
        }
        System.out.println("=".repeat(50));
    }
}