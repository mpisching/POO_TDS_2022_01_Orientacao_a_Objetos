/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package db_livros_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mpisc
 */
public class ExemploDBLivros {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estabelecerConexao();
    }
    private static Connection con = null;
    public static void estabelecerConexao() {
       try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = 
                    "jdbc:mysql://localhost:3306/db_livros?"
                    + "useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String pass = "admin";
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Sucesso na conexão! \n");
        } catch(ClassNotFoundException e) {
            System.out.println("excecao ClassNotFound...");
            e.printStackTrace();
        } catch(SQLException e) {
            System.out.println("SQL Exception... ");
            e.printStackTrace();
        } 
    }  
}
