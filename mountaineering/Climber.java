package mountaineering;

public class Climber {
    private String name;
    private int age;
    private String address;

    public Climber(String name, int age, String address) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя альпиниста не может быть пустым");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Возраст альпиниста должен быть не менее 18 лет");
        }
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Адрес не может быть пустым");
        }

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("Альпинист: %s, возраст: %d, адрес: %s", name, age, address);
    }
}