package hw;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        System.out.println("===== task 2 =====");
        // Вывести все простые числа от 1 до 1000

        int maxNumber = 1000; // верхняя граница поиска простых чисел
        List<Integer> simpleNumbersList = GetSimpleIntegers(maxNumber);
        System.out.println("простые числа от 1 до " + maxNumber + ":");
        System.out.println(simpleNumbersList);
    }

    public static List<Integer> GetSimpleIntegers(int maximum) {
        List<Integer> resultList = new ArrayList<Integer>();
        resultList.add(1);
        for (int i = 2; i < maximum; i++) {
            for (int j = 2; j < i + 1; j++) {
                if (i % j != 0) {
                    continue;
                }
                if (j == i) {
                    resultList.add(i);
                } else
                    break;
            }
        }
        return resultList;
    }
}
