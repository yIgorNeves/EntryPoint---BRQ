package appbookelandia.model;

public enum FormaDePagamento {
    Boleto("boleto"),
    Pix("pix"),
    CartaoDeCredito("cartão de credito");
    
    private final String descricao;

    private FormaDePagamento(String descricao) {
        this.descricao = null;
    }
    
    public String descricao(){
        return descricao;
    }
    
}
