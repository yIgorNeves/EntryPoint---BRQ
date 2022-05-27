
package appbookelandia;

import appbookelandia.model.Cliente;
import appbookelandia.model.Login;
import appbookelandia.model.NivelDeAcesso;
import java.time.LocalDate;

/**
 *
 * @author Igor Neves
 */
public class AppBookelandia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setCpf("12345678901");
        c1.setDataDeCadasto(LocalDate.now());
        
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Data de Cadastro: " + c1.getDataDeCadasto());     
        
        Login l1 = new Login();
        l1.setEmail("igor@mail.com");
        l1.setSenha("132");
        l1.setStatus(true);
        l1.setNivelDeAcesso(NivelDeAcesso.Admin);
        
        System.out.println("Email: " + l1.getEmail());
        System.out.println("Senha: " + l1.getSenha());
        System.out.println("Nivel: " + l1.getNivelDeAcesso());
        if(l1.getStatus() == true){
            System.out.println("LOGADO");        
        }else{
            System.out.println("DESLOGADO");
        }
    }
    
}
