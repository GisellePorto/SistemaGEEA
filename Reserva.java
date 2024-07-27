import java.time.LocalDateTime;

public class Reserva {
    private Usuario usuario;
    private Espaco espaco;
    private Equipamento equipamento;
    private LocalDateTime horario;

    public Reserva(Usuario usuario, Espaco espaco, Equipamento equipamento, LocalDateTime horario){
        setUsuario(usuario);
        setEspaco(espaco);
        setEquipamento(equipamento);
        setHorario(horario);
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return this.usuario;
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

    public void setHorario(LocalDateTime horario){
        this.horario = horario;
    }

    public LocalDateTime getHorario(){
        return this.horario;
    }
}
