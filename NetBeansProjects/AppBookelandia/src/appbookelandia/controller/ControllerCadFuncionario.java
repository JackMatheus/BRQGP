/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.FuncionarioDAO;
import appbookelandia.model.Atendente;
import appbookelandia.model.Funcionario;
import appbookelandia.model.*;
import appbookelandia.view.FrmCadFuncionarios;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author J. Mateus
 */
public class ControllerCadFuncionario {
    
    private FrmCadFuncionarios view;
    
    public ControllerCadFuncionario (FrmCadFuncionarios view){
    this.view = view;
    }
    
    public void cadastraFuncioario()  throws SQLException{
        Funcionario a = new Atendente();
        a.setNome(view.getTxtNome().getText());
        a.setDataAdmissao(LocalDate.parse(view.getTxtAdmissao().getText()));
        a.setCargo(view.getTxtCargo().getText());
        a.setMatricula(Integer.parseInt(view.getTxtMatricula().getText()));  
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.adiciona(a);
        
            
    }
    
    public void limpaTela(){        
        view.getTxtNome().setText("");
        view.getTxtAdmissao().setText("");
        view.getTxtCargo().setText("");
        view.getTxtMatricula().setText("");
        
    }
    
     public void altera() throws SQLException{
         
         Funcionario funcionario = new Funcionario();
         funcionario.setNome(view.getTxtNome().getText());
         funcionario.setCargo(view.getTxtCargo().getText());
         funcionario.setMatricula(Integer.parseInt(view.getTxtMatricula().getText()));
             
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.altera(funcionario);
                 
          
     }
     
     
     public void consultaCliente() throws SQLException {
         //String
        String matricula = view.getTxtMatricula().getText();
        
         FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
         Funcionario funcionario = funcionarioDAO.recupera(matricula);
         
          if (funcionario != null) {
            view.getTxtNome().setText(funcionario.getNome());
            view.getTxtCargo().setText(funcionario.getCargo());
            view.getTxtMatricula().setText(String.valueOf(funcionario.getMatricula()));
            //em teste
            view.getTxtAdmissao().setText(String.valueOf(funcionario.getDataAdmissao()));

        }
         
         
         }

    public void excluiFuncioario() throws SQLException {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(view.getTxtNome().getText());
        funcionario.setCargo(view.getTxtCargo().getText());
        //em teste
        funcionario.setMatricula(Integer.parseInt(view.getTxtMatricula().getText()));
        //funcionario.setDataAdmissao(LocalDate.parse(view.getTxtAdmissao().getText()));
        //funcionario.setSalario(view.getTxtSalario().getText());NA     
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.exclui(funcionario);
        
    }
    
}
