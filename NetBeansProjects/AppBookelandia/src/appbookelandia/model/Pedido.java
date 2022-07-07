package appbookelandia.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    
    private int numeroDoPedido;
    //Instaciando a classe Cliente para dentro de Pedido
    private Cliente cliente;
    private FormaDePagamento pagamento;
    private boolean status;
    private LocalDate dataPedido;
    private String cupon;
    private double valorTotal;
    //Instaciando a classe ProdutoDoPedido para dentro de Pedido
    private ArrayList<ProdutoDoPedido> produtos; 
    
        public Pedido(){
    }
    
     public Pedido(int numeroDoPedido){
         this.numeroDoPedido = numeroDoPedido;
         this.produtos = new ArrayList<ProdutoDoPedido>();
    }
    
   
    public void adcionaProduto(Produto p, int quantidade){
    ProdutoDoPedido produtopedido = new ProdutoDoPedido (p, quantidade);
    this.produtos.add(produtopedido);
    }
    
    public double calculaValorTotal(){
    double valorTotal=0.0;
    
    for(ProdutoDoPedido pp: this.produtos){
            Produto p =pp.getProduto();
            int quantidade = pp.getQuantidadePedidos();
            valorTotal = valorTotal + (p.getPreco() + quantidade);   
    }
    return valorTotal;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaDePagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaDePagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getCupon() {
        return cupon;
    }

    public void setCupon(String cupon) {
        this.cupon = cupon;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<ProdutoDoPedido> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutoDoPedido> produtos) {
        this.produtos = produtos;
    }
   
}
