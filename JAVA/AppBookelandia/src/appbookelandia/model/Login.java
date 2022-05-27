package appbookelandia.model;

/**
 *
 * @author Igor Neves
 */
public class Login {
    private String email;
    private String senha;
    private NivelDeAcesso nivelDeAcesso;
    private boolean status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelDeAcesso getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(NivelDeAcesso nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Login(String email, String senha, NivelDeAcesso nivelDeAcesso, boolean status) {
        this.email = email;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
        this.status = status;
    }   
    
    public Login(){
        
    }
    
}
