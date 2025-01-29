package Ex_002;

import Ex_002.Enums.TipoCombustivel;

public class Veiculo {
    //Atributos de Instancia
    protected String marca;
    protected String modelo;
    protected int anoFabrico;
    protected int potencia;
    protected int cc;
    protected TipoCombustivel combustivel;
    protected int litroskm;

    //Metodo construtor
    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cc, TipoCombustivel combustivel, int litroskm) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cc = cc;
        this.combustivel = combustivel;
        this.litroskm = litroskm;
    }

    //Metodo de Acesso
    public String getMarca() {
        return marca;
    }

    //Metodo de Instancia
    public int idade(){
        return 2025-this.anoFabrico;
    }

    public void ligar(){
        if(this.idade()> 30){//Temos um carro antigo(>30 anos)

            if(this.combustivel.equals(TipoCombustivel.DIESEL)){//Carro a Diesel
                System.out.println("Deita um pouco de fumo...Custa a pegar...O veiculo está ligado");
                System.out.println("Vrummm... Vrummm");
            }else{//Carro não diesel
                System.out.println("Custa a pegar... O veiculo está ligado");
                System.out.println("vrumm---vrumm-vrumm");
            }
        }else{//Temos um carro recente

            if(this.potencia<250){//Um carro com menos de 250cv
                System.out.println("O veiculo está ligado");
                System.out.println("Vrummmmmm");
            }else{//Um carro com mais de 250cv
                System.out.println("O veiculo está ligado");
                System.out.println("VRUMMMMMMMMMMMMM");
            }

        }
    }

    public Veiculo corrida(Veiculo adversario){
        if(this.potencia > adversario.potencia){//Ganha o meu carro se for maior potencia
            return this;//para retornar o obj que invocou o metodo
        }else if(this.potencia < adversario.potencia){//Ganha o adversario
            return adversario;
        }else{//Empate por cv

            if(this.cc > adversario.cc){//Ganha o meu carro se tiver mais cc
                return this;
            }else if(this.cc < adversario.cc){//Ganha o adversario
                return adversario;
            }else{//Caso empate por cc

                if(this.anoFabrico > adversario.anoFabrico){//Ganha o meu carro por idade
                    return this;
                }else if(this.anoFabrico < adversario.anoFabrico){//Ganha o adversario
                    return adversario;
                }else{//Empate total
                    return null;
                }
            }
        }

    }

    public void exibirDetalhes(){
        System.out.println(this.marca + " | " + this.modelo + " | " + this.anoFabrico);
    }

    public double consumoVeiculo(int distancia){
        return this.litroskm * distancia / 100;
    }


}

