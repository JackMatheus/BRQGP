/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal;

import appbookelandia.model.Funcionario;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author J. Mateus
 */
public class FuncionarioDAO  implements ICrud<Funcionario>{
    private Conexao conexao;

    public FuncionarioDAO() {
        this.conexao = new Conexao();
    }
    
    //Continuar daqui
    @Override
    public Funcionario recupera(String id) throws SQLException {
        String sql = "select nome , matricula, dataAdmissao, cargo, salario from funcionarios where matricula = ?;";
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
        Funcionario f = new Funcionario();
        f.setNome(resultado.getString("nome"));
        f.setMatricula(resultado.getInt("matricula"));
        f.setDataAdmissao(resultado.getDate("dataAdmissao").toLocalDate());
        f.setCargo(resultado.getString("cargo"));
        f.setSalario(resultado.getDouble("salario"));
        
        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto cliente preenchido
        return f;

    }

    @Override
    public void adiciona(Funcionario t) throws SQLException {
        String sql = "insert into funcionarios (nome , matricula, dataAdmissao, cargo, salario) values (?,?,?,?,?)";
        
        // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getNome());
        ps.setInt(2, t.getMatricula());
        ps.setDate(3, Date.valueOf(t.getDataAdmissao()));
        ps.setString(4, t.getCargo());
        ps.setDouble(5, t.getSalario());
        
        ps.execute();

        conexao.fecha();
    }

    @Override
    public void altera(Funcionario t) throws SQLException {
        String sql = "update funcionarios set nome = ?, cargo =? where matricula=?";
        
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        
        ps.setString(1, t.getNome());
        ps.setString(2, t.getCargo());
        ps.setInt(3, t.getMatricula());
 

        // Executa a consulta no BD
        ps.execute();

        conexao.fecha();
    }

    @Override
    public void exclui(Funcionario t) throws SQLException {
        String sql = "delete from funcionarios where matricula=?";
        
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);        
        // Inclui o parâmetro da consulta na declaração sql
        ps.setInt(1, t.getMatricula());
           // Executa a consulta no BD
        ps.execute();

        conexao.fecha();
        
    }

  
}
