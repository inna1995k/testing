package com.company;

//Roman to Integer

import java.util.HashMap;
import java.util.Map;

public class LeetCode2 {

    public static int romanToInt(String s) {
        // Создаем таблицу значений римских символов
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0; // Итоговое значение
        int prevValue = 0; // Предыдущее значение символа

        // Проходим по строке справа налево
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // Если текущее значение меньше предыдущего, вычитаем его
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // В противном случае добавляем
                total += currentValue;
            }

            // Обновляем предыдущее значение
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        // Примеры входных данных
        String roman1 = "III";
        String roman2 = "LVIII";
        String roman3 = "MCMXCIV";

        // Вывод результата для каждого примера
//        System.out.println("Roman numeral: " + roman1 + " -> Integer: " + romanToInt(roman1));
//        System.out.println("Roman numeral: " + roman2 + " -> Integer: " + romanToInt(roman2));
        System.out.println("Roman numeral: " + roman3 + " -> Integer: " + romanToInt(roman3));
    }
}
