package Ex_03.TipoDoc;

public enum TipoDocumento {
    TEXTO, CALCULO,APRESENTACAO;

    public String getTipoDocumento() {
        switch (this) {
            case TEXTO:
                return ".docx";
            case CALCULO:
                return ".xlsx";
            case APRESENTACAO:
                return "pptx";
            default:
                return "Unknow extension.";
        }
    }
}
