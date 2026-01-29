package mountaineering;

public class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain(String name, String country, int height) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название горы не может быть пустым");
        }
        if (country == null || country.trim().isEmpty()) {
            throw new IllegalArgumentException("Страна не может быть пустой");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Высота горы должна быть положительной");
        }

        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Гора: %s, страна: %s, высота: %.1f м", name, country, height);
    }
}