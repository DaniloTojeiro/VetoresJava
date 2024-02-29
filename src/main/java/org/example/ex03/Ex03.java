package org.example.ex03;

//3-Ler um vetor que contenha as notas de uma turma de 10 alunos. Calcular a média da turma
//e contar quantos alunos obtiveram nota acima desta média calculada.
//Escrever a média da turma e o resultado da contagem.

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[10];

        System.out.println("Informe as notas dos 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double mediaTurma = soma / notas.length;

        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > mediaTurma) {
                acimaMedia++;
            }
        }

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Quantidade de alunos com nota acima da média: " + acimaMedia);

        scanner.close();
    }
}
