/* Nome do aluno: Vinicius de Souza Alves
 * RA: 323128926
 * Nome do programa: Pratica2Atividade3
 * Description: Faca um programa que leia um numero inteiro e mostre uma mensagem indicando se o numero eh par ou impar, positivo ou negativo
 * Data: 04/04/2023
 * Data em que foi realizada a atividade: 21/04/2023
 */
import java.util.Scanner;

public class Pratica2Atividade3 {

    public static void main(String[] args) {
    
    int a;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    a = teclado.nextInt();
    teclado.close();

    if (a % 2 == 0) {
        System.out.print("Par");    
    } else { 
        System.out.print("Impar");
    }

    if (a >= 0) {
        System.out.print(" e positivo. ");
    } else { 
        System.out.print(" e negativo. ");
    }
}


}
    

