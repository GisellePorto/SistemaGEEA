package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aluno extends Usuario {
    private int matricula;

    public Aluno(String emailInstitucional, String senha, int matricula) {
        super(emailInstitucional, senha);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //metodo solicitar:
    public void solicitarEquipamento(String nome, LocalTime horario, LocalDate data, String descricao) {
        Equipamento equipamento = new Equipamento(nome, horario, data, descricao);

//esboco da classe de solicitacao de equipamentos, onde o aluno deve ser capaz de solicitar uma reserva a ser aprovada ou nao pelo administrador
    }

    public void solicitarReserva(Usuario usuario, Espaco espaco, LocalTime horario, LocalDate data, String descricao) {
        Reserva reserva = new Reserva(usuario, espaco, horario, data, descricao);



        //metodo visualizar: os alunos so podem ver as salas, mas nao podem solicitar reserva. independente dessa informacao, os alunos devem ser capazes
        // de visualizar todo o estoque de artefatos do sistema//
        public void visualizaEstoque (Estoque estoque) {
            System.out.println("Espaços disponíveis:");
            for (Espaco espaco : estoque.getEspacos()) {
                System.out.println("- " + espaco.getNome());
            }

            System.out.println("\nEquipamentos disponíveis:");
            for (Equipamento equipamento : estoque.getEquipamentos()) {
                System.out.println("- " + equipamento.getNome());
            }

            //metodo visualizarEstoque, onde os professores devem ser capazes de visualizar
        }

        /**metodo solicitarManutencao, que deve permitir que o usuario solicite a manutencao de um determinado espaco, geralmente relacionado a limpeza; este metodo deve se
         comunicar com a classe Administrador**/
        public void solicitarManutencao (Usuario usuario, String comentario, Equipamento equipamento, LocalTime
        horario, LocalDate data){
            if (usuario == null || equipamento == null || comentario == null || comentario.isEmpty()) {
                throw new IllegalArgumentException("Dados insuficientes para solicitar a manutenção.");
            }
            if (horario == null || data == null) {
                throw new IllegalArgumentException("Data e horário devem ser fornecidos.");
            }

            SolicitarManutencao manutencao = new SolicitarManutencao(usuario, comentario, equipamento, horario, data);
            GerenciaManutencao gerenciaManutencao = new GerenciaManutencao();
            gerenciaManutencao.addManutencaoPendente(manutencao);

        }

    }
}