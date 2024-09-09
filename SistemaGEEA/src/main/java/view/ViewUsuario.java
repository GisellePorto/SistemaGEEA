package view;

import controller.ControllerAdministrador;
import controller.ControllerUsuario;
import modelo.Administrador;
import modelo.Aluno;
import modelo.Professor;
import modelo.Usuario;

import java.util.Scanner;

public class ViewUsuario {

    private ControllerUsuario controllerUsuario;
    private Administrador administrador;

    public ViewUsuario(ControllerUsuario controllerUsuario, Administrador administrador) {
        this.controllerUsuario = controllerUsuario;
        this.administrador = administrador;

    }

    public void fazerLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        Usuario usuarioLogado = controllerUsuario.fazerLogin(email, senha);

        if (usuarioLogado != null) {
            exibirMenu(usuarioLogado);
        } else {
            System.out.println("Login falhou. Verifique suas credenciais.");
        }
    }

    private void exibirMenu(Usuario usuario) {
        if (usuario instanceof Administrador) {
            abrirMenuAdministrador();
        } else if (usuario instanceof Professor) {
            abrirMenuProfessor();
        } else if (usuario instanceof Aluno) {
            abrirMenuAluno();
        }
    }

    private void abrirMenuAdministrador() {
        Scanner scanner = new Scanner(System.in);
        ControllerAdministrador controllerAdministrador = new ControllerAdministrador(administrador);

        ViewAdministrador viewAdministrador = new ViewAdministrador(controllerAdministrador, scanner);
        viewAdministrador.mostrarMenuAdministrador();
    }


    private void abrirMenuProfessor() {
        ViewProfessor viewProfessor = new ViewProfessor();
        viewProfessor.mostrarMenuProfessor();
    }

    private void abrirMenuAluno() {
        ViewAluno viewAluno = new ViewAluno();
        viewAluno.mostrarMenuAluno();
    }
}
