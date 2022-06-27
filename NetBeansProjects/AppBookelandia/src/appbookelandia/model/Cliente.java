
package appbookelandia.model;

import java.time.LocalDate;

public class Cliente {   
        
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate dataDeCadastro;
    //Adcionado String email
    private String email;
    
    /*Construtor 1*/
    
    public Cliente(){
        this.setDataDeCadastro(LocalDate.now());
    }
    /*Construtor 2*/
    public Cliente(String cpf, String nome){
        this.setDataDeCadastro(LocalDate.now());
        this.setCpf(cpf);       
        this.nome = nome;
        this.telefone = telefone;       
    }
    
    /*Encapsulamento*/
    /*get - recupera a informação*/
    /*set - altera a informação*/
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEndereco() {
        return endereco;
    }

  
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String setCpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
