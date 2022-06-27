package appbookelandia.model;

import java.time.LocalDate;

public class Funcionario {

    protected int matricula;
    protected String nome;
    protected LocalDate dataAdmissao;
    protected String cargo;
    protected double salario;
    
    public Funcionario() {
       
    }
    
    protected Funcionario(int matricula, String nome, LocalDate dataAdmissao, String cargo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.salario = salario;
    }
    
  
    protected Funcionario (String cargo){
    this.cargo = cargo;
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

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } 
    
    public String getCargo() {
        return cargo;
    }  

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
 
}