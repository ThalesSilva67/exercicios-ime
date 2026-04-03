package com.exercises.java.inteiros;

import java.util.Scanner;
/*
21. (POLI 87) Dados n e uma seqüência de n números inteiros, determinar quantos segmentos de números iguais consecutivos compõem essa seqüência.

Exemplo: A seguinte seqüência é formada por 5 segmentos de números iguais: 5, 2, 2, 3, 4, 4, 4, 4, 1, 1
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de números da sequencia:");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Digite o primeiro número:");
        int left = Integer.parseInt(input.nextLine());
        int right;
        int count = 1;

        for(int i = 2; i <= num; i++) {
            System.out.println("Digite o proximo número:");
            right = Integer.parseInt(input.nextLine());
            if(left != right) {
                count++;
                left = right;
            }
        }

        System.out.printf("Quantidade de segmentos iguais da sequencia = %d\n", count);
    }
}
