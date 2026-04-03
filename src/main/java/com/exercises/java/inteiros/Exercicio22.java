package com.exercises.java.inteiros;

import java.util.Scanner;
/*
22. (POLI 89) Dados n e uma seqüência de n números inteiros, determinar o comprimento de um segmento crescente de comprimento máximo.

Exemplos:
Na seqüência 5, 10, 3, 2, 4, 7, 9, 8, 5 o comprimento do segmento crescente máximo é 4.
Na seqüência 10, 8, 7, 5, 2 o comprimento de um segmento crescente máximo é 1.
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //5,  10,  3,  2,  4,  7,  9,  8,  5
        System.out.println("Digite a quantidade de números da sequencia:");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Digite o primeiro número da sequencia:");
        int left = Integer.parseInt(input.nextLine());
        int right;
        int count = 1;
        int maxCount = 1;

        for(int i = 1; i < num; i++) {
            System.out.println("Digite o proximo número:");
            right = Integer.parseInt(input.nextLine());
            if(left < right) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
            left = right;
        }

        System.out.printf("O comprimento do segmento crescente máximo é = %d\n", maxCount);
    }
}
