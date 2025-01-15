package Ex_05;

public class Main {
    public static void main(String[] args){

        //para instanciar classe e dar valor aos construtores
        Pessoa pessoa1 = new Pessoa("Vitor", 23, 1.7, "vitor@email.com","912345754");
        Pessoa pessoa2 = new Pessoa("Rui", 28, 1.8, "rui@email.com","931045366");

        Agenda agenda1 = new Agenda(5);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());

        //para mudar o valor da variavel da classe
        pessoa1.setIdade(26);

        System.out.println(pessoa1.getIdade());

        //Agenda
        agenda1.adicionarPessoas(pessoa1);
        agenda1.adicionarPessoas(pessoa2);

        agenda1.exibirDetalhes();
    }
}
