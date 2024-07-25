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
}
