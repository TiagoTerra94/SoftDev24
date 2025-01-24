package Ex_02;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Vitor Santos",35,921345087,"vitorsantos@email.com");
        Pessoa pessoa2 = new Pessoa("Tiago Terra", 30,932008167,"tiagoterra@email.com");
        Pessoa pessoa3 = new Pessoa("Rui Cruz", 45,912037188,"ruicruz@email.com");
        Pessoa pessoa4 = new Pessoa("Ruben Pereira", 27,965189267,"rubenpereira@email.com");
        Pessoa pessoa5 = new Pessoa("Maria Antonieta",15,912134999,"maria@email.com");

        Sorteio euromilhoes = new Sorteio();

        //Adicionar participantes
        euromilhoes.addParticipantes(pessoa1);
        euromilhoes.addParticipantes(pessoa2);
        euromilhoes.addParticipantes(pessoa3);
        euromilhoes.addParticipantes(pessoa4);
        euromilhoes.addParticipantes(pessoa5);
        System.out.println("----------");

        //Imprimir lista de participantes
        euromilhoes.imprimirLista();
        System.out.println("----------");

        //Sortear Vencedor e adicionar a um objeto
        Pessoa vencedor = euromilhoes.sortear();

        //Imprimir o objeto vencedor
        vencedor.exibirDetalhes();


    }
}
