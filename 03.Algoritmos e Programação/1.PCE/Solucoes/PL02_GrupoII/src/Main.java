import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<Double> trabalho1 = new ArrayList<>();
    static ArrayList<Double> trabalho2 = new ArrayList<>();
    static ArrayList<Double> exame = new ArrayList<>();

    static double melhorFinal = -1, piorFinal = 21, contT1 = 0, contT2 = 0, contExame = 0, contFinal = 0, somaT1 = 0, somaT2 = 0, somaExame = 0;
    static int muitoBons = 0;

    public static void main(String[] args) {
        LerFicheiro();
        int op = 1;
        while (op != 0) {
            System.out.println("1-Inserir aluno");
            System.out.println("2-Editar aluno");
            System.out.println("3-Eliminar aluno");
            System.out.println("4-Imprimir");
            System.out.println("5-Imprimir para ficheiro");
            System.out.println("6-Ler ficheiro");
            System.out.println("7-Escrever ficheiro");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) break;
            else if (op == 1) InserirAluno();
            else if (op == 2) EditarAluno();
            else if (op == 3) EliminarAluno();
            else if (op == 4) Imprimir();
            else if (op == 5) ImprimirParaFicheiro();
            else if (op == 6) LerFicheiro();
            else if (op == 7) GravarFicheiro();
            else System.out.println("Opção inválida");
        }
    }

    private static void GravarFicheiro() {
        String texto = "";
        for (int i = 0; i < nomes.size(); i++) {
            texto += nomes.get(i) + "|" + trabalho1.get(i) + "|" + trabalho2.get(i) + "|" + exame.get(i);
            if (i < nomes.size() - 1) {
                texto += "\n";
            }
        }
        try {
            Files.writeString(Path.of("dados.txt"), texto);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar ficheiro");
        }
    }

    private static void LerFicheiro() {
        try {
            nomes.clear();
            trabalho1.clear();
            trabalho2.clear();
            exame.clear();
            List<String> linhas = Files.readAllLines(Path.of("dados.txt"));
            for (int i = 0; i < linhas.size(); i++) {
                if (!linhas.get(i).isEmpty()) {
                    String[] params = linhas.get(i).split("\\|");
                    try {
                        nomes.add(params[0]);
                        trabalho1.add(Double.parseDouble(params[1]));
                        trabalho2.add(Double.parseDouble(params[2]));
                        exame.add(Double.parseDouble(params[3]));
                    } catch (NumberFormatException e) {
                        System.out.println("Nota no formato incorreto");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler ficheiro");
        }
    }

    private static void Imprimir() {
        resetValores();
        System.out.println("Nome do aluno | Classificação");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.print(nomes.get(i) + "\t" + CalcularClassificacao(i) + "\n");
        }
        System.out.println("*********************************************");
        System.out.println("MELHOR NOTA FINAL: " + melhorFinal);
        System.out.println("PIOR NOTA FINAL: " + piorFinal);
        System.out.println("PERCENTAGENS DE NOTAS POSITIVAS: ");
        System.out.println(" -Trabalho1: " + (contT1 / trabalho1.size()) * 100 + "%");
        System.out.println(" -Trabalho2: " + (contT2 / trabalho2.size()) * 100 + "%");
        System.out.println(" -Exame: " + (contExame / exame.size()) * 100 + "%");
        System.out.println(" -Final: " + (contFinal / trabalho1.size()) * 100 + "%");
        System.out.println("MÉDIA DAS NOTAS: ");
        System.out.println(" -Trabalho1: " + somaT1 / trabalho1.size());
        System.out.println(" -Trabalho2: " + somaT2 / trabalho2.size());
        System.out.println(" -Exame: " + somaExame / exame.size());
        System.out.println(muitoBons + " alunos com classificação MUITO BOM");
    }

    private static void ImprimirParaFicheiro() {
        String texto = "";
        resetValores();
        texto += "Nome do aluno | Classificação\n";
        for (int i = 0; i < nomes.size(); i++) {
            texto += nomes.get(i) + "\t" + CalcularClassificacao(i) + "\n";
        }
        texto += "*********************************************\n";
        texto += "MELHOR NOTA FINAL: " + melhorFinal + "\n";
        texto += "PIOR NOTA FINAL: " + piorFinal + "\n";
        texto += "PERCENTAGENS DE NOTAS POSITIVAS:  " + "\n";
        texto += " -Trabalho1: " + (contT1 / trabalho1.size()) * 100 + "%\n";
        texto += " -Trabalho2: " + (contT2 / trabalho2.size()) * 100 + "%\n";
        texto += " -Exame: " + (contExame / exame.size()) * 100 + "%\n";
        texto += " -Final: " + (contFinal / trabalho1.size()) * 100 + "%\n";
        texto += "MÉDIA DAS NOTAS: \n";
        texto += " -Trabalho1: " + somaT1 / trabalho1.size() + "\n";
        texto += " -Trabalho2: " + somaT2 / trabalho2.size() + "\n";
        texto += " -Exame: " + somaExame / exame.size() + "\n";
        texto += muitoBons + " alunos com classificação MUITO BOM" + "\n";

        System.out.println(texto);

        try {
            Files.writeString(Path.of("output.txt"), texto);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar ficheiro");
        }
    }

    private static void resetValores() {
        melhorFinal = -1;
        piorFinal = 21;
        contT1 = 0;
        contT2 = 0;
        contExame = 0;
        contFinal = 0;
        somaT1 = 0;
        somaT2 = 0;
        somaExame = 0;
        muitoBons = 0;
    }

    private static String CalcularClassificacao(int posicao) {
        double notaFinal = trabalho1.get(posicao) * 0.2 + trabalho2.get(posicao) * 0.2 + exame.get(posicao) * 0.6;

        somaT1 += trabalho1.get(posicao);
        somaT2 += trabalho2.get(posicao);
        somaExame += exame.get(posicao);

        if (trabalho1.get(posicao) >= 10) contT1++;
        if (trabalho2.get(posicao) >= 10) contT2++;
        if (exame.get(posicao) >= 10) contExame++;
        if (notaFinal >= 10) contFinal++;

        if (notaFinal > melhorFinal) melhorFinal = notaFinal;
        if (notaFinal < piorFinal) piorFinal = notaFinal;

        if (notaFinal < 5) return "Muito fraco";
        else if (notaFinal < 10) return "Fraco";
        else if (notaFinal < 13) return "Suficiente";
        else if (notaFinal < 17) return "Bom";
        else {
            muitoBons++;
            return "Muito Bom";
        }
    }

    private static void ImprimirTeste() {
        System.out.println("--- NOMES ---");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("--- TRAB1 ---");
        for (int i = 0; i < trabalho1.size(); i++) {
            System.out.println(trabalho1.get(i));
        }
        System.out.println("--- TRAB2 ---");
        for (int i = 0; i < trabalho2.size(); i++) {
            System.out.println(trabalho2.get(i));
        }
        System.out.println("--- EXAME ---");
        for (int i = 0; i < exame.size(); i++) {
            System.out.println(exame.get(i));
        }
    }

    private static void EliminarAluno() {
        ImprimirNomes();
        System.out.println("Qual o aluno a eliminar?");
        int pos = in.nextInt() - 1;

        if (pos >= 0 && pos < nomes.size()) {
            nomes.remove(pos);
            trabalho1.remove(pos);
            trabalho2.remove(pos);
            exame.remove(pos);
            System.out.println("Aluno eliminado com sucesso");
        } else {
            System.out.println("Aluno inexistente");
        }
    }

    private static void EditarAluno() {
        ImprimirNomes();
        System.out.println("Qual o aluno a editar?");
        int pos = in.nextInt() - 1;

        if (pos >= 0 && pos < nomes.size()) {
            in = new Scanner(System.in);

            System.out.println("Qual o novo nome do " + nomes.get(pos));
            nomes.set(pos, in.nextLine());
            System.out.println("Qual a nova nota do trabalho 1");
            trabalho1.set(pos, in.nextDouble());
            System.out.println("Qual a nova nota do trabalho 2");
            trabalho2.set(pos, in.nextDouble());
            System.out.println("Qual a nova nota do exame");
            exame.set(pos, in.nextDouble());

            System.out.println("Aluno editado com sucesso");
        } else {
            System.out.println("Aluno inexistente");
        }
    }

    private static void ImprimirNomes() {
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + " - " + nomes.get(i));
        }
    }

    private static void InserirAluno() {
        in = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?");
        nomes.add(in.nextLine());

        System.out.println("Qual a nota do trabalho 1?");
        trabalho1.add(in.nextDouble());

        System.out.println("Qual a nota do trabalho 2?");
        trabalho2.add(in.nextDouble());

        System.out.println("Qual a nota do exame?");
        exame.add(in.nextDouble());

        System.out.println("Aluno inserido com sucesso!");
    }
}