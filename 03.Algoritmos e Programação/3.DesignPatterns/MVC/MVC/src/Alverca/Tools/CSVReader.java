package Alverca.Tools;

import GrandesNegocios.Domain.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    public static ArrayList<Alverca.Domain.User> readUserFileToArray(String filePath) throws FileNotFoundException {

        //Instanciar o Array de Users (vazio)
        ArrayList<Alverca.Domain.User> usersArrayRead = new ArrayList<>();

        //Instanciar o Scanner para ler o ficheiro (caminho do ficheiro)
        Scanner sc = new Scanner(new File(filePath));

        //Ignorar a primeira linha (cabeçalho)
        sc.nextLine();

        //Ciclo que vai iterar para cada linha do ficheiro
        while(sc.hasNextLine()){

            //Guardamos toda a linha da variavel: Linha
            String line = sc.nextLine();

            //Criamos Array de Strings, onde cada posição terá uma coluna da linha
            String[] separateLine = line.split(";");

            //Criar objeto user
            Alverca.Domain.User newUser = new Alverca.Domain.User(separateLine[0],separateLine[1],separateLine[2]);

            //Adicionar novo User ao Array
            usersArrayRead.add(newUser);
        }

        return usersArrayRead;
    }
}
