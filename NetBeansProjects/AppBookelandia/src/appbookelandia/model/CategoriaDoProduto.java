package appbookelandia.model;

public class CategoriaDoProduto {
    
    private int codigo;
    private String nome;
    private String descricao;
    
    /*Construtor 2*/
    public CategoriaDoProduto(){

    }

    
    public CategoriaDoProduto(int codigo, String nome,String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    /*Encapsulamento*/
    /*get - recupera a informação*/
    /*set - altera a informação*/
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
