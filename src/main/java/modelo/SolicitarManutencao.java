package modelo;
import java.time.LocalDate;
import java.time.LocalTime;

public class SolicitarManutencao {
    private Usuario usuario;
    private String comentario;
    private Equipamento equipamento;
    private Espaco espaco;
    private LocalDate data;

    public SolicitarManutencao(Usuario usuario, String comentario, Equipamento equipamento, LocalDate data){
        this.usuario = usuario;
        this.comentario = comentario;
        this.equipamento = equipamento;
        this.data = data;

    }

    public SolicitarManutencao(Usuario usuario, String comentario, Espaco espaco, LocalDate data){
        this.usuario = usuario;
        this.comentario = comentario;
        this.espaco = espaco;
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
