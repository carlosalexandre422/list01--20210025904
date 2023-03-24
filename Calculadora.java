/*Exercício 6 - Calculadora
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
       
        
        int operacao = -1, calculo = 0;
        String tOperacao;
        boolean sOperacao;
        Scanner sc = new Scanner(System.in);
        
        // Tela inicial
        do {
            System.out.println("\n\n");
            System.out.println("              Calculadora Avançada              \n\n");
            System.out.println("      1 - Dobro    |   2 - Triplo    | 3 - Metade | 4 - Quadrado | 5 - Cubo");
            System.out.println(" 6 - Raiz Quadrada | 7 - Raiz Cúbica | 8 - Módulo | 9 - Inverso  | 0 - Fechar programa");
            System.out.print("\n Digite o número da operação: ");
        
            //Tratando a escolha das operações
        
            do { 
                // verifica se o tipo de dado é o que a gente quer
                tOperacao = sc.next();
                sOperacao = tOperacao.matches("-?\\d+"); // variavelString.verificar (se a string do começo ao fim//puder ser um número inteiro)
                if (sOperacao == false) {
                
                    System.out.print(" Por favor digite um dos números da tabela: ");
            
                } else if (Integer.parseInt(tOperacao) >= 0 && Integer.parseInt(tOperacao) <= 9){
                
                    operacao = Integer.parseInt(tOperacao);
                
                } else {
                
                    System.out.print(" Por favor digite um dos números da tabela: ");
                
                }
            

            } while (operacao == -1);
            
            if (operacao == 0) {
                
                System.exit(0);
                
            }
        
            System.out.print("\n Digite o valor para calcular: "); 
        
            //Tratando o valor para calcular
            do {
                tOperacao = sc.next();
                sOperacao = tOperacao.matches("-?\\d+");
                if (sOperacao == false) {
                
                System.out.print(" Por favor digite um inteiro: ");
            
                } else {
                
                    calculo = Integer.parseInt(tOperacao);
                
                } 
            
            
            } while (sOperacao == false);
        
            switch (operacao) {
            
                case 1: System.out.println("\n Dobro: " + Dobro(calculo)); break;
                case 2: System.out.println("\n Triplo: " + Triplo(calculo)); break;
                case 3: System.out.printf("\n Metade: %.2f", Metade(calculo)); break;
                case 4: System.out.println("\n Elevado ao quadrado: " + Quadrado(calculo)); break;
                case 5: System.out.println("\n Elevado ao cubo: " + Cubo(calculo)); break;
                case 6: System.out.println("\n Raiz Quadrada: " + RaizQuadrada(calculo)); break;
                case 7: System.out.println("\n Raiz Cúbica: " + RaizCubica(calculo)); break;
                case 8: System.out.println("\n Módulo: " + Modulo(calculo)); break;
                case 9: System.out.println("\n Inverso: " + Inverso(calculo)); break;
                default: System.exit(0); 
            }
        } while (1 == 1);
        
    }
    
    private static int Dobro(int x) {
        
        int resultado;
        
        resultado = x * 2;
        
        return resultado;
        
    }
    
    private static int Triplo(int x) {
        
        int resultado;
        
        resultado = x * 3;
        
        return resultado;
        
    }
    
    private static float Metade(int x) {
        
        float resultado;
        
        resultado = (float)x / (float)2;
        
        return resultado;
    }
    
    private static double Quadrado(int x) {
        
        double resultado;
        
        resultado = Math.pow(x, 2);
        
        return resultado;
    }
    
    private static double Cubo(int x) {
        
        double resultado;
        
        resultado = Math.pow(x, 3);
        
        return resultado;
    }
    
    private static double RaizQuadrada(int x) {
        
        double resultado;
        
        resultado = Math.sqrt(x);
        
        return resultado;
    }
    
    private static double RaizCubica(int x) {
        
        double resultado;
        
        resultado = Math.cbrt(x);
        
        return resultado;
    }
    
    private static int Modulo(int x) {
        
        int resultado;
        
        resultado = Math.abs(x);
        
        return resultado;
        
    }
    
    private static String Inverso(int x) {
        
        String resultado = "1/";
        
        if (x > 0){
            
            resultado += Integer.toString(x);
            
        } else if (x < 0) {
            
            resultado = "-1/";
            x = Math.abs(x);
            resultado += Integer.toString(x);
            
        } else {
            
            resultado = " O inverso de 0 não existe";
        }
        
        return resultado;
        
    }
    
    
    
}
