package appbookelandia.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Igor Neves
 */
public class Conexao {
    private Connection conexao;
    
    public Connection getConexao() throws SQLException{
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookelandia", "root", "Igor1912");
        return conexao;
    }
    
    public void fecha()throws SQLException{
        if(conexao != null){
            conexao.close();
        }
    }
}
