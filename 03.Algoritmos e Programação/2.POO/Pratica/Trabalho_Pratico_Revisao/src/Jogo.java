import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Scanner scanner;
    private Random random;

    public Jogo() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    /**
     * Método para criar um novo personagem
     */
    public Heroi criarPersonagem() {
        System.out.println("=== Criação de Personagem ===");
        System.out.println("Escolha sua classe:");
        System.out.println("1. Cavaleiro");
        System.out.println("2. Feiticeiro");
        System.out.println("3. Arqueiro");

        int escolhaClasse = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Digite o nome do seu personagem:");
        String nome = scanner.nextLine();

        System.out.println("\nEscolha a dificuldade:");
        System.out.println("1. Fácil (300 pontos, 20 ouro)");
        System.out.println("2. Difícil (220 pontos, 15 ouro)");

        int escolhaDificuldade = scanner.nextInt();
        int pontos = escolhaDificuldade == 1 ? 300 : 220;
        int ouroInicial = escolhaDificuldade == 1 ? 20 : 15;

        System.out.println("\nDistribua seus pontos:");
        System.out.println("Vida (1 ponto = 1 HP)");
        System.out.println("Força (1 ponto = 5 força)");

        int pontosVida = 0;
        int pontosForca = 0;

        while (pontos > 0) {
            System.out.println("\nPontos restantes: " + pontos);
            System.out.println("1. Adicionar à Vida (atual: " + pontosVida + ")");
            System.out.println("2. Adicionar à Força (atual: " + pontosForca * 5 + ")");

            int escolha = scanner.nextInt();
            System.out.println("Quantidade:");
            int quantidade = scanner.nextInt();

            if (escolha == 1) {
                if (quantidade <= pontos) {
                    pontosVida += quantidade;
                    pontos -= quantidade;
                } else {
                    System.out.println("Pontos insuficientes!");
                }
            } else if (escolha == 2) {
                if (quantidade * 5 <= pontos) {
                    pontosForca += quantidade;
                    pontos -= quantidade * 5;
                } else {
                    System.out.println("Pontos insuficientes!");
                }
            }
        }

        // Cria o herói baseado na classe escolhida
        Heroi heroi = null;
        switch (escolhaClasse) {
            case 1:
                heroi = new Cavaleiro(nome, pontosVida, pontosForca * 5, ouroInicial);
                break;
            case 2:
                heroi = new Feiticeiro(nome, pontosVida, pontosForca * 5, ouroInicial);
                break;
            case 3:
                heroi = new Arqueiro(nome, pontosVida, pontosForca * 5, ouroInicial);
                break;
        }

        return heroi;
    }

    /**
     * Método principal do jogo que controla o fluxo da aventura
     */
    public void iniciarAventura(Heroi heroi) {
        System.out.println("\n=== A Grande Aventura ===");
        System.out.println("Bem-vindo ao Labirinto dos Perigos, " + heroi.getNome() + "!");
        System.out.println("Uma antiga maldição paira sobre estas terras...");
        System.out.println("Apenas um herói corajoso poderá enfrentar os desafios e trazer a paz de volta.");

        // Inicializa o vendedor
        Vendedor vendedor = new Vendedor();
        System.out.println("\nVocê encontra um vendedor misterioso na entrada do labirinto...");
        vendedor.imprimirLoja();

        while (true) {
            System.out.println("\nDeseja comprar algo? (S/N)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("S")) {
                vendedor.vender(heroi);
            } else {
                break;
            }
        }

        // Estrutura do labirinto usando um mapa de salas
        Map<String, Sala> salas = new HashMap<>();
        inicializarLabirinto(salas);

        // Começa na primeira sala
        Sala salaAtual = salas.get("entrada");

        while (true) {
            // Processa a sala atual
            boolean continuarJogo = processarSala(salaAtual, heroi);
            if (!continuarJogo) {
                System.out.println("Fim de jogo!");
                break;
            }

            // Mostra opções de próximas salas
            List<String> opcoes = salaAtual.getSalasConectadas();
            System.out.println("\nPara onde deseja ir?");
            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println((i+1) + ". " + opcoes.get(i));
            }

            int escolha = scanner.nextInt() - 1;
            if (escolha >= 0 && escolha < opcoes.size()) {
                salaAtual = salas.get(opcoes.get(escolha));
            }
        }
    }

    /**
     * Inicializa o labirinto com todas as salas e conexões
     */
    private void inicializarLabirinto(Map<String, Sala> salas) {
        // Cria as salas
        Sala entrada = new Sala("Entrada", "A entrada do labirinto");
        Sala corredor = new Sala("Corredor Sombrio", "Um corredor escuro e úmido");
        Sala salaTesouro = new Sala("Sala do Tesouro", "Uma sala repleta de tesouros");
        Sala salaArmadilhas = new Sala("Sala das Armadilhas", "Uma sala perigosa cheia de armadilhas");
        Sala salaChefe = new Sala("Sala do Chefe", "A sala do terrível chefe final");
        Sala salaSecreta = new Sala("Sala Secreta", "Uma sala misteriosa escondida");

        // Adiciona inimigos e tesouros
        corredor.adicionarInimigo(new NPC("Goblin", 30, 5, 10));
        salaTesouro.setOuro(50);
        salaArmadilhas.setArmadilha(true);
        salaChefe.adicionarInimigo(new NPC("Dragão Ancião", 100, 15, 100));
        salaSecreta.adicionarItem(new Pocao("Poção Lendária", 0, 50, 5));

        // Conecta as salas
        entrada.conectarSala("Corredor Sombrio");
        corredor.conectarSala("Sala do Tesouro");
        corredor.conectarSala("Sala das Armadilhas");
        salaTesouro.conectarSala("Sala do Chefe");
        salaArmadilhas.conectarSala("Sala do Chefe");
        salaArmadilhas.conectarSala("Sala Secreta");

        // Adiciona as salas ao mapa
        salas.put("entrada", entrada);
        salas.put("corredor", corredor);
        salas.put("tesouro", salaTesouro);
        salas.put("armadilhas", salaArmadilhas);
        salas.put("chefe", salaChefe);
        salas.put("secreta", salaSecreta);
    }

    /**
     * Processa os eventos de uma sala
     */
    private boolean processarSala(Sala sala, Heroi heroi) {
        System.out.println("\n=== " + sala.getNome() + " ===");
        System.out.println(sala.getDescricao());

        // Processa armadilhas
        if (sala.temArmadilha()) {
            int dano = random.nextInt(30) + 1;
            System.out.println("Você ativou uma armadilha! Recebeu " + dano + " de dano!");
            heroi.setVidaAtual(heroi.getVidaAtual() - dano);

            if (heroi.getVidaAtual() <= 0) {
                System.out.println("Você morreu!");
                return false;
            }
        }

        // Processa inimigos
        if (sala.temInimigo()) {
            NPC inimigo = sala.getInimigo();
            System.out.println("Um " + inimigo.getNome() + " aparece!");

            boolean vitoria = heroi.atacar(inimigo);
            if (!vitoria) {
                return false;
            }
        }

        // Processa tesouros
        if (sala.temOuro()) {
            int ouro = sala.getOuro();
            System.out.println("Você encontrou " + ouro + " moedas de ouro!");
            heroi.setOuro(heroi.getOuro() + ouro);
        }

        // Processa itens
        if (sala.temItem()) {
            ItemHeroi item = sala.getItem();
            System.out.println("Você encontrou: " + item.getNome());
            if (item instanceof Consumivel) {
                heroi.adicionarItem((Consumivel) item);
            }
        }

        // Oferece opção de usar poção
        System.out.println("\nDeseja usar uma poção? (S/N)");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("S")) {
            heroi.usarPocao();
        }

        return true;
    }
}
