import java.io.*;

public class Main {
    public static void main(String[] args) {

        Leitura();
        Escrita();

    }

    private static void Escrita() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write("Texto linha 5");
            bw.newLine();
            bw.write("Texto linha 6");
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro no ficheiro");
        }
    }

    private static void Leitura() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro no ficheiro");
        }
    }
}