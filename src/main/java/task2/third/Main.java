package task2.third;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomenclatures = new String[15];
        String[] namesOfProducts = new String[5];
        for (int i = 0; i < namesOfProducts.length; i++) {
            namesOfProducts[i] = "Product" + i;
        }
        for (int i = 0; i < nomenclatures.length; i++) {
            nomenclatures[i] = "000" + Math.round(Math.random() * 4) + " " + "0"
                    + Math.round(Math.random() * 9) + "00" + " " + Math.round(Math.random() * 4);//заполняет массив таким образом:
            // 000*-наименование товара, 0*00-цена товара, *-ИНН поставщика
        }
        Manufacturer manufacturer1 = new Manufacturer(0, "Man1", "Samara");
        Manufacturer manufacturer2 = new Manufacturer(1, "Man2", "Moscow");
        Dealer dealer1 = new Dealer(2, "Man3", "Samara", manufacturer1.getName(), 1.2);
        Dealer dealer2 = new Dealer(3, "Man4", "Moscow", manufacturer2.getName(), 1.3);
        Dealer dealer3 = new Dealer(4, "Man5", "Moscow", manufacturer2.getName(), 1.5);
        Supplier[] suppliers = {manufacturer1, manufacturer2, dealer1, dealer2, dealer3};
        System.out.println(Arrays.toString(nomenclatures));
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            boolean isNoProduct = true;
            for (String nomenclature : nomenclatures) {
                if (nomenclature.equals(str)) {
                    String[] strings = str.split(" ");
                    int inn = Integer.parseInt(strings[2]);
                    String nameProduct = namesOfProducts[Integer.parseInt(strings[0])];
                    double prise = Double.parseDouble(strings[1]);
                    String name = null;
                    String address = null;
                    for (Supplier supplier : suppliers) {
                        if (inn == supplier.getInn()) {
                            if (supplier instanceof Dealer) {
                                prise = prise * ((Dealer) supplier).getPercent();
                                name = supplier.getName() + " (" + ((Dealer) supplier).getNameOfManufacturer() + ")";
                            } else {
                                name = supplier.getName();
                            }
                            address = supplier.getAddress();
                        }
                    }
                    System.out.println("Название товара: " + nameProduct + "\n" + "Цена: " + prise + "\n" + "Имя и адрес: " + name
                            + " " + address);
                    isNoProduct = false;
                    break;
                }
            }
            if (isNoProduct) {
                System.out.println("Такого товара нет");
            }
        }
    }
}
