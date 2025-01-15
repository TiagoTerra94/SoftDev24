package Ex_05;

public class Agenda {
    //Atributos de instancia
    private Pessoa[] listaAgenda;

    //Metodo construtor
    public Agenda(int contactos) {
        this.listaAgenda = new Pessoa[contactos];
    }

    //Metodo de Acesso


    //Metodo de instancia
    public void adicionarPessoas(Pessoa novaPessoa){

        for(int i = 0; i < this.listaAgenda.length; i++){
            if(this.listaAgenda[i] == null){
                this.listaAgenda[i] = novaPessoa;
                return;
            }
        }
    }

    public void exibirDetalhes(){

        for(int i = 0; i< listaAgenda.length && this.listaAgenda[i]!=null; i++){
            System.out.println("Contacto Nº" + (i+1) + ":");
            this.listaAgenda[i].exibirPessoa();
            System.out.println();
        }
    }
}
