import java.util.Scanner;

public class Cavaleiro extends Heroi {
    private boolean ataqueEspecialDisponivel;

    public Cavaleiro(String nome, int vidaMax, int forca, int ouro) {
        super(nome, vidaMax, forca, ouro);
        this.ataqueEspecialDisponivel = true;
    }

    @Override
    public boolean atacar(NPC inimigo) {
        Scanner scanner = new Scanner(System.in);
        boolean combateAtivo = true;

        while (combateAtivo) {
            // Inimigo ataca primeiro
            int danoInimigo = (int)(inimigo.getForca() * 0.8);
            this.vidaAtual -= danoInimigo;
            System.out.println(inimigo.getNome() + " causa " + danoInimigo + " de dano!");

            if (this.vidaAtual <= 0) {
                System.out.println(this.nome + " foi derrotado!");
                return false;
            }

            // Menu de ações do Cavaleiro
            System.out.println("\nEscolha seu ataque:");
            System.out.println("1. Ataque Normal");
            if (ataqueEspecialDisponivel) {
                System.out.println("2. Ataque Especial");
            }
            System.out.println("3. Usar Consumível");

            int escolha = scanner.nextInt();
            int dano = 0;

            switch (escolha) {
                case 1:
                    dano = this.forca + this.armaPrincipal.getAtaque();
                    break;
                case 2:
                    if (ataqueEspecialDisponivel) {
                        dano = this.forca + this.armaPrincipal.getAtaqueEspecial();
                        ataqueEspecialDisponivel = false;
                    } else {
                        System.out.println("Ataque Especial já foi usado!");
                        continue;
                    }
                    break;
                case 3:
                    usarConsumivel(inimigo);
                    continue;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            inimigo.setVidaAtual(inimigo.getVidaAtual() - dano);
            System.out.println(this.nome + " causa " + dano + " de dano!");

            if (inimigo.getVidaAtual() <= 0) {
                subirNivel();
                this.ouro += inimigo.getOuro();
                return true;
            }
        }
        return false;
    }

    private void usarConsumivel(NPC inimigo) {
        ArrayList<Consumivel> consumiveisCombate = new ArrayList<>();
        for (Consumivel item : inventario) {
            if (item instanceof ConsumivelCombate) {
                consumiveisCombate.add(item);
            }
        }

        if (consumiveisCombate.isEmpty()) {
            System.out.println("Não há consumíveis de combate!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nConsumíveis disponíveis:");
        for (int i = 0; i < consumiveisCombate.size(); i++) {
            System.out.println((i+1) + ". " + consumiveisCombate.get(i).getNome());
        }

        System.out.println("Escolha um consumível (0 para cancelar): ");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= consumiveisCombate.size()) {
            ConsumivelCombate consumivel = (ConsumivelCombate) consumiveisCombate.get(escolha - 1);
            inimigo.setVidaAtual(inimigo.getVidaAtual() - consumivel.getAtaqueInstantaneo());
            inventario.remove(consumivel);
            System.out.println("Usou " + consumivel.getNome() + "!");
        }
    }

    private void subirNivel() {
        this.nivel++;
        this.vidaMax += 10;
        this.vidaAtual += 10;
        this.forca += 1;
        System.out.println(this.nome + " subiu para o nível " + this.nivel + "!");
    }
}
