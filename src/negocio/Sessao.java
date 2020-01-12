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
public class Sessao {
    private int idSessao;
    private int idAnamnese;
    private Calendar data;
    private String queixas_paciente;
    private String plano_tratamento;
    private String diagnostico_final;
    private String resumo_sessao;
    private int evolucao;
    private int pago;
    
    //Métodos getters

    public int getIdAnamnese() {
        return idAnamnese;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public Calendar getData() {
        return data;
    }

    public String getQueixas_paciente() {
        return queixas_paciente;
    }

    public String getPlano_tratamento() {
        return plano_tratamento;
    }

    public String getDiagnostico_final() {
        return diagnostico_final;
    }

    public String getResumo_sessao() {
        return resumo_sessao;
    }

    public int getEvolucao() {
        return evolucao;
    }

    public int getPago() {
        return pago;
    }
    
    //Métodos setters
    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setQueixas_paciente(String queixas_paciente) {
        this.queixas_paciente = queixas_paciente;
    }

    public void setPlano_tratamento(String plano_tratamento) {
        this.plano_tratamento = plano_tratamento;
    }

    public void setDiagnostico_final(String diagnostico_final) {
        this.diagnostico_final = diagnostico_final;
    }

    public void setResumo_sessao(String resumo_sessao) {
        this.resumo_sessao = resumo_sessao;
    }

    public void setEvolucao(int evolucao) {
        this.evolucao = evolucao;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    
}
