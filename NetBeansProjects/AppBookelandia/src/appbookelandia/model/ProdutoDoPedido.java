package appbookelandia.model;

public class ProdutoDoPedido {
    
    private int numeroDoPedido;
    //Aqui necessito de Instanciar a classe Produto para dentro da classe ProdutodoPedido
    private Produto produto;
    private int quantidadePedidos;

    public ProdutoDoPedido() {
            
    }
    
    public ProdutoDoPedido(Produto produto) {
    this.produto = produto;
        
    }
    
    
    public ProdutoDoPedido(Produto produto, int quantidadePedidos) {
    this.produto = produto;
    this.quantidadePedidos = quantidadePedidos;
    }
    

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadePedidos() {
        return quantidadePedidos;
    }

    public void setQuantidadePedidos(int quantidadePedidos) {
        this.quantidadePedidos = quantidadePedidos;
    }
    
    
    
}

    