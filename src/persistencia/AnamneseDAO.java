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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import negocio.Anamnese;

public class AnamneseDAO implements IAnamneseDAO{
    //conexão com o banco de dados
    private Connection connection;
    
    //construtor
    public AnamneseDAO(){
    this.connection = new ConFactory().getConnection();
    }
    
    //métodos
    @Override
    public void adiciona(Anamnese anamnese) {
        //criando a cadeia sql para inserção de dados na tabela paciente
        String sql = "insert into anamnese" + 
                "(queixas, sintomas, tratamento_anteriores, medicamentos, infancia, rotina, vicios, hobbies, trabalho, historico_familiar, comportamento, linguaguem, humor, hipotese_diagnostica, observacao, numero_sessoes, valor_sessao, periodicidade, IdPaciente, idPsicologo)" + 
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
           //preparar o comando para inserção
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           //setando os atributos do objeto na cadeia sql
           stmt.setString(1, anamnese.getQueixas());
           stmt.setString(2, anamnese.getSintomas());
           stmt.setString(3, anamnese.getTratamentos_anteriores());
           stmt.setString(4, anamnese.getMedicamentos());
           stmt.setString(5, anamnese.getInfancia());
           stmt.setString(6, anamnese.getRotina());
           stmt.setString(7, anamnese.getVicios());
           stmt.setString(8, anamnese.getHobbies());
           stmt.setString(9, anamnese.getTrabalho());
           stmt.setString(10, anamnese.getHistorico_familiar());
           stmt.setString(11, anamnese.getComportamento());
           stmt.setString(12, anamnese.getLinguagem());
           stmt.setString(13, anamnese.getHumor());
           stmt.setString(14, anamnese.getHipotese_diagnostica());
           stmt.setString(15, anamnese.getObservacoes());
           stmt.setInt(16, anamnese.getNumero_sessoes());
           stmt.setDouble(17, anamnese.getValor_sessao());
           stmt.setString(18, anamnese.getPeriodicidade());
           stmt.setInt(19, anamnese.getIdPaciente());
           stmt.setInt(20, anamnese.getIdPsicologo());
           //executa
           stmt.execute();
           stmt.close();
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Anamnese anamnese) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void remove(Anamnese anamnese) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Anamnese> listarTodos() {
        try{
            List<Anamnese> anamneses = new ArrayList<Anamnese>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from anamnese");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                //criando o objeto Contato
                Anamnese anamnese = new Anamnese();
                anamnese.setIdAnamnese(rs.getInt("idanamnese"));
                anamnese.setQueixas(rs.getString("queixas"));
                anamnese.setSintomas(rs.getString("sintomas"));
                anamnese.setTratamentos_anteriores(rs.getString("tratamento_anteriores"));
                anamnese.setMedicamentos(rs.getString("medicamentos"));
                anamnese.setInfancia(rs.getString("infancia"));
                anamnese.setRotina(rs.getString("rotina"));
                anamnese.setVicios(rs.getString("vicios"));
                anamnese.setHobbies(rs.getString("hobbies"));
                anamnese.setTrabalho(rs.getString("trabalho"));
                anamnese.setHistorico_familiar(rs.getString("historico_familiar"));
                anamnese.setComportamento(rs.getString("comportamento"));
                anamnese.setLinguagem(rs.getString("linguaguem"));
                anamnese.setHumor(rs.getString("humor"));
                anamnese.setHipotese_diagnostica(rs.getString("hipotese_diagnostica"));
                anamnese.setObservacoes(rs.getString("observacao"));
                anamnese.setNumero_sessoes(rs.getInt("numero_sessoes"));
                anamnese.setValor_sessao(rs.getInt("valor_sessao"));
                anamnese.setPeriodicidade(rs.getString("periodicidade"));
                //adicionando o objeto à lista
                anamneses.add(anamnese);
            }
            rs.close();
            stmt.close();
            return anamneses;
            
        }catch (SQLException e){
            throw new RuntimeException (e);
        }     
    }

    @Override
    public Anamnese getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
