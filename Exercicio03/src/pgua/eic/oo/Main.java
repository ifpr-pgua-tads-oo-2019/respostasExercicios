package pgua.eic.oo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner scan;
    public static Random rnd;

    public static void menuJogo() {
        System.out.println("1 - Apostar");
        System.out.println("2 - Comprar fichas");
        System.out.println("0 - Parar");
    }

    public static void menuGeral() {
        System.out.println("1 - Comprar fichas");
        System.out.println("2 - Ver meu placar");
        System.out.println("3 - Novo jogo");

        System.out.println("0 - Sair");
    }

    public static boolean valorValido(int valor) {
        return valor >= 1 && valor <= 6;
    }

    public static boolean palpiteValido(int valor) {
        return valor >= 2 && valor <= 12;
    }

    public static boolean acertou(int palpite, int soma) {
        return palpite == soma;
    }

    public static boolean quaseAcertou(int palpite, int soma) {

        int dif = Math.abs(palpite - soma);

        return dif == 1;


    }


    public static int sorteioDados() {

        int dado1 = rnd.nextInt(6) + 1;
        int dado2 = rnd.nextInt(6) + 1;

        return (dado1 + dado2);

    }

    public static int comprarFichas() {
        int fichas = 0;
        do {
            System.out.println("Digite o total de fichas:");
            fichas = scan.nextInt();
        } while (fichas <= 0);

        return fichas;
    }

    public static void main(String[] args) {

        int op1, op2, op3;
        scan = new Scanner(System.in);
        rnd = new Random(System.currentTimeMillis());

        String nomeJogador = "";
        int totalFichas = 0;

        int totalJogadas = 0;
        int fichasGanhas = 0;
        int fichasPerdidas = 0;
        int jogadasGanhas = 0;
        int jogadasPerdidas = 0;
        int qtdeApostada = 0;
        int palpite = 0;
        int sorteio = 0;

        System.out.println("Digite seu nome:");
        nomeJogador = scan.nextLine();


        do {
            System.out.println("Bem vindo " + nomeJogador);
            System.out.println("Seu total de fichas é " + totalFichas);

            menuGeral();
            op1 = scan.nextInt();
            switch (op1) {
                case 1:
                    totalFichas = comprarFichas();
                    break;
                case 2:
                    System.out.println("Placar da última partida:");
                    System.out.println("Total de jogadas: " + totalJogadas);
                    System.out.println("Jogadas ganhas: " + jogadasGanhas);
                    System.out.println("Jogadas perdidas: " + jogadasPerdidas);
                    System.out.println("Fichas ganhas:" + fichasGanhas);
                    System.out.println("Fichas perdidas: " + fichasPerdidas);
                    System.out.println("Seu total de fichas: " + totalFichas);
                    break;
                case 3:
                    totalJogadas = 0;
                    fichasGanhas = 0;
                    fichasPerdidas = 0;
                    jogadasGanhas = 0;
                    jogadasPerdidas = 0;

                    do {
                        menuJogo();
                        op2 = scan.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("Digite a quantidade de fichas:");
                                qtdeApostada = scan.nextInt();
                                if (qtdeApostada >= 0 && qtdeApostada <= totalFichas) {
                                    do {
                                        System.out.println("Digite um palpite:");
                                        palpite = scan.nextInt();
                                    } while (!palpiteValido(palpite));

                                    sorteio = sorteioDados();

                                    if (acertou(palpite, sorteio)) {
                                        totalFichas += qtdeApostada * 2;
                                        jogadasGanhas++;
                                        fichasGanhas += qtdeApostada * 2;
                                        System.out.println("Acertou!!");

                                    } else if (quaseAcertou(palpite, sorteio)) {
                                        totalFichas += qtdeApostada / 2;
                                        jogadasGanhas++;
                                        fichasGanhas += qtdeApostada / 2;
                                        System.out.println("Na trave!!!");

                                    } else {
                                        totalFichas -= qtdeApostada;
                                        fichasPerdidas += qtdeApostada;
                                        jogadasPerdidas++;
                                        System.out.println("Errou!!!");
                                    }
                                    totalJogadas++;
                                } else {
                                    System.out.println("Quantidade inválida...");
                                }
                                break;
                            case 2:
                                totalFichas = comprarFichas();
                                break;
                        }
                    } while (op2 != 0);
                    break;

            }

        } while (op1 != 0);


    }


}
