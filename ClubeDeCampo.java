/*Exercício 5 - Clube de Campo
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import java.util.Scanner;

public class ClubeDeCampo {
    public static void main(String[] args){

        //VARIÁVEIS

        int N, alturas10 = 0, qtd10 = 0, alturas15 = 0, qtd15 = 0, alturas21 = 0, qtd21 = 0, alturas21mais = 0, qtd21mais = 0;

        Scanner scn = new Scanner(System.in);

        //LER UM INTEIRO N (1 <= N <= 10)
        do {
            System.out.println("Insira um valor inteiro entre 1 e 10, incluindo-os: ");
            N = scn.nextInt();
            if((N>=1)&&(N<=10)){
                break;
            }
            System.out.println("invalido");
        }while((N<1)||(N>10));

        int[] ID = new int[N];
        int[] ALT = new int[N];

        //LER PARA OS ARRAYS "ID" E "ALT" OS DADOS CORRESPONDENTES À IDADE E À ALTURA DAS PESSOAS
        //CADASTRADAS;

            for(int i = 0; i < N; i++){
                System.out.printf("Insira a idade do candidato %d: ", (i+1));
                ID[i] = scn.nextInt();

                System.out.printf("Insira a altura do candidato %d em centimetros: ", (i+1));
                ALT[i] = scn.nextInt();

                // CALCULANDO OS VALORES DAS ALTURAS MÉDIAS PARA AS 4 FAIXAS ETÁRIAS
                if((ID[i]>0)&&(ID[i]<10)){
                    alturas10 = alturas10 + ALT[i];                    qtd10 = qtd10 + 1;
                }
                else if((ID[i]>10)&&(ID[i]<=15)){
                    alturas15 = alturas15 + ALT[i];
                    qtd15 = qtd15 + 1;
                }
                else if((ID[i]>15)&&(ID[i]<=21)){
                    alturas21 = alturas21 + ALT[i];
                    qtd21 = qtd21 + 1;
                }
                else if(ID[i]>21){
                    alturas21mais = alturas21mais + ALT[i];
                    qtd21mais = qtd21mais + 1;
                }
            }
        if(qtd10 == 0){
            qtd10 = 1;
        }
        if(qtd15 == 0){
            qtd15 = 1;
        }
        if(qtd21 == 0){
            qtd21 = 1;
        }
        if(qtd21mais == 0){
            qtd21mais = 1;
        }

        float media10 = (float)alturas10/qtd10;
        float media15 = (float)alturas15/qtd15;
        float media21 = (float)alturas21/qtd21;
        float media21mais = (float)alturas21mais/qtd21mais;

        //IMPRIMINDO OS VALORES DAS ALTURAS MÉDIAS PARA AS 4 FAIXAS ETÁRIAS
        System.out.printf("\nMedia das alturas:\n\n");
        if(media10!=0){
            System.out.printf("Faixa 1: idade menor ou igual a 10 anos: %.2f cm.\n", media10);
        }else
            System.out.printf("Nao ha candidatos com 10 anos ou menos.\n");
        if(media15!=0){
            System.out.printf("Faixa 2: idade maior que 10 e menor ou igual a 15 anos: %.2f cm.\n", media15);
        }else
            System.out.printf("Nao ha candidatos com a idade entre 10 e 15 anos.\n");
        if(media21!=0){
            System.out.printf("Faixa 3: idade maior que 15 e menor ou igual a 21 anos: %.2f cm.\n", media21);
        }else
            System.out.printf("Nao ha candidatos com a idade entre 15 e 21 anos.\n");
        if(media21mais!=0){
            System.out.printf("Faixa 4: idade maior que 21 anos: %.2f cm.\n", media21mais);
        }else
            System.out.printf("Nao ha candidatos com mais de 21 anos.\n");

    }
}
