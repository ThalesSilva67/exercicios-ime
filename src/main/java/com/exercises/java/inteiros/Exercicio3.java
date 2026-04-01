package com.exercises.java.inteiros;

import java.util.Scanner;
/*
3. Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares.
    Exemplo: Para n=4 a saída deverá ser 1,3,5,7.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =  Integer.parseInt(input.nextLine());
        int oddSequency = 1;

        for(int i = 1; i <= num; i++){
            System.out.println(oddSequency);
            oddSequency = oddSequency + 2;
        }
    }
}
