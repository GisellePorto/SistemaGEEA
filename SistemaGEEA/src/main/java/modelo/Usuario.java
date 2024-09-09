package modelo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Usuario{
    private String emailInstitucional;
    private String senha;
    private static int proximoId = 1;
    private int id;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String cpf;

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario() {
        this.id = gerarID();
        this.nomeCompleto = null;
        this.dataNascimento = null;
        this.cpf = null;
        this.emailInstitucional = null;
        this.senha = null;
    }



    private static int gerarID() {
        return proximoId++;
    }

    public Usuario(String nomeCompleto, LocalDate dataNascimento, String cpf,  String telefone,
                   String email, String senha) {
        this.id = gerarID();
        this.setNomeCompleto(nomeCompleto);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.setEmail(emailInstitucional);
        this.setSenha(senha);
    }

    public int getId() {
        return id;
    }


    public void setNomeCompleto(String nomeCompleto) {
        if(nomeCompleto != null && !nomeCompleto.isEmpty()) {
            this.nomeCompleto = nomeCompleto;
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        if(dataNascimento != null) {
            this.dataNascimento = dataNascimento;
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }



    public void setCpf(String cpf) {
        if(cpf != null && !cpf.isEmpty()) {
            this.cpf = cpf;
        }
    }public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        if(email != null && !email.isEmpty()) {
            this.emailInstitucional = emailInstitucional;
        }
    }

    public String getEmail() {
        return emailInstitucional;
    }


    public void setSenha(String senha) {
        if(senha != null && !senha.isEmpty()) {
            this.senha = senha;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void adicionarPessoas(){
        /*Esse método será utilizado para adicionar um novo usuario*/
    }

    public void alterarPessoa(){
        /*Esse método será utilizado para alterar dados de pessoa cadastrada*/
    }

    public void removerPessoa(){
        /*Esse método será utilizado para remover pessoa cadastrada */
    }

    public void calcularIdade(){
        /*Esse método será utilizado para calcular a idade com a data de nascimento fornecida*/
    }

    public void realizarLogin(){
        /*Esse método será utilizado para realizar autenticação no main.java.sistema*/
    }

    public void logout(){
        /*Esse método será utilizado para sair do main.java.sistema */
    }

    public void adicionarReserva() {
        /*Esse método será utilizado para adicionar reserva de equipamento ou espaco*/
    }

    public void alterarReserva() {
        /*Esse método será utilizado para alterar algum dados reserva
        de equipamento ou espaco cadastrada*/
    }

    public void removerReserva() {
        /*Esse método será utilizado para remover uma reserva
        de equipamento ou espaco cadastrada*/
    }

}