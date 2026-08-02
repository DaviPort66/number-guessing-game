import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        boolean jogo = true;
        int dificuldade;
        int num;
        int opcaoFim;

        System.out.println("Bem vindo ao jogo de adivinhação de números!");
        System.out.println("Estou pensando em um número de 1 a 100! Você consegue adivinhar ?\n");
        System.out.println("Escolha a dificuldade do jogo:");
        System.out.println("Pressione 1 - Fácil: 10 chances");
        System.out.println("Pressione 2 - Médio: 5 chances");
        System.out.println("Pressione 3 - Difícil: 3 chances");

        dificuldade = lerNumeroInteiro(scanner);

        while (jogo){
            num = rng.nextInt(100) + 1;
            String[] nomesDificuldade = {"fácil", "médio", "difícil"};
            int[] chancesPorDificuldade = {10, 5, 3};

            System.out.println("\nVocê escolheu a dificuldade " + nomesDificuldade[dificuldade - 1] + "!");
            jogarRodada(chancesPorDificuldade[dificuldade - 1], num, scanner);
            
            System.out.println("Quer continuar a jogar ?");
            System.out.println("Pressione 1 - Continuar");
            System.out.println("Pressione 2 - Mudar dificuldade");
            System.out.println("Pressione 3 - Sair do jogo");

            opcaoFim = lerNumeroInteiro(scanner);

            switch (opcaoFim){
                case 1: break;
                case 2: {
                    System.out.println("Escolha a dificuldade do jogo:");
                    System.out.println("Pressione 1 - Fácil: 10 chances");
                    System.out.println("Pressione 2 - Médio: 5 chances");
                    System.out.println("Pressione 3 - Difícil: 3 chances");
                    dificuldade = lerNumeroInteiro(scanner);
                    break;
                }
                case 3: System.out.println("Saindo do jogo..."); jogo = false; break;
            }
        }
    }

    private static void jogarRodada(int chances, int num, Scanner scanner){
        int tentativa;
        while(chances > 0){
            System.out.println("Você tem " + chances + " chances!");
            System.out.println("Digite um número: ");
            try{
                tentativa = scanner.nextInt();
                if (tentativa <= 100 && tentativa >= 1){
                    if(tentativa == num){
                        System.out.println("Você acertou!!");
                        break;
                    } else if (tentativa > num) {
                        System.out.println("O número é menor que " + tentativa);
                    } else if (tentativa < num) {
                        System.out.println("O número é maior que " + tentativa);
                    }
                    chances--;
                } else {
                    System.out.println("Escolha um número entre 1 e 100!");
                    continue;
                }
            } catch (InputMismatchException e){
                System.out.println("Digite um número entre 1 e 100!");
            }
        }
        if(chances == 0){
            System.out.println("Suas chances acabaram, você perdeu!");
        }
        return;
    }

    private static int lerNumeroInteiro(Scanner scanner){
        int valor;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Digite um número válido!");
                scanner.next();
            }
            valor = scanner.nextInt();
            if (valor < 1 || valor > 3) {
                System.out.println("Escolha entre 1, 2 ou 3!");
            }
        } while (valor < 1 || valor > 3);
        return valor;
    }
}


