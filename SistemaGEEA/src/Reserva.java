package model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reserva {
    private Usuario usuario;
    private Espaco espaco;
    private Equipamento equipamento;
    private LocalTime horario;
    private LocalDate data;
    private String descricao;
    private boolean aprovacao = false;
    private static ArrayList<Reserva> reservas = new ArrayList<>();



    public Reserva(Usuario usuario, Espaco espaco, LocalTime horario, LocalDate data, String descricao){
        this.usuario = usuario;
        this.espaco = espaco;
        this.horario = horario;
        this.data = data;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setEspaco(Espaco espaco){
        this.espaco = espaco;
    }

    public Espaco getEspaco(){
        return this.espaco;
    }

    public void setEquipamento(Equipamento equipamento){
        this.equipamento = equipamento;
    }

    public Equipamento getEquipamento(){
        return this.equipamento;
    }

    public void setHorario(LocalTime horario){
        this.horario = horario;
    }

    public LocalTime getHorario(){
        return this.horario;
    }

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public void confirmarReserva(boolean SouN) {
        //metodo para verificar se uma reserva esta aprovada ou nao, baseada na resposta o sistema deve aprovar e confirmar ao usuario q solicitou a reserva
    }

    public void cancelarReserva(Reserva reserva, Usuario usuario, String descricao) {
        //metodo de cancelar reserva, deve se comunicar com os adminstradores e atualizar a disponibilidade dos artefatos do estoque do sistema.
    }
}