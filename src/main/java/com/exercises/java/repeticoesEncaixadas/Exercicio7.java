package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
7. Dados um inteiro positivo n e uma seqüência de n inteiros positivos, determinar o máximo divisor comum a todos eles.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da sequencia");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("Digite o primeiro numero da sequencia");
        int mdc = Integer.parseInt(input.nextLine());
        int resto;

        for(int i = 1; i < n; i++){
            System.out.println("Digite o proximo numero da sequencia");
            int nextNum = Integer.parseInt(input.nextLine());
            while(nextNum != 0){
                resto = mdc % nextNum;
                mdc = nextNum;
                nextNum = resto;
            }
        }

        System.out.printf("MDC: %d\n", mdc);
    }
}
