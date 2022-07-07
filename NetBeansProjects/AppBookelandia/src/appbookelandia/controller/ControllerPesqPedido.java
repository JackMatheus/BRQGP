/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.PedidoDAO;
import appbookelandia.model.Pedido;
import appbookelandia.model.Cliente;
import appbookelandia.model.Produto;
import appbookelandia.view.FrmConsultaDePedidos;
import java.sql.SQLException;

/**
 *
 * @author J. Mateus
 */
public class ControllerPesqPedido {

    //Instanciando a view    
    private FrmConsultaDePedidos view;

    //Passando a view como parametro dentro da controller
    public ControllerPesqPedido(FrmConsultaDePedidos view) {
        this.view = view;
    }

    public void consultaPedido() throws SQLException {
        //Informação do front;
        String numeroDoPedido = view.getTxtNumeroPedido().getText();
        //Informação do Back end;
        //Ainda não tenho estas informações:
        PedidoDAO pedidoDAO = new PedidoDAO();
        //Instacio Pedido que recupera da DAO o numero;
        Pedido pedido = pedidoDAO.recupera(numeroDoPedido);

        //Verificar aqui  - Informação do Back end;
        if (pedido != null) {
            view.getTxtCliente().setText(String.valueOf(pedido.getCliente()));
            view.getTxtDataPedido().setText(String.valueOf(pedido.getDataPedido()));
            view.getTxtFormaDePagamento().setText(String.valueOf(pedido.getPagamento()));
            view.getTxtNumeroPedido().setText(String.valueOf(pedido.getNumeroDoPedido()));
            view.getTxtStatus().setText(String.valueOf(pedido.isStatus()));
            view.getTxtValorTotal().setText(String.valueOf(pedido.getValorTotal()));

        }

    }
    //if(pessoas.contains(pessoa1)) {
    //  System.out.println("Pessoa já existe na lista");
    // } else {
    //  System.out.println("Pessoa não existe na lista");
    //}

    public void limpaTela() {
        //view.getTxtCliente().setText("");
        //view.getTxtDataPedido().setText("");
        //view.getTxtFormaDePagamento().setText("");
        //view.getTxtNumeroPedido().setText("");
        //view.getTxtStatus().setText("");
        //view.getTxtValorTotal().setText("");

    }
}
