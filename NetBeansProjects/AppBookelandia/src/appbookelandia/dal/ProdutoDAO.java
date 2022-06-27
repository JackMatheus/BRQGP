/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal;

/**
 *
 * @author J. Mateus
 */
import appbookelandia.model.Produto;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class ProdutoDAO implements ICrud<Produto> {
        
    private Conexao conexao;
    
        public ProdutoDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public Produto recupera(String id) throws SQLException {
        
        String sql = "select codigoDoProduto, codigoDaCategoria, nome, descricao, preco from clientes where codigoDoProduto = ?;";
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
        Produto produto = new Produto();
        //produto.setCategoria(resultado.getInt("categoria"));
        //produto.setCodigo(resultado.getInt("codigo Produto"));
        produto.setCodigoDoProduto(resultado.getInt("codigo Produto"));
        produto.setNome(resultado.getString("nome"));
        produto.setDescricao(resultado.getString("descrição"));
        produto.setPreco(resultado.getDouble("preco"));
        
        
        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto cliente preenchido
        return produto;
        
        

    }

    @Override
    public void adiciona(Produto t) throws SQLException {
         // Cria a string de consulta
         String sql = "insert into produtos(codigoDoProduto, nome, descricao, preco ) values(?,?,?,?)";
         
            // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setInt(1, t.getCodigoDoProduto());
        //ps.setInt(2, t.getCategoria()};
        ps.setString(2, t.getNome());
        ps.setString(3, t.getDescricao());
        ps.setDouble(4, t.getPreco());
        
        ps.execute();

        conexao.fecha();
         
         
    }

    @Override
    public void altera(Produto t) throws SQLException {
        String sql = "update produtos set nome = ?, descricao =? , preco =? where codigoDoProduto=?";
        
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setString(1, t.getNome());
        ps.setString(2, t.getDescricao());
        ps.setDouble(3, t.getPreco());
        
        // Executa a consulta no BD
        ps.execute();

        conexao.fecha();

    }

    @Override
    public void exclui(Produto t) throws SQLException {
             // Cria a string de consulta
        String sql = "delete from clientes where codigoDoProduto = ?;";
        // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setInt(1, t.getCodigoDoProduto());
        // Executa a consulta no BD
        ps.execute();

        //Fecha a conexão
        conexao.fecha();
    }
        
    
}
