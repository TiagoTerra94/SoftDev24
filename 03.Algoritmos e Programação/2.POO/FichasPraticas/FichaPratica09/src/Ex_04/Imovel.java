package Ex_04;

public class Imovel {
    //Atributos de Instancia
    private String rua;
    private int numeroPorta;
    private String cidade;
    private String tipoCasa;
    private String acabamento;
    private double area;
    private int numeroQuartos;
    private int numeroWC;
    private double areaPiscina;
    private double valorImovel;

    //Metodo construtor
    public Imovel(String rua, int numeroPorta, String cidade, String tipoCasa, String acabamento, double area, int numeroQuartos, int numeroWC, double areaPiscina) {
        this.rua = rua;
        this.numeroPorta = numeroPorta;
        this.cidade = cidade;
        this.tipoCasa = tipoCasa;
        this.acabamento = acabamento;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.numeroWC = numeroWC;
        this.areaPiscina = areaPiscina;
    }

    //Metodos de Acesso
    public String getRua() {
        return rua;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    // Metodos de Instancia
    public double valorImovel() {

        if(this.tipoCasa == "Apartamento"){
            valorImovel += 1000 * area;
        } else if (this.tipoCasa == "Casa") {
            valorImovel += 3000 * area;
        } else if (this.tipoCasa == "Mansão") {
            valorImovel += 5000 * area;
        }

        if(this.acabamento == "Restauro"){
            valorImovel -= valorImovel * 0.5;
        } else if (this.acabamento == "Usada") {
            valorImovel -= valorImovel * 0.1;
        } else if (this.acabamento == "Nova com Acabamento") {
            valorImovel += valorImovel * 0.25;
        }

        for(int i=0; i < numeroQuartos; i++){
            valorImovel += 7500;
        }

        for(int i=0; i<numeroWC; i++){
            valorImovel += 10500;
        }

        if(areaPiscina != 0){
            valorImovel += 1000 * areaPiscina;
        }

        return valorImovel;
    }

    public void imprimirDescricao(){
        System.out.println("Tipo de Imovel: " + this.tipoCasa + "\n Acabamento: " + this.acabamento + "\n Área: " + this.area + "\n NºQuartos: " + this.numeroQuartos + "\n Nº WC: " + this.numeroWC + "\n Área Piscina: " + this.areaPiscina + "\n");
    }

    public Imovel compararImoveis(Imovel outroImovel){

        if(this.valorImovel > outroImovel.valorImovel()){//se este imovel for mais caro
            return this;
        }else if(this.valorImovel < outroImovel.valorImovel()){//se o outro imovel for mais caro
            return outroImovel;
        }else {//se ambos forem do mesmo valor
            return null;
        }

    }
}



