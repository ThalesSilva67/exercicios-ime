package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
2. Dado um número inteiro positivo n, determinar todos os inteiros entre 1 e n
que são comprimento da hipotenusa de um triângulo retângulo com catetos inteiros.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        boolean encontrado = false;

        for(int i = 1; i <= num; i++){
            for(int j = 1; j < i; j++){
                for(int k = j; k < i; k++){
                    if(j * j + k * k == i * i) {
                        System.out.printf("hipotenusa = %d, catetos %d e %d\n", i, j, k);
                        encontrado = true;
                    }
                }
            }
        }

        if(!encontrado){
            System.out.printf("Nenhum triângulo com lados inteiros foi encontrado para n = %d", num);
        }

    }
}
