/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal.produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author J. Mateus
 */
public class Conexao {
    
    private Connection conexao;
    
    public Connection getConexao() throws SQLException {
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookelandia", "root", "");
        return conexao;
    }
    
    public void fecha() throws SQLException {
        if (conexao != null){
            conexao.close();
        }
    }
    
}
