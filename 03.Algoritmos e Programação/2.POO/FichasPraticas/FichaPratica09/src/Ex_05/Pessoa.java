package Ex_05;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int idade, double altura, String email, String telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.email = email;
        this.telemovel = telemovel;
    }

    //para poder buscar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void exibirPessoa(){
        System.out.println("Nome: " + this.nome + "\nEmail: " + this.email + "\nTelemovel: " + this.telemovel);
    }
}
