/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection; //conexão SQL para Java
import java.sql.DriverManager; //driver de conexão SQL para Java
import java.sql.SQLException; //classe para tratamento de exceções
/**
 *
 * @author peeh-
 */
public class ConFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/dbconsultorio","root","2603");
        }
        catch (SQLException excecao)  {
            throw new RuntimeException(excecao);
        }
    }
}
