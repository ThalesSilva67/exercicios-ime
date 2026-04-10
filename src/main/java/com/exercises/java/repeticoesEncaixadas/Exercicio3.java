package com.exercises.java.repeticoesEncaixadas;

import java.util.Scanner;
/*
3. Dados dois naturais m e n determinar, entre todos os pares de números naturais (x,y)
tais que x < m e y < n, um par para o qual o valor da expressão xy - x2 + y seja máximo e calcular também esse máximo.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());

        int maxValue = 0;
        int bestX = 0;
        int bestY = 0;

        for(int x = 0; x <= m; x++) {
            for(int y = 0; y <= n; y++) {
                int result = x * y - (x * x) + y;
                if(result > maxValue) {
                    maxValue = result;
                    bestX = x;
                    bestY = y;
                }
            }
        }

        System.out.printf("O valor maximo alcançado: %d, com x = %d e y = %d\n", maxValue, bestX, bestY);
    }
}
