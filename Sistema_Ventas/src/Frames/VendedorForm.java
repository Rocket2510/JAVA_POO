package Frames;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Vendedor;
import modelo.VendedorDAO;


public class VendedorForm extends javax.swing.JInternalFrame {

    VendedorDAO dao = new VendedorDAO(); 
    
    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    
    public VendedorForm() {
        initComponents();
        this.setSize(710, 476);
        Listar();
    }
    
    public void Listar(){
        List <Vendedor> lista = dao.listar();
        modelo = (DefaultTableModel)TABLA.getModel();
        Object[] ob = new Object[6];
        
        for(int i = 0; i < lista.size(); i++){
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getDni();
            ob[2] = lista.get(i).getNombres();
            ob[3] = lista.get(i).getTelefono();
            ob[4] = lista.get(i).getEstado();
            ob[5] = lista.get(i).getUser();
            
            modelo.addRow(ob);
            
        }
        TABLA.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        cboEstado = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Modulo Vendedor");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("DNI: ");

        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("NOMBRES: ");

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("TELEFONO: ");

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("ESTADO: ");

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("USER: ");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR: ", "1", "0" }));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add (1).png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/update (1).png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete (1).png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo (1).png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(txtNombre)
                            .addComponent(txtUser)
                            .addComponent(cboEstado, 0, 207, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TABLA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombres", "Telefono", "Estado", "User"
            }
        ));
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TABLA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        LimpiarTabla();
        Listar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        LimpiarTabla();
        Listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminar();
       LimpiarTabla();
       Listar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
        LimpiarTabla();
        Listar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        int fila = TABLA.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
            id = Integer.parseInt(TABLA.getValueAt(fila, 0).toString());
            String dni = TABLA.getValueAt(fila, 1).toString();
            String nombre = TABLA.getValueAt(fila, 2).toString();
            String telefono = TABLA.getValueAt(fila, 3).toString();
            String estado = TABLA.getValueAt(fila, 4).toString();
            String user = TABLA.getValueAt(fila, 5).toString();
            
            txtDni.setText(dni);
            txtNombre.setText(nombre);
            txtTelefono.setText(telefono);
            cboEstado.setSelectedItem(estado);
            txtUser.setText(user);
        }
    }//GEN-LAST:event_TABLAMouseClicked

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        validarNumeros(evt);
        //Establecer que solo puedan ingresar 4 numeros
        if(txtDni.getText().trim().length() == 4){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Debe ingresar solo 4 digitos en este campo");
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        validarNumeros(evt);
        if(txtTelefono.getText().trim().length() == 10){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Debe ingresar solo 10 digitos en este campo");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped
    public void validarNumeros(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean numero = (key >= 48 && key <= 57);
        
        if(!numero){
            evt.consume();
        }
    }
    
    public void agregar(){
        if(txtDni.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar texto en los campos");
        }else{
            String dni = txtDni.getText();
            String nombre = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String estado = cboEstado.getSelectedItem().toString();
            String user = txtUser.getText();

            Object[] ob = new Object[5];
            ob[0] = dni;
            ob[1] = nombre;
            ob[2] = telefono;
            ob[3] = estado;
            ob[4] = user;


            dao.add(ob);
        }
    }
    
    public void actualizar(){
        int fila = TABLA.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
            
        }else{
            String dni = txtDni.getText();
            String nombre = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String estado = cboEstado.getSelectedItem().toString();
            String user = txtUser.getText();

            Object[] ob = new Object[6];
            
            ob[0] = dni;
            ob[1] = nombre;
            ob[2] = telefono;
            ob[3] = estado;
            ob[4] = user;
            ob[5] = id;
            
            dao.actualizar(ob);
        }
        
        
    }
    
    public void eliminar(){
        
        int fila = TABLA.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
            
        }else{
            
            dao.eliminar(id);
            String dni = txtDni.getText();
            String nombre = txtNombre.getText();
            String telefono = txtTelefono.getText();
            String estado = cboEstado.getSelectedItem().toString();
            String user = txtUser.getText();

            Object[] ob = new Object[6];
            ob[0] = dni;
            ob[1] = nombre;
            ob[2] = telefono;
            ob[3] = estado;
            ob[4] = user;
            ob[5] = id;
            dao.actualizar(ob);
        }
        
    }
    
    public void nuevo(){
        
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDni.setText("");
        txtUser.setText("");
        cboEstado.setSelectedItem(0);
        txtDni.requestFocus(); 
        txtUser.requestFocus();
    }
    
    public void LimpiarTabla(){
        for(int i = 0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i =- 1;   
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
