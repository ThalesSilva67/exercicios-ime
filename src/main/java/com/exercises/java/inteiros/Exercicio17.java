package com.exercises.java.inteiros;

import java.util.Scanner;
/*
17. Dado um número natural na base decimal, transformá-lo para a base binária.

Exemplo: Dado 18 a saída deverá ser 10010.
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        String binario = "";

        while(num != 0) {
            int resto = num % 2;
            binario = resto + binario;
            num /= 2;
        }

        System.out.printf("%s", binario);
    }
}
