package tasks1;

import java.util.Scanner;

public class Nds {
    public static void main(String[] args) {
        System.out.println("Введите стоимость торвара:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        long totalSum = Math.round(Double.parseDouble(str) * 100);
        long sum = Math.round(totalSum / 1.2);
        long nds = totalSum - sum;
        System.out.println("Стоимость товара без НДС: " + Double.parseDouble(String.valueOf(sum)) / 100);
        double ndsInReceipt = Double.parseDouble(String.valueOf(nds)) / 100;
        System.out.println("Сумма НДС в чеке: " + ndsInReceipt);
        System.out.println("Сумма НДС для налоговой декларации: " + Math.round(ndsInReceipt));
    }
}
