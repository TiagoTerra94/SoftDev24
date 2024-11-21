import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um lado do triângulo:");
        int l1 = in.nextInt();

        System.out.println("Insira outro lado do triângulo:");
        int l2 = in.nextInt();

        System.out.println("Insira o último lado do triângulo:");
        int l3 = in.nextInt();

        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Não é possivel determinar. Valor Inválido.");
        } else if (l1 > (l2 + l3) || l2 > (l1 + l3) || l3 > (l2 + l1)) {
                System.out.println("Não é possivel determinar.");
            } else{
                if (l1 == l2 && l1 == l3) {
                    System.out.println("Este triângulo é um Equilátero.");
                } else if (l1 != l2 && l1 != l3 && l2 != l3) {
                    System.out.println("Este triângulo é um Escaleno.");
                } else if (l1 == l2 && l1 != l3){
                    System.out.println("Este triângulo é um Isosceles.");
                }
            }
        }
    }
