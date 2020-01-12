/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import negocio.Psicologo;

/**
 *
 * @author peeh-
 */
public class PsicologoDAO implements IPsicologoDAO{
    //conexão com o banco de dados
    private Connection connection;
    
    //construtor
    public PsicologoDAO(){
    this.connection = new ConFactory().getConnection();
    }
    
    //métodos
    @Override
    public void adiciona(Psicologo psicologo) {
        //criando a cadeia sql para inserção de dados na tabela paciente
        String sql = "insert into psicologo" + 
                "(nome, cpf, crp, telefone, login, senha)" + 
                "values (?,?,?,?,?,?)";
        try {
           //preparar o comando para inserção
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           //setando os atributos do objeto na cadeia sql
           stmt.setString(1, psicologo.getNome());
           stmt.setString(2, psicologo.getCpf());
           stmt.setString(3, psicologo.getCrp());
           stmt.setString(4, psicologo.getTelefone());
           stmt.setString(5, psicologo.getLogin());
           stmt.setString(6, psicologo.getSenha());
           
           //executa
           stmt.execute();
           stmt.close();
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Psicologo psicologo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Psicologo psicologo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Psicologo> listarTodos() {
        try{
            List<Psicologo> psicologos = new ArrayList<Psicologo>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from psicologo");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                //criando o objeto Contato
                Psicologo psicologo = new Psicologo();
                psicologo.setIdPsicologo(rs.getInt("idpsicologo"));
                psicologo.setNome(rs.getString("nome"));
                psicologo.setCpf(rs.getString("cpf"));
                psicologo.setCrp(rs.getString("crp"));
                psicologo.setTelefone(rs.getString("telefone"));
                psicologo.setLogin(rs.getString("login"));
                psicologo.setSenha(rs.getString("senha"));
                
                //adicionando o objeto à lista
                psicologos.add(psicologo);
            }
            rs.close();
            stmt.close();
            return psicologos;
        }catch (SQLException e){
            throw new RuntimeException (e);
        }
    }

    @Override
    public Psicologo getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
