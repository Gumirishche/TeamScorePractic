package tasks1;

import java.util.Scanner;

public class Countdown {
    private static String format(int count, int format) {
        String[] str = switch (count % 10) {
            case 1 -> new String[]{" день ", " час ", " минута "};
            case 2, 3, 4 -> new String[]{" деня ", " часа ", " минуты "};
            case 5, 6, 7, 8, 9, 0 -> new String[]{" деней ", " часов ", " минутут "};
            default -> throw new IllegalStateException("Unexpected value: " + count % 10);
        };
        if ((count % 100) > 10 && (count % 100) < 20) {
            str = new String[]{" деней ", " часов ", " минутут "};
        }
        return str[format];
    }

    public static void main(String[] args) {
        System.out.println("Введите кол-во минут:");
        Scanner scanner = new Scanner(System.in);
        int minutes = Integer.parseInt(scanner.nextLine());
        if (minutes == 0) {
            System.out.println("Уже началось!");
        } else {
            int days = minutes / 1440;
            int remainingMinutes = minutes % 1440;
            System.out.println(remainingMinutes);
            int hours = remainingMinutes / 60;
            remainingMinutes = remainingMinutes % 60;
            System.out.println(remainingMinutes);
            System.out.println(minutes + " минут это " + days + format(days, 0) + hours + format(hours, 1)
                    + remainingMinutes + format(remainingMinutes, 2));
        }
    }
}
