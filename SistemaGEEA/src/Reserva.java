import java.time.LocalDateTime;

public class Reserva {
    private Usuario usuario;
    private Espaco espaco;
    private Equipamento equipamento;
    private LocalDateTime horario;
    private String descricao;
    private boolean aprovacao = false;
    
    public Reserva() {}
    
    public Reserva(String identificador, Espaco espaco, LocalDateTime horario, String descricao){
        setUsuario(usuario);
        setEspaco(espaco);
        setHorario(horario);
        setDescricao(descricao);
    }
    
    public Reserva(String identificador, Equipamento equipamento, LocalDateTime horario, String descricao){
        setUsuario(usuario);
        setEquipamento(equipamento);
        setHorario(horario);
        setDescricao(descricao);
    }
    
/**    public Reserva(Usuario usuario, Espaco espaco, Equipamento equipamento, LocalDateTime horario, String descricao){
        setUsuario(usuario);
        setEspaco(espaco);
        setEquipamento(equipamento);
        setHorario(horario);
   
    setDescricao(descricao);
    }**/ 

    
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
    
    public void taAprovado(boolean SouN) {
    	//metodo para verificar se uma reserva esta aprovada ou nao, baseada na resposta o sistema deve aprovar e confirmar ao usuario q solicitou a reserva
    }
}