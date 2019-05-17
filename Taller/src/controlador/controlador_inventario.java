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
public class controlador_inventario {
     conexion con;


public controlador_inventario(){
            this.con = new conexion();
}

 public void nuevaPieza( String Codigo, String Nombre, String Marca, 
         double costo,int Cantidad){
       try {     
           con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("insert into " + 
            "inventario(codigo_pieza, nombre, marca, costo_pieza, catidad) " +
            " values(?,?,?,?,?)"); 
            
            pstm.setString(1, Codigo);
            pstm.setString(2, Nombre);
            pstm.setString(3, Marca);
            pstm.setDouble(4, costo);
            pstm.setInt(5, Cantidad);
        
           
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
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM inventario ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][6];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT " +
            "id_pieza,codigo_pieza, nombre, marca, costo_pieza, catidad " +
            " FROM inventario" +
            " ORDER BY id_pieza ");
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estid_pieza = res.getString("id_pieza");
            String estcodigo_piez = res.getString("codigo_pieza");
            String estnombre = res.getString("nombre");
            String estmarca = res.getString("marca");
            String estcosto_pieza = res.getString("costo_pieza");
            String estcatidad = res.getString("catidad");
           
               
               
            s[i][0] = estid_pieza;            
            s[i][1] = estcodigo_piez;            
            s[i][2] = estnombre;
            s[i][3] = estmarca;
            s[i][4] = estcosto_pieza;
            s[i][5] = estcatidad;
            
            
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
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM inventario ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][6];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT " +
            "id_pieza,codigo_pieza, nombre, marca, costo_pieza, catidad " +
            " FROM inventario" +
            " ORDER BY id_pieza ");
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estid_pieza = res.getString("id_pieza");
            String estcodigo_piez = res.getString("codigo_pieza");
            String estnombre = res.getString("nombre");
            String estmarca = res.getString("marca");
            String estcosto_pieza = res.getString("costo_pieza");
            String estcatidad = res.getString("catidad");
           
               
               
            //s[i][0] = estid_pieza;            
            s[i][0] = estcodigo_piez;            
            s[i][1] = estnombre;
            s[i][2] = estmarca;
            s[i][3] = estcosto_pieza;
            s[i][4] = estcatidad;
            
            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      
      con.cerrar();
    return s;
    
 }
  
  
  
 public void eliminarProducto(String cod){  
            try {  
                con.conectar();
                PreparedStatement aaaa = con.estado().prepareStatement("DELETE FROM inventario WHERE  id_pieza= ?");            
                aaaa.setString(1, cod);
               aaaa.execute();
                aaaa.close();            
            }catch(SQLException e){
            System.out.println(e);
            }  
            con.cerrar();
   }
 
 
  public void ActualizarInventario(String Codigo, String Nombre, String Marca, 
         double costo,int cantidad,int id_pieza){
       try {    
           con.conectar();
//           
       PreparedStatement pstm = con.estado().prepareStatement("update inventario set codigo_pieza= ?, nombre= ?, marca= ?, costo_pieza= ?, catidad= ? where id_pieza= ?");
            pstm.setString(1, Codigo);
            pstm.setString(2, Nombre);
            pstm.setString(3, Marca);
            pstm.setDouble(4, costo);
            pstm.setInt(5, cantidad);
            pstm.setInt(6, id_pieza);
       
            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
       con.cerrar();
   }
  
}
