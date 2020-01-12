/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;

/**
 *
 * @author peeh-
 */
public class Paciente {
    //Atributos
    private int IdPaciente;
    private String nome;
    private String cpf;
    private Calendar data_nascimento;
    private String sexo;
    private String endereco;
    private String telefone;
    private String foto;
    private String plano_saude;
    private String observacoes;
    private Calendar data_cadastro;
    
    //Métodos getter
    public int getIdPaciente() {
        return IdPaciente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFoto() {
        return foto;
    }

    public String getPlano_saude() {
        return plano_saude;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }
    
    //Métodos setters
    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
    
}
