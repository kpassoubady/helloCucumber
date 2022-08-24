package common;

public class Color {
    public String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color.toUpperCase() + '\'' +
                '}';
    }
}
