/* Nome do aluno: Vinicius de Souza Alves
 * RA: 323128926
 * Nome do programa: Pratica2Atividade1
 * Description: Faça um Programa que leia dois numeros, A e B, e imprima o maior deles
 * Data: 04/04/2023
 * Data em que foi realizada a atividade: 21/04/2023
 */
import java.util.Scanner;

class Main {
  // Faça um Programa que leia dois numeros, A e B, e imprima o maior deles
  public static void main(String[] args) {

    // declaração das variáveis 
    int a, b;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    a = input.nextInt();
    System.out.println("Digite o segundo numero: ");
    b = input.nextInt();
    input.close();

    if (a > b) {
        System.out.println("O maior numero digitado foi o numero: " + a);
    } else if (b > a) {
        System.out.println("O maior numero digitado foi o numero: " + b);
    }
    else {
        System.out.println("O numeros tem valores iguais!" );
    }
    }
  }




