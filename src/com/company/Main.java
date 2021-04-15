package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Введите годовую сумму: ");
        int in = scanner.nextInt();

        float bonus5 = (in * 0.5f) * 0.05f;
        float bonus8 = (in * 0.3f) * 0.08f;
        float bonus10 = (in * 0.2f) * 0.1f;
        float sum = bonus5 + bonus10+ bonus8;

        System.out.println("Бонус 50% / 5%:" + bonus5);
        System.out.println("Бонус 30% / 8%:" + bonus8);
        System.out.println("Бонус 20% / 10%:" + bonus10);

        System.out.println("Сумма всех бонусов: "+ sum);
        System.out.println("Общий доход: " + (in + sum));
*/
        Scanner scanner = new Scanner(System.in);
        int[] banknotes = {1, 3, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000};
        int[] quantities = {10, 5, 5, 3, 2, 1, 2, 3, 3, 2, 0, 2};


        int num = 0;
        int totalAvailable = 0;
        int quantity;
        int tempAvailable = 0;
        String result = "";

        System.out.println("Введиту сумму для снятия со счёта: ");
        int withDraw = scanner.nextInt();
        int remainingAmountToGet = withDraw;


        for (int i = banknotes.length - 1; i > -1; i--) {
            totalAvailable = totalAvailable + banknotes[i] * quantities[i];
        }

        if (remainingAmountToGet > totalAvailable) {
            System.out.println("Вы можете снять только: " + totalAvailable);
        } else {
            for (int i = banknotes.length - 1; i > -1; i--) {
                if (quantities[i] > 0) {
                    quantity = remainingAmountToGet / banknotes[i];
                    if (quantity > 0) {
                        if (quantities[i] >= quantity) {
                            result = result + " " + quantity + " X " + banknotes[i];
                            quantities[i] -= quantity;
                            remainingAmountToGet = remainingAmountToGet - quantity * banknotes[i];
                            num += quantity * banknotes[i];
                            if (remainingAmountToGet == 0) {
                                break;
                            }
                        } else {
                            tempAvailable += quantities[i] * banknotes[i];
                            remainingAmountToGet -= quantities[i] * banknotes[i];
                            result += " " + quantities[i] + " X " + banknotes[i];
                        }
                    }
                }
            }
            if (withDraw == num) {
                System.out.println(result + "\n" +
                        "Снято: " + num);
            }
            else if (tempAvailable + num == withDraw){
                System.out.println(result + "\n" +
                        "Снято: " + (tempAvailable + num));
            }
            else
                System.out.println("Вы можете снять: "+(num + tempAvailable) );
        }
   /* if (quantity> quantities[i]){
   tempAvailable=tempAvailable+banknotes[i]*quantities[i];
   if (tempAvailable==remainingAmountToGet)
   break;
   System.out.println("Вы можете снять только: " + tempAvailable);
   }*/
        /* else {
                            for (int j = banknotes.length-1; j > -1; j--) {
                                if (quantities[j]==0)continue;
                                tempAvailable = tempAvailable+(remainingAmountToGet/( quantities[j] * banknotes[j]));
                            }
                            System.out.println("Вы можете снять только: " + tempAvailable);
                            break;
                        }*/

    }
}
