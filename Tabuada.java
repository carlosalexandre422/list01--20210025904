/*Exercício 1 - Tabuada
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i;
        
        do{

            //MENU

            System.out.println(" 1. Soma\n 2. Subtraçao\n 3. Multiplicação\n 4. Divisão\n");
            i = scn.nextInt();

            //CHAMANDO AS FUNÇÕES

            switch(i){
                case 1:
                    System.out.println("Qual a tabuada? ");
                    int e = scn.nextInt();

                    Soma(e);
                    break;
                case 2:
                    System.out.println("Qual a tabuada? ");
                    int f = scn.nextInt();

                    Subtracao(f);
                    break;
                case 3:
                    System.out.println("Qual a tabuada? ");
                    int g = scn.nextInt();

                    Multiplicacao(g);
                    break;
                case 4:
                    System.out.println("Qual a tabuada? ");
                    int h = scn.nextInt();

                    Divisao(h);
                    break;
            }

        } while(i<1||i>4);

    }

    //FUNÇÃO MULTIPLICAÇÃO
    public static void Multiplicacao(int num){
        
        System.out.println("Tabuada de multiplicação do " + num + ":");
        for(int i = num; i<=num;i++){
            for(int f = 0; f<=10; f++){
                System.out.println(i + " * " + f + " = " + (i*f));
            }
        }

    }
    
    //FUNÇÃO SOMA
    public static void Soma(int  num){
        
        System.out.println("Tabuada de soma do " + num + ":");
        for(int i = num; i<=num;i++){
            for(int f = 0; f<=10; f++){
                System.out.println(i + " + " + f + " = " + (i+f));
            }
        }
    }

    //FUNÇÃO SUBTRAÇÃO
    public static void Subtracao(int num){

        System.out.println("Tabuada de subrtação do " + num + ":");
        for(int i = num; i<=num;i++){
            for(int f = 10; f>=0; f--){
                System.out.println(f + " - " + i + " = " + (f-i));
            }
        }


    }
    
    //FUNÇÃO DIVISÃO
    public static void Divisao(int num){

        System.out.println("Tabuada de divisão do " + num + ":");
        for(int i = num; i<=num;i++){
            for(int f = 0; f<=10; f++){
                System.out.println(i + " / " + f + " = " + ((float)i/f));
            }
        }


    }
}
