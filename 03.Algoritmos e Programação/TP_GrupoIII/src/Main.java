import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

//Grupo III do Trabalho Prático
//Estatisticas
public class Main {
    static Scanner in = new Scanner(System.in);
    static int op =1;
    static ArrayList<String> distritos = new ArrayList<>();
    static ArrayList<Integer> inscritos = new ArrayList<>();
    static ArrayList<Integer> votantes = new ArrayList<>();
    static ArrayList<Integer> nulos = new ArrayList<>();
    static ArrayList<Integer> brancos = new ArrayList<>();
    static ArrayList<Integer> ad = new ArrayList<>();
    static ArrayList<Integer> ps = new ArrayList<>();
    static ArrayList<Integer> ch = new ArrayList<>();
    static ArrayList<Integer> il = new ArrayList<>();
    static ArrayList<Integer> be = new ArrayList<>();
    static ArrayList<Integer> outrosPartidos = new ArrayList<>();
    static ArrayList<Integer> totalVotos = new ArrayList<>();
    static String vencedor;
    public static void main(String[] args) {


        do{
            System.out.println("RESULTADOS ATO ELEITORAL");
            System.out.println("1- Leitura ficheiro");
            if(!distritos.isEmpty()) {
                System.out.println("2- Vizualizar Informação");
                System.out.println("3- Total Votantes por Distrito");
                System.out.println("4- Partido com mais votos");
                System.out.println("5- Distrito/Partido com mais votos");
                System.out.println("6- Ordenar distritos");
                System.out.println("7- Atualizar Dados");
                System.out.println("8- Gerar Email");
                System.out.println("9- Guardar ficheiro");
            }
            System.out.println("0- Sair");

            in = new Scanner(System.in);
            //certifica que introduz um numero
            while (true) {
                System.out.print("Que opção deseja:");
                String option = in.nextLine();
                try {
                    op = Integer.parseInt(option);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Insira uma opção válida.");
                }
            }

            switch (op){
                case 0:
                    break;
                case 1:
                    lerFicheiro();
                    break;
                case 2:
                    imprimirInfo();
                    break;
                case 3:
                    totalVotantes();
                    break;
                case 4:
                    votosPartido();
                    break;
                case 5:
                    distritoPartido();
                    break;
                case 6:
                    ordenarDistritos();
                    break;
                case 7:
                    atualizarDados();
                    break;
                case 8:
                    imprimirEmail();
                    break;
                case 9:
                    gravarFicheiro();
                    break;
            }

        }while(op!=0);

    }

    //ex10
    private static void gravarFicheiro() {
        System.out.println("OPÇÃO 9 - GRAVAR PARA FICHEIRO");
        String texto = "";
        //preenche o String texto
        for(int i = 0;i<distritos.size();i++){
            texto += distritos.get(i) + ";"
                    + inscritos.get(i) + ";"
                    + votantes.get(i) + ";"
                    + nulos.get(i) + ";"
                    + brancos.get(i) + ";"
                    + ad.get(i) + ";"
                    + ps.get(i) + ";"
                    + ch.get(i) + ";"
                    + il.get(i) + ";"
                    + be.get(i) + ";";
            if(!outrosPartidos.isEmpty()) {
                texto += outrosPartidos.get(i) + ";";
            }
            if(!totalVotos.isEmpty()) {
                texto += totalVotos.get(i);
            }
            texto += "\n";
        }

        //guarda tudo que está na String texto no ficheiro .txt
        try {
            Files.writeString(Path.of("distritos.txt"), texto);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar ficheiro");
        }
    }

    //ex09
    private static void imprimirEmail() {
        System.out.println("OPÇÃO 8 - IMPRIMIR EMAIL");

        ArrayList<Integer> invalidos = new ArrayList<>();
        ArrayList<String> listInvalidos = new ArrayList<>();

        //Busca os valores inválidos de cada distrito
        for (int i = 0; i < distritos.size(); i++) {
            invalidos.add(nulos.get(i) + brancos.get(i));
        }

        //Compara os valores invalidos e encontra os que têm maior quantidade adicionando os distritos num array
        if(invalidos.get(0) >= invalidos.get(1) && invalidos.get(0) >= invalidos.get(2) && invalidos.get(0) >= invalidos.get(3)) {
            listInvalidos.add(distritos.get(0));
        } else if (invalidos.get(1) >= invalidos.get(2) && invalidos.get(1)>=invalidos.get(3)) {
            listInvalidos.add(distritos.get(1));
        } else if (invalidos.get(2)>=invalidos.get(3)) {
            listInvalidos.add(distritos.get(2));
        }else {
            listInvalidos.add(distritos.get(3));
        }

        //Endereço de email do distrito com mais votos inválidos
        for(int i = 0;i<listInvalidos.size();i++){
            String distrito = listInvalidos.get(i);
            String email = ("" + distrito.charAt(0) + distrito.charAt(1) + distrito.charAt(distrito.length() - 2) +
                    distrito.charAt(distrito.length()-1) + "@ine.pt").toLowerCase();
            System.out.println("Distrito: " + listInvalidos.get(i) + " Email: " + email);
        }
    }

    //ex08
    private static void atualizarDados() {
        System.out.println("OPÇÃO 7- ATUALIZAR DADOS DO DISTRITO");

        in = new Scanner(System.in);
        System.out.println("Que distrito quer fazer a alterar?");
            String distrito = in.nextLine();
            while(!distritos.contains(distrito)){
                System.out.println("Distrito não encontrado. Tente Novamente: ");
                distrito = in.nextLine();
            }

            for(int i = 0; i < distritos.size(); i++){
                if(Objects.equals(distrito, distritos.get(i))){
                    System.out.println("Qual dados a atualizar?");
                    System.out.println("1- Inscritos");
                    System.out.println("2- Votantes");
                    System.out.println("3- Nulos");
                    System.out.println("4- Brancos");
                    System.out.println("5- AD");
                    System.out.println("6- PS");
                    System.out.println("7- CH");
                    System.out.println("8- IL");
                    System.out.println("9- BE");
                    if (!outrosPartidos.isEmpty()) {
                        System.out.println("10 - Outros");
                    }

                    int option;
                    in = new Scanner(System.in);
                    //certifica que introduz um numero
                    while (true) {
                        System.out.print("Opção:");
                        String opt = in.nextLine();
                        try {
                            option = Integer.parseInt(opt);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Insira uma opção válida.");
                        }
                    }

                    while(option < 0 || option >10){
                        System.out.println("Opção Inválida. Tente novamente: ");
                        option = in.nextInt();
                    }


                    System.out.println("Insira o novo valor: ");
                    int novoValor = in.nextInt();
                    while(novoValor < 0){
                        System.out.println("Número Inválido. Tente novamente: ");
                        novoValor = in.nextInt();
                    }

                    if(inscritos.get(i) < votantes.get(i)){
                        System.out.println("Número de inscritos inválido.");
                        return;
                    }

                    if(option == 1) inscritos.set(i, novoValor);
                    if(option == 2) votantes.set(i,novoValor);
                    if(option == 3) nulos.set(i, novoValor);
                    if(option == 4) brancos.set(i, novoValor);
                    if(option == 5) ad.set(i, novoValor);
                    if(option == 6) ps.set(i, novoValor);
                    if(option == 7) ch.set(i, novoValor);
                    if(option == 8) il.set(i, novoValor);
                    if(option == 9) be.set(i, novoValor);
                    if(!outrosPartidos.isEmpty() && option == 10) outrosPartidos.set(i, novoValor);

                }

            }
            atualizarValores();
            imprimirInfo();
    }

    private static void atualizarValores() {
        int somaPartidos;
        for (int i = 0; i < distritos.size(); i++){
            //soma dos partidos
            somaPartidos = nulos.get(i)
                    + brancos.get(i)
                    + ad.get(i)
                    + ps.get(i)
                    + ch.get(i)
                    + il.get(i)
                    + be.get(i);

            if(!outrosPartidos.isEmpty()) {
                somaPartidos += outrosPartidos.get(i);
            }


            //Validaçao
            if(inscritos.get(i) < somaPartidos) {
                System.out.println("Número de inscritos inválido.");
                return;
            }

            //Altera no array depois de validaçao
            totalVotos.set(i, somaPartidos);
            votantes.set(i, somaPartidos);
        }
    }

    //ex07
    private static void ordenarDistritos() {
        //Ordenar de forma descrescente do numero de votos no partido que ganhou as eleiçoes
        System.out.println("OPÇÃO 6- ORDENAR DISTRITOS PELO VENCEDOR");
        ArrayList<String> ordemDistrito = new ArrayList<>(distritos);
        ArrayList<Integer> ordemPartido = null;

        //Recalcula votos caso houver alteração após atualizar
        recalcularVotos();
        System.out.println("Vencedor das eleições: " + vencedor);

        for(int i = 0; i < ordemDistrito.size(); i++) {
            if(Objects.equals(vencedor, "AD")){
                ordemPartido = new ArrayList<>(ad);
            }else if(Objects.equals(vencedor, "PS")){
                ordemPartido = new ArrayList<>(ps);
            }else if(Objects.equals(vencedor, "CH")){
                ordemPartido = new ArrayList<>(ch);
            }else if(Objects.equals(vencedor, "IL")){
                ordemPartido = new ArrayList<>(il);
            }else{
                ordemPartido = new ArrayList<>(be);
            }
        }

        //Ordena de forma descrescente os Distritos e os votos do partido vencedor
        for(int i = 0; i < ordemPartido.size()-1; i++){
            for(int j = i+1; j < ordemPartido.size(); j++){
                if(ordemPartido.get(i) < ordemPartido.get(j)){
                    String temp = ordemDistrito.get(i);
                    ordemDistrito.set(i, ordemDistrito.get(j));
                    ordemDistrito.set(j, temp);

                    int tempAd = ordemPartido.get(i);
                    ordemPartido.set(i, ordemPartido.get(j));
                    ordemPartido.set(j, tempAd);
                }
            }
        }

        System.out.println("Ordem Descrescente: ");
        for(int i = 0; i < ordemPartido.size(); i++) {
            System.out.println((i+1) + "º - " + ordemDistrito.get(i) + ": " + ordemPartido.get(i) + " Votos");
        }
    }

    private static void recalcularVotos() {
        //Recalcula votos para saber o vencedor das eleiçoes
        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0, votos5 = 0, votos6 = 0, votosTotais = 0;
        vencedor = " ";

        for (int i = 0; i < votantes.size()-1; i++) {
            votos1 += ad.get(i);
            votos2 += ps.get(i);
            votos3 += ch.get(i);
            votos4 += il.get(i);
            votos5 += be.get(i);
        }

        if (votos1 >= votos2 && votos1 >= votos3 && votos1 >= votos4 && votos1 >= votos5){
            vencedor = "AD";
        }else if (votos2 >= votos3 && votos2 >= votos4 && votos2 >= votos5) {
            vencedor = "PS";
        }else if (votos3 >= votos4 && votos3 >= votos5) {
            vencedor = "CH";
        }else if (votos4 >= votos5) {
            vencedor = "IL";
        }else{
            vencedor = "BE";
        }
    }

    //ex06
    private static void distritoPartido() {
        System.out.println("OPÇÃO 5 - DISTRITO E O PARTIDO COM MAIS VOTOS");
        double percAd, percPs, percCh, percIl, percBe;

        for (int i = 0; i < votantes.size(); i++) {
            //Percentagem do partido no distrito
            percAd = (double) (ad.get(i) * 100) / votantes.get(i);
            percPs = (double) (ps.get(i) * 100) / votantes.get(i);
            percCh = (double) (ch.get(i) * 100) / votantes.get(i);
            percIl = (double) (il.get(i) * 100) / votantes.get(i);
            percBe = (double) (be.get(i) * 100) / votantes.get(i);

            //Imprime o Partido vencedor em cada distrito e sua percentagem
            System.out.print("No distrito de " + distritos.get(i) + " o partido que ganhou foi: ");
            if(ad.get(i) > ps.get(i) && ad.get(i) > ch.get(i) && ad.get(i) > il.get(i) && ad.get(i) > be.get(i)){
                System.out.print("AD ");
                System.out.print("(");
                System.out.printf("%.2f", percAd);
                System.out.println("%)");
            }else if(ps.get(i) > ch.get(i) && ps.get(i) > il.get(i) && ps.get(i) > be.get(i)){
                System.out.print("PS ");
                System.out.print("(");
                System.out.printf("%.2f", percPs);
                System.out.println("%)");
            }else if(ch.get(i) > il.get(i) && ch.get(i) > be.get(i)){
                System.out.println("CH ");
                System.out.print("(");
                System.out.printf("%.2f", percCh);
                System.out.println("%)");
            }else if(il.get(i) > be.get(i)){
                System.out.println("IL ");
                System.out.print("(");
                System.out.printf("%.2f", percIl);
                System.out.println("%)");
            }else{
                System.out.println("BE ");
                System.out.print("(");
                System.out.printf("%.2f", percBe);
                System.out.println("%)");
            }
        }
    }

    //ex04,ex05
    private static void votosPartido() {
        System.out.println("OPÇÃO 4- PARTIDO COM MAIS VOTOS TOTAIS");
        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0, votos5 = 0, votos6 = 0, votosTotais =0;

        for (int i = 0; i < votantes.size()-1; i++) {
            votos1 += ad.get(i);
            votos2 += ps.get(i);
            votos3 += ch.get(i);
            votos4 += il.get(i);
            votos5 += be.get(i);
            votos6 += outrosPartidos.get(i);
            votosTotais += votantes.get(i);
        }

        //Percentagem de Votos em cada partido
        double percAd = (double) (votos1 * 100) / votosTotais;
        double percPs = (double) (votos2 * 100) / votosTotais;
        double percCh = (double) (votos3 * 100) / votosTotais;
        double percIl = (double) (votos4 * 100) / votosTotais;
        double percBe = (double) (votos5 * 100) / votosTotais;

        System.out.println("O(s) partido(s) com mais votos: ");
        if (votos1 >= votos2 && votos1 >= votos3 && votos1 >= votos4 && votos1 >= votos5){
            System.out.println("AD TOTAL VOTOS: " + votos1);
            System.out.print("PERCENTAGEM VOTOS: ");
            System.out.printf("%.2f", percAd);
            System.out.println("%");
        }else if (votos2 >= votos3 && votos2 >= votos4 && votos2 >= votos5) {
            System.out.println("PS TOTAL VOTOS: " + votos2);
            System.out.println(" PERCENTAGEM VOTOS: ");
            System.out.printf("%.2f", percPs);
            System.out.println("%");
        }else if (votos3 >= votos4 && votos3 >= votos5) {
            System.out.println("CH TOTAL VOTOS: " + votos3);
            System.out.print("PERCENTAGEM VOTOS: ");
            System.out.printf("%.2f", percCh);
            System.out.println("%");
        }else if (votos4 >= votos5) {
            System.out.println("IL TOTAL VOTOS: " + votos4);
            System.out.print("PERCENTAGEM VOTOS: ");
            System.out.printf("%.2f", percIl);
            System.out.println("%");
        }else{
            System.out.println("BE TOTAL VOTOS: " + votos5);
            System.out.print("PERCENTAGEM VOTOS: ");
            System.out.printf("%.2f", percBe);
            System.out.println("%");
        }
    }

    //ex03
    private static void totalVotantes() {
        System.out.println("OPÇÃO 3 - TOTAL DE VOTANTES POR DISTRITO");
        ArrayList<String> maiorDistritos = new ArrayList<>();

        recalcularVotos();

        for (int i = 0; i < totalVotos.size(); i++){
            System.out.println("Total Votos do distrito de " + distritos.get(i) + ": " + totalVotos.get(i));
        }

        //Distrito com mais votos
        if(totalVotos.get(0) >= totalVotos.get(1) && totalVotos.get(0) >= totalVotos.get(2) && totalVotos.get(0) >= totalVotos.get(3)) {
            maiorDistritos.add(distritos.get(0));
        }else if(totalVotos.get(1)>= totalVotos.get(2) && totalVotos.get(1) >= totalVotos.get(3)) {
            maiorDistritos.add(distritos.get(1));
        }else if(totalVotos.get(2)>= totalVotos.get(3)) {
            maiorDistritos.add(distritos.get(2));
        }else{
            maiorDistritos.add(distritos.get(3));
        }

        System.out.print("O(s) distrito(s) com maior número de votos é/são: ");
        for(int i = 0;i<maiorDistritos.size();i++) {
            System.out.println(maiorDistritos.get(i));
        }
    }

    //ex02
    private static void imprimirInfo() {
        System.out.println("OPÇÃO 2- VIZUALIZAR RESULTADOS");

        //Imprime cada linha do array
        System.out.println("DISTRITO    |   INSCRITOS |   VOTANTES  |  NULOS  |  BRANCOS  |   AD  |   PS  |   CH  |   IL  |   BE  |   OUTROS   |   TOTAL   ");
        for(int i = 0; i < inscritos.size(); i++){
            System.out.printf("%-12s| %-12d| %-12d| %-8d| %-10d| %-6d| %-6d| %-6d| %-6d| %-6d| %-10s| %-8s%n",
            distritos.get(i),
            inscritos.get(i),
            votantes.get(i),
            nulos.get(i),
            brancos.get(i),
            ad.get(i),
            ps.get(i),
            ch.get(i),
            il.get(i),
            be.get(i),
            outrosPartidos.get(i),
            totalVotos.get(i));
        }

    }

    //ex01
    private static void lerFicheiro() {
        System.out.println("OPÇÃO 1- LER FICHEIRO");
        limpezaArrays();
        int somaPartidos, outros;

        //Leitura do ficheiro .txt
        try {
            List<String> linhas = Files.readAllLines(Path.of("distritos.txt"));
            for (int i = 0; i < linhas.size(); i++) {
                if (!linhas.get(i).isEmpty()) {
                    String[] params = linhas.get(i).split(";");
                    try {
                        distritos.add(params[0]);
                        inscritos.add(Integer.parseInt(params[1]));
                        votantes.add(Integer.parseInt(params[2]));
                        nulos.add(Integer.parseInt(params[3]));
                        brancos.add(Integer.parseInt(params[4]));
                        ad.add(Integer.parseInt(params[5]));
                        ps.add(Integer.parseInt(params[6]));
                        ch.add(Integer.parseInt(params[7]));
                        il.add(Integer.parseInt(params[8]));
                        be.add(Integer.parseInt(params[9]));
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao ler o ficheiro.");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler ficheiro");
        }

        //Calculo: Soma partidos + Outros
        for (int i = 0; i < distritos.size(); i++){

            //soma dos partidos
            somaPartidos = nulos.get(i)
                    + brancos.get(i)
                    + ad.get(i)
                    + ps.get(i)
                    + ch.get(i)
                    + il.get(i)
                    + be.get(i);

            //para saber o numero de votos noutros partidos
            outros = votantes.get(i) - somaPartidos;

            //Validaçao
            if(inscritos.get(i) < votantes.get(i)) {
                System.out.println("Número de inscritos inválido.");
                return;
            }

            if(!Objects.equals((outros + somaPartidos), votantes.get(i))) {
                System.out.println("Total de votos inválido");
                return;
            }

            //Adiciona aos arrays
            outrosPartidos.add(outros);
            //total de votantes em cada distrito
            totalVotos.add(outros + somaPartidos);
        }
        //para saber vencedor das eleiçoes inicial
        recalcularVotos();

        System.out.println("Dados lidos com sucesso");
    }

    private static void limpezaArrays() {
        distritos.clear();
        inscritos.clear();
        votantes.clear();
        nulos.clear();
        brancos.clear();
        ad.clear();
        ps.clear();
        ch.clear();
        il.clear();
        be.clear();
        outrosPartidos.clear();
        totalVotos.clear();
    }
}