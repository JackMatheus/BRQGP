/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.*;
import appbookelandia.dal.ProdutoDAO;
import appbookelandia.model.Produto;
import appbookelandia.view.FrmCadProdutos;
import appbookelandia.model.CategoriaDoProduto;
import java.sql.SQLException;

public class ControllerCadProduto {

    //Instanciando a view de Produtos
    private FrmCadProdutos view;

    public ControllerCadProduto(FrmCadProdutos view) {
        this.view = view;
    }

    public void cadastraProduto() throws SQLException {
        Produto produto = new Produto();
        produto.setNome(view.getTxtNome().getText());
        produto.setDescricao(view.getTxtDescricao().getText());
        produto.setPreco(Double.valueOf((view.getTxtPreco().getText())));
        //Importacção da Classe de CategoriaDoProduto.Produto // Checar a Viewname
        //produto.setCategoria(Double.valueOf(view.getTxtCategoriaDoProduto().getText())); 
        produto.setCodigoDoProduto(Integer.parseInt(view.getTxtCodigoDoProduto().getText()));
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.adiciona(produto);

    }

    public void limpaTela() {
        view.getTxtNome().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtPreco().setText("");
        view.getTxtCodigoDoProduto().setText("");     

    }

    /* Controller */
    public void consultaProduto()throws SQLException {
        //Informação do front;
        String codigoDoProduto = view.getTxtCodigoDoProduto().getText();
            
        //Informação do Back end;
        //Ainda não tenho estas informações:                
       ProdutoDAO produtoDAO = new ProdutoDAO();
       Produto produto = produtoDAO.recupera(codigoDoProduto);
       
       //Verificar aqui  - Informação do Back end;
        if (produto != null) {           
            view.getTxtNome().setText(produto.getNome());
            view.getTxtDescricao().setText(produto.getDescricao());
            //view.getTxtPreco().setText((produto.getPreco()));
            //view.getTxtCodigoDoProduto().setText((produto.getCodigoDoProduto()));          
         }
    }
    
     public void exclui() throws SQLException {
         Produto produto = new Produto();
         //produto.setCategoria(view.getTxt.getText());]
         produto.setNome(view.getTxtNome().getText());
         produto.setDescricao(view.getTxtDescricao().getText());
         produto.setPreco(Integer.parseInt((view.getTxtPreco().getText())));
         
         ProdutoDAO produtoDAO = new ProdutoDAO();
         produtoDAO.exclui(produto); 
     }
    
     public void alteraProduto() throws SQLException {
        
         Produto produto = new Produto();
         //produto.setCategoria(view.getTxt.getText());]
         produto.setNome(view.getTxtNome().getText());
         produto.setDescricao(view.getTxtDescricao().getText());
         produto.setPreco(Integer.parseInt((view.getTxtPreco().getText())));
         
         ProdutoDAO produtoDAO = new ProdutoDAO();
         produtoDAO.altera(produto);       
         
         
     
     }

}
