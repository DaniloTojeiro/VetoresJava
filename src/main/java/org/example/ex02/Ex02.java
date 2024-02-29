package org.example.ex02;

//2-Preencher um vetor com 10 valores reais e exibir todos os valores acima de 100.

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Valores acima de 100:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > 100) {
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
    }
}
