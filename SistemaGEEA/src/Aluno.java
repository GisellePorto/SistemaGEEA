import java.time.LocalDateTime;

public class Aluno extends Usuario{
    private int matricula;

    public Aluno(String emailInstitucional, String senha, int matricula){
        super(emailInstitucional, senha);
        setMatricula(matricula);
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
 //metodo solicitar:    
    public void solicitarEquipamento(Equipamento equipamento, LocalDateTime horario){
    	Reserva reserva = new Reserva();
    	reserva.setEquipamento(equipamento);
    	reserva.setHorario(horario);
//esboco da classe de solicitacao de equipamentos, onde o aluno deve ser capaz de solicitar uma reserva a ser aprovada ou nao pelo administrador
    }
 /**metodo visualizar: os alunos so podem ver as salas, mas nao podem solicitar reserva. independente dessa informacao, os alunos devem ser capazes
    de visualizar todo o estoque de artefatos do sistema**/
    
    public void visualizarEstoque() {
    	
    }
}
