package controller;

import view.ViewTelaLogin;
import view.ViewUsuario;

public class ControllerTelaLogin {

    private ViewTelaLogin viewTelaLogin;
    private ViewUsuario viewUsuario;

    public ControllerTelaLogin(ViewUsuario viewUsuario) {
        this.viewUsuario = viewUsuario;
    }

    public void setViewTelaLogin(ViewTelaLogin viewTelaLogin) {
        this.viewTelaLogin = viewTelaLogin;
    }

    public void iniciarPrograma() {
        viewTelaLogin.exibirMenuPrincipal();
    }

    public void realizarLogin() {
        viewUsuario.fazerLogin();
    }
}
