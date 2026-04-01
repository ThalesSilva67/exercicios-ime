package com.exercises.java.inteiros;

import java.util.Scanner;
/*
11. Dado um inteiro positivo n, verificar se n é primo.
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        boolean primo = true;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                primo = false;
                break;
            }
        }

        if(primo && num != 1) {
            System.out.println("é primo");
        } else {
            System.out.println("não é primo");
        }

    }
}
