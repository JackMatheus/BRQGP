/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.model.Chamado;
import appbookelandia.view.FrmCadChamadosAbertura;

/**
 *
 * @author J. Mateus
 */
public class ControllerAberturaChamado {
    
    //Instanciando a view
    private FrmCadChamadosAbertura view;
    
    //Passando a view como parametro dentro da controller
    public ControllerAberturaChamado (FrmCadChamadosAbertura view){
        this.view = view;
    }
    
     public void abrirChamado(){
         Chamado c = new Chamado();
         c.setCodigoDoCliente(view.getTxtCodigoDoCliente().getText());
         c.setDescricao(view.getTxtDescricao().getText());
         //c.setCodigoDoProduto(view.getTxtCodigoDoProduto().getText();
         c.setDescricao(view.getTxtDescricao().getText());
         c.setTicket(view.getTxtTicket().getText());
         salvarChamado();
         
     }
     
     public void salvarChamado(){
         
     
     }
     
      public void limpaTela(){
        view.getTxtCodigoDoCliente().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtCodigoDoProduto().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtTicket().setText("");     
      
      }
    
}
