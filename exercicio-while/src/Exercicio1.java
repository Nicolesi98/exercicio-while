import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        * Crie um programa em Java que solicite ao usuário um número inteiro positivo e, em
          seguida, use um loop while para exibir todos os números pares de 1 até o número
          inserido pelo usuário.
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Segue os números pares de 1 até " + numero + ":");

        int i = 1;

        while(i <= numero) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

//        for(int i = 1; i <= numero; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

    }
}