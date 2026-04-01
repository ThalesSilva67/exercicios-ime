package com.exercises.java.inteiros;

import java.util.Scanner;
import java.util.stream.IntStream;
/*
9. Dados n e dois números inteiros positivos i e j diferentes de 0, imprimir em ordem crescente os n primeiros naturais que são múltiplos de i ou de j e ou de ambos.

 Exemplo: Para n = 6 , i = 2 e j = 3 a saída deverá ser: 0,2,3,4,6,8.
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int i = Integer.parseInt(input.nextLine());
        int j = Integer.parseInt(input.nextLine());

        IntStream.iterate(0, a -> a + 1)
                .filter(a-> a % i == 0 || a % j == 0)
                .limit(num)
                .forEach(System.out::println);
    }
}
