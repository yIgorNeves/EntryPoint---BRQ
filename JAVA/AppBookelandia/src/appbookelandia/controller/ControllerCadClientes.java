/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.controller;

import appbookelandia.model.Cliente;
import appbookelandia.model.Login;
import appbookelandia.model.NivelDeAcesso;
import appbookelandia.view.FrmCadCliente;

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
}
