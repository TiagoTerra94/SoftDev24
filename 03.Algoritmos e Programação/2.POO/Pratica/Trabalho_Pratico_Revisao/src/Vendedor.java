import java.util.ArrayList;
import java.util.Random;

public class Vendedor {
    private ArrayList<ItemHeroi> loja;
    private Random random;

    public Vendedor() {
        this.loja = new ArrayList<>();
        this.random = new Random();
        inicializarLoja();
    }

    private void inicializarLoja() {
        // Armas
        ArmaPrincipal espadaBasica = new ArmaPrincipal("Espada Básica", 10, 5, 8);
        espadaBasica.adicionarHeroiPermitido("Cavaleiro");

        ArmaPrincipal cajadoMagico = new ArmaPrincipal("Cajado Mágico", 15, 6, 10);
        cajadoMagico.adicionarHeroiPermitido("Feiticeiro");

        ArmaPrincipal arcoLongo = new ArmaPrincipal("Arco Longo", 12, 5, 9);
        arcoLongo.adicionarHeroiPermitido("Arqueiro");

        // Poções
        Pocao pocaoCura = new Pocao("Poção de Cura", 5, 25, 0);
        pocaoCura.adicionarHeroiPermitido("Cavaleiro");
        pocaoCura.adicionarHeroiPermitido("Feiticeiro");
        pocaoCura.adicionarHeroiPermitido("Arqueiro");

        // Adiciona itens à loja
        loja.add(espadaBasica);
        loja.add(cajadoMagico);
        loja.add(arcoLongo);
        loja.add(pocaoCura);
        // Adicione mais itens conforme necessário
    }

    public void imprimirLoja() {
        ArrayList<ItemHeroi> itensDisponiveis = new ArrayList<>(loja);
        Collections.shuffle(itensDisponiveis);

        System.out.println("\n=== Itens Disponíveis ===");
        for (int i = 0; i < Math.min(10, itensDisponiveis.size()); i++) {
            System.out.println("\nItem " + (i+1) + ":");
            itensDisponiveis.get(i).mostrarDetalhes();
        }
    }

    public void vender(Heroi heroi) {
        Scanner scanner = new Scanner(System.in);
        imprimirLoja();

        System.out.println("\nEscolha um item para comprar (0 para sair):");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= Math.min(10, loja.size())) {
            ItemHeroi item = loja.get(escolha - 1);

            if (item.getPreco() > heroi.getOuro()) {
                System.out.println("Ouro insuficiente!");
                return;
            }

            if (!item.podeSerUsadoPor(heroi.getClass().getSimpleName())) {
                System.out.println("Este item não pode ser usado por sua classe!");
                return;
            }

            heroi.setOuro(heroi.getOuro() - item.getPreco());

            if (item instanceof ArmaPrincipal) {
                heroi.setArmaPrincipal((ArmaPrincipal) item);
                System.out.println("Arma equipada!");
            } else if (item instanceof Consumivel) {
                heroi.adicionarItem((Consumivel) item);
                System.out.println("Item adicionado ao inventário!");
            }
        }
    }
}

