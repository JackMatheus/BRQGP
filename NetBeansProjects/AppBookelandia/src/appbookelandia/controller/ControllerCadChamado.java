/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.ChamadoDAO;
import appbookelandia.model.Chamado;
import appbookelandia.view.FrmCadChamados;
import java.sql.SQLException;

/**
 *
 * @author J. Mateus
 */
public class ControllerCadChamado {
    
    //Instanciando a view
    private FrmCadChamados view;
    
    //Passando a view como parametro dentro da controller
    public ControllerCadChamado (FrmCadChamados view){
        this.view = view;
    }
    
     public void abrirChamado()throws SQLException{
         Chamado c = new Chamado();
         c.setTicket(view.getTxtTicket().getText());
         c.setStatus(Integer.parseInt(view.getTxtTicket().getText()));
         //c.setCodigoDoFuncionario(view.getTxt);NA
         c.setCodigoDoCliente(view.getTxtCodigoDoCliente().getText());
         //c.setCodigoDoProduto(Integer.parseInt(view.getTxtCodigoDoProduto().getText()));
         c.setDescricao(view.getTxtDescricao().getText());
         
        
        ChamadoDAO chamadoDA0 = new ChamadoDAO();
        chamadoDA0.adiciona(c);    
   
         
     }
     
     public void salvarChamado()throws SQLException{
         
     
     }
     
      public void limpaTela(){
        view.getTxtCodigoDoCliente().setText("");
        view.getTxtDescricao().setText("");
        //view.getTxtCodigoDoProduto().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtTicket().setText("");     
      
      }
      
    public void consultaDeChamado () throws SQLException{
      
        //String
        String ticket = view.getTxtTicket().getText();
        
        ChamadoDAO chamadoDAO = new ChamadoDAO();
        Chamado chamado = chamadoDAO.recupera(ticket);
        
         if (chamado != null) {         
         view.getTxtTicket().setText(chamado.getTicket());
         view.getTxtDescricao().setText(chamado.getDescricao());
         view.getTxtCodigoDoCliente().setText(chamado.getCodigoDoCliente());
         //view.getTxtCodigoDoProduto().setText(String.valueOf(chamado.getCodigoDoProduto()));         
         }
        
                
    }
    
}
