package appbookelandia.model;

public class Produto {
    
    private int codigoDoProduto;
    private int codigoDaCategoria;
    private String nome;
    private String descricao;
    private float preco;

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public int getCodigoDaCategoria() {
        return codigoDaCategoria;
    }

    public void setCodigoDaCategoria(int codigoDaCategoria) {
        this.codigoDaCategoria = codigoDaCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Produto(int codigoDoProduto, int codigoDaCategoria, String nome, String descricao, float preco) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDaCategoria = codigoDaCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    } 
    
}
