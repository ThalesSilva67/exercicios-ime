package com.exercises.java.inteiros;

import java.util.Scanner;
/*
4. Dados um inteiro x e um inteiro não-negativo n, calcular x n.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int num = Integer.parseInt(input.nextLine());
        int potency = 1;
        for(int i = 1; i <= num; i++){
            potency = potency * x;
        }

        System.out.println(potency);
    }
}

