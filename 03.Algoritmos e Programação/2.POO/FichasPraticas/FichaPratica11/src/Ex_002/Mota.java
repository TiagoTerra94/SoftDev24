package Ex_002;

import Ex_002.Enums.TipoCombustivel;

import java.io.*;
import java.util.ArrayList;

public class Mota extends Veiculo{


    //Metodo Construtor
    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cc, TipoCombustivel combustivel, int litroskm) {
        super(modelo, marca, anoFabrico, potencia, cc, combustivel, litroskm);
    }

    //Metodo de Acesso

    //Metodo de instancia
    public void imprimir(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Ex_002/Mota.txt"));
            String linha = "", texto = "";
            while ((linha = br.readLine()) != null) {
                texto += linha + "\n";
            }

            System.out.println(texto);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
