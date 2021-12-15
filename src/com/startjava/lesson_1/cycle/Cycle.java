package com.startjava.lesson_1.cycle;
/**
 * Выведите на консоль с помощью цикла for все числа от [0, 20]
 * Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
 * Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
 */
public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        int startRange = 6;
        int endRange = -6;
        while (startRange >= endRange) {
            System.out.print(startRange + " ");
            startRange -= 2;
        }

        startRange = 11;
        endRange = 20;
        int sum = 0;
        do {
            sum += startRange;
            startRange += 2;
        } while (startRange <= endRange);
        System.out.println(sum);
    }
}

