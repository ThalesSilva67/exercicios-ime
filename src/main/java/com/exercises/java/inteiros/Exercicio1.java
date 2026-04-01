package com.exercises.java.inteiros;

import java.util.Scanner;
/*
    1. Dada uma seqüência de números inteiros não-nulos, seguida por 0, imprimir seus quadrados.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        while(num != 0) {
            num = num * num;
            System.out.println(num);
            num = Integer.parseInt(input.nextLine());
        }
    }
}
