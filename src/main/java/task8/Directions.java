package task8;

public enum Directions {
    UP("Вверх", "U+2191", new int[]{0, 1}),
    DOWN("Вниз", "U+2193", new int[]{0, -1}),
    LEFT("Влево", "U+2190", new int[]{-1, 0}),
    RIGHT("Вправо", "U+2192", new int[]{1, 0});

    private String title;
    private String unicode;
    private int[] vector;

    Directions(String title, String unicode, int[] vector) {
        this.title = title;
        this.unicode = unicode;
        this.vector = vector;
    }
}
