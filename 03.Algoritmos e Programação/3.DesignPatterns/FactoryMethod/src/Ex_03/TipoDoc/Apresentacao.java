package Ex_03.TipoDoc;

public class Apresentacao extends Documento{
    public Apresentacao(String autor, String nome, String extensao) {
        super(autor, nome, extensao);
    }

    @Override
    public void open() {
        System.out.println("A abrir documento de " + getClass().getSimpleName()+ "" + this.nome + this.extensao);
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + this.autor + "gravadas");

    }

    @Override
    public void close() {

    }
}
