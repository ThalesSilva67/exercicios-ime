package com.exercises.java.inteiros;

import java.util.Scanner;
/*
6. Dados um número de alunos de uma turma de Introdução aos Autômatos a Pilha (MAC 414) e as suas notas da primeira prova,
determinar a maior e a menor nota obtidas por essa turma (Nota máxima = 100 e nota mínima = 0).
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
           int grade = Integer.parseInt(input.nextLine());

           if(grade > max){
               max = grade;
           }

           if(grade < min) {
               min = grade;
           }
        }

        System.out.println("Menor nota: " + min);
        System.out.println("Maior nota: " + max);


    }
}
