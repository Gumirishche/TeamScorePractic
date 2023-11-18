package tasks1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Nds {
    public static void main(String[] args) {
        System.out.println("Введите стоимость торвара:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double sum = Double.parseDouble(str);
        sum = sum / 1.2;
        double nds = sum * 0.2;
        System.out.println("Стоимость товара без НДС: " + sum);
        DecimalFormat format = new DecimalFormat("#.##");
        //System.out.println("Сумма НДС в чеке: " + nds);
        System.out.println("Сумма НДС в чеке: " + format.format(nds));
        System.out.println("Сумма НДС для налоговой декларации: " + Math.round(nds));
    }
}
