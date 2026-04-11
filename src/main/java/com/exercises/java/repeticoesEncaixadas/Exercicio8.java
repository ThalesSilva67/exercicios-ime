package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
8. (POLI 97) Dizemos que uma seqüência de inteiros positivos é k-alternante se for composta alternadamente por segmentos de números pares de
tamanho k e segmentos de números ímpares de tamanho k.

Exemplos:
A seqüência 1 3 6 8 9 11 2 4 1 7 6 8 é 2-alternante.
A seqüência 2 1 4 7 8 9 12 é 1-alternante.
A seqüência 4 2 3 1 6 4 2 9 3 não é alternante.
A seqüência 1 3 5 é 3-alternante.

Dado n > 1 e uma seqüência com n inteiros, verificar se existe um inteiro k > 1 tal que a seqüência é k-alternante.
Dê como saída também o valor de k caso a seqüência seja alternante.
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da sequencia");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("Digite o primeiro numero da sequencia");
        int num = Integer.parseInt(input.nextLine());
        int count = 1;
        int k = 0;
        boolean paridadeAnterior = num % 2 == 0;
        boolean flag = true;

        for (int i = 1; i < n; i++) {
            System.out.println("Digite os proximos números da sequencia");
            num = Integer.parseInt(input.nextLine());
            boolean paridadeAtual = num % 2 == 0;

            if (paridadeAnterior == paridadeAtual) {
                count++;
            } else {
                if (k == 0) {
                    k = count;
                } else {
                    if (count != k) {
                        flag = false;
                    }
                }
                count = 1;
                paridadeAnterior = paridadeAtual;
            }

        }

        if(k == 0) k = count;

        if(count != k || k <= 1) flag = false;

        if(flag) {
            System.out.printf("A sequencia é %d-alternante\n", k);
        } else {
            System.out.println("A sequencia não é k-alternante\n");
        }

    }
}
