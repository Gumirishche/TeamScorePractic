package tasks4.second;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayStatistics {
    private final int[] numbers;

    public ArrayStatistics(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] mode() {
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] repeatingNumbers = new int[1];
        int numberNext;
        int count = 0;
        int countNext;
        for (int j : numbers) {
            countNext = 0;
            numberNext = j;
            if (Arrays.asList(Arrays.stream(repeatingNumbers).boxed().toArray()).contains(numberNext)) {
                continue;
            }
            for (int number : numbers) {
                if (numberNext == number) {
                    countNext++;
                }
            }
            if (countNext > count) {
                count = countNext;
                repeatingNumbers = new int[]{numberNext};
            } else if (countNext == count) {
                repeatingNumbers = Arrays.copyOf(repeatingNumbers, repeatingNumbers.length + 1);
                repeatingNumbers[repeatingNumbers.length - 1] = numberNext;
            }
        }
        System.out.println(Arrays.toString(repeatingNumbers));
        return repeatingNumbers;
    }

    public double median() {
        if (numbers.length == 0) {
            return 0;
        }
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
        if (sortedNumbers.length % 2 == 0) {
            return ((double) (sortedNumbers[sortedNumbers.length / 2] + sortedNumbers[sortedNumbers.length / 2 - 1])) / 2;
        } else {
            return sortedNumbers[sortedNumbers.length / 2];
        }
    }

    public double average() {
        double sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return (double) Math.round(sum * 10 / numbers.length) / 10;
    }

    public double variance() {
        double average = average();
        double sum = 0;
        for (int number : numbers) {
            sum = sum + Math.pow((number - average), 2);
        }
        return ((double) Math.round(sum * 10 / numbers.length)) / 10;
    }

    public double geometricMean() {
        double multiple = 1;
        for (int number : numbers) {
            multiple = number * multiple;
        }
        return ((double) Math.round((Math.pow(multiple, 1.0 / numbers.length)) * 10)) / 10;
    }

    public int[] shuffle() {
        List<Integer> shuffleNumbers = Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new));
        Collections.shuffle(shuffleNumbers);
        return shuffleNumbers.stream().mapToInt(i -> i).toArray();
    }

    public int[] sample(int size) {
        return Arrays.copyOf(numbers, size);
    }

    public static void main(String[] args) {
        System.out.println(new ArrayStatistics(new int[]{1, 2, 3, 4, 9, 5, 6, 7, 8, 1}).variance());
        System.out.println(Arrays.toString(new ArrayStatistics(new int[]{1, 2, 3, 4, 8, 5, 6, 7, 8, 1, 10}).shuffle()));
    }
}
