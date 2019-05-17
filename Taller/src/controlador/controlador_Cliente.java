/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import Modelo.Modelo_Cliente;
//import controlador.conexion;
import java.sql.*;
import javax.swing.RowFilter;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import java.sql.Connection;
/**
 *
 * @author VictorMTA
 */
public class controlador_Cliente {
    conexion con;
//   private Conexiondos mysql = new Conexiondos(); 
//   private String sSQL = ""; //Sentencia SQL
//   private Connection cn = mysql.conectar();

  
   
    public controlador_Cliente(){
        this.con = new conexion();
    }
    
     /*Añade un nuevo registro*/
   public void nuevocliente( String Nombre, String ApellidoP, String ApellidoM, 
           String Colonia, String Calle, String No, 
           String Cel, String Email, String Tif, 
           String Fecha, String Hora){
       try {     
           con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("insert into " + 
            "cliente(nombre, apellido_P, apellido_M, telefono, TIF, Email, colonia, calle, no, fecha, hora ) " +
            " values(?,?,?,?,?,?,?,?,?,?,?)"); 
            
            pstm.setString(1, Nombre);
            pstm.setString(2, ApellidoP);
            pstm.setString(3, ApellidoM);
            pstm.setString(4, Cel);
            pstm.setString(5, Tif);
            pstm.setString(6, Email);
            pstm.setString(7, Colonia);
            pstm.setString(8, Calle);
            pstm.setString(9, No);
            pstm.setString(10, Fecha);
            pstm.setString(11, Hora);
           
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
         
      }con.cerrar();
       
   }
   
   
    /*obtenemos todos los datos de la tabla*/
 public Object [][] getDatos(){
      int x = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{      
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM cliente ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][12];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT " +
            "id_cliente,nombre, apellido_P, apellido_M, telefono, TIF, Email, colonia, calle, no, fecha, hora  " +
            " FROM cliente" +
            " ORDER BY id_cliente ");
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estid_cliente = res.getString("id_cliente");
            String estnombre = res.getString("nombre");
            String estapellido_P = res.getString("apellido_P");
            String estapellido_M = res.getString("apellido_M");
            String esttelefono = res.getString("telefono");
            String estTIF = res.getString("TIF");
            String estEmail = res.getString("Email");
            String estcolonia = res.getString("colonia");
            String estcalle = res.getString("calle");
            String estno = res.getString("no");
            String estfecha = res.getString("fecha");
            String esthora = res.getString("hora");
               
               
            s[i][0] = estid_cliente;            
            s[i][1] = estnombre;            
            s[i][2] = estapellido_P;
            s[i][3] = estapellido_M;
            s[i][4] = esttelefono;
            s[i][5] = estTIF;
            s[i][6] = estEmail;
            s[i][7] = estcolonia;
            s[i][8] = estcalle;
            s[i][9] = estno;
            s[i][10] = estfecha;
            s[i][11] = esthora;
            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      con.cerrar();
    return s;
    
 }
   
   public void eliminarCliente(String cod){  
            try {  
                con.conectar();
                PreparedStatement aaaa = con.estado().prepareStatement("DELETE FROM cliente WHERE  id_cliente= ?");            
                aaaa.setString(1, cod);
               aaaa.execute();
                aaaa.close();            
            }catch(SQLException e){
            System.out.println(e);
            }  
            con.cerrar();
   }
   
//   public boolean ActualizarCliente(Modelo_Cliente Modelo){
//        sSQL = "update cliente set nombre= ?, apellido_P= ?, apellido_M= ?, telefono= ?, TIF= ?, Email= ?, colonia= ?, calle= ?, no= ?, fecha= ?, hora= ? where id_cliente = ?";
////             con.conectar();
//          try {
//            PreparedStatement pst = cn.prepareStatement(sSQL);
////             PreparedStatement pstm = con.estado().prepareStatement("UPDATE cliente SET"+
////            "nombre= ?"+ 
////            "apellido_P= ?"+
////            "apellido_M= ?"+
////            "telefono= ?"+
////            "TIF= ?"+
////            "Email= ?"+
////            "colonia= ?"+
////            "calle= ?"+
////            "no= ?"+
////            "fecha= ?"+
////            "hora= ?"+
////            "where id_cliente = ? ");
//            pst.setString(1, Modelo.getTxtNombre());
//            pst.setString(2, Modelo.getTxtApellidoP());
//            pst.setString(3, Modelo.getTxtApellidoM());
//            pst.setString(4, Modelo.getTxtCel());
//            pst.setString(5, Modelo.getTxtTif());
//            pst.setString(6, Modelo.getTxtEmail());
//            pst.setString(7, Modelo.getTxtColonia());
//            pst.setString(8, Modelo.getTxtCalle());
//            pst.setString(9, Modelo.getTxtNo());
//            pst.setString(10, Modelo.getTxtFecha());
//            pst.setString(11, Modelo.getTxtHora());
//            pst.setInt(12, Modelo.getid_cliente());
//     
////             pstm.setString(1, Nombre);
////            pstm.setString(2, ApellidoP);
////            pstm.setString(3, ApellidoM);
////            pstm.setString(4, Cel);
////            pstm.setString(5, Tif);
////            pstm.setString(6, Email);
////            pstm.setString(7, Colonia);
////            pstm.setString(8, Calle);
////            pstm.setString(9, No);
////            pstm.setString(10, Fecha);
////            pstm.setString(11, Hora);
////            
//            
//            
//            
////            pst.setString(1, datos.getNombre_categoria());
////            pst.setString(2, datos.getDescripcion_categoria());
////            pst.setInt(3, datos.getCod_categoria());
////            
//            
//             int N = pst.executeUpdate();
//
//            if (N != 0) {
//
//                return true;
//
//            } else {
//
//                return false;
//
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            return false;
//        }
//                  
//   }
   
   
   public void ActualizarCliente(String Nombre, String ApellidoP, String ApellidoM, 
           String Colonia, String Calle, String No, 
           String Cel, String Email, String Tif, 
           String Fecha, String Hora,int id_cliente){
       try {    
           con.conectar();
//           
       PreparedStatement pstm = con.estado().prepareStatement("update cliente set nombre= ?, apellido_P= ?, apellido_M= ?, telefono= ?, TIF= ?, Email= ?, colonia= ?, calle= ?, no= ?, fecha= ?, hora= ? where id_cliente = ?");
            pstm.setString(1, Nombre);
            pstm.setString(2, ApellidoP);
            pstm.setString(3, ApellidoM);
            pstm.setString(4, Cel);
            pstm.setString(5, Tif);
            pstm.setString(6, Email);
            pstm.setString(7, Colonia);
            pstm.setString(8, Calle);
            pstm.setString(9, No);
            pstm.setString(10, Fecha);
            pstm.setString(11, Hora);
            pstm.setInt(12, id_cliente);

            
            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
       con.cerrar();
   }
   
//   public void filtro() {
//        int columnaABuscar = 0;
//         comboFiltro.getSelectedItem() == "Codigo";
//            columnaABuscar = 1;
//       
//      
//        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
//    }
   
}
