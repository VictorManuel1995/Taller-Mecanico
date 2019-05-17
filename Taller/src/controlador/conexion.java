/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author VictorMTA
 */
public class conexion {
   private String usu;
    private String pass;
    private String url;
    //Atributo de tipo Conexion
    Connection con=null;

    //Constructor
     public conexion() {
        this.usu="root";
        this.pass="";
        this.url="jdbc:mysql://127.0.0.1/taller_mecanico";
        System.out.println("primera conexion");
    }
     
     //Conectar
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,
                    usu,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar");
        }
    }
   //Desconectar
    public void cerrar(){
        con=null;
    }
    //Estado de la conexión
    public Connection estado(){
        return con;
    }

    PreparedStatement prepareStatement(String sSQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
