/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.model.Login;
import appbookelandia.view.FrmLogin;

import appbookelandia.model.Cliente;
import appbookelandia.model.NivelDeAcesso;

public class ControllerCadLogin {
    
    private FrmLogin view;
    
    public ControllerCadLogin(FrmLogin view){        
        this.view = view; 
    }
    
    public void criarLigar(){
        Login login = new Login();
     
        login.setEmail(view.getTextEmail().getText());
        login.setSenha(view.getTxtPassword().toString());   
        
                      
    }
    
}
