package model;
import java.time.LocalDate;
import java.time.LocalTime;

public class SolicitarManutencao {
    private Usuario usuario;
    private String comentario;
    private Equipamento equipamento;
    private LocalDate data;
    private LocalTime horario;

    public SolicitarManutencao(Usuario usuario, String comentario,Equipamento equipamento,LocalTime horario, LocalDate data){
        this.usuario = usuario;
        this.comentario = comentario;
        this.equipamento = equipamento;
        this.horario = horario;
        this.data = data;

    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String getComentario(){
        return comentario;
    }
    public LocalTime getHorario(){
        return horario;
    }
    public void setHorario(LocalTime horario ){
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
}
