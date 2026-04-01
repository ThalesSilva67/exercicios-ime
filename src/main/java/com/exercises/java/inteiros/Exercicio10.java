package com.exercises.java.inteiros;

import java.util.Scanner;
/*
10. Dizemos que um número natural é triangular se ele é produto de três números naturais consecutivos.

Exemplo: 120 é triangular, pois 4.5.6 = 120.

Dado um inteiro não negativo n, verificar se n é triangular.
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        boolean isTriangular = false;

        for(int i = 1; i * (i + 1) * (i + 2) <= num; i++){
            if(i * (i + 1) * (i + 2) == num) {
                isTriangular = true;
                break;
            }
        }

        if(isTriangular){
            System.out.println("TRIANGULAR");
        } else{
            System.out.println("NÃO É TRIANGULAR");
        }
    }
}
