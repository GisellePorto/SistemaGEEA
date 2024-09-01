package model;

import java.time.LocalTime;
import java.time.LocalDate;

public class Professor extends Usuario{
    private String loginSIGAA;


    public Professor(String emailInstitucional, String Senha, String loginSIGAA){
        super(emailInstitucional, Senha);
        this.loginSIGAA = loginSIGAA;

    }

    public String getLoginSIGAA(){
        return this.loginSIGAA;
    }

    public void setLoginSIGAA(String loginSIGAA){
        this.loginSIGAA = loginSIGAA;
    }

    public void solicitarEquipamento(String nome,Equipamento equipamento, LocalTime horario, LocalDate data, String descricao){
        Equipamento equip= new Equipamento(nome,equipamento,horario,data,descricao);

        //.confirmarReserva(reserva);
    } //metodo solicitarEquipamento que permite que o usuario do tipo professor solicitar uma reserva de equipamento a ser aprovada

    public void solicitarReserva(Usuario usuario,Espaco espaco, LocalTime horario, LocalDate data, String descricao){
        Reserva reserva = new Reserva ( usuario,espaco,horario, data, descricao);

        //confirmarReserva(reserva);
        //metodo solicitarEspaco que permite que o usuario do tipo professor solicitar uma reserva de espaco a ser aprovada
    }


    public void visualizarEstoque(Estoque estoque) {
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
    public void solicitarManutencao (Usuario usuario,String comentario,Equipamento equipamento, LocalTime horario,LocalDate data){
        SolicitarManutencao manutencao = new SolicitarManutencao(usuario,comentario,equipamento,horario,data);

        /**metodo solicitarManutencao, que deve permitir que o usuario solicite a manutencao de um determinado espaco, geralmente relacionado a limpeza; este metodo deve se
         comunicar com a classe Administrador**/

    }
}