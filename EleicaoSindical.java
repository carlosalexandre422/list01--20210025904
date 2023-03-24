/*Exercício 2 - Eleição Sindical
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import java.util.Scanner;

public class EleicaoSindical {
    public static void main(String[] args) {

        //VARIÁVEIS

        int a, b, c, nulos, brancos, total=0, validos=0;
        Scanner scn = new Scanner(System.in);

        //COLETA DE VOTOS 

        System.out.println("Quantidade de votos do candidato A: ");
        a = scn.nextInt();
        validos+=a;
        total+=a;

        System.out.println("Quantidade de votos do candidato B: ");
        b = scn.nextInt();
        total+=b;
        validos+=a;

        System.out.println("Quantidade de votos do candidato C: ");
        c = scn.nextInt();
        total+=c;
        validos+=a;

        System.out.println("Quantidade de votos nulos: ");
        nulos = scn.nextInt();
        total+=nulos;

        System.out.println("Quantidade de votos brancos: ");
        brancos = scn.nextInt();
        total+=brancos;

        //IMPRIMINDO OS RESULTADOS DA ELEIÇÃO
        
        System.out.printf("Percentual de A em relação ao total de eleitores: %.2f%%\n", ((float)a/total*100));
        System.out.printf("Percentual de B em relação ao total de eleitores: %.2f%%\n", ((float)b/total*100));
        System.out.printf("Percentual de C em relação ao total de eleitores: %.2f%%\n", ((float)c/total*100));
        System.out.printf("Percentual de nulos em relação ao total de eleitores: %.2f%%\n", ((float)nulos/total*100));
        System.out.printf("Percentual de brancos em relação ao total de eleitores: %.2f%%\n", ((float)brancos/total*100));

    }
}
