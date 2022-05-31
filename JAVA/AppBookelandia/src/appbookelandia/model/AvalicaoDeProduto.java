package appbookelandia.model;

public class AvalicaoDeProduto {
    
    private int codigoDoProduto;
    private Cliente codigoDoCliente;
    private int nota;
    private String descricao;

    public AvalicaoDeProduto() {
    }
          
    public AvalicaoDeProduto(int codigoDoProduto, Cliente codigoDoCliente) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
    }

    public AvalicaoDeProduto(int codigoDoProduto, Cliente codigoDoCliente, int nota, String descricao) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
        this.nota = nota;
        this.descricao = descricao;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public Cliente getCodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(Cliente codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
    
}
