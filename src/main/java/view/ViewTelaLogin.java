package view;
import controller.ControllerTelaLogin;
import java.util.Scanner;

public class ViewTelaLogin {
    private ControllerTelaLogin controllerTelaLogin;
    private ViewAdministrador viewAdministrador;

    public ViewTelaLogin(ControllerTelaLogin controllerTelaLogin, ViewAdministrador viewAdministrador) {
        this.controllerTelaLogin = controllerTelaLogin;
        this.viewAdministrador = viewAdministrador;
    }

    public void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("----- Bem vindo! -----");
            System.out.println("[1] Fazer Login");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    controllerTelaLogin.realizarLogin();
                    break;
                case 0:
                    System.out.println("Saindo do Programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
