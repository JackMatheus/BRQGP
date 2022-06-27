/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.model.Chamado;
import appbookelandia.view.FrmCadChamadosConsulta;

/**
 *
 * @author J. Mateus
 */
public class ControllerConsultaChamado {
        //Instanciando a view
    private FrmCadChamadosConsulta view;
    
    //Passando a view como parametro dentro da controller
    public ControllerConsultaChamado(FrmCadChamadosConsulta view){
        this.view = view;            
            }
    //Em andamento
    public void consultaDeChamado (){
        Chamado c = new Chamado();
        c.setCodigoDoCliente(view.getTxtCodigoDoCliente().getText());
        //c.setCodigoDoProduto(view.getTxtCodigoDoProduto().getText());
        c.setDescricao(view.getTxtDescricao().getText());
        //c.setTicket(view.getTicket().getText());        
    }
    
    public void limpaTela(){
        view.getTxtCodigoDoCliente().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtCodigoDoProduto().setText("");
        view.getTxtDescricao().setText("");
        //view.getTxtTicket().setText("");     
      
      }
}
