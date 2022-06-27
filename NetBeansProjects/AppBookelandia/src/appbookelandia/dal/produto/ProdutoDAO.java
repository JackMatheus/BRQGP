package appbookelandia.dal.produto;

import java.sql.ResultSet;
import appbookelandia.model.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO implements ICrudProduto<Produto> {

    private Conexao conexao;

    public ProdutoDAO() {
        this.conexao = conexao;
    }

    public Produto recupera(int codigoDoProduto) throws SQLException {
        // Cria a string de consulta
        String sql = "select codigoDoProduto, codigoDaCategoria, nome, descricao, preco from produtos where codigoDoProduto = ?;";
        // Cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // Inclui o parâmetro da consulta na declaração sql
        ps.setInt(1, codigoDoProduto);
        // Executa a consulta no BD
        ps.execute();

        // Recupera os dados do BD
        ResultSet resultado = ps.getResultSet();
        // Move o cursor do BD para a próxima linha (1ª linha da tabela)
        resultado.next();

        // Cria o objeto Produto para ser preenchido com os dados do BD
        Produto p = new Produto();
        //Categoria é um objeto    
        p.setDescricao(resultado.getString("descricao"));
        p.setNome(resultado.getString("nome"));
        p.setCodigoDoProduto(resultado.getInt("codigoDoProduto"));
        p.setPreco(resultado.getInt("preco"));
        //p.setCategoria(resultado.getInt("codigo da Categoria"));

        // Fecha a conexão
        conexao.fecha();

        // Devolve o objeto cliente preenchido
        return p;

    }

    @Override
    public void adiciona(Produto t) {
    }

    @Override
    public void altera(Produto t) {
    }

    @Override
    public void exclui(Produto t) {
    }




}
