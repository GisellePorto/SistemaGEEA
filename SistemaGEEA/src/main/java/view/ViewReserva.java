package view;

import controller.ControllerReserva;
import modelo.Reserva;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewReserva {
    private ControllerReserva controllerReserva;
    private Scanner scanner;

    public ViewReserva(ControllerReserva controllerReserva) {
        this.controllerReserva = controllerReserva;
        this.scanner = new Scanner(System.in);
    }

    public void menuReserva() {
        int opcao;
        do {
            System.out.println("----- Menu Reserva -----");
            System.out.println("1. Adicionar Reserva");
            System.out.println("2. Remover Reserva");
            System.out.println("3. Listar Reservas");
            System.out.println("4. Editar Reserva");
            System.out.println("5. Voltar");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();

            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarReserva();
                    break;
                case 2:
                    removerReserva();
                    break;
                case 3:
                    listarReservas();
                    break;
                case 4:
                    editarReserva();
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
    private void adicionarReserva() {

        System.out.print("Digite o ID do usuário solicitante: ");
        int idUsuarioSolicitante = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo da reserva:");
        String tipo = scanner.nextLine();


        System.out.print("Digite a data de início da reserva (formato DD/MM/AA):");
        String dataReservaString = scanner.nextLine();

        LocalDate dataReserva = null;

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            dataReserva = LocalDate.parse(dataReservaString, dateFormatter);
            System.out.println("Data inserida: " + dateFormatter.format(dataReserva));
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato dd/MM/yyyy.");
        }


        System.out.print("Agora digite a data final:");
        String dataFinalString = scanner.nextLine();

        LocalDate dataFinal = null;

        try {
            dataFinal = LocalDate.parse(dataFinalString, dateFormatter);
            System.out.println("Data inserida: " + dateFormatter.format(dataFinal));
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato dd/MM/yyyy.");
        }

        System.out.print("Digite o horário de início da reserva (HH:MM):");
        String horaReservaString = scanner.nextLine();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime horaReserva = null;

        try {
            horaReserva = LocalTime.parse(horaReservaString, timeFormatter);

            System.out.println("Horário inserido: " + timeFormatter.format(horaReserva));
        } catch (Exception e) {
            System.out.println("Formato de horário inválido. Certifique-se de seguir o formato HH:MM.");
        }

        System.out.print("Digite o horário final da reserva:");
        String horaFinalString = scanner.nextLine();

        LocalTime horaFinal = null;

        try {
            horaFinal = LocalTime.parse(horaFinalString, timeFormatter);

            System.out.println("Horário inserido: " + timeFormatter.format(horaFinal));
        } catch (Exception e) {
            System.out.println("Formato de horário inválido. Certifique-se de seguir o formato HH:MM.");
        }


        System.out.print("Digite a duração da reserva (em quantidade de horas):");
        int duracao = scanner.nextInt();

        System.out.print("Digite a finalidade da reserva:");
        String finalidade = scanner.nextLine();

        System.out.print("Digite a observação da reserva:");
        String observacao = scanner.nextLine();


        controllerReserva.adicionarReserva(idUsuarioSolicitante, tipo, dataReserva, dataFinal, horaReserva, horaFinal, duracao, finalidade, observacao);

        System.out.println("Reserva adicionada com sucesso!");
    }

    private void removerReserva() {
        System.out.print("Digite o ID da reserva a ser removida: ");
        int idReserva = scanner.nextInt();

        controllerReserva.removerReserva(idReserva);

        System.out.println("Reserva removida com sucesso!");
    }

    private void listarReservas() {
        ArrayList<Reserva> reservas = controllerReserva.listarReservas();

        System.out.println("----- Lista de Reservas -----");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    private void editarReserva() {
        System.out.print("Digite o ID da reserva que você deseja editar: ");
        int idReserva = scanner.nextInt();
        scanner.nextLine();

        if (controllerReserva.solicitarEdicaoReserva(idReserva)) {
            System.out.println("Vamos digitar os novos dados da reserva.");

            System.out.print("Digite o novo tipo do a reserva: ");
            String novoTipoReserva = scanner.nextLine();

            System.out.print("Digite a nova data de início da reserva (formato DD/MM/AA):");
            String novaDataReservaString = scanner.nextLine();

            LocalDate novaDataReserva = null;

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            try {
                novaDataReserva = LocalDate.parse(novaDataReservaString, dateFormatter);
                System.out.println("Data inserida: " + dateFormatter.format(novaDataReserva));
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Certifique-se de usar o formato dd/MM/yyyy.");
            }

            System.out.print("Digite a nova data final da reserva:");
            String novaDataFinalString = scanner.nextLine();

            LocalDate novaDataFinal = null;

            try {
                novaDataFinal = LocalDate.parse(novaDataFinalString, dateFormatter);
                System.out.println("Data inserida: " + dateFormatter.format(novaDataFinal));
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Certifique-se de usar o formato dd/MM/yyyy.");
            }

            System.out.print("Digite o novo horário de início da reserva (HH:MM):");
            String novoHorarioReservaString = scanner.nextLine();

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

            LocalTime novoHorarioReserva = null;

            try {
                novoHorarioReserva = LocalTime.parse(novoHorarioReservaString, timeFormatter);

                System.out.println("Horário inserido: " + timeFormatter.format(novoHorarioReserva));
            } catch (Exception e) {
                System.out.println("Formato de horário inválido. Certifique-se de seguir o formato HH:MM.");
            }

            System.out.print("Digite o novo horário final da reserva:");
            String novoHorarioFinalString = scanner.nextLine();

            LocalTime novoHorarioFinal = null;

            try {
                novoHorarioFinal = LocalTime.parse(novoHorarioFinalString, timeFormatter);

                System.out.println("Horário inserido: " + timeFormatter.format(novoHorarioFinal));
            } catch (Exception e) {
                System.out.println("Formato de horário inválido. Certifique-se de seguir o formato HH:MM.");
            }

            System.out.print("Digite a nova duração da reserva (em quantidade de horas):");
            int novaDuracao = scanner.nextInt();

            System.out.print("Digite a nova finalidade da reserva:");
            String novaFinalidade = scanner.nextLine();

            System.out.print("Digite a nova observação da reserva:");
            String novaObservacao = scanner.nextLine();

            controllerReserva.editarReserva(idReserva, novoTipoReserva, novaDataReserva, novaDataFinal, novoHorarioReserva, novoHorarioFinal, novaDuracao, novaFinalidade, novaObservacao);

            System.out.println("Reserva editada com sucesso!");
        } else {
            System.out.println("Reserva não encontrada. Edição cancelada.");
        }
    }
}
