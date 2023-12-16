package tasks4.third.model;

import java.util.Arrays;

public class Algorithm {
    private final Supplier[] suppliers = new Supplier[]{new Supplier(600, 5.2), new Supplier(420, 4.5),
            new Supplier(360, 6.1), new Supplier(250, 3.8),
            new Supplier(700, 6.4), new Supplier(390, 5.6)};
    private final GasStation[] gasStations = new GasStation[]{new GasStation(new int[]{803, 967, 825, 1024, 754, 911}),
            new GasStation(new int[]{952, 1012, 945, 1800, 817, 668}), new GasStation(new int[]{997, 848, 777, 931, 531, 865}),
            new GasStation(new int[]{931, 1200, 848, 999, 628, 1526})};

    private final int[] costForSupplier = new int[suppliers.length];
    private int[] emptyStations = new int[0];

    public int findLowestPrice(double priceFloor) {
        int indexOfSupplier = 0;
        double lowestPrice = Double.MAX_VALUE;
        for (int i = 0; i < suppliers.length; i++) {
            if (lowestPrice > suppliers[i].getPrice() && suppliers[i].getPrice() > priceFloor) {
                indexOfSupplier = i;
                lowestPrice = suppliers[i].getPrice();
            }
        }
        //System.out.println(suppliers[indexOfSupplier].getPrice());
        return indexOfSupplier;
    }

    public int findLowestCost(int index) {
        int indexOfStation = 0;
        int lowestCost = Integer.MAX_VALUE;
        for (int i = 0; i < gasStations.length; i++) {
            boolean isNotEmpty = true;
            for (int emptyStation : emptyStations) {
                if (i == emptyStation) {
                    isNotEmpty = false;
                    break;
                }
            }
            if (lowestCost > gasStations[i].getCostOfDelivery()[index] && isNotEmpty) {
                //System.out.println(gasStations[i].getCostOfDelivery()[indexOfSupplier]);
                indexOfStation = i;
                lowestCost = gasStations[i].getCostOfDelivery()[index];
            }
        }
        //System.out.println(gasStations[indexOfStation].getCostOfDelivery()[indexOfSupplier]);
        return indexOfStation;
    }

    public void standardAlgorithm(int[] volumes) {
        Arrays.fill(costForSupplier, 0);
        int indexOfSupplier = findLowestPrice(0);
        int indexOfStation = findLowestCost(indexOfSupplier);
        for (int i = 0; i < gasStations.length; i++) {
            while (true) {
                if (suppliers[indexOfSupplier].getCurrentVolume() < volumes[indexOfStation]) {
                    volumes[indexOfStation] = volumes[indexOfStation] - suppliers[indexOfSupplier].getCurrentVolume();
                    suppliers[indexOfSupplier].costOfVolume(suppliers[indexOfSupplier].getCurrentVolume());
                    costForSupplier[indexOfSupplier] = costForSupplier[indexOfSupplier] + gasStations[indexOfStation].getCostOfDelivery()[indexOfSupplier];
                    indexOfSupplier = findLowestPrice(suppliers[indexOfSupplier].getPrice());
                } else {
                    suppliers[indexOfSupplier].costOfVolume(volumes[indexOfStation]);
                    emptyStations = Arrays.copyOf(emptyStations, emptyStations.length + 1);
                    emptyStations[emptyStations.length - 1] = indexOfStation;
                    costForSupplier[indexOfSupplier] = costForSupplier[indexOfSupplier] + gasStations[indexOfStation].getCostOfDelivery()[indexOfSupplier];
                    break;
                }
            }
            indexOfStation = findLowestCost(indexOfSupplier);
        }
        System.out.println("_______________________________________________________________________________________________\n"
                + "| №поставщика  |   Объём закупки   |  Сумма затрат по поставщикам  |  По АЗС  |  Общие затраты |\n"
                + "_______________________________________________________________________________________________\n"
                + "|      1       |     " + suppliers[0].gasSold() + "            |          "
                + suppliers[0].getTotalPrice() + "              |   " + costForSupplier[0]
                + "   |   " + (suppliers[0].getTotalPrice() + costForSupplier[0])
                + "       |\n"
                + "|      2       |     " + suppliers[1].gasSold() + "            |          "
                + suppliers[1].getTotalPrice() + "              |   " + costForSupplier[1]
                + "   |   " + (suppliers[1].getTotalPrice() + costForSupplier[1])
                + "       |\n"
                + "|      3       |     " + suppliers[2].gasSold() + "              |          "
                + suppliers[2].getTotalPrice() + "                 |   " + costForSupplier[2]
                + "      |   " + (suppliers[2].getTotalPrice() + costForSupplier[2])
                + "          |\n"
                + "|      4       |     " + suppliers[3].gasSold() + "            |          "
                + suppliers[3].getTotalPrice() + "               |   " + costForSupplier[3]
                + "    |   " + (suppliers[3].getTotalPrice() + costForSupplier[3])
                + "       |\n"
                + "|      5       |     " + suppliers[4].gasSold() + "              |          "
                + suppliers[4].getTotalPrice() + "                 |   " + costForSupplier[4]
                + "      |   " + (suppliers[4].getTotalPrice() + costForSupplier[4])
                + "          |\n"
                + "|      6       |     " + suppliers[5].gasSold() + "            |          "
                + suppliers[5].getTotalPrice() + "              |   " + costForSupplier[5]
                + "    |   " + (suppliers[5].getTotalPrice() + costForSupplier[5])
                + "       |\n"
                + "_______________________________________________________________________________________________\n");
    }

//    public static void main(String[] args) {
//        Algorithm algorithm = new Algorithm();
//        System.out.println(algorithm.findLowestPrice(6));
//        System.out.println(algorithm.emptyStations.length);
//        System.out.println(algorithm.findLowestCost(algorithm.findLowestPrice(6)));
//        System.out.println(algorithm.findLowestPrice(4));
//        System.out.println(algorithm.findLowestCost(algorithm.findLowestPrice(4)));
//        algorithm.standardAlgorithm(new int[]{400, 550, 280, 310});
//    }
}
