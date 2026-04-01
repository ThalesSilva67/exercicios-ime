package com.exercises.java.inteiros;

import java.util.Scanner;
/*
14. Um matemático italiano da idade média conseguiu modelar o ritmo de crescimento da população de coelhos (1) por uma seqüência de números naturais
que passou a ser conhecida como seqüência de Fibonacci (2). O n-ésimo número da seqüência de Fibonacci Fn é dado pela seguinte fórmula de recorrência:
Faça um programa que, dado n, calcula Fn.
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        int fibo1 = 0;
        int fibo2 = 1;
        int fibonacci = num;

        for(int i = 1; i < num; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        System.out.println(fibonacci);
    }

}
