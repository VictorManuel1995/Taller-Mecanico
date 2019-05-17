/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VictorMTA
 */
public class controlador_Automovil {

    conexion con;

    public controlador_Automovil() {
        this.con = new conexion();
    }

    public void nuevoAutomovil(String placa, String Nombre_Cliente, String marca, String año, String No_motor, String No_serie, String Km, String Modelo,
            String Color, String HC, String CO, String CO2, String llave_de_ruedas, String seguro_de_ruedas, String extintor, String gato, String TsAngulo, String llanta_repuesto,
            String plumilla, String T_tanque, String espejos_exterior, String faros, String antenas, String vasos, String emblema,
            String arcos, String brazos, String nablineros, String parlantes, String pisos, String parasoles, String mascaras, String bajos,
            String caja_CD, String ecualizador, String radio, String amplificador, String llavero, String marca_interior, String espejos_interior, String cabezales, String encendedor,
            String observacionExt, String observacionInt, String observacionMaletera,String NoExt) {
        try {

//           if(Codigo_libro == Codigo_libro){
//               JOptionPane.showMessageDialog(null,"el libro ya existe");
//           }
            // else {
            con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("insert into "
                    + "vehiculo(placa, Nombre_Cliente, marca, año, No_motor, No_serie, Km, Modelo, Color, HC, CO, CO2,  llave_de_ruedas, seguro_de_ruedas, extintor, gato, TsAngulo, llanta_repuesto, plumilla, T_tanque, espejos_exterior, faros, antenas, vasos, emblema, arcos, brazos, nablineros, parlantes, pisos, parasoles, mascaras, bajos, caja_CD, ecualizador, radio, amplificador, llavero, marca_interior, espejos_interior, cabezales, encendedor, observacionExt, observacionInt, observacionMaletera,NoExt) "
                    + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, placa);
            pstm.setString(2, Nombre_Cliente);
            pstm.setString(3, marca);
            pstm.setString(4, año);
            pstm.setString(5, No_motor);
            pstm.setString(6, No_serie);
            pstm.setString(7, Km);
            pstm.setString(8, Modelo);
            pstm.setString(9, Color);
            pstm.setString(10, HC);
            pstm.setString(11, CO);
            pstm.setString(12, CO2);
            pstm.setString(13, llave_de_ruedas);
            pstm.setString(14, seguro_de_ruedas);
            pstm.setString(15, extintor);
            pstm.setString(16, gato);
            pstm.setString(17, TsAngulo);
            pstm.setString(18, llanta_repuesto);
            pstm.setString(19, plumilla);
            pstm.setString(20, T_tanque);
            pstm.setString(21, espejos_exterior);
            pstm.setString(22, faros);
            pstm.setString(23, antenas);
            pstm.setString(24, vasos);
            pstm.setString(25, emblema);
            pstm.setString(26, arcos);
            pstm.setString(27, brazos);
            pstm.setString(28, nablineros);
            pstm.setString(29, parlantes);
            pstm.setString(30, pisos);
            pstm.setString(31, parasoles);
            pstm.setString(32, mascaras);
            pstm.setString(33, bajos);
            pstm.setString(34, caja_CD);
            pstm.setString(35, ecualizador);
            pstm.setString(36, radio);
            pstm.setString(37, amplificador);
            pstm.setString(38, llavero);
            pstm.setString(39, marca_interior);
            pstm.setString(40, espejos_interior);
            pstm.setString(41, cabezales);
            pstm.setString(42, encendedor);
            pstm.setString(43, observacionExt);
            pstm.setString(44, observacionInt);
            pstm.setString(45, observacionMaletera);
            pstm.setString(46, NoExt);
            
            pstm.execute();
            pstm.close();

//            JOptionPane.showMessageDialog(null,"el libro ha sido ingresado"); 
            //}         
        } catch (SQLException e) {
            System.out.println(e);
        }
        con.cerrar();
    }

    public Object[][] getDatos() {
        int x = 0;
        //obtenemos la cantidad de registros existentes en la tabla
        try {
            con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM vehiculo ");
            ResultSet res = pstm.executeQuery();
            res.next();
            x = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("primer paso");

            con.cerrar();
        }

        Object[][] s = new String[x][48];
        //realizamos la consulta sql y llenamos los datos en "Object"
        try {
            con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("SELECT "
                    + " li.id_vehiculo, placa, marca, año, No_motor, No_serie , Km , Modelo , Color, HC, CO, CO2, llave_de_ruedas, seguro_de_ruedas, extintor, gato, TsAngulo, llanta_repuesto, plumilla, T_tanque, espejos_exterior, faros, antenas, vasos, emblema, arcos, brazos, nablineros, parlantes, pisos, parasoles, mascaras, bajos, caja_CD, ecualizador, radio, amplificador, llavero, marca_interior, espejos_interior, cabezales, encendedor, observacionExt, observacionInt, observacionMaletera, NoExt, e.id_cliente,nombre"
                    + " FROM vehiculo li"
                    + " JOIN cliente e on li.Nombre_Cliente = e.nombre"
                    + " ORDER BY id_vehiculo ");

            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                String estid_vehiculo = res.getString("id_vehiculo");
                String estplaca = res.getString("placa");
                String estid_cliente = res.getString("id_cliente");
                String estmarca = res.getString("marca");
                String estaño = res.getString("año");
                String estNo_motor = res.getString("No_motor");
                String estNo_serie = res.getString("No_serie");
                String estKm = res.getString("Km");
                String estModelo = res.getString("Modelo");
                String estColor = res.getString("Color");
                String estllave_de_ruedas = res.getString("llave_de_ruedas");
                String estseguro_de_ruedas = res.getString("seguro_de_ruedas");
                String estextintor = res.getString("extintor");
                String estgato = res.getString("gato");
                String estTsAngulo = res.getString("TsAngulo");
                String estllanta_repuesto = res.getString("llanta_repuesto");
                String estplumilla = res.getString("plumilla");
                String estT_tanque = res.getString("T_tanque");
                String estespejos_exterior = res.getString("espejos_exterior");
                String estfaros = res.getString("faros");
                String estantenas = res.getString("antenas");
                String estvasos = res.getString("vasos");
                String estemblema = res.getString("emblema");
                String estarcos = res.getString("arcos");
                String estbrazos = res.getString("brazos");
                String estnablineros = res.getString("nablineros");
                String estparlantes = res.getString("parlantes");
                String estpisos = res.getString("pisos");
                String estparasoles = res.getString("parasoles");
                String estmascaras = res.getString("mascaras");
                String estbajos = res.getString("bajos");
                String estcaja_CD = res.getString("caja_CD");
                String estecualizador = res.getString("ecualizador");
                String estradio = res.getString("radio");
                String estamplificador = res.getString("amplificador");
                String estllavero = res.getString("llavero");
                String estmarca_interior = res.getString("marca_interior");
                String estespejos_interior = res.getString("espejos_interior");
                String estcabezales = res.getString("cabezales");
                String estencendedor = res.getString("encendedor");
                String estobservacionExt = res.getString("observacionExt");
                String estobservacionIntl = res.getString("observacionInt");
                String estobservacionMaletera = res.getString("observacionMaletera");
                String estNombre = res.getString("nombre");
                String estHC = res.getString("HC");
                String estCO = res.getString("CO");
                String estCO2 = res.getString("CO2");
                String estNoExt = res.getString("NoExt");

//                String valoHc;NoExt
//                vista.Automovil.txtHc.setText(estHC);

//                System.out.print(estNombre);
                
                s[i][0] = estid_vehiculo;
                s[i][1] = estplaca;
                s[i][2] = estmarca;
                s[i][3] = estaño;
                s[i][4] = estNo_motor;
                s[i][5] = estNo_serie;
                s[i][6] = estKm;
                s[i][7] = estModelo;
                s[i][8] = estColor;
                s[i][9] = estNombre;
                s[i][10] = estHC;
                s[i][11] = estCO;
                s[i][12] = estCO2;
                s[i][13] = estid_cliente;
                s[i][14] = estllave_de_ruedas;
                s[i][15] = estseguro_de_ruedas;
                s[i][16] = estextintor;
                s[i][17] = estgato;
                s[i][18] = estTsAngulo;
                s[i][19] = estllanta_repuesto;
                s[i][20] = estplumilla;
                s[i][21] = estT_tanque;
                s[i][22] = estespejos_exterior;
                s[i][23] = estfaros ;
                s[i][24] = estantenas;
                s[i][25] = estvasos;
                s[i][26] = estemblema ;
                s[i][27] = estarcos;
                s[i][28] = estbrazos;
                s[i][29] = estnablineros;
                s[i][30] = estparlantes;
                s[i][31] = estpisos;
                s[i][32] = estparasoles;
                s[i][33] = estmascaras;
                s[i][34] = estbajos;
                s[i][35] = estcaja_CD;
                s[i][36] = estecualizador;
                s[i][37] = estradio;
                s[i][38] = estamplificador;
                s[i][39] = estllavero;
                s[i][40] = estmarca_interior;
                s[i][41] = estespejos_interior;
                s[i][42] = estcabezales;
                s[i][43] = estencendedor;
                s[i][44] = estobservacionExt;
                s[i][45] = estobservacionIntl;
                s[i][46] = estobservacionMaletera;
                s[i][47] = estNoExt;


//System.out.print(estNoExt);
//            s[i][10] = estHC;
//            s[i][11] = estCO;
//            s[i][12] = estCO2;
//            s[i][10] = estllave_de_ruedas; 
//            s[i][11] = estseguro_de_ruedas;
//            s[i][12] = estextintor ;
//            s[i][13] = estgato ;
//            s[i][14] = estTsAngulo; 
//            s[i][15] = estllanta_repuesto; 
//            s[i][16] = estplumilla ;
//            s[i][17] = estT_tanque ;
//            s[i][18] = estespejos_exterior; 
//            s[i][19] = estfaros ;
//            s[i][20] = estantenas; 
//            s[i][21] = estvasos; 
//            s[i][22] = estemblema; 
//            s[i][23] = estarcos; 
//            s[i][24] = estbrazos; 
//            s[i][25] = estnablineros; 
//            s[i][26] = estparlantes ;
//            s[i][27] = estpisos ;
//            s[i][28] = estparasoles; 
//            s[i][29] = estmascaras;
//            s[i][30] = estbajos ;
//            s[i][31] = estcaja_CD; 
//            s[i][32] = estecualizador; 
//            s[i][33] = estradio ;
//            s[i][34] = estamplificador; 
//            s[i][35] = estllavero ;
//            s[i][36] = estmarca_interior; 
//            s[i][37] = estespejos_interior; 
//            s[i][38] = estcabezales ;
//            s[i][39] = estencendedor ;
//            s[i][40] = estobservacionExt; 
//            s[i][41] = estobservacionIntl; 
//            s[i][42] = estobservacionMaletera; 
//         

                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("no  paso");
        }
        con.cerrar();
        return s;

    }

    public Object[][] getDatos2() {
 int x = 0;
        //obtenemos la cantidad de registros existentes en la tabla
        try {
            con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("SELECT count(1) as total FROM vehiculo ");
            ResultSet res = pstm.executeQuery();
            res.next();
            x = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("primer paso");

            con.cerrar();
        }

        Object[][] s = new String[x][47];
        //realizamos la consulta sql y llenamos los datos en "Object"
        try {
            con.conectar();
            PreparedStatement pstm = con.estado().prepareStatement("SELECT "
                    + " li.id_vehiculo, placa, marca, año, No_motor, No_serie , Km , Modelo , Color, HC, CO, CO2, llave_de_ruedas, seguro_de_ruedas, extintor, gato, TsAngulo, llanta_repuesto, plumilla, T_tanque, espejos_exterior, faros, antenas, vasos, emblema, arcos, brazos, nablineros, parlantes, pisos, parasoles, mascaras, bajos, caja_CD, ecualizador, radio, amplificador, llavero, marca_interior, espejos_interior, cabezales, encendedor, observacionExt, observacionInt, observacionMaletera,e.id_cliente,nombre"
                    + " FROM vehiculo li"
                    + " JOIN cliente e on li.Nombre_Cliente = e.nombre"
                    + " ORDER BY id_vehiculo ");

            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                String estid_vehiculo = res.getString("id_vehiculo");
                String estplaca = res.getString("placa");
                String estid_cliente = res.getString("id_cliente");
                String estmarca = res.getString("marca");
                String estaño = res.getString("año");
                String estNo_motor = res.getString("No_motor");
                String estNo_serie = res.getString("No_serie");
                String estKm = res.getString("Km");
                String estModelo = res.getString("Modelo");
                String estColor = res.getString("Color");
                String estllave_de_ruedas = res.getString("llave_de_ruedas");
                String estseguro_de_ruedas = res.getString("seguro_de_ruedas");
                String estextintor = res.getString("extintor");
                String estgato = res.getString("gato");
                String estTsAngulo = res.getString("TsAngulo");
                String estllanta_repuesto = res.getString("llanta_repuesto");
                String estplumilla = res.getString("plumilla");
                String estT_tanque = res.getString("T_tanque");
                String estespejos_exterior = res.getString("espejos_exterior");
                String estfaros = res.getString("faros");
                String estantenas = res.getString("antenas");
                String estvasos = res.getString("vasos");
                String estemblema = res.getString("emblema");
                String estarcos = res.getString("arcos");
                String estbrazos = res.getString("brazos");
                String estnablineros = res.getString("nablineros");
                String estparlantes = res.getString("parlantes");
                String estpisos = res.getString("pisos");
                String estparasoles = res.getString("parasoles");
                String estmascaras = res.getString("mascaras");
                String estbajos = res.getString("bajos");
                String estcaja_CD = res.getString("caja_CD");
                String estecualizador = res.getString("ecualizador");
                String estradio = res.getString("radio");
                String estamplificador = res.getString("amplificador");
                String estllavero = res.getString("llavero");
                String estmarca_interior = res.getString("marca_interior");
                String estespejos_interior = res.getString("espejos_interior");
                String estcabezales = res.getString("cabezales");
                String estencendedor = res.getString("encendedor");
                String estobservacionExt = res.getString("observacionExt");
                String estobservacionIntl = res.getString("observacionInt");
                String estobservacionMaletera = res.getString("observacionMaletera");
                String estNombre = res.getString("nombre");
                String estHC = res.getString("HC");
                String estCO = res.getString("CO");
                String estCO2 = res.getString("CO2");

//                String valoHc;
//                vista.Automovil.txtHc.setText(estHC);

//                System.out.print(estNombre);
                
//                s[i][0] = estid_vehiculo;
                s[i][0] = estplaca;
                s[i][1] = estmarca;
                s[i][2] = estaño;
                s[i][3] = estNo_motor;
                s[i][4] = estNo_serie;
                s[i][5] = estKm;
                s[i][6] = estModelo;
                s[i][7] = estColor;
                s[i][8] = estNombre;
//                s[i][9] = estHC;
//                s[i][10] = estCO;
//                s[i][11] = estCO2;
//                s[i][12] = estid_cliente;
//                s[i][13] = estllave_de_ruedas;
//                s[i][14] = estseguro_de_ruedas;
//                s[i][15] = estextintor;
//                s[i][16] = estgato;
//                s[i][17] = estTsAngulo;
//                s[i][18] = estllanta_repuesto;
//                s[i][19] = estplumilla;
//                s[i][20] = estT_tanque;
//                s[i][21] = estespejos_exterior;
//                s[i][22] = estfaros ;
//                s[i][23] = estantenas;
//                s[i][24] = estvasos;
//                s[i][25] = estemblema ;
//                s[i][26] = estarcos;
//                s[i][27] = estbrazos;
//                s[i][28] = estnablineros;
//                s[i][29] = estparlantes;
//                s[i][30] = estpisos;
//                s[i][31] = estparasoles;
//                s[i][32] = estmascaras;
//                s[i][33] = estbajos;
//                s[i][34] = estcaja_CD;
//                s[i][35] = estecualizador;
//                s[i][36] = estradio;
//                s[i][37] = estamplificador;
//                s[i][38] = estllavero;
//                s[i][39] = estmarca_interior;
//                s[i][40] = estespejos_interior;
//                s[i][41] = estcabezales;
//                s[i][42] = estencendedor;
//                s[i][43] = estobservacionExt;
//                s[i][44] = estobservacionIntl;
//                s[i][45] = estobservacionMaletera;
//            s[i][10] = estHC;
//            s[i][11] = estCO;
//            s[i][12] = estCO2;
//            s[i][10] = estllave_de_ruedas; 
//            s[i][11] = estseguro_de_ruedas;
//            s[i][12] = estextintor ;
//            s[i][13] = estgato ;
//            s[i][14] = estTsAngulo; 
//            s[i][15] = estllanta_repuesto; 
//            s[i][16] = estplumilla ;
//            s[i][17] = estT_tanque ;
//            s[i][18] = estespejos_exterior; 
//            s[i][19] = estfaros ;
//            s[i][20] = estantenas; 
//            s[i][21] = estvasos; 
//            s[i][22] = estemblema; 
//            s[i][23] = estarcos; 
//            s[i][24] = estbrazos; 
//            s[i][25] = estnablineros; 
//            s[i][26] = estparlantes ;
//            s[i][27] = estpisos ;
//            s[i][28] = estparasoles; 
//            s[i][29] = estmascaras;
//            s[i][30] = estbajos ;
//            s[i][31] = estcaja_CD; 
//            s[i][32] = estecualizador; 
//            s[i][33] = estradio ;
//            s[i][34] = estamplificador; 
//            s[i][35] = estllavero ;
//            s[i][36] = estmarca_interior; 
//            s[i][37] = estespejos_interior; 
//            s[i][38] = estcabezales ;
//            s[i][39] = estencendedor ;
//            s[i][40] = estobservacionExt; 
//            s[i][41] = estobservacionIntl; 
//            s[i][42] = estobservacionMaletera; 
//         

                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("no  paso");
        }
        con.cerrar();
        return s;

}
    
 
      
  public void ActualizarAuto(String placa, String Nombre_Cliente, String marca, String año, String No_motor, String No_serie, String Km, String Modelo,
            String Color, String HC, String CO, String CO2, String llave_de_ruedas, String seguro_de_ruedas, String extintor, String gato, String TsAngulo, String llanta_repuesto,
            String plumilla, String T_tanque, String espejos_exterior, String faros, String antenas, String vasos, String emblema,
            String arcos, String brazos, String nablineros, String parlantes, String pisos, String parasoles, String mascaras, String bajos,
            String caja_CD, String ecualizador, String radio, String amplificador, String llavero, String marca_interior, String espejos_interior, String cabezales, String encendedor,
            String observacionExt, String observacionInt, String observacionMaletera,String NoExt,int id_vehiculo){
       try {    
           con.conectar();
//           
       PreparedStatement pstm = con.estado().prepareStatement("update vehiculo set placa= ?, Nombre_Cliente= ?, marca= ?, año= ?, No_motor= ?, No_serie= ? , Km= ?, Modelo= ?, Color= ?, HC= ?, CO= ?, CO2= ?, llave_de_ruedas= ?, seguro_de_ruedas= ?, extintor= ?, gato= ?, TsAngulo= ?, llanta_repuesto= ?, plumilla= ?, T_tanque= ?, espejos_exterior= ?, faros= ?, antenas= ?, vasos= ?, emblema= ?, arcos= ?, brazos= ?, nablineros= ?, parlantes= ?, pisos= ?, parasoles= ?, mascaras= ?, bajos= ?, caja_CD= ?, ecualizador= ?, radio= ?, amplificador= ?, llavero= ?, marca_interior= ?, espejos_interior= ?, cabezales= ?, encendedor= ?, observacionExt= ?, observacionInt= ?, observacionMaletera= ?, NoExt= ? where id_vehiculo= ?");
            
//       id_vehiculo, placa,id_cliente, marca, año, No_motor, No_serie , Km , Modelo , Color, HC, CO, CO2, llave_de_ruedas, seguro_de_ruedas, extintor, gato, TsAngulo, llanta_repuesto, plumilla, T_tanque, espejos_exterior, faros, antenas, vasos, emblema, arcos, brazos, nablineros, parlantes, pisos, parasoles, mascaras, bajos, caja_CD, ecualizador, radio, amplificador, llavero, marca_interior, espejos_interior, cabezales, encendedor, observacionExt, observacionInt, observacionMaletera, NoExt,
       
//            pstm.setString(1, Nombre);
//            pstm.setString(2, ApellidoP);
//            pstm.setString(3, ApellidoM);
//            pstm.setString(4, Telefono);
//            pstm.setString(5, Colonia);
//            pstm.setString(6, calle);
//            pstm.setString(7, noCasa);
//            pstm.setString(8, email);
//            pstm.setInt(9, idMecanico);
            
            
            
            
             pstm.setString(1, placa);
            pstm.setString(2, Nombre_Cliente);
            pstm.setString(3, marca);
            pstm.setString(4, año);
            pstm.setString(5, No_motor);
            pstm.setString(6, No_serie);
            pstm.setString(7, Km);
            pstm.setString(8, Modelo);
            pstm.setString(9, Color);
            pstm.setString(10, HC);
            pstm.setString(11, CO);
            pstm.setString(12, CO2);
            pstm.setString(13, llave_de_ruedas);
            pstm.setString(14, seguro_de_ruedas);
            pstm.setString(15, extintor);
            pstm.setString(16, gato);
            pstm.setString(17, TsAngulo);
            pstm.setString(18, llanta_repuesto);
            pstm.setString(19, plumilla);
            pstm.setString(20, T_tanque);
            pstm.setString(21, espejos_exterior);
            pstm.setString(22, faros);
            pstm.setString(23, antenas);
            pstm.setString(24, vasos);
            pstm.setString(25, emblema);
            pstm.setString(26, arcos);
            pstm.setString(27, brazos);
            pstm.setString(28, nablineros);
            pstm.setString(29, parlantes);
            pstm.setString(30, pisos);
            pstm.setString(31, parasoles);
            pstm.setString(32, mascaras);
            pstm.setString(33, bajos);
            pstm.setString(34, caja_CD);
            pstm.setString(35, ecualizador);
            pstm.setString(36, radio);
            pstm.setString(37, amplificador);
            pstm.setString(38, llavero);
            pstm.setString(39, marca_interior);
            pstm.setString(40, espejos_interior);
            pstm.setString(41, cabezales);
            pstm.setString(42, encendedor);
            pstm.setString(43, observacionExt);
            pstm.setString(44, observacionInt);
            pstm.setString(45, observacionMaletera);
            pstm.setString(46, NoExt);
            pstm.setInt(47, id_vehiculo);
            
            
            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
       con.cerrar();
   }    
    
     public void eliminarAuto(String cod){  
            try {  
                con.conectar();
                PreparedStatement aaaa = con.estado().prepareStatement("DELETE FROM vehiculo WHERE  id_vehiculo= ?");            
                aaaa.setString(1, cod);
               aaaa.execute();
                aaaa.close();            
            }catch(SQLException e){
            System.out.println(e);
            }  
            con.cerrar();
   }
    
}