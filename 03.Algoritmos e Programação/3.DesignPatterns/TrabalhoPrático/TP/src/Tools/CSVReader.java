package Tools;

import Domain.Attraction;
import Domain.Cost;
import Domain.Sale;
import Domain.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

    public static ArrayList<User> readUserFiletoArray(String filePath) throws FileNotFoundException {

        //Instanciar array de Users(vazio)
        ArrayList<User> usersArrayRead = new ArrayList<>();

        //Instanciar o Scanner para ler o ficheiro
        Scanner sc = new Scanner(new File(filePath));

        //Ciclo que vai iterar para cada linha do ficheiro
        while(sc.hasNextLine()){

            String line = sc.nextLine();

            String[] separateLine = line.split(",");

            User newUser = new User(separateLine[0],separateLine[1],separateLine[2]);

            usersArrayRead.add(newUser);
        }

        return usersArrayRead;
    }

    public static ArrayList<Attraction> readAttractionFileToArray(String filePath) throws FileNotFoundException {

        ArrayList<Attraction> attractionsArrayRead = new ArrayList<>();

        Scanner sc = new Scanner(new File(filePath));

        //Ignora a primeira linha (cabeçalho)
        sc.nextLine();

        while(sc.hasNextLine()){

            String line = sc.nextLine();

            String[] separateLine = line.split(";");

            Attraction newAttraction = new Attraction(Integer.parseInt(separateLine[0]),separateLine[1],Double.parseDouble(separateLine[2]),Double.parseDouble(separateLine[3]), Integer.parseInt(separateLine[4]));

            attractionsArrayRead.add(newAttraction);
        }
        return attractionsArrayRead;
    }

    public static ArrayList<Sale> readSaleFileToArray(String filePath) throws FileNotFoundException {
        ArrayList<Sale> salesArrayRead = new ArrayList<>();

        Scanner sc = new Scanner(new File(filePath));

        sc.nextLine();

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            String[] separateLine = line.split(";");

            Sale newSale = new Sale(Integer.parseInt(separateLine[0]),separateLine[1],separateLine[2]);

            salesArrayRead.add(newSale);
        }
        return salesArrayRead;
    }

    public static ArrayList<Cost> readCostFileToArray(String filePath) throws FileNotFoundException {
        ArrayList<Cost> costsArrayRead = new ArrayList<>();

        Scanner sc = new Scanner(new File(filePath));

        sc.nextLine();

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            String[] separateLine = line.split(";");

            Cost newCost = new Cost(Integer.parseInt(separateLine[0]),Double.parseDouble(separateLine[1]),Double.parseDouble(separateLine[2]));

            costsArrayRead.add(newCost);
        }
        return costsArrayRead;

    }
}
