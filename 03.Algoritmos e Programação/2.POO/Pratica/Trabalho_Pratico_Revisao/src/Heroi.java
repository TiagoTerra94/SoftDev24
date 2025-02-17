public abstract class Heroi extends Entidade {
    protected int nivel;
    protected int ouro;
    protected ArmaPrincipal armaPrincipal;
    protected ArrayList<Consumivel> inventario;

    public Heroi(String nome, int vidaMax, int forca, int ouro) {
        super(nome, vidaMax, forca);
        this.nivel = 1;
        this.ouro = ouro;
        this.inventario = new ArrayList<>();
    }

    public abstract boolean atacar(NPC inimigo);

    public void usarPocao() {
        ArrayList<Consumivel> pocoes = new ArrayList<>();
        for (Consumivel item : inventario) {
            if (item instanceof Pocao) {
                pocoes.add(item);
            }
        }

        if (pocoes.isEmpty()) {
            System.out.println("Não há poções no inventário!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPoções disponíveis:");
        for (int i = 0; i < pocoes.size(); i++) {
            System.out.println((i+1) + ". " + pocoes.get(i).getNome());
            pocoes.get(i).mostrarDetalhes();
        }

        System.out.println("\nEscolha uma poção (0 para cancelar): ");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= pocoes.size()) {
            Pocao pocaoEscolhida = (Pocao) pocoes.get(escolha - 1);
            pocaoEscolhida.usar(this);
            inventario.remove(pocaoEscolhida);
        }
    }

    // Getters e setters adicionais
    public int getOuro() { return ouro; }
    public void setOuro(int ouro) { this.ouro = ouro; }
    public void setArmaPrincipal(ArmaPrincipal arma) { this.armaPrincipal = arma; }
    public void adicionarItem(Consumivel item) { this.inventario.add(item); }
}
