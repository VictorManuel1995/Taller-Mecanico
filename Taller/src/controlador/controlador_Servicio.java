/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VictorMTA
 */
public class controlador_Servicio {
    conexion con;
    
    public controlador_Servicio(){
        this.con = new conexion();
    }
    
    
    public void nuevoServicio( String nombre_servicio, double costo_servicio, 
         String repuesto1,String cantidad1,String repuesto2,String cantidad2,String repuesto3,String cantidad3,String repuesto4,String cantidad4
    ,String repuesto5,String cantidad5,String repuesto6,String cantidad6,String repuesto7,String cantidad7,String repuesto8,String cantidad8,String repuesto9,String cantidad9,
    String repuesto10,String cantidad10,double Costo_Sumado,double costo1,double costo2,double costo3,double costo4,double costo5,double costo6,double costo7,double costo8,double costo9,
    double costo10){
       try {     
           con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("insert into " + 
            "servicios(nombre_servicio,costo_servicio,repuesto1,cantidad1,repuesto2,cantidad2,repuesto3,cantidad3,repuesto4,cantidad4,repuesto5,cantidad5,repuesto6,cantidad6,repuesto7,cantidad7,repuesto8,cantidad8,repuesto9,cantidad9,repuesto10,cantidad10,CostoSumado,costo1,costo2,costo3,costo4,costo5,costo6,costo7,costo8,costo9,costo10) " +
            " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
            
            
            pstm.setString(1, nombre_servicio);
            pstm.setDouble(2, costo_servicio);
            pstm.setString(3, repuesto1);
            pstm.setString(4, cantidad1);
            pstm.setString(5, repuesto2);
            pstm.setString(6, cantidad2);
            pstm.setString(7, repuesto3);
            pstm.setString(8, cantidad3);
            pstm.setString(9, repuesto4);
            pstm.setString(10, cantidad4);
            pstm.setString(11, repuesto5);
            pstm.setString(12, cantidad5);
            pstm.setString(13, repuesto6);
            pstm.setString(14, cantidad6);
            pstm.setString(15, repuesto7);
            pstm.setString(16, cantidad7);
            pstm.setString(17, repuesto8);
            pstm.setString(18, cantidad8);
            pstm.setString(19, repuesto9);
            pstm.setString(20, cantidad9);
            pstm.setString(21, repuesto10);
            pstm.setString(22, cantidad10);
            pstm.setDouble(23, Costo_Sumado);
            pstm.setDouble(24, costo1);
            pstm.setDouble(25, costo2);
            pstm.setDouble(26, costo3);
            pstm.setDouble(27, costo4);
            pstm.setDouble(28, costo5);
            pstm.setDouble(29, costo6);
            pstm.setDouble(30, costo7);
            pstm.setDouble(31, costo8);
            pstm.setDouble(32, costo9);
            pstm.setDouble(33, costo10);
           
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
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM servicios ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][35];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT " +
       "idservicio,nombre_servicio,costo_servicio,repuesto1,cantidad1,repuesto2,cantidad2,repuesto3,cantidad3,repuesto4,cantidad4,repuesto5,cantidad5,repuesto6,cantidad6,repuesto7,cantidad7,repuesto8,cantidad8,repuesto9,cantidad9,repuesto10,cantidad10,CostoSumado,costo1,costo2,costo3,costo4,costo5,costo6,costo7,costo8,costo9,costo10 FROM servicios ORDER BY idservicio" );
      
       

         	
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estidservicio = res.getString("idservicio");
            String estnombre_servicio = res.getString("nombre_servicio");
            String estcosto_servicio = res.getString("costo_servicio");
           String estrepuesto1 = res.getString("repuesto1");
            String estcantidad1 = res.getString("cantidad1");
            String estrepuesto2 = res.getString("repuesto2");
            String estcantidad2 = res.getString("cantidad2");
            String estrepuesto3 = res.getString("repuesto3");
            String estcantidad3 = res.getString("cantidad3");
           String estrepuesto4 = res.getString("repuesto4");
            String estcantidad4 = res.getString("cantidad4");
            String estrepuesto5 = res.getString("repuesto5");
             String estcantidad5 = res.getString("cantidad5");
            String estrepuesto6 = res.getString("repuesto6");
            String estcantidad6 = res.getString("cantidad6");
            String estrepuesto7 = res.getString("repuesto7");
            String estcantidad7 = res.getString("cantidad7");
            String estrepuesto8 = res.getString("repuesto8");
           String estcantidad8 = res.getString("cantidad8");
            String estrepuesto9 = res.getString("repuesto9");
            String estcantidad9 = res.getString("cantidad9");
            String estrepuesto10 = res.getString("repuesto10");
           String estcantidad10 = res.getString("cantidad10");
           String estCostoSumado = res.getString("CostoSumado");
           String estcosto1 = res.getString("costo1");
           String estcosto2 = res.getString("costo2");
           String estcosto3 = res.getString("costo3");
           String estcosto4 = res.getString("costo4");
           String estcosto5 = res.getString("costo5");
           String estcosto6 = res.getString("costo6");
           String estcosto7 = res.getString("costo7");
           String estcosto8 = res.getString("costo8");
           String estcosto9 = res.getString("costo9");
           String estcosto10 = res.getString("costo10");
         

             s[i][0] = estidservicio;
             s[i][1] = estnombre_servicio;
             s[i][2] = estcosto_servicio;
             s[i][3] = estrepuesto1;
             s[i][4] = estcantidad1;
             s[i][5] = estrepuesto2;
             s[i][6] = estcantidad2;
             s[i][7] = estrepuesto3;
             s[i][8] = estcantidad3;
             s[i][9] = estrepuesto4;
             s[i][10] = estcantidad4;
             s[i][11] = estrepuesto5;
             s[i][12] = estcantidad5;
             s[i][13] = estrepuesto6;
             s[i][14] = estcantidad6;
             s[i][15] = estrepuesto7;
             s[i][16] = estcantidad7;
             s[i][17] = estrepuesto8;
             s[i][18] = estcantidad8;
             s[i][19] = estrepuesto9;
             s[i][20] = estcantidad9;
             s[i][21] = estrepuesto10;
             s[i][22] = estcantidad10;
             s[i][23] = estCostoSumado;
             s[i][24] = estcosto1;
             s[i][25] = estcosto2;
             s[i][26] = estcosto3;
             s[i][27] = estcosto4;
             s[i][28] = estcosto5;
             s[i][29] = estcosto6;
             s[i][30] = estcosto7;
             s[i][31] = estcosto8;
             s[i][32] = estcosto9;
             s[i][33] = estcosto10;
            
//    System.out.print(estnombre5);

            
//            s[i][3] = estrepuesto;
//            System.out.print(estnombre_repuesto);
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
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM servicios ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][23];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement("SELECT " +
       "idservicio,nombre_servicio,costo_servicio,repuesto1,cantidad1,repuesto2,cantidad2,repuesto3,cantidad3,repuesto4,cantidad4,repuesto5,cantidad5,repuesto6,cantidad6,repuesto7,cantidad7,repuesto8,cantidad8,repuesto9,cantidad9,repuesto10,cantidad10,CostoSumado FROM servicios ORDER BY idservicio" );
      
       

         	
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estidservicio = res.getString("idservicio");
            String estnombre_servicio = res.getString("nombre_servicio");
            String estcosto_servicio = res.getString("costo_servicio");
           String estrepuesto1 = res.getString("repuesto1");
            String estcantidad1 = res.getString("cantidad1");
            String estrepuesto2 = res.getString("repuesto2");
            String estcantidad2 = res.getString("cantidad2");
            String estrepuesto3 = res.getString("repuesto3");
            String estcantidad3 = res.getString("cantidad3");
           String estrepuesto4 = res.getString("repuesto4");
            String estcantidad4 = res.getString("cantidad4");
            String estrepuesto5 = res.getString("repuesto5");
             String estcantidad5 = res.getString("cantidad5");
            String estrepuesto6 = res.getString("repuesto6");
            String estcantidad6 = res.getString("cantidad6");
            String estrepuesto7 = res.getString("repuesto7");
            String estcantidad7 = res.getString("cantidad7");
            String estrepuesto8 = res.getString("repuesto8");
           String estcantidad8 = res.getString("cantidad8");
            String estrepuesto9 = res.getString("repuesto9");
            String estcantidad9 = res.getString("cantidad9");
            String estrepuesto10 = res.getString("repuesto10");
           String estcantidad10 = res.getString("cantidad10");
           String estCostoSumado = res.getString("CostoSumado");
           
           
         

//             s[i][0] = estidservicio;
             s[i][0] = estnombre_servicio;
             s[i][1] = "$"+estcosto_servicio;
             s[i][2] = "$"+estCostoSumado;
//             s[i][3] = estrepuesto1;
//             s[i][4] = estcantidad1;
//             s[i][5] = estrepuesto2;
//             s[i][6] = estcantidad2;
//             s[i][7] = estrepuesto3;
//             s[i][8] = estcantidad3;
//             s[i][9] = estrepuesto4;
//             s[i][10] = estcantidad4;
//             s[i][11] = estrepuesto5;
//             s[i][12] = estcantidad5;
//             s[i][13] = estrepuesto6;
//             s[i][14] = estcantidad6;
//             s[i][15] = estrepuesto7;
//             s[i][16] = estcantidad7;
//             s[i][17] = estrepuesto8;
//             s[i][18] = estcantidad8;
//             s[i][19] = estrepuesto9;
//             s[i][20] = estcantidad9;
//             s[i][21] = estrepuesto10;
//             s[i][22] = estcantidad10;
//             
            
//    System.out.print(estnombre5);

            
//            s[i][3] = estrepuesto;
//            System.out.print(estnombre_repuesto);
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      con.cerrar();
    return s;
    
 }
    
    
    

    
     public void eliminarServicio(String cod){  
            try {  
                con.conectar();
                PreparedStatement aaaa = con.estado().prepareStatement("DELETE FROM servicios WHERE  idservicio= ?");            
                aaaa.setString(1, cod);
               aaaa.execute();
                aaaa.close();            
            }catch(SQLException e){
            System.out.println(e);
            }  
            con.cerrar();
   }
    
     public void ActualizarServicio(String nombre_servicio, double costo_servicio, 
         String repuesto1,String cantidad1,String repuesto2,String cantidad2,String repuesto3,String cantidad3,String repuesto4,String cantidad4
    ,String repuesto5,String cantidad5,String repuesto6,String cantidad6,String repuesto7,String cantidad7,String repuesto8,String cantidad8,String repuesto9,String cantidad9,
    String repuesto10,String cantidad10,int id_servicio){
       try {    
           con.conectar();
//           
       PreparedStatement pstm = con.estado().prepareStatement("update servicios set nombre_servicio=?,costo_servicio= ?,repuesto1= ?,cantidad1= ?,repuesto2= ?,cantidad2= ?,repuesto3= ?,cantidad3= ?,repuesto4= ?,cantidad4= ?,repuesto5= ?,cantidad5= ?,repuesto6= ?,cantidad6= ?,repuesto7= ?,cantidad7= ?,repuesto8= ?,cantidad8= ?,repuesto9= ?,cantidad9= ?,repuesto10= ?,cantidad10= ?  WHERE  idservicio= ?");
            
       
             pstm.setString(1, nombre_servicio);
            pstm.setDouble(2, costo_servicio);
            pstm.setString(3, repuesto1);
            pstm.setString(4, cantidad1);
            pstm.setString(5, repuesto2);
            pstm.setString(6, cantidad2);
            pstm.setString(7, repuesto3);
            pstm.setString(8, cantidad3);
            pstm.setString(9, repuesto4);
            pstm.setString(10, cantidad4);
            pstm.setString(11, repuesto5);
            pstm.setString(12, cantidad5);
            pstm.setString(13, repuesto6);
            pstm.setString(14, cantidad6);
            pstm.setString(15, repuesto7);
            pstm.setString(16, cantidad7);
            pstm.setString(17, repuesto8);
            pstm.setString(18, cantidad8);
            pstm.setString(19, repuesto9);
            pstm.setString(20, cantidad9);
            pstm.setString(21, repuesto10);
            pstm.setString(22, cantidad10);
            pstm.setInt(23, id_servicio);
            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
       con.cerrar();
   }
    
    
}

