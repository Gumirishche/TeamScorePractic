package tasks1;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean go = true;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0, mean = 0;
        String str;
        while (go) {
            str=scanner.nextLine();
            if (str.isEmpty()) {
                go = false;
            } else {
                min = Math.min(Integer.parseInt(str), min);
                max = Math.max(Integer.parseInt(str), max);
                sum = sum + Integer.parseInt(str);
                mean++;
            }
        }
        mean = sum / mean;
        System.out.println("Min = " + min + "\nMax = " + max + "\nSum = " + sum + "\nMean = " + mean);
    }
}
