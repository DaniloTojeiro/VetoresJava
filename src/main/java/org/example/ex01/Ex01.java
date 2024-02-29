package org.example.ex01;

//1-Criar um vetor com 5 posições de inteiros e exibir o produto de todos valores.

public class Ex01 {

    public static void main(String[] args) {
        int[] vetor = {2, 3, 4, 5, 6};

        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            produto *= vetor[i];
        }

        System.out.println("O produto de todos os valores do vetor é: " + produto);
    }
}
