package com.exercises.java.inteiros;

import java.util.Scanner;
/*
7. Dados n e uma seqüência de n números inteiros, determinar a soma dos números pares.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int soma = 0;
        for(int i = 1; i <= n; i++){
            int num = Integer.parseInt(input.nextLine());
            if(num % 2 == 0){
                soma += num;
            }
        }
        System.out.println(soma);
    }
}

