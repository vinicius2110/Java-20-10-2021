/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Casa
 */
public class Conexao {
       
    public static Connection con = null;

    public static void Conectar() {
        System.out.println("Conectando ao banco...");
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/atividade1","root","");
            
            System.out.println("Conectado.");
        
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            
        } catch(SQLException e) {
            
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
