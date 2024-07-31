public class Credenciais {
    private String identificadorDeAcesso;
    private String senha;
    private Usuario usuario;

    public Credenciais(String identificadorDeAcesso, String senha, Usuario usuario){
        setIdentificadorDeAcesso(identificadorDeAcesso);
        setSenha(senha);
        setUsuario(usuario);
    }

    private void setUsuario(Usuario usuario) {
		this.usuario = usuario;	
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