/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author peeh-
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import negocio.Sessao;

public class SessaoDAO implements ISessaoDAO{
    //conexão com o banco de dados
    private Connection connection;
    
    //construtor
    public SessaoDAO(){
    this.connection = new ConFactory().getConnection();
    }
    
    //métodos
    @Override
    public void adiciona(Sessao sessao) {
        //criando a cadeia sql para inserção de dados na tabela paciente
        String sql = "insert into sessao" + 
                "(data, queixas_paciente, plano_tratamento, diagnostico_final, resumo_sessao, evolucao, pago, idAnamnese)" + 
                "values (?,?,?,?,?,?,?,?)";
        try {
           //preparar o comando para inserção
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           //setando os atributos do objeto na cadeia sql
           stmt.setDate(1, new Date(sessao.getData().getTimeInMillis()));
           stmt.setString(2, sessao.getQueixas_paciente());
           stmt.setString(3, sessao.getPlano_tratamento());
           stmt.setString(4, sessao.getDiagnostico_final());
           stmt.setString(5, sessao.getResumo_sessao());
           stmt.setInt(6, sessao.getEvolucao());
           stmt.setInt(7, sessao.getPago());
           stmt.setInt(8, sessao.getIdAnamnese()); 
           //executa
           stmt.execute();
           stmt.close();
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Sessao sessao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Sessao sessao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sessao> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sessao getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
