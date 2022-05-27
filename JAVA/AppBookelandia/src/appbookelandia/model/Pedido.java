/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.model;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Igor Neves
 */
public class Pedido {
    private int numeroDoPedido;
    private Cliente cliente;
    private FormaDePagamento formaDePagamento;
    private boolean status;
    private LocalDate data;
    private String cupom;
    private double valorTotal;
    private ArrayList<ProdutoPedido> produto;
    

    public Pedido(int numeroDoPedido, Cliente cliente, FormaDePagamento formaDePagamento, boolean status, LocalDate data, String cupom, double valorTotal) {
        this.numeroDoPedido = numeroDoPedido;
        this.cliente = cliente;
        this.formaDePagamento = formaDePagamento;
        this.status = status;
        this.data = data;
        this.cupom = cupom;
        this.valorTotal = valorTotal;
        this.produto = new ArrayList<ProdutoPedido>();

    }
    
    public Pedido (int numeroDoPedido){
        this.numeroDoPedido = numeroDoPedido;
        this.produto = new ArrayList<ProdutoPedido>();
    }
    
    public Pedido(){
        this.produto = new ArrayList<ProdutoPedido>();
    }
    
    public void adicionaProduto(int quantidade, Produto p){
        ProdutoPedido produtoPedido = new ProdutoPedido(quantidade, p);
        this.produto.add(produtoPedido);        
    }
    
    public double calculaValor(){
        double valorTotal=0.0;
        for(ProdutoPedido pp : this.produto){
            Produto p = pp.getProduto();
            int quantidade = pp.getQuantidade();
            valorTotal = valorTotal + (p.getPreco() * quantidade);        
        }
        return valorTotal;
    }
    
    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
