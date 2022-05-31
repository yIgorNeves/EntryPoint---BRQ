package appbookelandia.model;

public class ProdutoPedido {
    private int numeroDoPedido;
    private Produto produto;
    private int quantidade;
    
    public ProdutoPedido(){
        
    }

    public ProdutoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }
    

    public ProdutoPedido(int numeroDoPedido, Produto produto) {
        this.numeroDoPedido = numeroDoPedido;
        this.produto = produto;
    }
    
    

    public ProdutoPedido(int numeroDoPedido, Produto produto, int quantidade) {
        this.numeroDoPedido = numeroDoPedido;
        this.produto = produto;
        this.quantidade = quantidade;
    }



    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
