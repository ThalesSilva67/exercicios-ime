package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
4. Dados n números inteiros positivos, calcular a soma dos que são primos
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos números voce quer testar: ");
        int num = Integer.parseInt(input.nextLine());
        int n;
        int sum = 0;
        boolean primo;

       for(int i = 1; i <= num; i++){
           System.out.println("Digite o número: ");
           n = Integer.parseInt(input.nextLine());
           int raizQ = (int) Math.sqrt(n);
           primo = true;
           for (int j = 2; j <= raizQ; j++) {
               if (n % j == 0) {
                   primo = false;
                   break;
               }
           }
           if(primo && n != 1) {
               sum += n;
           }
       }

        System.out.printf("Resultado da soma dos números primos: %d\n", sum);

    }
}
