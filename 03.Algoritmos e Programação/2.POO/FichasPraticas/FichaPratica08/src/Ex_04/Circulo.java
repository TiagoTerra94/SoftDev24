package Ex_04;

public class Circulo {
    //Atributos de instancia
    private double raio;

    //Metodo Contrutor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //Metodo calculo
    public double Area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double Cicunferencia() {
        return 2* Math.PI * this.raio;
    }
}
