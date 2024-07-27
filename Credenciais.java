public class Credenciais {
    private String identificadorDeAcesso;
    private String senha;

    public Credenciais(String identificadorDeAcesso, String senha){
        setIdentificadorDeAcesso(identificadorDeAcesso);
        setSenha(senha);
    }

    public void setIdentificadorDeAcesso(String identificador){
        this.identificadorDeAcesso = identificador;
    }

    public String getIdentificadorDeAcesso(){
        return this.identificadorDeAcesso;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }
}