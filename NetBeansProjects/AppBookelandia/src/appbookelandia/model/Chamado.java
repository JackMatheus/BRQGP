package appbookelandia.model;

public class Chamado {
    
    private String ticket;
    private Integer status;
    private String codigoDoFuncionario;	    
    private String codigoDoCliente;
    //private int codigoDoProduto;
    private int codigoDoProduto;
    private String descricao;
   
    
    //Produto produto;  
    public Chamado() {
    }
    
    public Chamado(String descricao, Cliente cliente) {
        this.descricao = descricao;
       this.codigoDoCliente = cliente.getCpf();
    }
   
      //Chamado esta recebendo como parâmetro codigoDoPedido, Cliente cliente , Produto produto
      public Chamado(int codigoDoPedido, Cliente cliente , Produto produto) {
        this.descricao = descricao;
        this.codigoDoCliente = cliente.setCpf(); 
        this.codigoDoProduto = produto.getCodigoDoProduto();
    } 
    

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(String codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public String getCodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(String codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

 
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }
    
	
}