package Ex_08;

public class Main {
    public static void main(String[] args) {

        Aluno Joao = new Aluno("Joao",15,"Informática",15);
        Aluno Rita = new Aluno("Rita",18,"Hotelaria",8);

        System.out.println(Joao.Aprovacao());
        System.out.println(Rita.Aprovacao());
    }
}
