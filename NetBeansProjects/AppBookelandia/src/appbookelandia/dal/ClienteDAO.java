package appbookelandia.dal;

import appbookelandia.model.Cliente;

import java.sql.ResultSet;
import appbookelandia.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class ClienteDAO implements ICrud<Cliente> {

    private Conexao conexao;

    public ClienteDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public Cliente recupera(String id) throws SQLException {
        // Cria a string de consulta
        String sql = "select cpf, nome, endereco, telefone, dataDeCadastro from clientes where cpf = ?;";
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
        Cliente c = new Cliente();
        c.setNome(resultado.getString("nome"));
        c.setEndereco(resultado.getString("endereco"));
        c.setCpf(resultado.getString("cpf"));
        c.setTelefone(resultado.getString("telefone"));
        c.setDataDeCadastro(resultado.getDate("dataDeCadastro").toLocalDate());

        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto cliente preenchido
        return c;
    }

    @Override
    public void adiciona(Cliente t) throws SQLException {
        // Cria a string de consulta
        String sql = "insert into clientes (cpf, nome, telefone, endereco, dataDeCadastro) values (?,?,?,?,?)";
        //String sql = "insert into clientes (nome, endereco, cpf, telefone, dataDeCadastro) values (?,?,?,?,?)";
        // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setString(1, t.getCpf());
        ps.setString(2, t.getNome());
        ps.setString(3, t.getTelefone());
        ps.setString(4, t.getEndereco());
        ps.setDate(5, Date.valueOf(t.getDataDeCadastro()));

        ps.execute();

        conexao.fecha();

    }

    //Trabalhando aqui
    //public Cliente recupera(String id) throws SQLException //Original = (Cliente t)
    @Override
    public void altera(Cliente t) throws SQLException {
       
        String sql = "update clientes set telefone = ?, endereco =? where cpf=?";
        
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        
        ps.setString(1, t.getTelefone());
        ps.setString(2, t.getEndereco());
        ps.setString(3, t.getCpf());
 

        // Executa a consulta no BD
        ps.execute();

        conexao.fecha();

    }

    @Override
    public void exclui(Cliente t) throws SQLException {
        // Cria a string de consulta
        String sql = "delete from clientes where cpf = ?;";
        // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setString(1, t.getCpf());
        // Executa a consulta no BD
        ps.execute();

        //Fecha a conexão
        conexao.fecha();

    }

}
