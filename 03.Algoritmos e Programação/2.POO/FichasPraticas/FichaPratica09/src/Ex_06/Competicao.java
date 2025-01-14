package Ex_06;

import java.sql.SQLOutput;

public class Competicao {
    //Atributos de instancia
    private String nome;
    private String pais;
    private Atleta[] listaParticipantes;

    //Metodo construtor
    public Competicao(String nome, String pais, int maxParticipantes) {
        this.nome = nome;
        this.pais = pais;
        this.listaParticipantes = new Atleta[maxParticipantes];
    }

    //Metodos de Acesso
    public String getNome() {
        return nome;
    }

    //Metodos de Instancia
    public void inscreverAtleta(Atleta atletaNovo){

        for(int i =0; i< listaParticipantes.length; i++){
            if(listaParticipantes[i] == null){//posiçao vazia
                this.listaParticipantes[i] = atletaNovo;
                System.out.println(atletaNovo.getNome() + " inscrito com sucesso no " + this.nome);
                return;
            }
        }
        System.out.println("*************");
    }

    public void exibirDetalhes(){
        System.out.println("*******" + this.nome + "|" + this.pais + "********");

        for(int i= 0; i <listaParticipantes.length && this.listaParticipantes[i]!=null; i++){
            this.listaParticipantes[i].exibirDetalhes();
        }
    }
}
