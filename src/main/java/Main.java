import java.time.LocalDate;
import java.util.Scanner;
import controller.ControllerUsuario;
import controller.ControllerTelaLogin;
import controller.ControllerAdministrador;
import view.ViewTelaLogin;
import view.ViewUsuario;
import view.ViewAdministrador;
import modelo.Administrador;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Administrador administrador = new Administrador(
                "Ian da Silva",
                "072.737.777.99",
                "iandasilva@gmail.com",
                "minhasenha"
        );

        administrador.adicionarUsuario(administrador);

        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ViewUsuario viewUsuario = new ViewUsuario(controllerUsuario, administrador);
        ControllerAdministrador controllerAdministrador = new ControllerAdministrador(administrador);
        ControllerTelaLogin controllerTelaLogin = new ControllerTelaLogin(viewUsuario);

        ViewAdministrador viewAdministrador = new ViewAdministrador(controllerAdministrador, scanner);

        controllerTelaLogin.setViewTelaLogin(new ViewTelaLogin(controllerTelaLogin, viewAdministrador));

        controllerTelaLogin.iniciarPrograma();
    }
}
