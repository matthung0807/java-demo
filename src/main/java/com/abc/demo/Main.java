package com.abc.demo;

public class Main {

    public static void main(String[] arges) {
        var color = Color.WHITE;

        var value = switch (color) {
            case RED -> 1;
            case BLUE -> 2;
            case BLACK, WHITE -> {
                if((int) (Math.random() * 3) > 1) {
                    yield 0;
                }
                yield 1;
            }
            default -> -1;
        };
        System.out.println(value);
    }

}

enum Color {
    RED, BLUE, GREEN, WHITE, BLACK,
}
