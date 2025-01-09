package Ex_10;

public class Funcionario {
    //Atributos de instancia
    private String nome;
    private double salario;
    private String departamento;

    //Metodo construtor
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }


    //Metodos de acesso


    //Metodos de instancia
   public double aumentarSalario(double percentagem){
        this.salario = this.salario + (this.salario * (percentagem/100));
        return this.salario;
   }

   public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
   }

}


