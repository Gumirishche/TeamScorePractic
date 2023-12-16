package task8;

import task8.exceptions.AlreadyExistsException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            for (int i = 0; i < stringList.size(); i++) {
                if (str.equals(stringList.get(i))) {
                    throw new AlreadyExistsException(str, i + 1);
                }
            }
            stringList.add(str);
        }
    }
}
