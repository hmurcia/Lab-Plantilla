package funcionesPuras;

public class Operacion {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static float suma(float a, float b) {
        return a + b;
    }

    public static boolean isInteger(String str) {
        return str.matches("^[+-]\\d+");
    }
}
