package appbookelandia.model;

public class Login {    
        
    private String email;
    private String senha;
    //Classe NivelDeAcesso
    private NivelDeAcesso nivelDeAcesso;
    private boolean status;
    
     /*Construtor 1*/
    public Login (){
    }  
    
    /*Construtor 2*/
    public Login (String email, String senha){
        this.email= email;    
        this.senha = senha;  
    }            

    /*Encapsulamento*/
    /*get - recupera a informação*/
    /*set - altera a informação*/
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        //this.senha = senha;
        if(senha.length()<=20){
         this.senha = senha;
        }else {
            System.out.println("Senha Inválida");
        }
    }
    
    
    public NivelDeAcesso getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(NivelDeAcesso nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void getEmail(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
