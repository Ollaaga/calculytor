package main.java.olga;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scan = new Scanner(System.in);
            System.out.println("Введите данные");
            if (scan.hasNextInt()) {
            int number1 = scan.nextInt();
            checkRange (number1);
            char c = scan.next().charAt(0);
            int number2 = scan.nextInt();
            checkRange(number2);
            if (c == '+')
                System.out.println(number1 + number2);
            if (c == '*')
                System.out.println(number1 * number2);
            if (c == '/')
                System.out.println(number1 / number2);
            if (c == '-')
                System.out.println(number1 - number2);

        }
else {
        String [] roman = scan.nextLine().split(" ");
        int number1 = Roman.romanToArabic(roman[0]);
        checkRange(number1);
        char c = roman [1].charAt(0);
        int number2 = Roman.romanToArabic(roman[2]);
        checkRange(number2);
        if (c == '+')
            System.out.println(Roman.arabicToRoman(number1 + number2));
        if (c == '*')
            System.out.println(Roman.arabicToRoman(number1 * number2));
        if (c == '/')
            System.out.println(Roman.arabicToRoman(number1 / number2));
        if (c == '-')
            System.out.println(Roman.arabicToRoman(number1 - number2));
    }
    }

private static void checkRange (int number) throws Exception {
        if (number<0||number>10)
      throw new Exception("Неверный диапазон");
    }
}
