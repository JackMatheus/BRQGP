/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appbookelandia.dal.produto;

import java.sql.SQLException;

/* Interface com Tipo Genérico */
public interface ICrudProduto <T>{
    
     T recupera(int codigoDoProduto) throws SQLException;

    void adiciona(T t) throws SQLException;

    void altera(T t) throws SQLException;

    void exclui(T t) throws SQLException;
    
}
