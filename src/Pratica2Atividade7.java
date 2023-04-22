/* Nome do aluno: Vinicius de Souza Alves
 * RA: 323128926
 * Nome do programa: Pratica2Atividade7
 * Description: Faça um Programa que leia um numero entre 1 e 12 correspondendo a um mes, o programa deve imprimir uma mensagem com o mes e a estacao do ano
 * Data: 04/04/2023
 * Data em que foi realizada a atividade: 21/04/2023
 */
import java.util.Scanner;

public class Pratica2Atividade7 {
    public static void main(String[] args) {
        int a;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o mes");
            a = input.nextInt();
        }
        switch(a) {
            case 1: System.out.println("Janeiro - Verao");
                break;
            case 2: System.out.println("Fevereiro - Verao");
                break;
            case 3: System.out.println("Marco - Verao");
                break;
            case 4: System.out.println("Abril - Outono");
                break;
            case 5: System.out.println("Maio - Outono");
                break;
            case 6: System.out.println("Junho - Outono");
                break;
            case 7: System.out.println("Julho - Inverno");
                break;
            case 8: System.out.println("Agosto - Inverno");
                break;
            case 9: System.out.println("Setembro - Inverno");
                break;
            case 10: System.out.println("Outubro - Primavera");
                break;
            case 11: System.out.println("Novembro - Primavera");
                break;
            case 12: System.out.println("Dezembro - Primavera");
                break;
            default: System.out.println("Digite um mes valido");
        }
    }
}
