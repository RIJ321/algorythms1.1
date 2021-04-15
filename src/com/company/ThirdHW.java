package com.company;

import javax.management.StringValueExp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ThirdHW {

   /* public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println();

    }*/
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите число: ");
       String input = scanner.next();

       String one = "asda";
       char res=1;


       for (int i = 0; i < scanner.nextInt(); i++) {
           char asd = one.charAt(res);
           if (i ==input.length()-1)
               System.out.println(asd);

       }

   }

   }


