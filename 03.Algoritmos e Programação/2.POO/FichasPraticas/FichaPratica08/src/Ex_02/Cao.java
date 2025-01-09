package Ex_02;

public class Cao {
    private String nome = "Joca";
    private String raca = "Golden";
    private String latido = "Auauau";

    //Metodo Construtor
    public Cao(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    //Metodo de acesso(getter setter)
    public void setLatido(String latido) {
        this.latido = latido;
    }

    //Metodo de instancia
    public void ladrar(){
        System.out.println(this.latido);
    }
}

