import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        boolean jogo = true;
        int dificuldade;
        int num;
        int tentativa;
        int opcaoFim;

        System.out.println("Bem vindo ao jogo de adivinhação de números!");
        System.out.println("Estou pensando em um número de 1 a 100! Você consegue adivinhar ?\n");
        System.out.println("Escolha a dificuldade do jogo:");
        System.out.println("Pressione 1 - Fácil: 10 chances");
        System.out.println("Pressione 2 - Médio: 5 chances");
        System.out.println("Pressione 3 - Difícil: 3 chances");
        dificuldade = scanner.nextInt();

        while (jogo){
            num = rng.nextInt(100) + 1;
            switch (dificuldade){
                case 1: {
                    System.out.println("\nVocê escolheu a dificuldade fácil!");
                    for(int i = 10; i > 0; i--){
                        System.out.println("\nVocê tem " + i + " chances!");
                        System.out.println("Digite um número: ");
                        tentativa = scanner.nextInt();
                        if (tentativa < 100 && tentativa > 1){
                            if(tentativa == num){
                                System.out.println("Você acertou!!");
                                break;
                            } else if (tentativa > num) {
                                System.out.println("O número é menor que " + tentativa);
                            } else if (tentativa < num) {
                                System.out.println("O número é maior que " + tentativa);
                            }
                        } else {
                            System.out.println("Escolha um número entre 1 e 100!");
                        }
                    }
                }
                break;
                case 2: {
                    System.out.println("Você escolheu a dificuldade média!");
                    for(int i = 5; i > 0; i--){
                        System.out.println("Você tem " + i + " chances!");
                        System.out.println("Digite um número: ");
                        tentativa = scanner.nextInt();
                        if (tentativa < 100 && tentativa > 1){
                            if(tentativa == num){
                                System.out.println("Você acertou!!");
                                break;
                            } else if (tentativa > num) {
                                System.out.println("O número é menor que " + tentativa);
                            } else if (tentativa < num) {
                                System.out.println("O número é maior que " + tentativa);
                            }
                        } else {
                            System.out.println("Escolha um número entre 1 e 100!");
                        }
                    }
                }
                break;
                case 3: {
                    System.out.println("Você escolheu a dificuldade difícil!");
                    for(int i = 3; i > 0; i--){
                        System.out.println("Você tem " + i + " chances!");
                        System.out.println("Digite um número: ");
                        tentativa = scanner.nextInt();
                        if (tentativa < 100 && tentativa > 1){
                            if(tentativa == num){
                                System.out.println("Você acertou!!");
                                break;
                            } else if (tentativa > num) {
                                System.out.println("O número é menor que " + tentativa);
                            } else if (tentativa < num) {
                                System.out.println("O número é maior que " + tentativa);
                            }
                        } else {
                            System.out.println("Escolha um número entre 1 e 100!");
                        }
                    }
                }
                break;
                default: {
                    System.out.println("Selecione um número válido: ");
                    dificuldade = scanner.nextInt();
                }
                break;
            }
            System.out.println("Quer continuar a jogar ?");
            System.out.println("Pressione 1 - Continuar");
            System.out.println("Pressione 2 - Mudar dificuldade");
            System.out.println("Pressione 3 - Sair do jogo");
            opcaoFim = scanner.nextInt();
            switch (opcaoFim){
                case 1: break;
                case 2: {
                    System.out.println("Escolha a dificuldade do jogo:");
                    System.out.println("Pressione 1 - Fácil: 10 chances");
                    System.out.println("Pressione 2 - Médio: 5 chances");
                    System.out.println("Pressione 3 - Difícil: 3 chances");
                    dificuldade = scanner.nextInt();
                    break;
                }
                case 3: System.out.println("Saindo do jogo..."); jogo = false; break;
                default: System.out.println("Selecione um número válido: "); opcaoFim = scanner.nextInt();
            }
        }
    }
}
