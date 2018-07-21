package pl.sda.tdd;

public class Calculator2 {
    int x;
    int y;

    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            y = y + 1;
        }
        return x / y;

    }
}