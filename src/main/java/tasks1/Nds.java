package tasks1;

import java.util.Scanner;

public class Nds {
    public static void main(String[] args) {
        System.out.println("Введите стоимость торвара:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        long sum = Math.round(Double.parseDouble(str)*100);
        sum = Math.round(sum / 1.2);
        long nds = Math.round(sum * 0.2);
        System.out.println("Стоимость товара без НДС: " + Double.parseDouble(String.valueOf(sum))/100);
        double ndsInReceipt = Double.parseDouble(String.valueOf(nds)) / 100;
        System.out.println("Сумма НДС в чеке: " + ndsInReceipt);
        System.out.println("Сумма НДС для налоговой декларации: " + Math.round(ndsInReceipt));
    }
}
