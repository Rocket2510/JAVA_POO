package Frames;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Cliente;
import modelo.VentasDAO;
import modelo.ClienteDAO;
import modelo.ProductoDAO;
import modelo.DetalleVentas;
import modelo.Vendedor;
import modelo.Producto;
import modelo.VendedorDAO;
import modelo.Ventas;

public class VentasForm extends javax.swing.JInternalFrame {

    VentasDAO vda = new VentasDAO();
    ClienteDAO cdao = new ClienteDAO();
    ProductoDAO pdao = new ProductoDAO();
    DetalleVentas dv = new DetalleVentas();
    Producto p = new Producto();
    Ventas v = new Ventas();
    Cliente cliente = new Cliente();
    Vendedor vendedor = new Vendedor();
    VendedorDAO vendedao = new VendedorDAO();
    
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int idp;
    int cant = 0;
    double precio = 0;
    double tpagar = 0;
    
    
    
    public VentasForm() {
        initComponents();
        this.setSize(975, 700);
        generarSerie();
        fecha();
        
    }
    
    public void fecha(){
        Calendar calendar=new GregorianCalendar();
        txtFecha.setText("" + calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.DAY_OF_MONTH));

    }
    
    public void generarSerie(){
        String serie = vda.NroSerieVentas();
        if(serie==null){
            TXTSerie.setText("0000001");
            
        } else {
            int incremento = Integer.parseInt(serie);
            incremento++;
            TXTSerie.setText("000000"+incremento);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTSerie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        btnBuscarCl = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        btnBuscarProd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JSpinner();
        txtStock = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        TotalPagar = new javax.swing.JLabel();
        txtTotalAPagar = new javax.swing.JTextField();
        btnGenerarVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sistema de Ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PUNTO DE VENTA \"SPORT STORE\"");
        jLabel1.setToolTipText("");
        jLabel1.setBounds(new java.awt.Rectangle(10, 10, 20, 10));

        jLabel2.setText("Venta de Ropa deportiva");

        TXTSerie.setEditable(false);

        jLabel3.setText("Tel: 8989-03939");

        jLabel4.setText("NRO SERIE");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgPDF/logo.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel3)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("COD: CLIENTE: ");

        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });
        txtCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodClienteKeyTyped(evt);
            }
        });

        btnBuscarCl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar (1).png"))); // NOI18N
        btnBuscarCl.setText("Buscar");
        btnBuscarCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClActionPerformed(evt);
            }
        });

        txtCliente.setEditable(false);

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("CLIENTE:");

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("COD: PRODUCTO:");

        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });
        txtCodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyTyped(evt);
            }
        });

        btnBuscarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar (1).png"))); // NOI18N
        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("PRODUCTO:");

        txtProducto.setEditable(false);

        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("PRECIO:");

        txtPrecio.setEditable(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("STOCK:");

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add (1).png"))); // NOI18N
        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("CANTIDAD:");

        txtStock.setEditable(false);

        txtFecha.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarCl)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarProd)
                    .addComponent(txtFecha))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(34, 34, 34)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(222, 222, 222))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarCl)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnBuscarProd)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto)
                    .addComponent(jLabel11)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "CODIGO", "PRODUCTO", "CANTIDAD", "PRE UNIT", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalle);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TotalPagar.setText("TOTAL A PAGAR:");

        txtTotalAPagar.setEditable(false);

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calcular (1).png"))); // NOI18N
        btnGenerarVenta.setText("GENERAR VENTA");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar (1).png"))); // NOI18N
        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarVenta)
                .addGap(80, 80, 80)
                .addComponent(TotalPagar)
                .addGap(27, 27, 27)
                .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPagar)
                    .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarVenta)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        if(!txtCodCliente.getText().equals("")){
            agregarProducto();
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar datos");
        }
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if(txtTotalAPagar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar datos");
        }else{
            guardarVenta();
            guardarDetalle();
            PDF();
            actualizarStock();
            JOptionPane.showMessageDialog(this, "La compra se realizo con Exito");
            clean();
            generarSerie();
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnBuscarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarClActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
       buscarProducto();
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void txtCodClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodClienteKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtCodClienteKeyTyped

    private void txtCodProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtCodProductoKeyTyped

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed
    public void validarNumeros(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean numero = (key >= 48 && key <= 57);
        
        if(!numero){
            evt.consume();
        }
    }
    
    public void PDF(){
        try{
            //Dar la ruta
            int id = Integer.parseInt(vda.IdVentas());
            FileOutputStream archivo;
            File file = new File ("src/Reportes/venta"+id+".pdf");
            archivo = new FileOutputStream(file);
            
            //Crear documento
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/Img/imgPDF/logo.png");
            
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Factura: "+id+"\n"+"Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n"+"\n\n");
            
            //Generar tabla
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] columnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(columnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            //Agregar en las celdas
            Encabezado.addCell(img);
            
            String nom = "SPORT STORE", telefono = "8989-03939";
            String direccion = "Juárez, Plaza La Rosa, 06600 Ciudad de México, Distrito Federal, Mexiko";
            
            Encabezado.addCell("");
            Encabezado.addCell("Empresa: " + nom + "\nTelefono: " + telefono + "\nDireccion: " + direccion);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos del cliente" + "\n\n");
            doc.add(cli);
            
            //Cliente
            PdfPTable tablaCliente = new PdfPTable(4);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);
            float[] columnaCliente = new float[]{20f, 50f, 30f, 40f};
            tablaCliente.setWidths(columnaCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("Dni", negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell cl3 = new PdfPCell(new Phrase("Direccion", negrita));
            PdfPCell cl4 = new PdfPCell(new Phrase("Estado", negrita));
            
            cl1.setBorder(0); 
            cl2.setBorder(0); 
            cl3.setBorder(0);
            cl4.setBorder(0);
            
            tablaCliente.addCell(cl1);
            tablaCliente.addCell(cl2);
            tablaCliente.addCell(cl3);
            tablaCliente.addCell(cl4);
            
            tablaCliente.addCell(cliente.getDni());
            tablaCliente.addCell(cliente.getNombres());
            tablaCliente.addCell(cliente.getDireccion());
            tablaCliente.addCell(cliente.getEstado());
            
            doc.add(tablaCliente);
            
            //Prodcuto
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);
            float[] columnaProducto = new float[]{20f, 10f, 15f, 20f};
            tablaProducto.setWidths(columnaProducto);
            tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            PdfPCell pr1 = new PdfPCell(new Phrase("Producto", negrita));
            PdfPCell pr2 = new PdfPCell(new Phrase("Cant.", negrita));
            PdfPCell pr3 = new PdfPCell(new Phrase("Precio U.", negrita));
            PdfPCell pr4 = new PdfPCell(new Phrase("Precio T.", negrita));
            
            pr1.setBorder(0); 
            pr2.setBorder(0); 
            pr3.setBorder(0);
            pr4.setBorder(0); 
            
            pr1.setBackgroundColor(BaseColor.YELLOW);
            pr2.setBackgroundColor(BaseColor.YELLOW);
            pr3.setBackgroundColor(BaseColor.YELLOW);
            pr4.setBackgroundColor(BaseColor.YELLOW);
            
            tablaProducto.addCell(pr1);
            tablaProducto.addCell(pr2);
            tablaProducto.addCell(pr3);
            tablaProducto.addCell(pr4);
            
           
            for (int i = 0; i < TablaDetalle.getRowCount(); i++){
            
                String nomp = TablaDetalle.getValueAt(i, 2).toString();
                String cantidad= TablaDetalle.getValueAt(i, 3).toString();
                String precioU = TablaDetalle.getValueAt(i, 4).toString();
                String precioT = TablaDetalle.getValueAt(i, 5).toString();


                tablaProducto.addCell(nomp);
                tablaProducto.addCell(cantidad);
                tablaProducto.addCell(precioU);
                tablaProducto.addCell(precioT);
            }
            
            doc.add(tablaProducto);
            
            
            //Informacion extra
            Paragraph totalPagar = new Paragraph();
            totalPagar.add(Chunk.NEWLINE);
            totalPagar.add("TOTAL A PAGAR:$" + tpagar);
            totalPagar.setAlignment(Element.ALIGN_RIGHT);
            doc.add(totalPagar);
            
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Cancelacion y Firma\n\n");
            firma.add("------------------------");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por su compra\n\n");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
        }catch(DocumentException | IOException e){
            System.out.println(e.toString());
        }
    }
    
    public void clean (){
        limpiarTabla();
        txtCodCliente.setText("");
        txtCliente.setText("");
        Cantidad.setValue(1);
        txtCodProducto.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtTotalAPagar.setText("");
        txtCodCliente.requestFocus();
        
    }
    
    public void limpiarTabla(){
        for(int i = 0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i--;
        }
    }
    
    public void actualizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++){
            
            idp = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            
            p = pdao.listarID(idp);
            int stockActual = p.getStock() - cant;
            
            pdao.actualizarStock(stockActual, idp);
        }
    }
    
    
    public void guardarVenta(){
        String serie = TXTSerie.getText();
        int idv = 1;
        int idc = cliente.getId();
        String fecha = txtFecha.getText();
        double monto = tpagar;
        String estado="1";
        
        
        v.setIdCliente(idc);
        v.setIdVendedor(idv);
        v.setSerie(serie); 
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vda.GuardarVentas(v);
    }
    
    public void guardarDetalle(){
        String idv=vda.IdVentas();
        int idve=Integer.parseInt(idv);
        for (int i = 0;i<TablaDetalle.getRowCount(); i++){
            idp=Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            precio=Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idp);
            dv.setCantidad(cant);
            dv.setPreVenta(precio);
            vda.GuardarDetalleVentas(dv);
            
        }
    }
    
    public void calculatTotal(){
        tpagar = 0;
        for (int i = 0; i<TablaDetalle.getRowCount(); i++){
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            precio = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            tpagar += (cant*precio);
        }
        txtTotalAPagar.setText("$"+tpagar);
    }
    
    private void agregarProducto() {
        double total = 0;
        int item = 0;
        modelo = (DefaultTableModel) TablaDetalle.getModel();
        item++;

        String nomp = txtProducto.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        cant = Integer.parseInt(Cantidad.getValue().toString());
        
        total = (cant*precio);
        int stock = Integer.parseInt(txtStock.getText());
        ArrayList lista = new ArrayList();
        
        try{
            if(stock>0){
                lista.add(item);
                lista.add(idp = p.getId());
                lista.add(nomp);
                lista.add(cant);
                lista.add(precio);
                lista.add(total);

                Object[] ob= new Object[6];
                ob[0]=lista.get(0);
                ob[1]=lista.get(1);
                ob[2]=lista.get(2);
                ob[3]=lista.get(3);
                ob[4]=lista.get(4);
                ob[5]=lista.get(5);

                modelo.addRow(ob);
                TablaDetalle.setModel(modelo);
                calculatTotal();
            }else{
                JOptionPane.showMessageDialog(this, "Stock Producto no disponible");
            }
            
        }catch(HeadlessException e){
            System.out.println(e.toString());
            
        }
        
    }
    
    public void buscarProducto(){
        int id = Integer.parseInt(txtCodProducto.getText());
        if(txtCodProducto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el codProducto");
        }else{
            p = pdao.listarID(id);
            if(p.getId() !=0){
                txtProducto.setText(p.getNombre());
                txtPrecio.setText(""+p.getPrecio());
                txtStock.setText(""+p.getStock());
            }else{
                JOptionPane.showMessageDialog(this, "Producto no registrado");
                txtCodProducto.requestFocus();
            }
        }
    }
    
    public void buscarCliente(){
        int r;
        String cod=txtCodCliente.getText();
        if(txtCodCliente.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar cod Cliente");
        }else{
            cliente = cdao.listaID(cod);
            if(cliente.getDni()!=null){
                txtCliente.setText(cliente.getNombres());
                txtCodProducto.requestFocus();
            }else{
                r=JOptionPane.showConfirmDialog(this,"Cliente No Registrado, Desea Registrar?");
                if(r==0){
                    ClienteForm cf=new  ClienteForm();
                    Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
        } 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JTextField TXTSerie;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JLabel TotalPagar;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscarCl;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalAPagar;
    // End of variables declaration//GEN-END:variables

    
    
   
}
