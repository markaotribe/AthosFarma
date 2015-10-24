/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VIVO
 */
public class Conexao {
    
    public static Connection getConexao(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDataSource");
            Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/athosFarma;SecurityMechanism=3",
            "athoscode", // usuario
            "1234"); // senha)
            return(conexao);
            
        }catch (Exception e){
            
            return (null);
        }
    }
}
