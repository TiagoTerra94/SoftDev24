package Ex_03;

import Ex_03.TipoDoc.Documento;
import Ex_03.TipoDoc.Texto;
import Ex_03.TipoDoc.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        Documento texto = DocumentoFactory.createDocument(TipoDocumento.TEXTO,"Rui", "ASWRYWARYURSD", );

        texto.open();
        texto.save();
        texto.close();
    }
}
