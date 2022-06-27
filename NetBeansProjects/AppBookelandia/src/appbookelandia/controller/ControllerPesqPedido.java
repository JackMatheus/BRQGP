/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.model.Pedido;
import appbookelandia.model.Cliente;
import appbookelandia.view.FrmConsultaDePedidos;

/**
 *
 * @author J. Mateus
 */
public class ControllerPesqPedido {
    
    //Instanciando a view    
    private FrmConsultaDePedidos view;
    
    
    //Passando a view como parametro dentro da controller
    public ControllerPesqPedido (FrmConsultaDePedidos view){
         this.view = view;
    }
    
    //ak- public void pesquisarPedido(Pedido p, Cliente c, Produto p){}
        //if(pessoas.contains(pessoa1)) {
    //  System.out.println("Pessoa já existe na lista");
    // } else {
    //  System.out.println("Pessoa não existe na lista");
    //}
    public void pesquisarPedido(){        
    Pedido p = new Pedido();
    //p.setCliente(view.getTxtCliente().getText());
    //p.setDataPedido(view.getTxtDataPedido().getText());
    //p.setNumeroDoPedido(view.getTxtNumeroPedido().getText());
    //p.setPagamento(view.getTxtFormaDePagamento().getText());
    //p.setStatus(view.getTxtStatus().getText());
    //p.setValorTotal(view.getTxtValorTotal().getText());
    
 
    }
    
    public void limpaTela(){
       view.getTxtCliente().setText("");
       view.getTxtDataPedido().setText("");
       view.getTxtFormaDePagamento().setText("");
       view.getTxtNumeroPedido().setText("");
       view.getTxtStatus().setText("");
       view.getTxtValorTotal().setText("");    
       
    }
}
