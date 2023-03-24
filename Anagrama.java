/*Exercício 8 - Anagrama
 * Aluno: Carlos Alexandre | Matrícula: 20210025904
 */

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        
        //COLETANDO AS PALAVRASQUE SERÃO ANALIZADAS

        String primeiraPalavra = JOptionPane.showInputDialog(null, "Insira a primeira palavra");
        String segundaPalavra = JOptionPane.showInputDialog(null, "Insira a segunda palavra");
        char[] letrasPrimeira = new char[primeiraPalavra.length()];
        char[] letrasSegunda = new char[segundaPalavra.length()];

        //TRANSFORMANDO AS DUAS PALAVRAS EM ARRAYS DE CARACTERES

        for(int i = 0; i<primeiraPalavra.length(); i++){
            letrasPrimeira[i] = primeiraPalavra.charAt(i);
        }
        for(int i = 0; i<segundaPalavra.length(); i++){
            letrasSegunda[i] = segundaPalavra.charAt(i);
        }
        
        //ORDENANDO OS ARRAYS DE CARACTERES

        Arrays.sort(letrasPrimeira);
        Arrays.sort(letrasSegunda);

        String primeiraOrganizada = "";
        String segundaOrganizada = "";

        //CHECANDO SE OS ARRAYS ORDENADOS SÃO IGUAIS

        for(int i = 0; i<primeiraPalavra.length(); i++){
            primeiraOrganizada += letrasPrimeira[i];
        }
        for(int i = 0; i<segundaPalavra.length(); i++){
           segundaOrganizada += letrasSegunda[i];
        }

        //PRINTANDO O RESULTADO: SE FOREM IGUAIS: SÃO ANAGRAMAS/SE N FOREM IGUAIS: NÃO SÃO ANAGRAMAS
        
        if(primeiraOrganizada.equalsIgnoreCase(segundaOrganizada)){
            JOptionPane.showMessageDialog(null, "São anagramas");
        } else{
            JOptionPane.showMessageDialog(null, "Não são anagramas");
        };



    }
}
