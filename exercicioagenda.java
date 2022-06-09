package matriz;
import java.util.Scanner;

public class exercicioagenda
{
public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
String [][] matriz = new String [10][5]; 
// Declarado uma matriz de 10 linhas e 5 colunas
int n = 0;
// Declarado uma variavel com atribuicao de valor 0
do {
// Comando faca       
 System.out.printf ("Digite seu nome:\n");
 // Exibe na tela "Digite seu nome:"
 matriz [n][0] = ler.nextLine();
 // Realiza a leitura da matriz [n][0]
 System.out.printf ("Digite seu endereco:\n");
 // Exibe na tela "Digite seu endereco:"
 matriz [n][1] = ler.nextLine();
 // Realiza a leitura da matriz [n][1]
 System.out.printf ("Digite seu codigo postal:\n");
 // Exibe na tela "Digite seu codigo postal:"
 matriz [n][2] = ler.nextLine();
 // Realiza a leitura da matriz [n][2]
 System.out.printf ("Digite seu bairro:\n");
 // Exibe na tela "Digite seu bairro:"
 matriz [n][3] = ler.nextLine();
 // Realiza a leitura da matriz [n][3]
 System.out.printf ("Digite seu telefone:\n");
 // Exibe na tela "Digite seu telefone:"
 matriz [n][4] = ler.nextLine();
 // Realiza a leitura da matriz [n][4]
 n++;
 // Soma +1 na variavel n
} while (n <10);
// Enquanto a variavel n for menor que 10, para realizar a leiutra de 10 usuarios para a agenda

 for (int i = 0; i < matriz.length; i++) {
// Laco de for para enquanto i for menor que matriz.lenght, i soma+1
        for (int j = 0; j < matriz[i].length; j++) {
       // Laco de for para enquanto j for menor que matriz[i].lenght soma +1
               System.out.print ("\t\t"+matriz[i][j]);
               // Exibe a matriz
        }
System.out.println();
// Exibe os resultados
 } 
 





}
}

       