package tasks1;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //double[] massive = {1, 2, 3, 4, 5, 0, 1, 2, 3, -1, -2, 3};    Проверка
        //n = massive.length;
        double randomNew, random = 0;
        int length = 0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                random = (Math.random() - 0.5) * 2000;
                //random = massive[i];
                System.out.println(random + "        " + ((random < 0) ? "-" : "+"));
                length++;
            } else {
                randomNew = (Math.random() - 0.5) * 2000;
                //randomNew = massive[i];
                System.out.println(randomNew + "        " + ((randomNew < 0) ? "-" : "+"));
                if (random < 0 && randomNew < 0 || random > 0 && randomNew > 0) {
                    random = randomNew;
                    length++;
                } else {
                    if (length > maxLength) {
                        maxLength = length;
                    }
                    random = randomNew;
                    length = 1;
                }
            }
        }
        System.out.println("Самая длиная серия: " + maxLength);
    }
}
