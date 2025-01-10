package Ex_10;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("Rui",1200,"Data Analyst");
        Funcionario func2 = new Funcionario("Maria",3500,"Recursos Humanos");

        func1.aumentarSalario(10);
        func1.exibirDados();
        System.out.println("------");
        func2.aumentarSalario(20);
        func2.exibirDados();


    }
}
