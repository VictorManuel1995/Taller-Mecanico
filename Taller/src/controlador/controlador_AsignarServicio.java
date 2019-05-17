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
public class controlador_AsignarServicio {
    conexion con =new conexion();
    
    
    public void controlador_AsignarServicio(){
                this.con = new conexion();
    }
    
    
     public void nuevaAsignacion( String fecha_inicio, String hora_inicio, String fecha_final, 
           String hora_final, String Nombre_Servicio,String Placa_vehiculo, 
           String dueño, double Costo_total,int estado,String pieza1,int cantidad1,String pieza2,int cantidad2,String pieza3,int cantidad3,String pieza4,int cantidad4,String pieza5,int cantidad5,
           String pieza6,int cantidad6,String pieza7,int cantidad7, String mecanico_asig1,String mecanico_asig2,String mecanico_asig3,String mecanico_asig4){
       try {     
           con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("insert into " + 
            "transaccion_servicio(fecha_inicio, hora_inicio, fecha_final, hora_final, Nombre_Servicio, Placa_vehiculo, dueño, Costo_total, estado, pieza1, cantidad1, pieza2, cantidad2, pieza3, cantidad3, pieza4, cantidad4, pieza5, cantidad5, pieza6, cantidad6, pieza7, cantidad7, mecanico_asig1, mecanico_asig2, mecanico_asig3, mecanico_asig4)" +
            " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
            
         
//            String fecha_inicio	, String hora_inicio, String fecha_final, 
//           String hora_final, int id_servicio, int id_vehiculo, 
//           String dueño, double Costo_total,int estado,int pieza1,int cantidad1,int pieza2,int cantidad2,int pieza3,int cantidad3,int pieza4,int cantidad4,int pieza5,int cantidad5,
//           int pieza6,int cantidad6,int pieza7,int cantidad7, int mecanico_asig1,int mecanico_asig2,int mecanico_asig3,int mecanico_asig4
            
            
            
           pstm.setString(1, fecha_inicio);
           pstm.setString(2, hora_inicio);
           pstm.setString(3, fecha_final);
           pstm.setString(4, hora_final);
           pstm.setString(5,Nombre_Servicio);
           pstm.setString(6, Placa_vehiculo);
           pstm.setString(7, dueño);
           pstm.setDouble(8, Costo_total);
           pstm.setInt(9, estado);
           pstm.setString(10, pieza1);
           pstm.setInt(11, cantidad1);
           pstm.setString(12, pieza2);
           pstm.setInt(13, cantidad2);
           pstm.setString(14, pieza3);
           pstm.setInt(15, cantidad3);
           pstm.setString(16, pieza4);
           pstm.setInt(17, cantidad4);
           pstm.setString(18, pieza5);
           pstm.setInt(19, cantidad5);
           pstm.setString(20, pieza6);
           pstm.setInt(21, cantidad6);
           pstm.setString(22, pieza7);
           pstm.setInt(23, cantidad7);
           pstm.setString(24, mecanico_asig1);
           pstm.setString(25, mecanico_asig2);
           pstm.setString(26, mecanico_asig3);
           pstm.setString(27, mecanico_asig4);

           
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
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM transaccion_servicio ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][33];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement(
       " SELECT li.N_OT,li.fecha_inicio,li.hora_inicio,li.fecha_final,li.hora_final,li.dueño,li.Costo_total,li.estado,li.pieza1,li.cantidad1,li.pieza2,li.cantidad2,li.pieza3,li.cantidad3,li.pieza4,li.cantidad4,li.pieza5,li.cantidad5,li.pieza6,li.cantidad6,li.pieza7,li.cantidad7,li.mecanico_asig1,li.mecanico_asig2,li.mecanico_asig3,li.mecanico_asig4,e.idservicio,e.nombre_servicio,e.costo_servicio,f.id_vehiculo,f.placa,f.marca FROM transaccion_servicio li JOIN servicios e ON li.Nombre_Servicio = e.nombre_servicio JOIN vehiculo f ON li.Placa_vehiculo = f.placa ORDER BY N_OT");
       

         	
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estN_OT = res.getString("li.N_OT");
            String estfecha_inicio = res.getString("li.fecha_inicio");
            String esthora_inicio = res.getString("li.hora_inicio");
           String estfecha_final = res.getString("li.fecha_final");
            String esthora_final = res.getString("li.hora_final");
            String estdueño = res.getString("li.dueño");
            String estCosto_total = res.getString("li.Costo_total");
            String estestado = res.getString("li.estado");
            String estpieza1 = res.getString("li.pieza1");
            String estcantidad1 = res.getString("li.cantidad1");
            String estpieza2 = res.getString("li.pieza2");
            String estcantidad2 = res.getString("li.cantidad2");
            String estpieza3 = res.getString("li.pieza3");
            String estcantidad3 = res.getString("li.cantidad3");
            String estpieza4 = res.getString("li.pieza4");
            String estcantidad4 = res.getString("li.cantidad4");
            String estpieza5 = res.getString("li.pieza5");
            String estcantidad5 = res.getString("li.cantidad5");
            String estpieza6 = res.getString("li.pieza6");
            String estcantidad6 = res.getString("li.cantidad6");
            String estpieza7 = res.getString("li.pieza7");
            String estcantidad7 = res.getString("li.cantidad7");
            String estmecanico_asig1 = res.getString("li.mecanico_asig1");
            String estmecanico_asig2= res.getString("li.mecanico_asig2");
            String estmecanico_asig3 = res.getString("li.mecanico_asig3");
            String estmecanico_asig4 = res.getString("li.mecanico_asig4");
            String estidservicio = res.getString("e.idservicio");
            String estnombre_servicio = res.getString("e.nombre_servicio");
            String estcosto_servicio = res.getString("e.costo_servicio");
            String estid_vehiculo = res.getString("f.id_vehiculo");
            String estplaca = res.getString("f.placa");
            String estmarca = res.getString("f.marca");





             s[i][0] = estN_OT;
             s[i][1] = estfecha_inicio;
             s[i][2] = esthora_inicio;
             s[i][3] = estfecha_final;
             s[i][4] = esthora_final;
             s[i][5] = estdueño;
             s[i][6] = estCosto_total;
             s[i][7] = estestado;
             s[i][8] = estpieza1;
             s[i][9] = estcantidad1;
             s[i][10] = estpieza2;
             s[i][11] = estcantidad2;
             s[i][12] = estpieza3;
             s[i][13] = estcantidad3;
             s[i][14] = estpieza4;
             s[i][15] = estcantidad4;
             s[i][16] = estpieza5;
             s[i][17] = estcantidad5;
             s[i][18] = estpieza6;
             s[i][19] = estcantidad6;
             s[i][20] = estpieza7;
             s[i][21] = estcantidad7;  
             s[i][22] = estmecanico_asig1;
             s[i][23] = estmecanico_asig2;
             s[i][24] = estmecanico_asig3;
             s[i][25] = estmecanico_asig4;
             s[i][26] = estidservicio;
             s[i][27] = estnombre_servicio;
             s[i][28] = estcosto_servicio;
             s[i][29] = estid_vehiculo;
             s[i][30] = estplaca;


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
         PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM transaccion_servicio ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         con.cerrar();
      }
      
    Object[][] s = new String[x][33];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement(
       " SELECT li.N_OT,li.fecha_inicio,li.hora_inicio,li.fecha_final,li.hora_final,li.dueño,li.Costo_total,li.estado,li.pieza1,li.cantidad1,li.pieza2,li.cantidad2,li.pieza3,li.cantidad3,li.pieza4,li.cantidad4,li.pieza5,li.cantidad5,li.pieza6,li.cantidad6,li.pieza7,li.cantidad7,li.mecanico_asig1,li.mecanico_asig2,li.mecanico_asig3,li.mecanico_asig4,e.idservicio,e.nombre_servicio,e.costo_servicio,f.id_vehiculo,f.placa,f.marca FROM transaccion_servicio li JOIN servicios e ON li.Nombre_Servicio = e.nombre_servicio JOIN vehiculo f ON li.Placa_vehiculo = f.placa ORDER BY N_OT");
       

         	
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estN_OT = res.getString("li.N_OT");
            String estfecha_inicio = res.getString("li.fecha_inicio");
            String esthora_inicio = res.getString("li.hora_inicio");
           String estfecha_final = res.getString("li.fecha_final");
            String esthora_final = res.getString("li.hora_final");
            String estdueño = res.getString("li.dueño");
            String estCosto_total = res.getString("li.Costo_total");
            String estestado = res.getString("li.estado");
            String estpieza1 = res.getString("li.pieza1");
            String estcantidad1 = res.getString("li.cantidad1");
            String estpieza2 = res.getString("li.pieza2");
            String estcantidad2 = res.getString("li.cantidad2");
            String estpieza3 = res.getString("li.pieza3");
            String estcantidad3 = res.getString("li.cantidad3");
            String estpieza4 = res.getString("li.pieza4");
            String estcantidad4 = res.getString("li.cantidad4");
            String estpieza5 = res.getString("li.pieza5");
            String estcantidad5 = res.getString("li.cantidad5");
            String estpieza6 = res.getString("li.pieza6");
            String estcantidad6 = res.getString("li.cantidad6");
            String estpieza7 = res.getString("li.pieza7");
            String estcantidad7 = res.getString("li.cantidad7");
            String estmecanico_asig1 = res.getString("li.mecanico_asig1");
            String estmecanico_asig2= res.getString("li.mecanico_asig2");
            String estmecanico_asig3 = res.getString("li.mecanico_asig3");
            String estmecanico_asig4 = res.getString("li.mecanico_asig4");
            String estidservicio = res.getString("e.idservicio");
            String estnombre_servicio = res.getString("e.nombre_servicio");
            String estcosto_servicio = res.getString("e.costo_servicio");
            String estid_vehiculo = res.getString("f.id_vehiculo");
            String estplaca = res.getString("f.placa");
            String estmarca = res.getString("f.marca");

                  
             s[i][0] = estdueño;   
             s[i][1] = estplaca;
             s[i][2] = estnombre_servicio;                 
             s[i][3] = estfecha_inicio;
             s[i][4] = esthora_inicio; 
             s[i][5] = estmarca;

            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      con.cerrar();
    return s;
    
 }
      
      
       public void ActualizarAsignar_servicio(String fecha_inicio, String hora_inicio, String fecha_final, 
           String hora_final, String Nombre_Servicio,String Placa_vehiculo, 
           String dueño, double Costo_total,int estado,String pieza1,int cantidad1,String pieza2,int cantidad2,String pieza3,int cantidad3,String pieza4,int cantidad4,String pieza5,int cantidad5,
           String pieza6,int cantidad6,String pieza7,int cantidad7, String mecanico_asig1,String mecanico_asig2,String mecanico_asig3,String mecanico_asig4,int N_OT){
       try {    
           con.conectar();
//           
       PreparedStatement pstm = con.estado().prepareStatement(
      "update transaccion_servicio set fecha_inicio=?, hora_inicio=?, fecha_final=?, hora_final=?, Nombre_Servicio=?, Placa_vehiculo=?, dueño=?, Costo_total=?, estado=?, pieza1=?, cantidad1=?, pieza2=?, cantidad2=?, pieza3=?, cantidad3=?, pieza4=?, cantidad4=?, pieza5=?, cantidad5=?, pieza6=?, cantidad6=?, pieza7=?, cantidad7=?, mecanico_asig1=?, mecanico_asig2=?, mecanico_asig3=?, mecanico_asig4=? WHERE N_OT =?");
       
              pstm.setString(1, fecha_inicio);
           pstm.setString(2, hora_inicio);
           pstm.setString(3, fecha_final);
           pstm.setString(4, hora_final);
           pstm.setString(5,Nombre_Servicio);
           pstm.setString(6, Placa_vehiculo);
           pstm.setString(7, dueño);
           pstm.setDouble(8, Costo_total);
           pstm.setInt(9, estado);
           pstm.setString(10, pieza1);
           pstm.setInt(11, cantidad1);
           pstm.setString(12, pieza2);
           pstm.setInt(13, cantidad2);
           pstm.setString(14, pieza3);
           pstm.setInt(15, cantidad3);
           pstm.setString(16, pieza4);
           pstm.setInt(17, cantidad4);
           pstm.setString(18, pieza5);
           pstm.setInt(19, cantidad5);
           pstm.setString(20, pieza6);
           pstm.setInt(21, cantidad6);
           pstm.setString(22, pieza7);
           pstm.setInt(23, cantidad7);
           pstm.setString(24, mecanico_asig1);
           pstm.setString(25, mecanico_asig2);
           pstm.setString(26, mecanico_asig3);
           pstm.setString(27, mecanico_asig4);
           pstm.setInt(28, N_OT);

            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
       con.cerrar();
   }
      
      
        public void eliminarAsignacion(String cod){  
            try {  
                con.conectar();
                PreparedStatement aaaa = con.estado().prepareStatement("DELETE FROM  transaccion_servicio WHERE  N_OT= ?");            
                aaaa.setString(1, cod);
               aaaa.execute();
                aaaa.close();            
            }catch(SQLException e){
            System.out.println(e);
            }  
            con.cerrar();
   }
        
        //CONSULTAMOS LA TABLA DE SERVICIO PARA PODER RESTAR LA CANTIDAD DE PIEZAS DE LA TABLA DE REPUESTO        
       
       public void restarPiezas(){
           //SELECT id_pieza, catidad FROM `inventario` ORDER BY id_pieza
            try{    
          con.conectar();
         PreparedStatement pstm = con.estado().prepareStatement(
            "SELECT id_pieza, catidad FROM `inventario` ORDER BY id_pieza ");
         
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estid_pieza = res.getString("id_pieza");
            String estcatidad = res.getString("catidad");
           
               
               
//            s[i][0] = estid_pieza;            
//            s[i][1] = estcodigo_piez;            
//            s[i][2] = estnombre;
//            s[i][3] = estmarca;
//            s[i][4] = estcosto_pieza;
//            s[i][5] = estcatidad;
            
            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      
      con.cerrar();
    
           
       }
        
        
       
       

}
