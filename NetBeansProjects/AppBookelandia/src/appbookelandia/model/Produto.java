package appbookelandia.model;


public class Produto {

    private int codigo;
    //Implementando CategoriaDoProduto
    private CategoriaDoProduto categoria;    
    private String nome;
    private String descricao;
    private double preco;

 
    private int CodigoDoProduto;
  
    /*Construtor 2*/
    public Produto(){
    };
    
    //public Produto(int codigo){
    //this.codigo = codigo;
    //}
    
    //public Produto(String nome){
    //this.nome= nome;
    //}
    
    //Construtor
    public Produto(String nome, String descricao, double preco, CategoriaDoProduto categoria){ 
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }
        
    /*Getter and setter*/ 
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public CategoriaDoProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDoProduto categoria) {
        this.categoria = categoria;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigoDoProduto() {
        return CodigoDoProduto;
    }

    public void setCodigoDoProduto(int CodigoDoProduto) {
        this.CodigoDoProduto = CodigoDoProduto;
    }

    
    
}
   
    
   