package task3.fourth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
            System.out.println(new FormatterDate().weekRange(str));
        }
        scanner.close();
    }
}
