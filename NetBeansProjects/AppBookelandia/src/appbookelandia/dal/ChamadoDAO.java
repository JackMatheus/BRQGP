/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal;

import appbookelandia.model.Chamado;
import appbookelandia.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author J. Mateus
 */
public class ChamadoDAO implements ICrud<Chamado>{
    
    private Conexao conexao;
    
    public ChamadoDAO(){
          this.conexao = new Conexao();
    }

    @Override
    public Chamado recupera(String id) throws SQLException {
         // Cria a string de consulta
        //String sql = "select ticket, status, codigoDoFuncionario, codigoDoCliente, codigoDoProduto, descricao from chamados where ticket = ?;";
        String sql = "select  codigoDoCliente, descricao, ticket from chamados where ticket = ?;";
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

        // Cria o objeto Cliente para ser preenchido com os dados do BD
        Chamado c = new Chamado();
        c.setCodigoDoCliente(resultado.getString("CodigoDoCliente"));
        //c.setCodigoDoFuncionario(resultado.getString("CodigoDoFuncionario"));
        //c.setCodigoDoProduto(resultado.getInt("CodigoDoProduto"));
        c.setDescricao(resultado.getString("Descricao"));
        //c.setStatus(resultado.getInt("Status"));
        c.setTicket(resultado.getString("ticket"));
        
        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto cliente preenchido        
        return c;
    }

    @Override
    public void adiciona(Chamado t) throws SQLException {
        // Cria a string de consulta
        //String sql = "insert into chamados(ticket, status, codigoDoFuncionario, codigoDoCliente, codigoDoProduto, descricao) values (?,?,?,?,?,?)";
        String sql = "insert into chamados(ticket,codigoDoCliente, descricao ) values (?,?,?)";
        // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setString(1, t.getTicket());
        ps.setString(2, t.getCodigoDoCliente());
        ps.setString(3, t.getDescricao());
        // ps.setInt(2, t.getStatus());
        // ps.setString(3, t.getCodigoDoFuncionario());
        
        //ps.setInt(4, t.getCodigoDoProduto());
        
        
        ps.execute();

        conexao.fecha();
        
        
        
    
    
    }

    @Override
    public void altera(Chamado t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void exclui(Chamado t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
