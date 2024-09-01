package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aluno extends Usuario{
    private int matricula;

    public Aluno(String emailInstitucional, String senha, int matricula){
        super(emailInstitucional, senha);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    //metodo solicitar:
    public void solicitarEquipamento(String nome,Equipamento equipamento, LocalTime horario, LocalDate data, String descricao){
        Equipamento equipament= new Equipamento(nome,equipamento,horario,data,descricao);

//esboco da classe de solicitacao de equipamentos, onde o aluno deve ser capaz de solicitar uma reserva a ser aprovada ou nao pelo administrador
    }

    public  void solicitarReserva(Usuario usuario,Espaco espaco, LocalTime horario, LocalDate data, String descricao) {
        Reserva reserva = new Reserva(usuario, espaco, horario, data, descricao);


        //metodo visualizar: os alunos so podem ver as salas, mas nao podem solicitar reserva. independente dessa informacao, os alunos devem ser capazes
        // de visualizar todo o estoque de artefatos do sistema//

        public void visualizarEstoque( ) {

            //metodo visualizarEstoque, onde o aluno deve ser capaz de visualizar os espacos e equipamentos disponiveis no sistema
        }

        public void solicitarManutencao (Usuario usuario,String comentario,Equipamento equipamento, LocalTime horario,LocalDate data){
            SolicitarManutencao manutencao = new SolicitarManutencao(usuario,comentario,equipamento,horario,data);



        }
        //metodo solicitarManutencao, que deve permitir que o usuario solicite a manutencao de um determinado equipamento; este metodo deve se
        //comunicar com a classe Administrador**//


    }