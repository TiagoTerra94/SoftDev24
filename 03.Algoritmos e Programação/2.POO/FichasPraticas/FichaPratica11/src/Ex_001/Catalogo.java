package Ex_001;

import java.util.ArrayList;

public class Catalogo {
    //Atributos de instancia
    protected ArrayList<Aviao> listaAviao;

    //Metodo Construtor
    public Catalogo() {
        this.listaAviao = new ArrayList<Aviao>();
    }

    //Metodos de Acesso


    //Metodos de Instancia
    public void adquirirAviao(Aviao novoAviao){
        this.listaAviao.add(novoAviao);
    }

    public void venderAviao(Aviao aviaoVendido){
        this.listaAviao.remove(aviaoVendido);
    }

    public double calcularTotalCatalogo(){
        double total = 0;

        for(Aviao aviaoAtual: this.listaAviao ){
            total+= aviaoAtual.getPreco();
        }
        return total;
    }

    public void listarCatalogo(){
        for(Aviao aviaoAtual: this.listaAviao){
            aviaoAtual.exibirDetalhes();
            System.out.println();
        }

    }
}
