package com.exercises.java.inteiros;

import java.util.Scanner;
/*
12. Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles usando o algoritmo de Euclides.
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        while(b != 0) {
            int resto =  a % b;
            a = b;
            b = resto;
        }
        System.out.println(a);

    }
}
