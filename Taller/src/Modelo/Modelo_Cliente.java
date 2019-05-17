/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author VictorMTA
 */
public class Modelo_Cliente {
     private int id_cliente;
    private String TxtNombre;
    private String TxtApellidoP;
    private String TxtApellidoM;
    private String TxtColonia;
    private String TxtCalle;
    private String TxtNo;
    private String TxtCel;
    private String TxtEmail;
    private String TxtTif;
    private String TxtFecha;
    private String TxtHora;
    
    public Modelo_Cliente(){
}
    
     public Modelo_Cliente(String TxtNombre, String TxtApellidoP, String TxtApellidoM, String TxtColonia, String TxtCalle, String TxtNo, String TxtCel,
             String TxtEmail, String TxtTif, String TxtFecha, String TxtHora, int id_cliente) {
        
        this.id_cliente = id_cliente;
        this.TxtNombre = TxtNombre;
        this.TxtApellidoP = TxtApellidoP;
        this.TxtApellidoM = TxtApellidoM;
        this.TxtColonia= TxtColonia;
        this.TxtCalle= TxtCalle;
        this.TxtNo= TxtNo;
        this.TxtCel= TxtCel;
        this.TxtEmail= TxtEmail;
        this.TxtTif= TxtTif;
        this.TxtFecha= TxtFecha;
        this.TxtHora= TxtHora;
        
     }
     
    public int getid_cliente() {
        return id_cliente;
    }

    public void setid_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
        
    
     public String getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(String TxtNombre) {
        this.TxtNombre = TxtNombre;
    }
    
     public String getTxtApellidoP() {
        return TxtApellidoP;
    }

    public void setTxtApellidoP(String TxtApellidoP) {
        this.TxtApellidoP = TxtApellidoP;
    }
    
     public String getTxtApellidoM() {
        return TxtApellidoM;
    }

    public void setTxtApellidoM(String TxtApellidoM) {
        this.TxtApellidoM = TxtApellidoM;
    }
    
     public String getTxtColonia() {
        return TxtColonia;
    }

    public void setTxtColonia(String TxtColonia) {
        this.TxtColonia = TxtColonia;
    }
    
     public String getTxtCalle() {
        return TxtCalle;
    }

    public void setTxtCalle(String TxtCalle) {
        this.TxtCalle = TxtCalle;
    }
    
     public String getTxtNo() {
        return TxtNo;
    }

    public void setTxtNo(String TxtNo) {
        this.TxtNo = TxtNo;
    }
    
     public String getTxtCel() {
        return TxtCel;
    }

    public void setTxtCel(String TxtCel) {
        this.TxtCel = TxtCel;
    }
    
    public String getTxtEmail() {
        return TxtEmail;
    }

    public void setTxtEmail(String TxtEmail) {
       this.TxtEmail = TxtEmail;
    }
    
    public String getTxtTif() {
        return TxtTif;
    }

    public void setTxtTif(String TxtTif) {
       this.TxtTif = TxtTif;
    }
    
    public String getTxtFecha() {
        return TxtFecha;
    }

    public void setTxtFecha(String TxtFecha) {
       this.TxtFecha = TxtFecha;
    }
    
     public String getTxtHora() {
        return TxtHora;
    }

    public void setTxtHora(String TxtHora) {
       this.TxtHora = TxtHora;
    }
}
