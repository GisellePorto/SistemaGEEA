package view;

import controller.ControllerAdministrador;

import java.time.LocalDate;
import java.util.Scanner;

public class ViewAdministrador {
    private final ControllerAdministrador controller;
    private final Scanner scanner;

    public ViewAdministrador(ControllerAdministrador controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }

    public void mostrarMenuAdministrador() {
        boolean continuarExecucao = true;

        while (continuarExecucao) {
            System.out.println("Menu Administrador:");
            System.out.println("1 - Gerenciar espaços");
            System.out.println("2 - Gerenciar equipamentos");
            System.out.println("3 - Gerenciar reservas");
            System.out.println("4 - Gerenciar usuários");
            System.out.println("0 - Voltar");

            int escolhaMenuPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMenuPrincipal) {
                case 1:
                    mostrarMenuEspacos();
                    break;
                case 2:
                    mostrarMenuEquipamentos();
                    break;
                case 3:
                    mostrarMenuReservas();
                    break;
                case 4:
                    mostrarMenuUsuarios();
                    break;
                case 0:
                    continuarExecucao = false;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void mostrarMenuEspacos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("Opções para Gerenciar Espaços:");
            System.out.println("1 - Adicionar espaço");
            System.out.println("2 - Remover espaço");
            System.out.println("3 - Editar espaço");
            System.out.println("4 - Voltar");

            int escolhaEspacos = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaEspacos) {
                case 1:
                    System.out.print("Digite a descrição do espaço: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a quantidade disponível: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite alguma observação sobre o espaço: ");
                    String observacoes = scanner.nextLine();
                    System.out.print("Digite a capacidade do espaço: ");
                    int capacidade = scanner.nextInt();

                    controller.adicionarEspaco(descricao, quantidade, false, LocalDate.of(2024, 9, 16) , observacoes, capacidade, false);
                    break;
                case 2:
                    System.out.print("Digite o ID do espaço que deseja remover: ");
                    int idEspaco = scanner.nextInt();
                    controller.removerEspaco(idEspaco);
                    break;
                case 3:
                    System.out.print("Digite o ID do espaço que deseja editar: ");
                    int obterIdEspaco = scanner.nextInt();

                    if (controller.solicitarEdicaoEspaco(obterIdEspaco)) {
                        System.out.print("Digite a descrição do espaço: ");
                        String descricaoEdicao = scanner.nextLine();
                        System.out.print("Digite a quantidade disponível: ");
                        int quantidadeEdicao = scanner.nextInt();
                        System.out.print("Digite alguma observação sobre o espaço: ");
                        String observacoesEdicao = scanner.nextLine();
                        System.out.print("Digite a capacidade do espaço: ");
                        int capacidadeEdicao = scanner.nextInt();
                        controller.editarEspaco(obterIdEspaco, descricaoEdicao, quantidadeEdicao, false, LocalDate.of(2024, 9, 16) , observacoesEdicao, capacidadeEdicao, false);
                    } else {
                        System.out.println("Espaço não encontrado.");
                    }
                    break;
                case 4:
                    voltar = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }
    public void mostrarMenuEquipamentos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("Opções para Gerenciar Equipamentos:");
            System.out.println("1 - Adicionar equipamento");
            System.out.println("2 - Remover equipamento");
            System.out.println("3 - Editar equipamento");
            System.out.println("0 - Voltar");

            int escolhaEspacos = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaEspacos) {
                case 1:
                    System.out.print("Digite a descrição do equipamento ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite alguma observação sobre o equipamento: ");
                    String observacoes = scanner.nextLine();
                    System.out.print("Digite o fabricante do equipamento: ");
                    String fabricante = scanner.nextLine();
                    System.out.print("Digite o modelo do equipamento: ");
                    String modelo = scanner.nextLine();

                    controller.adicionarEquipamento(descricao, quantidade, true, LocalDate.of(2024, 9, 16), observacoes, fabricante, modelo, false);
                    break;
                case 2:
                    System.out.print("Digite o ID do equipamento que deseja remover: ");
                    int idEquipamento = scanner.nextInt();
                    controller.removerEquipamento(idEquipamento);
                    break;
                case 3:
                    System.out.print("Digite o ID do equipamento que deseja editar: ");
                    int obterIdEquipamento = scanner.nextInt();

                    if (controller.solicitarEdicaoEspaco(obterIdEquipamento)) {
                        System.out.print("Digite a descrição do equipamento ");
                        String descricaoEdicao = scanner.nextLine();
                        System.out.print("Digite a quantidade: ");
                        int quantidadeEdicao = scanner.nextInt();
                        System.out.print("Digite alguma observação sobre o equipamento: ");
                        String observacoesEdicao = scanner.nextLine();
                        System.out.print("Digite o fabricante do equipamento: ");
                        String fabricanteEdicao = scanner.nextLine();
                        System.out.print("Digite o modelo do equipamento: ");
                        String modeloEdicao = scanner.nextLine();

                        controller.editarEquipamento(obterIdEquipamento, descricaoEdicao, quantidadeEdicao, true, LocalDate.of(2024, 9, 16), observacoesEdicao, fabricanteEdicao, modeloEdicao, false);
                    } else {
                        System.out.println("Equipamento não encontrado.");
                    }
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }

    public void mostrarMenuReservas() {
        boolean voltar = false;

        System.out.println("Opções para Gerenciar Reservas:");
        System.out.println("1 - Adicionar reserva");
        System.out.println("2 - Remover reserva");
        System.out.println("3 - Editar reserva");
        System.out.println("0 - Voltar");

        int escolhaReservas = scanner.nextInt();
        scanner.nextLine();

        switch (escolhaReservas) {
            case 1:
                System.out.print("Digite a descrição do equipamento ");
                String descricao = scanner.nextLine();
                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();
                System.out.print("Digite alguma observação sobre o equipamento: ");
                String observacoes = scanner.nextLine();
                System.out.print("Digite o fabricante do equipamento: ");
                String fabricante = scanner.nextLine();
                System.out.print("Digite o modelo do equipamento: ");
                String modelo = scanner.nextLine();

                controller.adicionarEquipamento(descricao, quantidade, true, LocalDate.of(2024, 9, 16), observacoes, fabricante, modelo, false);
                break;
            case 2:
                System.out.print("Digite o ID do equipamento que deseja remover: ");
                int idEquipamento = scanner.nextInt();
                controller.removerEquipamento(idEquipamento);
                break;
            case 3:
                System.out.print("Digite o ID do equipamento que deseja editar: ");
                int obterIdEquipamento = scanner.nextInt();

                if (controller.solicitarEdicaoEspaco(obterIdEquipamento)) {
                    System.out.print("Digite a descrição do equipamento ");
                    String descricaoEdicao = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeEdicao = scanner.nextInt();
                    System.out.print("Digite alguma observação sobre o equipamento: ");
                    String observacoesEdicao = scanner.nextLine();
                    System.out.print("Digite o fabricante do equipamento: ");
                    String fabricanteEdicao = scanner.nextLine();
                    System.out.print("Digite o modelo do equipamento: ");
                    String modeloEdicao = scanner.nextLine();

                    controller.editarEquipamento(obterIdEquipamento, descricaoEdicao, quantidadeEdicao, true, LocalDate.of(2024, 9, 16), observacoesEdicao, fabricanteEdicao, modeloEdicao, false);
                } else {
                    System.out.println("Equipamento não encontrado.");
                }
                break;
            case 0:
                voltar = true;
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
                break;
        }
    }

    public void mostrarMenuUsuarios() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("Opções para Gerenciar Usuários:");
            System.out.println("1 - Administradores");
            System.out.println("2 - Alunos");
            System.out.println("3 - Professores");
            System.out.println("0 - Voltar");

            int escolhaMenuUsuarios = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaMenuUsuarios) {
                case 1:
                    mostrarMenuAdministradores();
                    break;
                case 2:
                    mostrarMenuAlunos();
                    break;
                case 3:
                    mostrarMenuProfessores();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }



    public void mostrarMenuProfessores() {

        boolean voltar = false;

        while (!voltar) {
            System.out.println("Opções para Gerenciar Professores:");
            System.out.println("1 - Adicionar professor");
            System.out.println("2 - Remover professor");
            System.out.println("3 - Editar professor");
            System.out.println("0 - Voltar");

            int escolhaEspacos = scanner.nextInt();
            scanner.nextLine();


            switch (escolhaEspacos) {
                case 1:
                    System.out.print("Digite o nome completo do professor: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do professor: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o telefone do professor: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Digite o email do professor: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha do professor: ");
                    String senha = scanner.nextLine();
                    System.out.print("Digite a formacão do professor: ");
                    String formacao = scanner.nextLine();

                    controller.adicionarProfessor(nome , cpf, email, senha, formacao);
                    break;
                case 2:
                    System.out.print("Digite o ID do professor que deseja remover: ");
                    int idProfessor = scanner.nextInt();
                    controller.removerProfessor(idProfessor);
                    break;
                case 3:
                    System.out.print("Digite o ID do espaço que deseja editar: ");
                    int obterIdProfessor = scanner.nextInt();

                    if (controller.solicitarEdicaoProfessor(obterIdProfessor)) {
                        System.out.print("Digite o nome completo do professor: ");
                        String nomeEdicao = scanner.nextLine();
                        System.out.print("Digite o CPF do professor: ");
                        String cpfEdicao = scanner.nextLine();
                        System.out.print("Digite o telefone do professor: ");
                        String telefoneEdicao = scanner.nextLine();
                        System.out.print("Digite o email do professor: ");
                        String emailEdicao = scanner.nextLine();
                        System.out.print("Digite a senha do professor: ");
                        String senhaEdicao = scanner.nextLine();
                        System.out.print("Digite a formacão do professor: ");
                        String formacaoEdicao = scanner.nextLine();
                        controller.editarProfessor(obterIdProfessor, nomeEdicao, LocalDate.of(2024, 9, 16) , cpfEdicao, telefoneEdicao, emailEdicao, senhaEdicao, formacaoEdicao);
                    } else {
                        System.out.println("Professor não encontrado.");
                    }
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }

    }

    public void mostrarMenuAdministradores() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("Opções para Gerenciar Administradores:");
            System.out.println("1 - Adicionar administrador");
            System.out.println("2 - Remover administrador");
            System.out.println("3 - Editar administrador");
            System.out.println("0 - Voltar");

            int escolhaAdministrador = scanner.nextInt();
            scanner.nextLine();


            switch (escolhaAdministrador) {
                case 1:
                    System.out.print("Digite o nome completo do administrador: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do administrador: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o telefone do administrador: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Digite o email do administrador: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha do administrador: ");
                    String senha = scanner.nextLine();
                    System.out.print("Digite a funcao do administrador: ");
                    String funcao = scanner.nextLine();

                    controller.adicionarAdministrador(nome, cpf, email, senha);
                    break;
                case 2:
                    System.out.print("Digite o ID do administrador que deseja remover: ");
                    int idAdministrador = scanner.nextInt();
                    controller.removerProfessor(idAdministrador);
                    break;
                case 3:
                    System.out.print("Digite o ID do administrador que deseja editar: ");
                    int obterIdAdministrador = scanner.nextInt();

                    if (controller.solicitarEdicaoAdministrador(obterIdAdministrador)) {
                        System.out.print("Digite o nome completo do administrador: ");
                        String nomeEdicao = scanner.nextLine();
                        System.out.print("Digite o CPF do administrador: ");
                        String cpfEdicao = scanner.nextLine();
                        System.out.print("Digite o telefone do administrador: ");
                        String telefoneEdicao = scanner.nextLine();
                        System.out.print("Digite o email do administrador: ");
                        String emailEdicao = scanner.nextLine();
                        System.out.print("Digite a senha do administrador: ");
                        String senhaEdicao = scanner.nextLine();
                        System.out.print("Digite a função do administrador: ");
                        String funcaoEdicao = scanner.nextLine();
                        controller.editarAdministrador(obterIdAdministrador, nomeEdicao, LocalDate.of(2024, 9, 16) , cpfEdicao, telefoneEdicao, emailEdicao, senhaEdicao, funcaoEdicao);
                    } else {
                        System.out.println("Administrador não encontrado.");
                    }
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }

    public void mostrarMenuAlunos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("Opções para Gerenciar Alunos:");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Editar aluno");
            System.out.println("0 - Voltar");

            int escolhaAluno = scanner.nextInt();
            scanner.nextLine();


            switch (escolhaAluno) {
                case 1:
                    System.out.print("Digite o nome completo do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do aluno: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o telefone do aluno: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Digite o email do aluno: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a senha do aluno: ");
                    String senha = scanner.nextLine();
                    System.out.print("Digite o curso do aluno: ");
                    String curso = scanner.nextLine();
                    System.out.print("Digite o semestre do aluno: ");
                    int semestre = scanner.nextInt();

                    controller.adicionarAluno(nome, LocalDate.of(2024, 9, 16) , cpf, telefone, email, senha, curso, semestre);
                    break;
                case 2:
                    System.out.print("Digite o ID do aluno que deseja remover: ");
                    int idAluno = scanner.nextInt();
                    controller.removerAluno(idAluno);
                    break;
                case 3:
                    System.out.print("Digite o ID do aluno que deseja editar: ");
                    int obterIdAluno = scanner.nextInt();

                    if (controller.solicitarEdicaoAluno(obterIdAluno)) {
                        System.out.print("Digite o nome completo do aluno: ");
                        String nomeEdicao = scanner.nextLine();
                        System.out.print("Digite o CPF do aluno: ");
                        String cpfEdicao = scanner.nextLine();
                        System.out.print("Digite o telefone do aluno: ");
                        String telefoneEdicao = scanner.nextLine();
                        System.out.print("Digite o email do aluno: ");
                        String emailEdicao = scanner.nextLine();
                        System.out.print("Digite a senha do aluno: ");
                        String senhaEdicao = scanner.nextLine();
                        System.out.print("Digite o curso do aluno: ");
                        String cursoEdicao = scanner.nextLine();
                        System.out.print("Digite o semestre do aluno: ");
                        int semestreEdicao = scanner.nextInt();
                        controller.editarAluno(obterIdAluno, nomeEdicao, LocalDate.of(2024, 9, 16) , cpfEdicao, telefoneEdicao, emailEdicao, senhaEdicao, cursoEdicao, semestreEdicao);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }
    }
}