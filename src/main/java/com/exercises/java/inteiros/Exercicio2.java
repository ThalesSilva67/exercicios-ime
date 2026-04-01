package com.exercises.java.inteiros;

import java.util.Scanner;
/*
    2. Dado um número inteiro positivo n, calcular a soma dos n primeiros números inteiros positivos.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int sum = 0;
        for(int i = 1; i <= num; i++){
             sum = sum + i;
        }
        System.out.println(sum);
    }
}
