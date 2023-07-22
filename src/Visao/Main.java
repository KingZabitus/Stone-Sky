package Visao;
import Controle.*;
import Mapas.*;
import Modelo.Mapa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean i = false;
        Scanner scanner = new Scanner(System.in);
        int opcao;
        System.out.println("//////////////////////////////////////");
        System.out.println("//////////////////////////////////////");
        System.out.println("/////////////STONE//SKY///////////////");
        System.out.println("//////////////////////////////////////");
        System.out.println("//////////////////////////////////////" + "\n");

        System.out.println("Pressione qualquer tecla para iniciar o jogo");
        scanner.nextLine();

        Jogador jogador = null;
        while (!i) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Novo Personagem");
            System.out.println("2 - Carregar personagem");
            System.out.println("0 - Sair do Jogo");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Criando novo personagem...");
                    System.out.println("Informe suas escolhas para seu novo personagem:");
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    scanner.nextLine();
                    String backstory;
                    System.out.print("""
                            Antecedente:\s
                            1 - Criminoso
                            2 - Missionário
                            3 - Infectado
                            4 - Bruxa
                            5 - Nobre
                            6 - Eremita
                            7 -\s""");
                    int opcaobg = scanner.nextInt();
                    switch (opcaobg) {
                        case 1 -> backstory = "Criminoso";
                        case 2 -> backstory = "Missionário";
                        case 3 -> backstory = "Infectado";
                        case 4 -> backstory = "Bruxa";
                        case 5 -> backstory = "Nobre";
                        case 6 -> backstory = "Eremita";
                        default -> {
                            System.out.println("Opção inválida!");
                            return;
                        }
                    }

                    jogador = new Jogador(7, 3);
                    jogador.setNome(nome);
                    jogador.setBackstory(backstory);

                    System.out.println("Novo personagem criado:");
                    System.out.println("Nome: " + jogador.getNome());
                    System.out.println("Classe: " + jogador.getBackstory());
                    i = true;
                }
                case 2 -> System.exit(1);
                case 0 -> System.exit(0);
                default -> System.out.println("Insira uma opção válida");
            }
        }
        Mapa vila = new Vila(8, 8, 7, 3);
        jogador.setMapa(vila);
        vila.preencherMapa();
        

    }
}