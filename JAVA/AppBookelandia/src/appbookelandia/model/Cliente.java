
package appbookelandia.model;

import java.time.LocalDate;

/**
 *
 * @author Igor Neves
 */
public class Cliente {
    /*Atributos*/
    private String cpf;
    private String endereco;
    private String nome;
    private String telefone;
    public LocalDate dataDeCadastro;  
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }  
    
    public String getCpf(){
        return this.cpf; 
    }
    public void setCpf(String cpf){
        this.cpf = cpf; 
    }   
    
    public LocalDate getDataDeCadasto(){
        return this.dataDeCadastro; 
    }
    public void setDataDeCadasto(LocalDate dataDeCadastro){
        this.dataDeCadastro = dataDeCadastro; 
    }   
    
    public String getNome(){
        return this.nome;
    }    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /*Construtor*/
    public Cliente(){
        this.setDataDeCadasto(LocalDate.now());
    }
    public Cliente(String cpf, LocalDate dataDeCadastro){
        this.setCpf(cpf);
        this.setDataDeCadasto(LocalDate.now());        
    }
    
    public Cliente(String cpf, LocalDate dataDeCadastro,String nome){
        this.setCpf(cpf);
        this.setDataDeCadasto(LocalDate.now());        
        this.nome = nome;
    }   
      public Cliente(String cpf, String endereco, String nome, String telefone, LocalDate dataDeCadastro) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeCadastro = dataDeCadastro;
    }
}



   