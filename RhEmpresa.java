/*Exercício 4 - RhEmpresa
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class RhEmpresa {
    public static void main(String[] args) {
        float maior = 0, menor = 99999999, somaSalario = 0, mediaSalario;
        int n;

        // LENDO UM NÚMERO INTEIRO N CORRESPONDENTE AO NÚMERO DE FUNCIONÁRIOS DE UMA EMPRESA, SENDO
        // 0 < N < 40;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de funcionários: "));
        } while(n<1||n>40);

        String[] nome = new String[n];
        float[] salario = new float[n];

        // LENDO, EM PROCESSO REPETITIVO, O NOME E O SALÁRIO DOS N FUNCIONÁRIOS, COLOCANDO-OS
        // RESPECTIVAMENTE NOS ARRAYS NOME E SALARIO;

        for(int i = 0; i<n; i++){
            nome[i] = JOptionPane.showInputDialog("Insira o nome do " + (i+1) + "o funcionario: ");
            salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário do " + (i+1) + "o funcionario: "));
            somaSalario += salario[i];
            if(maior<=salario[i]){
                maior = salario[i];     //CHECANDO QUAL O MAIOR SALÁRIO
            }
        }

        mediaSalario = somaSalario/n;   //OBTENDO A MÉDIA

        //INICIALIZANDO E PREENCHENDO ARRAYLISTS COM OS NOMES DOS FUNCIONARIOS COM O MAIOR SALÁRIO E 
        //NOMES DE FUNCIONARIOS COM  SALÁRIO ABAIXO DA MÉDIA, RESPECTIVAMENTE

        ArrayList<String> maiorSal = new ArrayList<String>();
        ArrayList<String> menorSal = new ArrayList<String>();

        for(int i = 0; i<n; i++){
            if(salario[i]==maior){
                maiorSal.add(nome[i]);
            }
            if(salario[i]<mediaSalario){
                menorSal.add(nome[i]);
            }
        }
        
        //CONVERTENDO OS ARRAYLISTS EM STRINGS

        String maioresSalarios = "";
        String salariosAbaixoMedia = "";

        for(int i = 0; i <= maiorSal.size(); i++){
             maioresSalarios = maiorSal.toString();
             salariosAbaixoMedia = menorSal.toString(); 
        }

        //IMPRIMINDO OS VALORES
        
        JOptionPane.showMessageDialog(null, String.format(" Maior salário: R$%.2f\n Média geral dos salários: R$%.2f\n Funcionários com o maior salário obervado: %s\n Funcionários com o salário menor que a média geral: %s", maior, mediaSalario, maioresSalarios, salariosAbaixoMedia, args));
    }
}
