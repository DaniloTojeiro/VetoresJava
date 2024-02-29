package org.example.ex04;

//4-Ler um vetor A de 6 elementos contendo o gabarito da Mega Sena. A seguir, ler um vetor B de 10 elementos contendo uma aposta.
//Escreve quantos pontos fez o apostador, e se ele fez a sena (6 acertos), a quina (5 acertos) ou a quadra (4 acertos).

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] gabarito = new int[6];
        System.out.println("Informe os números do gabarito da Mega Sena:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            gabarito[i] = scanner.nextInt();
        }

        int[] aposta = new int[10];
        System.out.println("Informe os números da aposta:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            aposta[i] = scanner.nextInt();
        }

        int acertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (aposta[j] == gabarito[i]) {
                    acertos++;
                }
            }
        }

        String premio;
        switch (acertos) {
            case 6:
                premio = "Sena (6 acertos)";
                break;
            case 5:
                premio = "Quina (5 acertos)";
                break;
            case 4:
                premio = "Quadra (4 acertos)";
                break;
            default:
                premio = "Nenhum prêmio";
        }

        System.out.println("Você fez " + acertos + " pontos.");
        System.out.println("Prêmio: " + premio);

        scanner.close();
    }
}
