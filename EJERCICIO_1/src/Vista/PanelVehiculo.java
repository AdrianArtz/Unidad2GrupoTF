/**
 * @Author: Adrián Hernández  || 2A || POO
 * TRABAJO FINAL DE ASIGNATURA|| SISTEMA DE GESTION DE INVENTARIO
 */
package Vista;

import Controlador.ControladorIngreso;
import Controlador.ControladorVehiculos;
import Modelo.Vehiculo;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import static Vista.InterfacePrincipal.Panelcontenido;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PanelVehiculo extends javax.swing.JPanel {

    String list[][] = ControladorVehiculos.mostrarVehiculos();
    boolean userAct = ControladorIngreso.getPermiso();
    ControladorVehiculos ctrlVehiculo = new ControladorVehiculos(Vehiculo.class);

    public PanelVehiculo() {
        initComponents();
        BotonNuevo.setVisible(false);
        BotonEditar.setVisible(false);
        BotonBorrar.setVisible(false);
        mostrarVehiculos();
        ctrlVehiculo.leer(TablaProductoContenido);
        
        if (userAct == true) {
            BotonNuevo.setVisible(true);
            BotonEditar.setVisible(true);
            BotonBorrar.setVisible(true);
        } else {
            BotonNuevo.setVisible(false);
            BotonEditar.setVisible(false);
            BotonBorrar.setVisible(false);
        }
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    public void mostrarContenido(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0, 0);

        Panelcontenido.removeAll();
        Panelcontenido.add(p, BorderLayout.CENTER);
        Panelcontenido.revalidate();
        Panelcontenido.repaint();
    }

    private void mostrarVehiculos() {

        TablaProductoContenido.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "ID", "Marca", "Tipo de Vehiculo", "Color", "Matricula", "Precio", "Disponibles"
                }));
        if (TablaProductoContenido.getColumnModel().getColumnCount() > 0) {
            TablaProductoContenido.getColumnModel().getColumn(0).setPreferredWidth(20);
        }
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        idTxT = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonBorrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductoContenido = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Vehiculos Disponibles");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        idTxT.setForeground(new java.awt.Color(102, 102, 102));
        idTxT.setText("Ingrese el ID del Vehiculo a Buscar");
        idTxT.setBorder(null);
        idTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idTxTMousePressed(evt);
            }
        });
        add(idTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar");
        BotonBuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        BotonNuevo.setBackground(new java.awt.Color(18, 90, 173));
        BotonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonNuevoMousePressed(evt);
            }
        });
        BotonNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo");
        BotonNuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(BotonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 395, 80, -1));

        BotonEditar.setBackground(new java.awt.Color(18, 90, 173));
        BotonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonEditarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonEditarMousePressed(evt);
            }
        });
        BotonEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");
        BotonEditar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 395, 80, -1));

        BotonBorrar.setBackground(new java.awt.Color(18, 90, 173));
        BotonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonBorrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBorrarMousePressed(evt);
            }
        });
        BotonBorrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Borrar");
        BotonBorrar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 395, 80, -1));

        TablaProductoContenido.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        TablaProductoContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Tipo de Vehiculo", "Color", "Matricula", "Precio", "Disponibles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductoContenido.getTableHeader().setReorderingAllowed(false);
        TablaProductoContenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaProductoContenidoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductoContenido);
        if (TablaProductoContenido.getColumnModel().getColumnCount() > 0) {
            TablaProductoContenido.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 300));

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void idTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idTxTMousePressed
        if (idTxT.getText().equals("Ingrese el ID del Vehiculo a Buscar"))
            idTxT.setText("");
    }//GEN-LAST:event_idTxTMousePressed

    private void BotonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseEntered
        setColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseEntered

    private void BotonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseExited
        resetColor(BotonBuscar);
    }//GEN-LAST:event_BotonBuscarMouseExited

    private void BotonNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseEntered
        setColor(BotonNuevo);
    }//GEN-LAST:event_BotonNuevoMouseEntered

    private void BotonNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseExited
        resetColor(BotonNuevo);
    }//GEN-LAST:event_BotonNuevoMouseExited
    //ABRIR SECCIÓN
    private void BotonNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMousePressed

        PanelNuevoVehiculo p1 = new PanelNuevoVehiculo();
        mostrarContenido(p1);
    }//GEN-LAST:event_BotonNuevoMousePressed

    private void BotonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseEntered
        setColor(BotonEditar);
    }//GEN-LAST:event_BotonEditarMouseEntered

    private void BotonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseExited
        resetColor(BotonEditar);
    }//GEN-LAST:event_BotonEditarMouseExited

    private void BotonBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarMouseEntered
        setColor(BotonBorrar);
    }//GEN-LAST:event_BotonBorrarMouseEntered

    private void BotonBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarMouseExited
        resetColor(BotonBorrar);
    }//GEN-LAST:event_BotonBorrarMouseExited

    private void TablaProductoContenidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoContenidoMousePressed
        if (idTxT.getText().equals("") || idTxT.getText() == null || idTxT.getText().equals(" "))
            idTxT.setText("Ingrese el ID del Vehiculo a Buscar");
    }//GEN-LAST:event_TablaProductoContenidoMousePressed
    //BORRAR
    private void BotonBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarMousePressed

        int idcell = TablaProductoContenido.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el vehiculo a borrar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String id = list[idcell][0];
            if (id == null || id.equals("")) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar el vehiculo a borrar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Integer ID = Integer.valueOf(id);
                ControladorVehiculos.borrarVehiculo(ID);
                JOptionPane.showMessageDialog(this, "¡Vehiculo borrado exitosamente! \n", "HECHO", JOptionPane.INFORMATION_MESSAGE);
                PanelVehiculo pp = new PanelVehiculo();
                mostrarContenido(pp);

            }
        }

    }//GEN-LAST:event_BotonBorrarMousePressed
    //ABRIR SECCIÓN EDITAR
    private void BotonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMousePressed
        int idcell = TablaProductoContenido.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el vehiculo a editar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String id = list[idcell][0];
            if (id == null || id.equals("")) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar el vehiculo a editar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String bID = list[idcell][0];
                String bMarca = list[idcell][1];
                String bTipoVehiculo = list[idcell][2];
                String bColor = list[idcell][3];
                String bMatricula = list[idcell][4];
                String bPrecio = list[idcell][5];
                String bDisponibles = list[idcell][6];
                PanelNuevoVehiculo p1 = new PanelNuevoVehiculo(bID, bMarca, bTipoVehiculo, bColor, bMatricula, bPrecio, bDisponibles);
                mostrarContenido(p1);
            }
        }
    }//GEN-LAST:event_BotonEditarMousePressed
    // BUSCAR
    private void BotonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMousePressed
//
//        String inf = IdProductoObtenidoTxT.getText();
//        String lista[][] = ControladorProductos.BuscarProducto(inf);
//        TablaProductoContenido.setModel(new javax.swing.table.DefaultTableModel(
//                lista,
//                new String[]{
//                    "Marca", "Tipo de Vehiculo", "Color", "Matricula", "Precio", "Disponibles"
//                }));

    }//GEN-LAST:event_BotonBuscarMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       PanelNuevoVehiculo p1 = new PanelNuevoVehiculo();
       mostrarContenido(p1);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int seleccion = TablaProductoContenido.getSelectedRow();
        
        if (seleccion >= 0) {
            try {
                ctrlVehiculo.borrar(seleccion);
                ctrlVehiculo.leer(TablaProductoContenido);
            } catch (Exception ex) {
                Logger.getLogger(PanelVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el vehiculo a eliminar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        PanelNuevoVehiculo p1 = new PanelNuevoVehiculo();
        mostrarContenido(p1);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBorrar;
    private javax.swing.JPanel BotonBuscar;
    private javax.swing.JPanel BotonEditar;
    private javax.swing.JPanel BotonNuevo;
    private javax.swing.JTable TablaProductoContenido;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTextField idTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
