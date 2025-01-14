package Ex_06;

public class Atleta {
    private String nome;
    private String modalidade;
    double altura;
    double peso;
    String paisOrigem;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    //Metodo de Acesso
    public String getNome() {
        return nome;
    }

    public void exibirDetalhes(){
        System.out.println(this.nome + "|" + this.modalidade + "|" + this.paisOrigem);
    }
}
