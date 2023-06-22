package Frames;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        
        
    }
    
    public void Login(){
        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemGenerarVenta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemCliente = new javax.swing.JMenuItem();
        itemProducto = new javax.swing.JMenuItem();
        itemVendedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemReportes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setForeground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1394, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home (1).png"))); // NOI18N
        jMenu1.setText("Menu");

        itemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit (1).png"))); // NOI18N
        itemExit.setText("Salir");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        jMenu1.add(itemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ventas (1).png"))); // NOI18N
        jMenu2.setText("Ventas");

        itemGenerarVenta.setText("GenerarVenta");
        itemGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGenerarVentaActionPerformed(evt);
            }
        });
        jMenu2.add(itemGenerarVenta);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logomanten.png"))); // NOI18N
        jMenu3.setText("Mantenimiento");

        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        jMenu3.add(itemCliente);

        itemProducto.setText("Producto");
        itemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductoActionPerformed(evt);
            }
        });
        jMenu3.add(itemProducto);

        itemVendedor.setText("Vendedor");
        itemVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVendedorActionPerformed(evt);
            }
        });
        jMenu3.add(itemVendedor);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte (1).png"))); // NOI18N
        jMenu4.setText("Reportes");

        itemReportes.setText("Reporte de ventas");
        itemReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesActionPerformed(evt);
            }
        });
        jMenu4.add(itemReportes);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(VentanaPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        Login();
        this.dispose();
    }//GEN-LAST:event_itemExitActionPerformed

    private void itemGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGenerarVentaActionPerformed
        VentasForm vf=new VentasForm();
        CentrarVentana(vf);
    }//GEN-LAST:event_itemGenerarVentaActionPerformed

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        ClienteForm cf=new ClienteForm();
        CentrarVentana(cf);
    }//GEN-LAST:event_itemClienteActionPerformed

    private void itemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductoActionPerformed
        ProductoForm pf=new ProductoForm();
        CentrarVentana(pf);
    }//GEN-LAST:event_itemProductoActionPerformed

    private void itemVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVendedorActionPerformed
        VendedorForm vf=new VendedorForm();
        CentrarVentana(vf);
    }//GEN-LAST:event_itemVendedorActionPerformed

    private void itemReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesActionPerformed
        ReportesForm rf = new ReportesForm();
        CentrarVentana(rf);
    }//GEN-LAST:event_itemReportesActionPerformed
    
    public void CentrarVentana(JInternalFrame frame) {
        VentanaPrincipal.add(frame);
        Dimension dimension=VentanaPrincipal.getSize();
        Dimension Dframe=frame.getSize();
        frame.setLocation((dimension.width -Dframe.height)/2,(dimension.height -Dframe.height)/2);
        frame.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuItem itemGenerarVenta;
    private javax.swing.JMenuItem itemProducto;
    private javax.swing.JMenuItem itemReportes;
    private javax.swing.JMenuItem itemVendedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
