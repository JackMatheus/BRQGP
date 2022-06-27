package appbookelandia.model;

import java.util.ArrayList;

public class AvaliacaoDoProduto {    

    private String codigoDoCliente;
    private int nota;
    //Receber um produto
    private ArrayList<Produto> produtos;    
    
     public AvaliacaoDoProduto(String codigoDoCliente){
         this.codigoDoCliente = codigoDoCliente;
         this.produtos = new ArrayList<Produto>();
    }
    
    public void notaDoProduto(Produto p, String codigoDoCliente, int nota) {
     this.nota = nota;  
    }
    
    public String getCodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(String codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota >= 0 && nota <10 ){
        this.nota = nota;
    }else {
          System.out.println("Nota Inválida"); 
        }}
    
  
        
    
}
