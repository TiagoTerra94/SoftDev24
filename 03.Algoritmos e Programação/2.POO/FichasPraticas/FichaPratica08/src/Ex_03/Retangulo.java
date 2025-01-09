package Ex_03;

public class Retangulo {
    //Atributos de instancia
    private int largura;
    private int altura;

    //Metodo construtor
    public Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    public int perimetro(){
        int perimetroretangulo = 2*(this.largura + this.altura);
        return perimetroretangulo;
    }

    //podemos por return diretamente
    //return 2*(this.largura + this.altura);

    public int Area(){
        int arearetangulo = this.largura * this.altura;
        return arearetangulo;
    }

    //return this.largura * this.altura;
}
