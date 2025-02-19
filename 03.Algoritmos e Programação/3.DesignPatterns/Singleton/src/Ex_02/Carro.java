package Ex_02;

import java.io.IOException;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int potenciaCv;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100km;

    public Carro(String marca, String modelo, int ano, int potenciaCv, int cc, TipoCombustivel combustivel, double consumoL100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potenciaCv = potenciaCv;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100km = consumoL100km;
    }

    //Metodo de acesso
    public String getMarca() {
        return marca;
    }

    //Metodo de instancia
    public int idade(){
        return 2025-this.ano;
    }


    public void ligar() throws IOException {
        Logger logger = Logger.getInstance("programa_log.txt");
        logger.log("Log 2: Objeto 'porsche' da Classe Car criado com sucesso");

        if(this.idade()> 30){//Temos um carro antigo(>30 anos)

            if(this.combustivel.equals(TipoCombustivel.DIESEL)){//Carro a Diesel
                System.out.println("Deita um pouco de fumo...Custa a pegar...O carro está ligado");
                System.out.println("Vrummm... Vrummm");
            }else{//Carro não diesel
                System.out.println("Custa a pegar... O carro está ligado");
                System.out.println("vrumm---vrumm-vrumm");
            }
        }else{//Temos um carro recente

            if(this.potenciaCv<250){//Um carro com menos de 250cv
                System.out.println("O carro está ligado");
                System.out.println("Vrummmmmm");
            }else{//Um carro com mais de 250cv
                System.out.println("O carro está ligado");
                System.out.println("VRUMMMMMMMMMMMMM");
            }

        }
    }

    public Carro corrida(Carro adversario){
        if(this.potenciaCv > adversario.potenciaCv){//Ganha o meu carro se for maior potencia
            return this;//para retornar o obj que invocou o metodo
        }else if(this.potenciaCv < adversario.potenciaCv){//Ganha o adversario
            return adversario;
        }else{//Empate por cv

            if(this.cc > adversario.cc){//Ganha o meu carro se tiver mais cc
                return this;
            }else if(this.cc < adversario.cc){//Ganha o adversario
                return adversario;
            }else{//Caso empate por cc

                if(this.ano > adversario.ano){//Ganha o meu carro por idade
                    return this;
                }else if(this.ano < adversario.ano){//Ganha o adversario
                    return adversario;
                }else{//Empate total
                    return null;
                }

            }

        }

    }

    public void exibirDetalhes(){
        System.out.println(this.marca + " | " + this.modelo + " | " + this.ano);
    }

    public double consumoCarro(int distancia){
        return this.consumoL100km * distancia / 100;
    }


}
