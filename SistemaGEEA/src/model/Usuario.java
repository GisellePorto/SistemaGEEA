package model;

public class Usuario{
    private String emailInstitucional;
    private String senha;

    public Usuario(String emailInstitucional, String senha){
        setEmailInstitucional(emailInstitucional);
        setSenha(senha);
    }

	public String getEmailInstitucional(){
        return this.emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional){
        this.emailInstitucional = emailInstitucional;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}