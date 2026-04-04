package com.exercises.java.inteiros;

import java.util.Scanner;
/*
23. Dizemos que um número natural n é palíndromo (3) se
    o 1º algarismo de n é igual ao seu último algarismo,
    o 2º algarismo de n é igual ao penúltimo algarismo,
    e assim sucessivamente.

    Exemplos:
    567765 e 32423 são palíndromos.
    567675 não é palíndromo.
    Dado um número natural, verificar se n é palíndrome.
 */
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int temp = num;
        int digito;
        int invertido = 0;


        while(temp > 0) {
            digito = num % 10;
            invertido = invertido * 10 + digito;
            temp /= 10;
        }

        if(num == invertido) {
            System.out.printf("%d. É um palindromo", invertido);
        } else {
            System.out.printf("%d. Não é um palindromo", invertido);
        }
    }
}
