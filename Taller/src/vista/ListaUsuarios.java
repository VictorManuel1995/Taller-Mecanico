/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Modelo_Cliente;
import controlador.controlador_Usuarios;
/**
 *
 * @author VictorMTA
 */
public class ListaUsuarios extends javax.swing.JFrame {
  int fila=-1;
    //Constructor de Clase
     controlador_Usuarios u = new controlador_Usuarios();  
     conexion con=new conexion();
    
    
   public void mostrarUsuario(){
        con.conectar();
        Object[][] dtAut;        
        String[] columNames = {"id_cliente", "nombre", "apellido_P", "apellido_M", "telefono" 
            , "Colonia", "Calle", "No_casa", "Email"};  
        // se utiliza la funcion
        dtAut = u.getDatos();
        // se colocan los datos en la tabla
        DefaultTableModel datos = new DefaultTableModel(dtAut,columNames);                        
        TablaUsuario.setModel(datos);
    }
    /**
     * Creates new form Inventario
     */
    public ListaUsuarios() {
       
        this.setLocation(350, 0);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidoP = new javax.swing.JTextField();
        TxtApellidoM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtColonia = new javax.swing.JTextField();
        TxtCalle = new javax.swing.JTextField();
        TxtNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtCel = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnAuto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE CLIENTES");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("RomanT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Usuarios");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        TxtNombre.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtNombre.setBorder(null);
        TxtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        TxtApellidoP.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtApellidoP.setBorder(null);
        TxtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoPActionPerformed(evt);
            }
        });

        TxtApellidoM.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtApellidoM.setBorder(null);
        TxtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoMActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Agency FB", 2, 18)); // NOI18N
        jLabel5.setText("Direccion y contacto");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Colonia:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Calle:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Nº");

        TxtColonia.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtColonia.setBorder(null);
        TxtColonia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtColoniaActionPerformed(evt);
            }
        });

        TxtCalle.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtCalle.setBorder(null);
        TxtCalle.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCalleActionPerformed(evt);
            }
        });

        TxtNo.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtNo.setBorder(null);
        TxtNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Cel:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setText("E-mail:");

        TxtCel.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtCel.setBorder(null);
        TxtCel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCelActionPerformed(evt);
            }
        });

        TxtEmail.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        TxtEmail.setBorder(null);
        TxtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmailActionPerformed(evt);
            }
        });

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuario);

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnNuevo.setText("Nuevo Mecanico");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 0, 0));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnAuto.setBackground(new java.awt.Color(0, 102, 204));
        BtnAuto.setText("Ingresar Auto");
        BtnAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(TxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(TxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnNuevo)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAuto)
                    .addComponent(BtnSalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoPActionPerformed

    private void TxtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoMActionPerformed

    private void TxtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtColoniaActionPerformed

    private void TxtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCalleActionPerformed

    private void TxtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNoActionPerformed

    private void TxtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCelActionPerformed

    private void TxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        String Campo1, Campo2, Campo3, Campo4, Campo5, Campo6,Campo7,Campo8,Campo9,Campo10,Campo11;
        Campo1=TxtNombre.getText();
        Campo2=TxtApellidoP.getText();
        Campo3=TxtApellidoM.getText();
        Campo4=TxtCel.getText();
        Campo5=TxtColonia.getText();
        Campo6=TxtCalle.getText();
        Campo7=TxtNo.getText();
        Campo8=TxtEmail.getText();
      
        u.nuevoUsuario(Campo1, Campo2, Campo3, Campo4, Campo5, Campo6,Campo7,Campo8);
        //id_cliente, nombre1, apellido_P2, apellido_M3, telefono4, TIF5, Email6, colonia7, calle8, no9, fecha10, hora11 
        //mostrarusuario();
       
        JOptionPane.showMessageDialog(rootPane,"Cliente ingresado");
        
        mostrarUsuario();
        
        
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       if (fila > -1){
            String codigo = String.valueOf(TablaUsuario.getValueAt(fila, 0));                        
            u.eliminarUsuario(codigo);
            mostrarUsuario();
            fila=-1;
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
       
            String Campo1, Campo2, Campo3, Campo4, Campo5, Campo6,Campo7,Campo8,Campo9,Campo10,Campo11;  
              int Campo12;
            String codigo = String.valueOf(TablaUsuario.getValueAt(fila, 0));                        

            
       Campo1=TxtNombre.getText();
        Campo2=TxtApellidoP.getText();
        Campo3=TxtApellidoM.getText();
        Campo4=TxtCel.getText();
        Campo5=TxtColonia.getText();
        Campo6=TxtCalle.getText();
        Campo7=TxtNo.getText();
        Campo8=TxtEmail.getText();
        Campo12=Integer.parseInt(codigo);
//System.out.println(codigo);
        u.ActualizarUsuario(Campo1, Campo2, Campo3, Campo4, Campo5, Campo6,Campo7,Campo8,Campo12);
         JOptionPane.showMessageDialog(rootPane,"Usuario actualizado");
     
        mostrarUsuario();        

    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
this.dispose();
    new Inicio().setVisible(true);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAutoActionPerformed

    private void TablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuarioMouseClicked
fila = TablaUsuario.rowAtPoint(evt.getPoint());                 
         if (fila > -1){                          
             TxtNombre.setText(String.valueOf(TablaUsuario.getValueAt(fila, 1)));
             TxtApellidoP.setText(String.valueOf(TablaUsuario.getValueAt(fila, 2)));
             TxtApellidoM.setText(String.valueOf(TablaUsuario.getValueAt(fila, 3)));
             TxtCel.setText(String.valueOf(TablaUsuario.getValueAt(fila, 4)));
             TxtColonia.setText(String.valueOf(TablaUsuario.getValueAt(fila, 5)));
             TxtCalle.setText(String.valueOf(TablaUsuario.getValueAt(fila, 6)));
             TxtNo.setText(String.valueOf(TablaUsuario.getValueAt(fila, 7)));
             TxtEmail.setText(String.valueOf(TablaUsuario.getValueAt(fila, 8)));
             
                  
         }
        
         
         
         
    }//GEN-LAST:event_TablaUsuarioMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 mostrarUsuario();
     
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAuto;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JTextField TxtApellidoM;
    public javax.swing.JTextField TxtApellidoP;
    private javax.swing.JTextField TxtCalle;
    private javax.swing.JTextField TxtCel;
    public javax.swing.JTextField TxtColonia;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNo;
    public javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}