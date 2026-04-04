package com.exercises.java.inteiros;

import java.util.Scanner;
/*
24. São dados dois números inteiros positivos p e q, sendo que o número de dígitos de p é menor ou igual ao número de dígitos de q.
Verificar se p é um subnúmero de q.

Exemplos:
p = 23, q = 57238, p é subnúmero de q.
p = 23, q = 258347, p não é subnúmero de q.
 */
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = Integer.parseInt(input.nextLine());
        int q = Integer.parseInt(input.nextLine());

        int temp = p;
        int maxDigit = 0;

        while(temp > 0) {
            temp /= 10;
            maxDigit++;
        }

        int potency = (int) Math.pow(10, maxDigit);

        int aux = q;
        boolean encontrado = false;

        while(aux > 0) {
            int digito = aux % potency;
            if(p == digito) {
                System.out.printf("%d é subnúmero de %d\n", p, q);
                encontrado = true;
                break;
            }
            aux /= 10;
        }

        if(!encontrado) System.out.printf("%d não é subnúmero de %d\n", p, q);

    }
}
