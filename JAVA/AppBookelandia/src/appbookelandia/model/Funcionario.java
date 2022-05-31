package appbookelandia.model;

import java.time.LocalDate;

public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected LocalDate dataDeAdmicao;
    protected String cargo;
    protected double salario;
    protected Chamado chamado;
    
    protected Funcionario (String cargo){
        this.cargo = cargo;
    }

    public Funcionario(int matricula, String nome, Chamado chamado) {
        this.matricula = matricula;
        this.nome = nome;
        this.chamado = chamado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeAdmicao() {
        return dataDeAdmicao;
    }

    public void setDataDeAdmicao(LocalDate dataDeAdmicao) {
        this.dataDeAdmicao = dataDeAdmicao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }
    
    
}
