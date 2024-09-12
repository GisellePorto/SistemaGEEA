package modelo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Usuario{
    private String emailInstitucional;
    private String senha;
    private static int proximoId = 1;
    private int id;
    private String nomeCompleto;
    private String cpf;

    public Usuario() {
        this.id = gerarID();
        this.nomeCompleto = null;
        this.cpf = null;
        this.emailInstitucional = null;
        this.senha = null;
    }

    public Usuario(String nomeCompleto, String cpf, String email, String senha) {
        this.id = gerarID();
        this.setNomeCompleto(nomeCompleto);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setSenha(senha);
    }

    private static int gerarID() {
        return proximoId++;
    }

    public int getId() {
        return id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        if(nomeCompleto != null) {
            this.nomeCompleto = nomeCompleto;
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setCpf(String cpf) {
        if(cpf != null && !cpf.isEmpty()) {
            this.cpf = cpf;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        if(email != null) {
            this.emailInstitucional = email;
        }
    }

    public String getEmail() {
        return emailInstitucional;
    }

    public void setSenha(String senha) {
        if(senha != null) {
            this.senha = senha;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void alterarPessoa(){
        /*Esse método será utilizado para alterar dados de pessoa cadastrada*/
    }

    public void removerPessoa(){
        /*Esse método será utilizado para remover pessoa cadastrada */
    }

    public void realizarLogin(){
        /*Esse método será utilizado para realizar autenticação no main.java.sistema*/
    }

    public void logout(){
        /*Esse método será utilizado para sair do main.java.sistema */
    }

}