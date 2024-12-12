//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //nomes
        String[] nomes = new String[5];//0 1 2 3 4
        nomes[0] = "Joao";
        nomes[1] = "Maria";
        nomes[2] = "Maria";
        nomes[3] = "Maria";
        nomes[4] = "Maria";

        String[] nomes2 = new String[]{"Joao", "Maria","Maria", "Luis", "Mario"};

        //quando nao sabemos o tamanho do array, usamos nomevar.length
        for(int i=0; i < nomes2.length; i++){
            System.out.println("Posição: " + i + "valor" + nomes2[i]);
        }

        //para aplicar variaveis de arrays numa nova variavel
        for(String nome: nomes2){
            System.out.println(nome);
        }

        for(int i=0; i< nomes2.length; i++){
            System.out.println(nomes2[i]);
        }


        //idades, numero
        int[] idades = new int[5];//0 1 2 3 4
        idades[0] = 10;
        idades[1] = 5;
        idades[2] = 20;
        idades[3] = 10;
        idades[4] = 10;

        for(int i=0; i<5; i++){
            System.out.println("Posição: " + i + "valor" + idades[i]);
        }

        //array multidimensional
        int[][] nums = new int [2][2];
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[1][0] = 3;
        nums[1][1] = 4;

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Valor: " + nums[i][j]);
            }
        }


    }
}