package appbookelandia.model;


public enum FormaDePagamento {
    Boleto("boleto"),
    Pix("pix"),
    CartaoCredito("cartão de credito");
    
    private final String descricao;
    
    FormaDePagamento (String descricao){
        this.descricao = descricao;
    }
    public String descricao(){
    return descricao;
    }
}
