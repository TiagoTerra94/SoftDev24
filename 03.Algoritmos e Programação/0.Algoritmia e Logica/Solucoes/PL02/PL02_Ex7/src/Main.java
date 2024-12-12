import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 7. O preço de um automóvel é calculado pela soma do preço de fábrica com o
        // preço dos impostos (45% do preço de fábrica) e a percentagem do revendedor
        // (28% do preço de fábrica). Faça um algoritmo que leia o nome do
        // automóvel e o preço de fábrica e escreva o nome do automóvel e o preço final.

        Scanner in = new Scanner(System.in);
        double percImpostos = 0.45;
        double percRevendedor = 0.28;

        System.out.println("Qual o carro que vai comprar?");
        String carro = in.nextLine();

        System.out.println("Qual o preço de fábrica do "+carro+"?");
        double precoFabrica = in.nextDouble();

        double impostos = precoFabrica * percImpostos;
        double revendedor = precoFabrica * percRevendedor;
        double precoTotal = precoFabrica + impostos + revendedor;
        // double precoTotal = precoFabrica + precoFabrica * 0.45 + precoFabrica * 0.28;
        System.out.println("O automóvel " + carro + " custará no total " + precoTotal);
    }
}