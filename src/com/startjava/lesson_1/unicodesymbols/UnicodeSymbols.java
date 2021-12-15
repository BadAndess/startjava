package com.startjava.lesson_1.unicodesymbols;
/**
 * Выведите в цикле символы кодировки Unicode (внимательно изучите тип char)
 * в диапазоне [9398, 10178]. Если выводятся непонятные символы или ?,
 * то используйте [33, 126]
 */
public class UnicodeSymbols {
    public static void main(String[] args) {
        for (int i = 9398; i <= 10178; i++) {
            System.out.println((char) i);
        }
    }
}