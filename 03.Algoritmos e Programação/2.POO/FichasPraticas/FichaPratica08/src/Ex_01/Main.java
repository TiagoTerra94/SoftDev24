package Ex_01;

public class Main {
    public static void main(String[] args){

        //para instanciar classe e dar valor aos construtores
        Pessoa pessoa1 = new Pessoa("Vitor", 23, 1.7);
        Pessoa pessoa2 = new Pessoa("Rui", 28, 1.8);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());

        //para mudar o valor da variavel da classe
        pessoa1.setIdade(26);

        System.out.println(pessoa1.getIdade());
    }
}
