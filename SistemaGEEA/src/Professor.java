import java.time.LocalDateTime;

public class Professor extends Usuario{
    private String loginSIGAA;

    public Professor(String emailInstitucional, String Senha, String loginSIGAA){
        super(emailInstitucional, Senha);
        setLoginSIGAA(loginSIGAA);
    }

    public String getLoginSIGAA(){
        return this.loginSIGAA;
    }

    public void setLoginSIGAA(String loginSIGAA){
        this.loginSIGAA = loginSIGAA;
    }
    
    public void solicitarEquipamento(Equipamento equipamento, LocalDateTime horario, String descricao){
    	Reserva reserva = new Reserva();
    	reserva.setEquipamento(equipamento);
    	reserva.setHorario(horario);
    	//.confirmarReserva(reserva);
    } //metodo solicitarEquipamento que permite que o usuario do tipo professor solicitar uma reserva de equipamento a ser aprovada
    
    public void solicitarEspaco(Espaco espaco, LocalDateTime horario, String descricao){
    	Reserva reserva = new Reserva (this.loginSIGAA, espaco, horario, descricao);
    	reserva.setEspaco(espaco);
    	reserva.setHorario(horario);
    	//confirmarReserva(reserva);
    } //metodo solicitarEspaco que permite que o usuario do tipo professor solicitar uma reserva de espaco a ser aprovada

    public void visualizarEstoque() {
    	//metodo visualizarEstoque, onde os professores devem ser capazes de visualizar 
    }
    
    public void solicitarManutencao(Aluno aluno, Equipamento equip, String descricao) {
    	/**metodo solicitarManutencao, que deve permitir que o usuario solicite a manutencao de um determinado equipamento; este metodo deve se
    	comunicar com a classe Administrador**/
    }
    
    public void solicitarManutencao(Aluno aluno, Espaco espaco, String descricao) {
    	/**metodo solicitarManutencao, que deve permitir que o usuario solicite a manutencao de um determinado espaco, geralmente relacionado a limpeza; este metodo deve se
    	comunicar com a classe Administrador**/
    }
}