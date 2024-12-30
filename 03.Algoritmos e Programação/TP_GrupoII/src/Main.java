import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    static ArrayList<String> ouvintes = new ArrayList<>();
    static ArrayList<Integer> apostas = new ArrayList<>();
    static ArrayList<Integer> nrJogos = new ArrayList<>();
    static ArrayList<Integer> vitorias = new ArrayList<>();
    static int op = 1;
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    public static void main(String[] args) {

        //MENU
        do{
            System.out.println("*******\nJogo do Saco\n*******");
            System.out.println("1- Adicionar Ouvintes ");
            if(!ouvintes.isEmpty()){
                System.out.println("2- Remover Ouvintes ");
                System.out.println("3- Ver Ranking");
                System.out.println("4- Jogar");
                System.out.println("5- Ler ficheiro");
                System.out.println("6- Gravar ficheiro");
            }
            System.out.println("0- Sair");

            //certifica que introduz um numero
            while (true) {
                System.out.println("Que opção deseja:");
                String option = in.nextLine();
                try {
                    op = Integer.parseInt(option);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Insira um valor numerico valido.");
                }
            }

            switch (op){
                case 0:
                    break;
                case 1:
                    addPlayer();
                    break;
                case 2:
                    removePlayer();
                    break;
                case 3:
                    ranking();
                    break;
                case 4:
                    playGame();
                    break;
                case 5:
                    readFile();
                    break;
                case 6:
                    saveFile();
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }while(op !=0);

    }

    private static void saveFile() {
        String texto = "";
        //Adiciona cada linha de texto à String
        texto += "Nome Jogador | Nº JOGOS | Nº VITORIAS \n";
        for (int i = 0; i < ouvintes.size(); i++) {
            texto += ouvintes.get(i) + "\t" + nrJogos.get(i) + "\t"+vitorias.get(i)+"\n";
        }

        //Guarda a String criada no ficheiro .txt
        try {
            Files.writeString(Path.of("classificacao.txt"), texto);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar ficheiro");
        }
    }

    private static void readFile() {
        System.out.println("OPÇÃO 5- LER FICHEIRO");

        //Leitura do ficheiro .txt
        try {
            BufferedReader br = new BufferedReader(new FileReader("classificacao.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro no ficheiro");
        }
    }

    private static void playGame() {
        //selecionar ouvintes de forma random e sua ordem
        //jogador mais proximo do valor do peso do saco, ganha
        ArrayList<String> orderPlayers = new ArrayList<>();
        ArrayList<Integer> menorDiff = new ArrayList<>();
        int bagWeight = rnd.nextInt(4500, 4751);
        int bet = 0, min = 151;
        String winner = "";


        System.out.println("OPÇÃO 4- JOGO DO SACO");
        int numRandom;

        System.out.println("Quantos jogadores vão jogar?");
        int n = rnd.nextInt(2,ouvintes.size()+1);
        System.out.println("Número de jogadores: " + n);


        //Operação para buscar jogador aleatório e apostar
        while(orderPlayers.size()<n){
                numRandom = rnd.nextInt(n);
                if (!orderPlayers.contains(ouvintes.get(numRandom))){
                    System.out.println("Qual a aposta do(a) " + ouvintes.get(numRandom) + "?");
                    System.out.print("Aposta: (entre 4500 e 4650) ");
                    bet = in.nextInt();
                    while (bet<4500 || bet >4650){
                        System.out.println("Número fora do campo estimado. Tente novamente:");
                        bet = in.nextInt();
                    }
                    int games = nrJogos.get(numRandom);
                    nrJogos.set(numRandom, games + 1);
                    apostas.set(numRandom, bet);
                    orderPlayers.add(ouvintes.get(numRandom));
                }
        }

            //Jogador mais proximo do peso vence
            for(int i = 0; i < orderPlayers.size(); i++) {
                //Comparar diferença de peso do saco
                int diffBet = Math.abs(apostas.get(i) - bagWeight);
                menorDiff.add(diffBet);//Array temporario relacionado à diferença de peso
            }

            //Menor Diferença e Variavel com vencedor
            for(int i = 0; i < orderPlayers.size(); i++) {
                if(menorDiff.get(i)<min) {
                    min = menorDiff.get(i);
                    winner = ouvintes.get(i);

                }
            }
        //Busca o nome do vencedor e incrementa +1
        vitorias.set(ouvintes.indexOf(winner), vitorias.get(ouvintes.indexOf(winner)) + 1);
        System.out.println("O vencedor é: " + winner);

        //Imprime
        System.out.println("NOME | Nº JOGOS | Nº VITORIAS ");
        for(int i = 0; i < ouvintes.size(); i++){
            System.out.print(ouvintes.get(i)+"\t\t ");
            System.out.print(nrJogos.get(i)+"\t\t ");
            System.out.println(vitorias.get(i)+" ");
        }
    }

    private static void ranking() {
        System.out.println("OPÇÃO 3 - RANKING");

        //Imprime a Classificação
        System.out.println("NOME | Nº JOGOS | Nº VITORIAS ");
        for(int i = 0; i < ouvintes.size(); i++){
            System.out.print(ouvintes.get(i)+"\t\t ");
            System.out.print(nrJogos.get(i)+"\t\t ");
            System.out.println(vitorias.get(i));
        }
    }

    private static void removePlayer() {
        System.out.println("OPÇÃO 2- REMOVER OUVINTES");
        //ver validaçao
        //Operação para remover jogador
        System.out.println("Que ouvinte deseja remover?");
        int pos = in.nextInt()-1;
            if (pos >= 0 && pos < ouvintes.size()) {
                ouvintes.remove(pos);
                apostas.remove(pos);
            }else {
                System.out.println("Posição Inválida. Tente novamente.");
            }

        System.out.println("Ouvinte removido com sucesso!");


    }

    private static void addPlayer() {
        int n = 0;

        System.out.println("OPÇÃO 1- ADICIONAR OUVINTES");

        //validaçao
        while (true) {
            System.out.println("Quantos ouvintes deseja adicionar?");
            String option = in.nextLine();
            try {
                n = Integer.parseInt(option);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Insira um valor numerico valido.");
            }
        }

        //Adicionar Jogador e Criação de Arrays
        while(ouvintes.size()<n){
            in = new Scanner(System.in);
            System.out.print("Nome do ouvinte: ");
            String player = in.next();
                if(!ouvintes.contains(player)) {
                    ouvintes.add(player);
                    apostas.add(0);
                    nrJogos.add(0);
                    vitorias.add(0);
                } else{
                System.out.println("Nome já existe. Tente novamente. ");
                }
        }

        if(n>1) {
            System.out.println("Foram adicionados " + n + " ouvintes à lista");
        }
        if(n == 1){
            System.out.println("Foi adicionado " + n + " ouvinte à lista");
        }
        Collections.sort(ouvintes);

    }
}