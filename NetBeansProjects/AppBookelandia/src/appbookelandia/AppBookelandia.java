package appbookelandia;


import appbookelandia.view.FrmLogin;
import appbookelandia.view.FrmPrincipal;


public class AppBookelandia {

    public static void main(String[] args) {
               
        FrmPrincipal frmprincipal = new FrmPrincipal();
        frmprincipal.setVisible(true);
        
        FrmLogin login = new FrmLogin();
        //boolean logged = true;
        //JOptionPane.showMessageDialog(this, "Senha incorreta"); 
        //if(logged == true){login.setVisible(true);}else{}
        //dispose();
        login.setVisible(true);          
             
    }

   
}
