package tasks1;

public class Rounding {
    private void rounding() {
        System.out.println("                      30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675");
        System.out.println("Math.ceil():          " + Math.ceil(30.0) + ", " + Math.ceil(10000.1) + ", " + Math.ceil(12.5)
                + ", " + Math.ceil(99.99) + ", " + Math.ceil(0.0) + ", " + Math.ceil(-23.45) + ",  " + Math.ceil(-4.5)
                + ", " + Math.ceil(-129.675));
        System.out.println("Math.floor():         " + Math.floor(30.0) + ", " + Math.floor(10000.1) + ", " + Math.floor(12.5)
                + ", " + Math.floor(99.99) + ",  " + Math.floor(0.0) + ", " + Math.floor(-23.45) + ",  " + Math.floor(-4.5)
                + ", " + Math.floor(-129.675));
        System.out.println("Math.round(double a): " + Math.round(30.0) + ",   " + Math.round(10000.1) + ",   " + Math.round(12.5)
                + ",   " + Math.round(99.99) + ",   " + Math.round(0.0) + ",   " + Math.round(-23.45) + ",    " + Math.round(-4.5)
                + ",   " + Math.round(-129.675));
        System.out.println("Math.rint(double a):  " + Math.rint(30.0) + ", " + Math.rint(10000.1) + ", " + Math.rint(12.5)
                + ", " + Math.rint(99.99) + ", " + Math.rint(0.0) + ", " + Math.rint(-23.45) + ",  " + Math.rint(-4.5)
                + ", " + Math.rint(-129.675));
    }

    public static void main(String[] args) {
        new Rounding().rounding();
    }
}
