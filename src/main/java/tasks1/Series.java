package tasks1;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int length = 0;
        int maxLength = 0;
        double sign = 0;
        for (int i = 0; i < n; i++) {
            double randomValue = (Math.random() - 0.5) * 2000;
            if (sign == Math.signum(randomValue) && Math.signum(randomValue) != 0) {
                length++;
            } else {
                length = 1;
            }
            System.out.println(randomValue + "        " + (int)Math.signum(randomValue));
            maxLength = Math.max(length, maxLength);
            sign = Math.signum(randomValue);
        }
        System.out.println("Самая длиная серия: " + maxLength);
    }
}
