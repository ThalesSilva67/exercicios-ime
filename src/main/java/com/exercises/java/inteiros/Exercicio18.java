package com.exercises.java.inteiros;

import java.util.Scanner;
/*
18. Dados três números naturais, verificar se eles formam os lados de um triângulo retângulo.
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());
        int num3 = Integer.parseInt(input.nextLine());
        int temp;

        if(num2 > num) {
            temp = num;
            num = num2;
            num2 = temp;
        }
        if(num3 > num) {
            temp = num;
            num = num3;
            num3 = temp;
        }

        int hipotenusa = num * num;
        int cateto1 = num2 * num2;
        int cateto2 = num3 * num3;

        if(cateto1 + cateto2 == hipotenusa){
            System.out.println("é um triangulo retangulo");
        } else {
            System.out.println("não é um triangulo retangulo");
        }

    }

}
