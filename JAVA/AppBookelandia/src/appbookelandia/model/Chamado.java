package appbookelandia.model;

public class Chamado {
    
    private int ticket;
    private boolean status;
    private Funcionario codigoDoFuncionario;
    private Pedido codigoDoPedido;
    private String descricao;

    public Chamado() {
    }

    public Chamado(int ticket) {
        this.ticket = ticket;
    }

    public Chamado(int ticket, boolean status, Funcionario codigoDoFuncionario, Pedido codigoDoPedido, String descricao) {
        this.ticket = ticket;
        this.status = status;
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.codigoDoPedido = codigoDoPedido;
        this.descricao = descricao;
    } 
    
    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Funcionario getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(Funcionario codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public Pedido getCodigoDoPedido() {
        return codigoDoPedido;
    }

    public void setCodigoDoPedido(Pedido codigoDoPedido) {
        this.codigoDoPedido = codigoDoPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
            
       
    
}
