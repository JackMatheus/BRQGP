/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal;
import appbookelandia.model.Cliente;
import appbookelandia.model.FormaDePagamento;
import appbookelandia.model.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
/**
 *
 * @author J. Mateus
 */
public class PedidoDAO implements ICrud<Pedido>{
    
    private Conexao conexao;
    
    public PedidoDAO() {
        this.conexao = new Conexao();
    }
    
    
   @Override
    public Pedido recupera(String id) throws SQLException { 
        // String sql = "select codigoDoProduto, codigoDaCategoria, nome, descricao, preco from clientes where codigoDoProduto = ?;";
        String sql = "select numeroDoPedido, status, dataPedido, cupon, valorTotal from pedidos where numeroDoPedido=?;";
        // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setString(1, id);
        // Executa a consulta no BD
        ps.execute();
        
        // Recupera os dados do BD
        ResultSet resultado = ps.getResultSet();
        // Move o cursor do BD para a próxima linha (1ª linha da tabela)
        resultado.next();

        // Cria o objeto Produto para ser preenchido com os dados do BD        
        Pedido pedido = new Pedido();       
        pedido.setNumeroDoPedido(resultado.getInt("numeroDoPedido"));
        //pedido.setPagamento((FormaDePagamento) resultado.getObject("Cupon"));
        //pedido.setCliente((Cliente) resultado.getObject("Cliente"));
        pedido.setCupon(resultado.getString("cupon"));
        pedido.setDataPedido(resultado.getDate("dataPedido").toLocalDate());
        pedido.setStatus(resultado.getBoolean("status"));
        pedido.setValorTotal(resultado.getDouble("valorTotal"));
       
        
        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto cliente preenchido
        return pedido;
    }

    @Override
    public void adiciona(Pedido t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void altera(Pedido t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void exclui(Pedido t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }





    
    
    
}
