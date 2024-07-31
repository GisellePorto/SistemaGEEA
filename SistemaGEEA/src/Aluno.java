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
    	//metodo visualizarEstoque, onde o aluno deve ser capaz de visualizar os espacos e equipamentos disponiveis no sistema
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
