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

            in = new Scanner(System.in);
            //certifica que introduz um numero
            while (true) {
                System.out.print("Que opção deseja:");
                String option = in.nextLine();
                try {
                    op = Integer.parseInt(option);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Insira uma opção válida.");
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

    //GUARDAR FICHEIRO
    private static void saveFile() {
        //caso o array estiver vazio, não pode escrever no ficheiro
        if (ouvintes.isEmpty()) {
            System.out.println("Erro. Insira ouvintes antes de proceder à gravação.");
            return;
        }

        in = new Scanner(System.in);
        String texto = "";
        //Adiciona cada linha de texto à String
        texto += "JOGADOR | JOGOS | VITORIAS \n";
        for (int i = 0; i < ouvintes.size(); i++) {
            texto += ouvintes.get(i) + "\t\t" + nrJogos.get(i) + "\t"+vitorias.get(i)+"\n";
        }

        //Guarda a String criada no ficheiro .txt
        try {
            Files.writeString(Path.of("classificacao.txt"), texto);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar ficheiro");
        }
    }

    //LER FICHEIRO
    private static void readFile() {
        System.out.println("OPÇÃO 5- LER FICHEIRO");

        //ve se o txt está vazio
        try (BufferedReader br = new BufferedReader(new FileReader("classificacao.txt"))) {
            if (br.readLine() == null) {
                System.out.println("Erro. Grave dados no ficheiro antes de proceder à leitura. ");
                return;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro.");
        }

        //leitura
        try (BufferedReader br = new BufferedReader(new FileReader("classificacao.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro.");
        }


        System.out.println("Dados lidos com sucesso");

        //limpeza após a leitura para voltar a ser preenchida com novos dados
        try {
            Files.writeString(Path.of("classificacao.txt"), "");
        } catch (IOException e) {
            System.out.println("Erro ao apagar conteúdo do ficheiro txt.");
        }
    }

    //JOGAR
    private static void playGame() {
        ArrayList<String> orderPlayers = new ArrayList<>();
        ArrayList<Integer> menorDiff = new ArrayList<>();
        int bagWeight = rnd.nextInt(4500, 4751);//peso do saco definido
        int min = 151;
        int bet;
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
                    //certifica que não repete o nr neste jogo
                    while(apostas.contains(bet)){
                        System.out.println("Aposta já inserida por outro jogador. Insira outra:");
                        bet = in.nextInt();
                    }
                    //certifica que o nr é válido
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
        System.out.println("O vencedor é " + winner + " com uma diferença de " + min);

        //Imprime
        System.out.println("**Classificação Atual**");
        System.out.println("NOME | Nº JOGOS | Nº VITORIAS ");
        for(int i = 0; i < ouvintes.size(); i++){
            System.out.print(ouvintes.get(i)+"\t\t ");
            System.out.print(nrJogos.get(i)+"\t\t ");
            System.out.println(vitorias.get(i)+" ");
        }
    }

    //IMPRIME A TABELA
    private static void ranking() {
        System.out.println("OPÇÃO 3 - RANKING");

        //Imprime a Classificação
        System.out.println("Nº | NOME | Nº JOGOS | Nº VITORIAS ");
        for(int i = 0; i < ouvintes.size(); i++){
            System.out.print(i+1 + "\t");
            System.out.print(ouvintes.get(i)+"\t\t ");
            System.out.print(nrJogos.get(i)+"\t\t ");
            System.out.println(vitorias.get(i));
        }
    }

    //REMOVE JOGADORES
    private static void removePlayer() {
        System.out.println("OPÇÃO 2- REMOVER OUVINTES");
        int pos;

        ranking();
        //Operação para remover jogador
        in = new Scanner(System.in);
        while (true) {
            System.out.println("Que ouvinte deseja remover?");
            String num = in.nextLine();
            try{
                pos = Integer.parseInt(num);
                break;
            }catch (NumberFormatException e) {
                System.out.println("Insira um valor númerico válido.");
            }

        }

        //Remove jogador na posição desejada
        if (pos-1  >= 0 && pos-1 < ouvintes.size()) {
            ouvintes.remove(pos-1);
            apostas.remove(pos-1);
            nrJogos.remove(pos-1);
            vitorias.remove(pos-1);
        } else {
            System.out.println("Posição Inválida. Tente novamente.");
        }

        System.out.println("Ouvinte removido com sucesso!");


    }

    //ADICIONA JOGADORES
    private static void addPlayer() {
        int num = 0;
        System.out.println("OPÇÃO 1- ADICIONAR OUVINTES");

        //validaçao
        while (true) {
            System.out.println("Quantos ouvintes deseja adicionar?");
            String n = in.nextLine();
            try {
                num = Integer.parseInt(n);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Insira um valor numerico válido.");
            }
        }
        //Adicionar Jogador e Criação de Arrays
        for(int i = 0; i < num; i++) {
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
                i--;//para voltar atras
            }
        }

        if(num>1) {
            System.out.println("Foram adicionados " + num + " ouvintes à lista");
        }
        if(num == 1){
            System.out.println("Foi adicionado " + num + " ouvinte à lista");
        }
        Collections.sort(ouvintes);

    }
}