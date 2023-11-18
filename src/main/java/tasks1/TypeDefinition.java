package tasks1;

import java.util.Scanner;

public class TypeDefinition {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите данные:");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                Integer.parseInt(str);
                System.out.println("Integer");

            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(str);
                    System.out.println("Double");
                } catch (NumberFormatException exception) {
                    System.out.println((str.equals("true") || str.equals("false")) ? "Boolean" : "String");
                }
            }
        }
    }
}
