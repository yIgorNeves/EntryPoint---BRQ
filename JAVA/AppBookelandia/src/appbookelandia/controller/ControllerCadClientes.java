/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.dal.ClienteDAO;
import appbookelandia.model.Cliente;
import appbookelandia.model.Login;
import appbookelandia.model.NivelDeAcesso;
import appbookelandia.view.FrmCadCliente;
import java.sql.SQLException;

/**
 *
 * @author Igor Neves
 */
public class ControllerCadClientes {
    
    private FrmCadCliente view;

    public ControllerCadClientes(FrmCadCliente view) {
        this.view = view;
    }
    
    
    
    public void cadastraCliente(){
        Cliente c = new Cliente();
        c.setCpf(view.getTxtCPF().getText());
        c.setEndereco(view.getTxtEndereco().getText());
        c.setNome(view.getTxtNome().getText());
        c.setTelefone(view.getTxtTelefone().getText());
        
        Login l = new Login();
        l.setEmail(view.getTxtEmail().getText());
        l.setSenha(view.getTxtSenha().getPassword().toString());
        l.setNivelDeAcesso(NivelDeAcesso.Cliente);
        l.setStatus(true);
}
   
    public void limpaTela(){
        view.getTxtEmail().setText(" ");
        view.getTxtEndereco().setText(" ");
        view.getTxtEmail().setText(" ");
        view.getTxtNome().setText(" ");
        view.getTxtSenha().setText(" ");
        view.getTxtTelefone().setText(" ");
    }
    
    public void consultaCliente() throws SQLException {        
        String cpf = view.getTxtCPF().getText();
    
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.recupera(cpf);
    
        if (cliente != null) {
            view.getTxtNome().setText(cliente.getNome());
            view.getTxtEndereco().setText(cliente.getEndereco());
            view.getTxtTelefone().setText(cliente.getTelefone());
        }
    }
}
