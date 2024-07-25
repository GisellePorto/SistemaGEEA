public class Professor extends Usuario{
    private String loginSIGAA;

    public Professor(String emailInstitucional, String Senha, String loginSIGAA){
        super(emailInstitucional, Senha);
        setLoginSIGAA(loginSIGAA);
    }

    public String getLoginSIGAA(){
        return this.loginSIGAA;
    }

    public void setLoginSIGAA(String loginSIGAA){
        this.loginSIGAA = loginSIGAA;
    }
}
