/**
 * @Author: Adrián Hernández  || 2A || POO
 * TRABAJO FINAL DE ASIGNATURA|| SISTEMA DE GESTION DE INVENTARIO
 */
package Vista;
import static Vista.InterfacePrincipal.Panelcontenido;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import javax.swing.JPanel;

public class PanelFactura extends javax.swing.JPanel implements ItemListener{
    
    public PanelFactura() throws SQLException {
        initComponents();
        CedulaTxT.setText("");
        TelefonoTxT.setText("");
        NumeroFacturaTXT.setText("");
        ElegirDatos.addItemListener(this);
        AreaFacturaTxT.setText("");
        
    }
    
    public PanelFactura(int fact){
        initComponents();
        
        for (Facturas f : listaFacturas) 
        {
            info+= f.presentarInfo();
        }
        total = 0.00;
        AreaFacturaTxT.setText(info);
        CedulaTxT.setText("");
        TelefonoTxT.setText("");
        NumeroFacturaTXT.setText("");
        ElegirDatos.addItemListener(this);
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
            
    public void mostrarContenido(JPanel p){
        p.setSize(750, 430);
        p.setLocation(0,0);
        
        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        ElegirDatos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        CedulaTxT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        TelefonoTxT = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        NumeroFacturaTXT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaFacturaTxT = new javax.swing.JTextArea();
        BotonImprimir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ElegirDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FORMA DE PAGO", "FACTURA", "CONSUMIDOR FINAL" }));
        add(ElegirDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel1.setText("TIENDA KARITO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 40));

        jLabel3.setText("AV. EUGENIO ESPEJO Y COLLAS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 20));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Cédula");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        CedulaTxT.setForeground(new java.awt.Color(102, 102, 102));
        CedulaTxT.setText("Ingresar Cedula");
        CedulaTxT.setBorder(null);
        CedulaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CedulaTxTMousePressed(evt);
            }
        });
        add(CedulaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Télefono");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        TelefonoTxT.setForeground(new java.awt.Color(102, 102, 102));
        TelefonoTxT.setText("Ingresar Contacto");
        TelefonoTxT.setBorder(null);
        TelefonoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoTxTMousePressed(evt);
            }
        });
        add(TelefonoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 260, 10));

        NumeroFacturaTXT.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        NumeroFacturaTXT.setForeground(new java.awt.Color(153, 153, 153));
        NumeroFacturaTXT.setText("000000000");
        add(NumeroFacturaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 260, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("FACTURA #");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AreaFacturaTxT.setColumns(20);
        AreaFacturaTxT.setRows(5);
        jScrollPane2.setViewportView(AreaFacturaTxT);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 5, 270, 380));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 280, 390));

        BotonImprimir.setBackground(new java.awt.Color(18, 90, 173));
        BotonImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonImprimirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonImprimirMousePressed(evt);
            }
        });
        BotonImprimir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Imprimir");
        BotonImprimir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, -1));

        add(BotonImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CedulaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CedulaTxTMousePressed
        if(CedulaTxT.getText().equals("Ingresar Cedula"))
        CedulaTxT.setText("");
        if(TelefonoTxT.getText().equals("") || TelefonoTxT.getText() == null || TelefonoTxT.getText().equals(" "))
        TelefonoTxT.setText("Ingresar Contacto");
    }//GEN-LAST:event_CedulaTxTMousePressed

    private void TelefonoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoTxTMousePressed
        if(TelefonoTxT.getText().equals("Ingresar Contacto"))
        TelefonoTxT.setText("");
        if(CedulaTxT.getText().equals("") || CedulaTxT.getText() == null || CedulaTxT.getText().equals(" "))
        CedulaTxT.setText("Ingresar Cedula");
    }//GEN-LAST:event_TelefonoTxTMousePressed

    private void BotonImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonImprimirMouseEntered
        setColor(BotonImprimir);
    }//GEN-LAST:event_BotonImprimirMouseEntered

    private void BotonImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonImprimirMouseExited
        resetColor(BotonImprimir);
    }//GEN-LAST:event_BotonImprimirMouseExited

    private void BotonImprimirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonImprimirMousePressed
    
        if(total == 0.00)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "No has vendido nada \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
        else
        {
            String opcion = ElegirDatos.getSelectedItem().toString();
            if(TelefonoTxT.getText().equals("Ingresar Contacto") || CedulaTxT.getText().equals("Ingresar Cedula"))
            {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                CedulaTxT.requestFocus();
            }
            else
            {
                String bnFactura = NumeroFacturaTXT.getText();
                String btelefono = TelefonoTxT.getText();
                String bcedula = CedulaTxT.getText();
                if(bcedula == null || "".equals(bcedula) || btelefono == null || "".equals(btelefono))
                {
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    CedulaTxT.requestFocus();
                }
                else
                {
                    int fact = Integer.parseInt(bnFactura);
                    try 
                    {
                        ControladorFacturas.CrearFactura(fact, opcion, bcedula, btelefono);
                        PanelFactura pf = new PanelFactura(fact);
                        mostrarContenido(pf);
                    } catch (SQLException ex) {}
                }
            }   
        }
        
    }//GEN-LAST:event_BotonImprimirMousePressed
    void generarSerie() throws SQLException{
        String serie = ControladorFacturas.obtenerNumeroParaFactura();
        if (serie == null) 
        {
            NumeroFacturaTXT.setText("00000000");
        }else{
            int i = Integer.parseInt(serie);
            i++;
            NumeroFacturaTXT.setText("0000000"+i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaFacturaTxT;
    private javax.swing.JPanel BotonImprimir;
    private javax.swing.JTextField CedulaTxT;
    private javax.swing.JComboBox<String> ElegirDatos;
    private javax.swing.JLabel NumeroFacturaTXT;
    private javax.swing.JTextField TelefonoTxT;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables


    @Override
    public void itemStateChanged(ItemEvent e) {
        String opcion = ElegirDatos.getSelectedItem().toString();
        if (opcion.equals("FACTURA")) {
            CedulaTxT.setText("Ingresar Cedula");
            TelefonoTxT.setText("Ingresar Contacto");
            try {
                generarSerie();
            } catch (SQLException ex) {}
        }
        if (opcion.equals("CONSUMIDOR FINAL")) {
            CedulaTxT.setText("999999999-9");
            TelefonoTxT.setText("9999999999");
            NumeroFacturaTXT.setText("9999999");
        }
        if (opcion.equals("FORMA DE PAGO")) {
            CedulaTxT.setText("");
            TelefonoTxT.setText("");
            NumeroFacturaTXT.setText("");
        }
    }
}
