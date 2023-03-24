/*Exercício 3 - CensoAltura
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import javax.swing.JOptionPane;

public class CensoAltura {
    public static void main(String[] args) {

        //VARIÁVEIS

        int[] alturaCm = {170,170,190,191,145,165,155,173,177,180,180,150,200,180,167,168,189,160,176,160};
        String[] sexo = {"m", "m", "f", "f", "f", "m", "m", "f", "f","m" , "f", "m", "f","f" , "f", "f", "f", "m", "m", "m"};
        int maior = 0, menor = 9999, alturaHomens = 0, alturaMulheres = 0, numMulheres= 0, numHomens = 0, numTotal = 0;
        float mediaHomens, mediaMulheres, porcentagemHomens, porcentagemMulheres;

        //CHECAGEM DAS VARIÁVEIS

        for(int i = 0; i <= 19; i++){
            numTotal += 1;
            if(maior<=alturaCm[i]){
                maior = alturaCm[i];
            }
            if(menor>=alturaCm[i]){
                menor = alturaCm[i];
            }
            if(sexo[i]=="m"){
                alturaHomens += alturaCm[i];
                numHomens += 1;
            }
            if(sexo[i]=="f"){
                alturaMulheres += alturaCm[i];
                numMulheres += 1;
            }

        }

        mediaHomens = (float)alturaHomens/numHomens;
        mediaMulheres = (float)alturaMulheres/numMulheres;
        porcentagemHomens = (float)numHomens/numTotal*100;
        porcentagemMulheres = (float)numMulheres/numTotal*100;

        //IMPRIMINDO O RESULTADO
        
        JOptionPane.showMessageDialog(null, "Maior altura: " + maior + "cm\n" + "Menor altura: " + menor + "cm\n" + "Número de mulheres: " + numMulheres + "\nNúmero de homens: " + numHomens);
        JOptionPane.showMessageDialog(null, String.format(" Média de Altura das mulheres: %.2fcm\n Média da altura dos homens: %.2fcm\n Porcentagem de mulheres: %.2f%%\n Porcentagem de homens: %.2f%%\n", mediaMulheres, mediaHomens,porcentagemMulheres, porcentagemHomens));

    }
}
