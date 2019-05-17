/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.*;

/**
 *
 * @author VictorMTA
 */
public class controlador_Mecanico {
    conexion con;
    
    public controlador_Mecanico(){
        this.con = new conexion();

    }
    
    
    public void nuevoMecanico( String Nombre, String ApellidoP, String ApellidoM, 
           String Telefono, String Colonia, String calle, 
           String noCasa, String email){
       try {     
           con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("insert into " + 
            "mecanico(nombre, apellido_P, apellido_M, Telefono, colonia, calle, no_casa, email)" +
            " values(?,?,?,?,?,?,?,?)"); 
            
            pstm.setString(1, Nombre);
            pstm.setString(2, ApellidoP);
            pstm.setString(3, ApellidoM);
            pstm.setString(4, Telefono);
            pstm.setString(5, Colonia);
            pstm.setString(6, calle);
            pstm.setString(7, noCasa);
            pstm.setString(8, email);
           
            
           
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
         
      }con.cerrar();
       
   }
 
    public Object [][] getDatos(){
      int x = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{      
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM mecanico ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][9];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT " +
            " idmecanico, nombre, apellido_P, apellido_M, Telefono, colonia, calle, no_casa, email  " +
            " FROM mecanico" +
            " ORDER BY idmecanico ");
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estidmecanico = res.getString("idmecanico");
            String estnombre = res.getString("nombre");
            String estapellido_P = res.getString("apellido_P");
            String estapellido_M = res.getString("apellido_M");
            String estTelefono = res.getString("Telefono");
            String estcolonia = res.getString("colonia");
            String estcalle = res.getString("calle");
            String estno_casa = res.getString("no_casa");
            String estemail = res.getString("email");
           
           
            s[i][0] = estidmecanico;            
            s[i][1] = estnombre;            
            s[i][2] = estapellido_P;
            s[i][3] = estapellido_M;
            s[i][4] = estTelefono;
            s[i][5] = estcolonia;
            s[i][6] = estcalle;
            s[i][7] = estno_casa;       
            s[i][8] = estemail;
          
            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      con.cerrar();
    return s;
    
 }
    
    
    public Object [][] getDatos2(){
      int x = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{      
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM mecanico ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][9];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT " +
            " idmecanico, nombre, apellido_P, apellido_M, Telefono, colonia, calle, no_casa, email  " +
            " FROM mecanico" +
            " ORDER BY idmecanico ");
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estidmecanico = res.getString("idmecanico");
            String estnombre = res.getString("nombre");
            String estapellido_P = res.getString("apellido_P");
            String estapellido_M = res.getString("apellido_M");
            String estTelefono = res.getString("Telefono");
            String estcolonia = res.getString("colonia");
            String estcalle = res.getString("calle");
            String estno_casa = res.getString("no_casa");
            String estemail = res.getString("email");
           
           
//            s[i][0] = estidmecanico;            
            s[i][0] = estnombre;            
            s[i][1] = estapellido_P;
            s[i][2] = estapellido_M;
            s[i][3] = estTelefono;
            s[i][4] = estcolonia;
            s[i][5] = estcalle;
            s[i][6] = estno_casa;       
            s[i][7] = estemail;
          
            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      con.cerrar();
    return s;
    
 }
    
    
    
    
      public void eliminarMecanico(String cod){  
            try {  
                con.conectar();
                PreparedStatement aaaa = con.estado().prepareStatement("DELETE FROM mecanico WHERE  idmecanico= ?");            
                aaaa.setString(1, cod);
               aaaa.execute();
                aaaa.close();            
            }catch(SQLException e){
            System.out.println(e);
            }  
            con.cerrar();
   }
      
  public void ActualizarMecanico(String Nombre, String ApellidoP, String ApellidoM, 
           String Telefono, String Colonia, String calle, 
           String noCasa, String email, int idMecanico){
       try {    
           con.conectar();
//           
       PreparedStatement pstm = con.estado().prepareStatement("update mecanico set nombre= ?, apellido_P= ?, apellido_M= ?, Telefono= ?, colonia= ?, calle= ?, no_casa= ?, email= ? where idmecanico = ?");
            pstm.setString(1, Nombre);
            pstm.setString(2, ApellidoP);
            pstm.setString(3, ApellidoM);
            pstm.setString(4, Telefono);
            pstm.setString(5, Colonia);
            pstm.setString(6, calle);
            pstm.setString(7, noCasa);
            pstm.setString(8, email);
            pstm.setInt(9, idMecanico);
            
            
            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
       con.cerrar();
   }    
      
}
