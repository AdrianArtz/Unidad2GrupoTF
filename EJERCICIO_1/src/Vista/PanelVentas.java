/**
 * @Author: Adrián Hernández  || 2A || POO
 * TRABAJO FINAL DE ASIGNATURA|| SISTEMA DE GESTION DE INVENTARIO
 */
package Vista;
import Controlador.ControladorVehiculos;
import Controlador.ControladorVentas;
import static Vista.InterfacePrincipal.Panelcontenido;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelVentas extends javax.swing.JPanel {
    
    String list [][] = ControladorVehiculos.mostrarVehiculos();
    String valor;
    double total;
    
    public PanelVentas() throws SQLException {
        initComponents();
        mostrarProductos();
    }
    
    public PanelVentas(String tot) throws SQLException{
        initComponents();
        mostrarProductos();
        TotalPrecioTxT.setText(tot);
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    
    private void mostrarProductos() throws SQLException{
        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Producto", "Precio", "Disponibles"
        }));
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        BotonVender = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BotonInsertar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CajaTotal = new javax.swing.JPanel();
        TotalPrecioTxT = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        IdProductoObtenidoTxT = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        TablaProducto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Vehículo", "Precio", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProducto.getTableHeader().setReorderingAllowed(false);
        TablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaProductoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProducto);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 710, 240));

        BotonVender.setBackground(new java.awt.Color(18, 90, 173));
        BotonVender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonVenderMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonVenderMousePressed(evt);
            }
        });
        BotonVender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Vender");
        BotonVender.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, -1));

        add(BotonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, 30));

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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Insertar");
        BotonInsertar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, -1));

        add(BotonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, 30));

        CajaTotal.setBackground(new java.awt.Color(18, 90, 173));
        CajaTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CajaTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CajaTotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CajaTotalMouseExited(evt);
            }
        });
        CajaTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TotalPrecioTxT.setBackground(new java.awt.Color(255, 255, 255));
        TotalPrecioTxT.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        TotalPrecioTxT.setForeground(new java.awt.Color(255, 255, 255));
        TotalPrecioTxT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalPrecioTxT.setText("0.00 $");
        CajaTotal.add(TotalPrecioTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 40));

        add(CajaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 240, 60));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TOTAL");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 130, 30));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Vender Vehículo");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        IdProductoObtenidoTxT.setForeground(new java.awt.Color(102, 102, 102));
        IdProductoObtenidoTxT.setText("Ingrese el ID del Vehiculo a Vender");
        IdProductoObtenidoTxT.setBorder(null);
        IdProductoObtenidoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IdProductoObtenidoTxTMousePressed(evt);
            }
        });
        add(IdProductoObtenidoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        BotonBuscar.setBackground(new java.awt.Color(18, 90, 173));
        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBuscarMousePressed(evt);
            }
        });
        BotonBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar");
        BotonBuscar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMousePressed

    }//GEN-LAST:event_TablaProductoMousePressed

    private void BotonVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderMouseEntered
        setColor(BotonVender);
    }//GEN-LAST:event_BotonVenderMouseEntered

    private void BotonVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderMouseExited
        resetColor(BotonVender);
    }//GEN-LAST:event_BotonVenderMouseExited

    private void BotonVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVenderMousePressed
        
        valor = TotalPrecioTxT.getText();
        valor = valor.substring(0, valor.length()-2);
        total = Double.valueOf(valor);
        if (total <= 0.00) {
            JOptionPane.showMessageDialog(this, "No se puede realizar la facturacion si no se ha vendido nada. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Venta realizada con exito! por favor dirigase a Facturacion. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            TotalPrecioTxT.setText("0.00 $");
        }
        
    }//GEN-LAST:event_BotonVenderMousePressed

    private void BotonInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInsertarMouseEntered
        setColor(BotonInsertar);
    }//GEN-LAST:event_BotonInsertarMouseEntered

    private void BotonInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInsertarMouseExited
        resetColor(BotonInsertar);
    }//GEN-LAST:event_BotonInsertarMouseExited

    private void BotonInsertarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInsertarMousePressed
        int idcell = TablaProducto.getSelectedRow();
        if(idcell <= -1)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el producto a vender. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            int inf = Integer.parseInt(list[idcell][0]);
            String id = list[idcell][0];
            if(id == null || id.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Debe seleccionar el producto a vender. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                double vender;
                valor = TotalPrecioTxT.getText();
                valor = valor.substring(0, valor.length()-2);
                total = Double.valueOf(valor);
                int cantidad = 0;
                if (Integer.parseInt(list[idcell][3]) == 0) 
                {
                    JOptionPane.showMessageDialog(this, "Ya no hay disponibles de este tipo de producto. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad: "));
                } 
                if(Integer.parseInt(list[idcell][3]) >= cantidad)
                {
                    
                        vender = ControladorVentas.CalcularVenta(SOMEBITS, cantidad, vender);
                        total += vender;
                        TotalPrecioTxT.setText(total+" $");
                        ControladorFacturas.setTotal(total);
                        ControladorVentas.
                        PanelVentas pv = new PanelVentas(TotalPrecioTxT.getText());
                        mostrarContenido(pv);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "La cantidad ingresada es mayor a la cantidad disponible. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }  
            }
        }
    }//GEN-LAST:event_BotonInsertarMousePressed

    private void CajaTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaTotalMouseEntered
        setColor(CajaTotal);
    }//GEN-LAST:event_CajaTotalMouseEntered

    private void CajaTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaTotalMouseExited
        resetColor(CajaTotal);
    }//GEN-LAST:event_CajaTotalMouseExited

    private void IdProductoObtenidoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdProductoObtenidoTxTMousePressed
        if(IdProductoObtenidoTxT.getText().equals("Ingrese el ID del Producto a Vender"))
        IdProductoObtenidoTxT.setText("");
    }//GEN-LAST:event_IdProductoObtenidoTxTMousePressed

    private void BotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseEntered
        setColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseEntered

    private void BotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseExited
        resetColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseExited

    private void BotonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMousePressed

        String inf = IdProductoObtenidoTxT.getText();
        try {
            list = ControladorVentas.BuscarProducto(inf);
            TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            list,
        new String [] {
            "ID", "Producto", "Precio","Disponibles"
        }));
        } catch (SQLException ex) {
        }
  
    }//GEN-LAST:event_BotonBuscarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBuscar;
    private javax.swing.JPanel BotonInsertar;
    private javax.swing.JPanel BotonVender;
    private javax.swing.JPanel CajaTotal;
    private javax.swing.JTextField IdProductoObtenidoTxT;
    private javax.swing.JTable TablaProducto;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TotalPrecioTxT;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
