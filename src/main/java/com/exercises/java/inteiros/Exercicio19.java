package com.exercises.java.inteiros;

import java.util.Scanner;
/*
19. Dados três números, imprimi-los em ordem crescente.
 */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =  Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());
        int num3 = Integer.parseInt(input.nextLine());


        if(num <= num2 && num2 <= num3) {
            System.out.printf("%d %d %d", num, num2, num3);
        } else if(num <= num3 && num3 <= num2) {
            System.out.printf("%d %d %d", num, num3, num2);
        } else if(num2 <= num && num <= num3) {
            System.out.printf("%d %d %d", num2, num, num3);
        } else if(num2 <= num3) {
            System.out.printf("%d %d %d", num2, num3, num);
        } else if(num <= num2) {
            System.out.printf("%d %d %d", num3, num, num2);
        } else  {
            System.out.printf("%d %d %d", num3, num2, num);
        }

    }
}
