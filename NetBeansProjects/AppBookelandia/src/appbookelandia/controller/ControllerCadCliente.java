/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.ClienteDAO;
import appbookelandia.view.FrmCadClientes;
import appbookelandia.model.Cliente;
import appbookelandia.model.Login;
import appbookelandia.model.NivelDeAcesso;
import java.sql.SQLException;

/**
 *
 * @author J. Mateus
 */
public class ControllerCadCliente{

    //Instanciando a view
    private FrmCadClientes view;

    //Passando a view como parametro dentro da controller
    public ControllerCadCliente(FrmCadClientes view) {
        this.view = view;
    }

    public void cadastraCliente() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCpf().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        
        
        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.adiciona(c);

        Login log = new Login();
        log.setEmail(view.getTxtEmail().getText());
        log.setSenha(view.getTxtSenha().getText());

        //Importacção da Classe de NivelDeAcesso
        log.setNivelDeAcesso(NivelDeAcesso.Cliente);
        log.setStatus(true);       
        

    }
    


    public void limpaTela() {
        view.getTxtCpf().setText("");
        view.getTxtNome().setText("");
        view.getTxtEmail().setText("");
        view.getTxtSenha().setText("");
        view.getTxtTelefone().setText("");
        view.getTxtEndereco().setText("");
    }

    public void consultaCliente() throws SQLException {
        String cpf = view.getTxtCpf().getText();

        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.recupera(cpf);

        if (cliente != null) {
            view.getTxtNome().setText(cliente.getNome());
            view.getTxtEndereco().setText(cliente.getEndereco());
            view.getTxtTelefone().setText(cliente.getTelefone());
        }
    }
    
    public void exclui() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCpf().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        
        
        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.exclui(c);
           
    }  

    
        public void altera() throws SQLException {
        Cliente c = new Cliente();
        c.setNome(view.getTxtNome().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setCpf(view.getTxtCpf().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        
        
        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.altera(c);
    
    }
    

}
