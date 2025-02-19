package Ex_03;

import Ex_03.TipoDoc.*;

public class DocumentoFactory {

    public static Documento createDocument(TipoDocumento tipo, String autor, String nome, String extensao){

        switch (tipo){
            case TEXTO:
                return new Texto(autor,nome, extensao);
            case CALCULO:
                return new Calculo(autor,nome, extensao);
            case APRESENTACAO:
                return new Apresentacao(autor,nome, extensao);
            default:
                throw new IllegalArgumentException();
        }

    }


}
