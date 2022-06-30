/**
 * @Author: Adrián Hernández  || 2A || POO
 * TRABAJO FINAL DE ASIGNATURA|| SISTEMA DE GESTION DE INVENTARIO
 */
package Vista;

import Controlador.ControladorFacturas;
import Controlador.ControladorVehiculos;
import Controlador.ControladorVentas;
import static Vista.InterfacePrincipal.Panelcontenido;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelVentas extends javax.swing.JPanel {

    String list[][] = ControladorVehiculos.mostrarVehiculos2();
    double total = 0.00;
    Integer X = 0;

    public PanelVentas() {
        initComponents();
        mostrarVehiculos();
        BotonFacturar.setEnabled(false);
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    private void mostrarVehiculos() {
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "ID", "Vehículo", "Precio"
                }));
    }

    public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);

        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        BotonFacturar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        idVehiculoTxT = new javax.swing.JTextField();
        Text6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        BotonInsertar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();
        jSeparator17 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BotonFacturar.setBackground(new java.awt.Color(18, 90, 173));
        BotonFacturar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonFacturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonFacturarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonFacturarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonFacturarMousePressed(evt);
            }
        });
        BotonFacturar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Facturar");
        BotonFacturar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        add(BotonFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 230, 30));

        Title.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Title.setText("COMPRAR AUTO");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, -1));

        idVehiculoTxT.setForeground(new java.awt.Color(102, 102, 102));
        idVehiculoTxT.setText("Ingrese el ID de vehiculo");
        idVehiculoTxT.setBorder(null);
        idVehiculoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idVehiculoTxTMousePressed(evt);
            }
        });
        add(idVehiculoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("ID del Vehículo");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 10, 240));

        BotonInsertar.setBackground(new java.awt.Color(18, 90, 173));
        BotonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonInsertarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonInsertarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonInsertarMousePressed(evt);
            }
        });
        BotonInsertar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Insertar");
        BotonInsertar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, -1));

        add(BotonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, 30));

        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Vehículo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaVehiculo);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 340, 240));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonFacturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFacturarMouseEntered
        setColor(BotonFacturar);
    }//GEN-LAST:event_BotonFacturarMouseEntered

    private void BotonFacturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFacturarMouseExited
        resetColor(BotonFacturar);
    }//GEN-LAST:event_BotonFacturarMouseExited

    private void BotonFacturarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFacturarMousePressed

        if (total <= 0.00) {
            JOptionPane.showMessageDialog(this, "No se puede realizar la facturacion si no se ha vendido nada. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Venta realizada con exito! por favor dirigase a Facturacion. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            ControladorFacturas.crearFactura(ControladorVentas.getListaCompras().getLista());      
            
            PanelFacturar pF = new PanelFacturar();
            mostrarContenido(pF);
        }

    }//GEN-LAST:event_BotonFacturarMousePressed

    private void idVehiculoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idVehiculoTxTMousePressed
        if (idVehiculoTxT.getText().equals("Ingrese el tipo de vehiculo")) {
            idVehiculoTxT.setText("");
        }

    }//GEN-LAST:event_idVehiculoTxTMousePressed

    private void BotonInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInsertarMouseEntered
        setColor(BotonInsertar);
    }//GEN-LAST:event_BotonInsertarMouseEntered

    private void BotonInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInsertarMouseExited
        resetColor(BotonInsertar);
    }//GEN-LAST:event_BotonInsertarMouseExited

    private void BotonInsertarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInsertarMousePressed

        if (idVehiculoTxT.getText().equals("") || idVehiculoTxT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe insertar el id del vehiculo \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Integer ID = Integer.valueOf(idVehiculoTxT.getText());
            ControladorVentas.hacerVenta(1, ControladorVehiculos.getListaVehiculos().obtenerDato(ID));
            PanelVentas pv = new PanelVentas();
            mostrarContenido(pv);
            BotonFacturar.setEnabled(true);

        }
    }//GEN-LAST:event_BotonInsertarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonFacturar;
    private javax.swing.JPanel BotonInsertar;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTextField idVehiculoTxT;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablaVehiculo;
    // End of variables declaration//GEN-END:variables
}
