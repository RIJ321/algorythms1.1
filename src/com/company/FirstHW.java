package com.company;

import java.util.Scanner;

public class FirstHW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите годовой доход: ");
        int in = scanner.nextInt();

        float bonus5 = (in * 0.5f) * 0.05f;
        float bonus8 = (in * 0.3f) * 0.08f;
        float bonus10 = (in * 0.2f) * 0.1f;
        float sum = bonus5 + bonus10 + bonus8;

        System.out.println("Нажмите если хотите: " +
                "\n1-Узнать 5% от 50% годовой зарплаты" +
                "\n2-Узнать 8% бонуса от 30% годовой зарплаты" +
                "\n3-Узнать 10% от 20% годовой зарплаты" +
                "\n4-Узнать общую сумму бонусов" +
                "\n5-Узнать весь доход вместе с бонусами");
        int func = scanner.nextInt();
        switch (func) {
            case 1:
                System.out.println("Бонус  5% от 50% годовой: " + bonus5);
                System.out.println("Бонус к годовой зарплате: " + (in + bonus5));
                break;
            case 2:
                System.out.println("Бонус 8% от 30% годовой: " + bonus8);
                System.out.println("Бонус к годовой зарплате: " + (in + bonus8));
                break;
            case 3:
                System.out.println("Бонус 10% от 20% годовой: " + bonus10);
                System.out.println("Бонус к годовой зарплате: " + (in + bonus10));
                break;
            case 4:
                System.out.println("Бонус  5% от 50% годовой: " + bonus5);
                System.out.println("Бонус  8% от 30% годовой: " + bonus8);
                System.out.println("Бонус  10% от 20% годовой: " + bonus10);
                   System.out.println("Сумма всех бонусов: " + sum);
                break;
            case 5:
                System.out.println("Бонус  5% от 50% от годовой: " + bonus5);
                System.out.println("Бонус  8% от 30% от годовой: " + bonus8);
                System.out.println("Бонус  10% от 20% от годовой: " + bonus10);
                System.out.println("Общий доход: " + (in + sum));
                break;
            default:
                System.out.println("Убедитесь в правильности набора.");
        }
    }
}
