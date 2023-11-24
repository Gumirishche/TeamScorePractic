package tasks1;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean go = true;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        double mean;
        int count = 0;
        String str;
        while (go) {
            str = scanner.nextLine();
            if (str.isEmpty()) {
                go = false;
            } else {
                min = Math.min(Double.parseDouble(str), min);
                max = Math.max(Double.parseDouble(str), max);
                sum = sum + Double.parseDouble(str);
                count++;
            }
        }
        mean = sum / count;
        System.out.println("Min = " + min + "\nMax = " + max + "\nSum = " + sum + "\nMean = " + mean);
    }
}
