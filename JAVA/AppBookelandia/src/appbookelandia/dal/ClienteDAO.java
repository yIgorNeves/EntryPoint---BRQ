/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbookelandia.dal;

import appbookelandia.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Igor Neves
 */
public class ClienteDAO implements ICrud<Cliente>{
    private Conexao conexao;
    
    public ClienteDAO(){
        this.conexao = new Conexao();
    }

    @Override
    public Cliente recupera(String id) throws SQLException{
        String sql = "select cpf, nome, endereco, telefone, dataDeCadastro from clientes where cpf=?;";
        PreparedStatement ps =  conexao.getConexao().prepareStatement(sql);
        ps.setString(1, id);
        ps.execute();
        ResultSet resultado = ps.getResultSet();
        resultado.next();
        
        
        
        Cliente c = new Cliente();
        c.setCpf(resultado.getString("cpf"));
        c.setDataDeCadasto(resultado.getDate("dataDeCadastro").toLocalDate());
        c.setEndereco(resultado.getString("endereco"));
        c.setNome(resultado.getString("nome"));
        c.setTelefone(resultado.getString("telefone"));
        
        conexao.fecha();
        
        return c;
    }

    @Override
    public void adiciona(Cliente t) throws SQLException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void altera(Cliente t) throws SQLException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void exclui(Cliente t) throws SQLException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
