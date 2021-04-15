package com.company;

import java.util.Scanner;

public class SecondHW {

    public static void main(String[] args) {

        /*String str = "Hello world!";
        int start = 6;
        int end = str.length();
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst); // world*/

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuilder deleting = new StringBuilder(input);
        if (input.length() % 2 ==0){
            deleting.deleteCharAt(input.length()-1);
            deleting.deleteCharAt(input.length()-2);
            System.out.println(deleting);
        }
        if (input.length() %2 >0){
            int middle = input.length()/2;
            char first = input.charAt(middle);
            char second = input.charAt(middle-1);
            char third = input.charAt(middle+1);

            System.out.println(second+""+first+""+third);
        }


    }
}

/*
Написать программу, которая должна считывать введенное юзером слово и если длинна
слова состоит из нечетного количества букв, то программа должна распечатать только 3
буквы из середины слова. Если слово состоит из четного количества букв то необходимо
распечатать введенное слово без последних двух букв.
Примеры:
I.
Введите слово:
test
Результат:
te
II.
Введите слово:
Chicago
Результат:
Ica
 */