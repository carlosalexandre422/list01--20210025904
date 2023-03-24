/*Exercício 7 - OperacoesMarizes
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import java.util.Arrays;
import java.util.Scanner;

public class OperacoeMatrizes {

    static int menor;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int i, j;
        int matrizabaixo = 0, matrizacima = 0;

        //COLETANDO OS VALORES DOS ELEMENTOS DA MATRÍZ

        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.printf("insira o %d° numero da %d° coluna: ", (i + 1), (j + 1));
                matriz[i][j] = scn.nextInt();

                menor = matriz[i][j];
            }
        }

        //IMPRIMINDO A MATRÍZ GERADA

        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 3; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.print("\n");
        }
        
        //CHAMANDO AS FUNÇÕES
        mediaAbaixo(matriz);
        somaAcima(matriz);
        mediaDiagPrincipal(matriz);
        menorNum(matriz);
        somaTotal(matriz);


    }

    //SOMA DE TODOS OS ELEMENTOS DA MATRIZ

    static void somaTotal(int matriz[][]) {
        int soma = Arrays.stream(matriz).flatMapToInt(linha -> Arrays.stream(linha)).sum();
        ;
        System.out.printf("e) Soma de todos os elementos da matriz: %d.\n", soma);
    }

    //MÉDIA DA DE TODOS OS ELEMENTOS ABAIXO DA DIAGONAL PRINCIPAL

    static void mediaAbaixo(int matriz[][]) {
        int matrizabaixo = 0, qtd = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i > j) {
                    matrizabaixo = matrizabaixo + matriz[i][j];
                    qtd = qtd + 1;
                }
            }
        }
        float mediabaixo = (float)matrizabaixo / qtd;
        System.out.printf("a) Média dos elementos abaixo da diagonal principal: %.2f.\n", mediabaixo);
    }

    //MÉDIA DE TODOS OS ELEMENTOS DA DIAGONAL PRINCIPAL

    static void mediaDiagPrincipal(int matriz[][]) {
        int diagPrinc = 0, qtd = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == j) {
                    diagPrinc = diagPrinc + matriz[i][j];
                    qtd = qtd + 1;
                }
            }
        }
        float mediaDiagPrinc = diagPrinc / qtd;
        System.out.printf("c) Média dos elementos da diagonal principal: %.2f.\n", mediaDiagPrinc);
    }

    //SOMA DE TODOAS OS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL

    static void somaAcima(int matriz[][]) {
        int matrizacima = 0, qtd = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i < j) {
                    matrizacima = matrizacima + matriz[i][j];
                    qtd = qtd + 1;
                }
            }
        }
        System.out.printf("b) Soma dos elementos acima da diagonal principal: %d.\n", matrizacima);

    }

    //MENOR NÚMERO DA MATRIZ

    public static void menorNum(int matriz[][]){
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }System.out.printf("d) Menor elemento da matriz: %d.\n", menor);
    }

}
