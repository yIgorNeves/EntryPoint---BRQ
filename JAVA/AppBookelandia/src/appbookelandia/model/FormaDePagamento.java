/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.model;

/**
 *
 * @author Igor Neves
 */
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
