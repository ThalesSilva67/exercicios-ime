package com.exercises.java.inteiros;

/*
20. (FIS 88) Qualquer número natural de quatro algarismos pode ser dividido em duas dezenas formadas pelos seus dois primeiros e dois últimos dígitos.

Exemplos:
1297: 12 e 97.
5314: 53 e 14.
   Escreva um programa que imprime todos os milhares (4 algarismos) cuja raiz quadrada seja a soma das dezenas formadas pela divisão acima.
Exemplo: raiz de 9801 = 99 = 98 + 01.
Portanto 9801 é um dos números a ser impresso.
 */

public class Exercicio20 {
    public static void main(String[] args) {
        int num = 9999;
        int partOne;
        int partTwo;
        int sum;
        for(int i = 1000; i <= num; i++){
            partOne = i / 100;
            partTwo = i % 100;
            sum = partOne + partTwo;
            if(sum == Math.sqrt(i)) {
                System.out.printf("%d\n", i);
            }
        }

    }
}
