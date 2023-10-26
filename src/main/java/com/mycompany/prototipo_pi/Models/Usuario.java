
package com.mycompany.prototipo_pi.Models;
public class Usuario {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String dataNascimento;
    private String sexo;

    private String estadoCivil;
    public Usuario(String nome, String cpf, String telefone, String email, String sexo, String dataNascimento, String estadoCivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }
    public Usuario(){
        
    }
        public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
     public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
