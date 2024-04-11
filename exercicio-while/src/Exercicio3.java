import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Crie um jogo simples em Java em que o programa gera aleatoriamente um número
        entre 1 e 100, e o jogador precisa adivinhar o número. Use um loop while para
        permitir que o jogador continue adivinhando até acertar. Dê dicas, sobre se o número
        é maior ou menor que o desejado. Importante, para gerar o valor aleatório, procure
        pela classe Random do Java.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Advinhe o número: [Informe um número entre 1 e 100]");
        int palpite = scanner.nextInt();

        Random rand = new Random();
        int numeroSorteio = rand.nextInt(101);

        while (palpite != numeroSorteio) {

            if (palpite < numeroSorteio) {
                System.out.println("Dica: O número sorteado é maior que " + palpite);
            } else {
                System.out.println("Dica: O número sorteado é menor que " + palpite);
            }

            System.out.println("Dê um novo palpite: ");
            palpite = scanner.nextInt();
        }

        System.out.println("Parabéns! Você acertou o número sorteado: " + numeroSorteio);

    }
}