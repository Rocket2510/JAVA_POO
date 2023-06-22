package Frames;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ventas;
import modelo.VentasDAO;

public class ReportesForm extends javax.swing.JInternalFrame {
    VentasDAO vda = new VentasDAO();
    
    DefaultTableModel modelo = new DefaultTableModel();
    int id = 0;

    
    public ReportesForm() {
        initComponents();
        this.setSize(746, 293);
        listarVentas();
    }

    public void listarVentas(){
        List <Ventas> listarVentas = vda.listarVentas();
        modelo = (DefaultTableModel) TablaDetalle.getModel();
        Object[] ob = new Object[7];
        for(int i = 0; i < listarVentas.size(); i++){
            ob[0] = listarVentas.get(i).getId();
            ob[1] = listarVentas.get(i).getIdCliente();
            ob[2] = listarVentas.get(i).getIdVendedor();
            ob[3] = listarVentas.get(i).getSerie();
            ob[4] = listarVentas.get(i).getFecha();
            ob[5] = listarVentas.get(i).getMonto();
            ob[6] = listarVentas.get(i).getEstado();
            
            modelo.addRow(ob);
        }
        TablaDetalle.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        mostrarPDF = new javax.swing.JButton();

        setClosable(true);
        setTitle("Modulo Reportes");

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Ventas", "id_Cliente", "id_Vendedor", "#Serie", "Fecha", "Monto", "Estado"
            }
        ));
        TablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDetalle);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );

        mostrarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf (1).png"))); // NOI18N
        mostrarPDF.setText("venta PDF");
        mostrarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mostrarPDF)
                .addContainerGap(594, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(mostrarPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPDFActionPerformed
         PDF();
    }//GEN-LAST:event_mostrarPDFActionPerformed

    private void TablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetalleMouseClicked
        int fila = TablaDetalle.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
            id = Integer.parseInt(TablaDetalle.getValueAt(fila, 0).toString());
        }
       
    }//GEN-LAST:event_TablaDetalleMouseClicked
    
    public void PDF(){
        int fila = TablaDetalle.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
            
        }else{
            File file = new File ("src/Reportes/venta"+id+".pdf"); 
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarPDF;
    // End of variables declaration//GEN-END:variables
}
