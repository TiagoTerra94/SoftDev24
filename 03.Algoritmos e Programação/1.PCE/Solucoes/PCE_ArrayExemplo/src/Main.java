public class Main {
    public static void main(String[] args) {

        double[] nomes = new double[5]; // 0 1 2 3 4
        nomes[0] = 10;
        nomes[1] = 3;
        nomes[2] = 34;
        nomes[3] = 22;
        nomes[4] = 43;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posicao: " + i + " Valor: " + nomes[i]);
        }

        System.out.println("=======================");

        String[] nomes2 = new String[]{"Joao", "Maria", "Pedro", "Maria", "Pedro"};
        //for (String nome : nomes2) {
        for (int i = 0; i < nomes2.length; i++) {
            //System.out.println(nome);
            System.out.println(nomes2[i]);
        }

        System.out.println("=======================");

        int[][] nums = new int[2][2];
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[1][0] = 3;
        nums[1][1] = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Valor: " + nums[i][j]);
            }
        }
    }
}
