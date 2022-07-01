// @Created by: Hilary Calva | Thais Cartuche | Ronald Cuenca | Karen Gonzaga | Adrián Hernández
package Vista;

import Controlador.ControladorIngreso;
import Controlador.ControladorVehiculos;
import Modelo.Vehiculo;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import static Vista.InterfacePrincipal.Panelcontenido;
import controlador.tda.lista.exception.PosicionException;
import javax.swing.JOptionPane;

public class PanelVehiculo extends javax.swing.JPanel {

    private ControladorVehiculos CV = new ControladorVehiculos(Vehiculo.class);
    boolean userAct = ControladorIngreso.getPermiso();
    String[][] list;

    public PanelVehiculo() throws PosicionException {

        initComponents();
        CV.leer(tablaVehiculo);
        BotonNuevo.setVisible(false);
        BotonEditar.setVisible(false);
        BotonBorrar.setVisible(false);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonBorrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculo = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("CRUD VEHÍCULOS");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, -1));

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

        tablaVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaVehiculo.getTableHeader().setReorderingAllowed(false);
        tablaVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaVehiculoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVehiculo);
        if (tablaVehiculo.getColumnModel().getColumnCount() > 0) {
            tablaVehiculo.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 750, 300));
    }// </editor-fold>//GEN-END:initComponents

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

    private void tablaVehiculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVehiculoMousePressed

    }//GEN-LAST:event_tablaVehiculoMousePressed
    //BORRAR
    private void BotonBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarMousePressed
        int seleccion = tablaVehiculo.getSelectedRow();
        if (seleccion >= 0) {
            try {
                CV.borrar(seleccion);
                CV.leer(tablaVehiculo);
            } catch (Exception ex) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el vehiculo a eliminar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_BotonBorrarMousePressed
//ABRIR SECCIÓN EDITAR
    private void BotonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMousePressed

        int idcell = tablaVehiculo.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el vehiculo a editar. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println(idcell);
            
            String bID = String.valueOf(CV.getListaVehiculos().obtenerDato(idcell).getId());
            String bMarca = CV.getListaVehiculos().obtenerDato(idcell).getMarca();
            String bTipoVehiculo = CV.getListaVehiculos().obtenerDato(idcell).getTipoVehiculo();
            String bColor = CV.getListaVehiculos().obtenerDato(idcell).getColor();
            String bMatricula = CV.getListaVehiculos().obtenerDato(idcell).getMatricula();
            String bPrecio = ""+CV.getListaVehiculos().obtenerDato(idcell).getPrecio();
            String bDisponibles = ""+CV.getListaVehiculos().obtenerDato(idcell).getDisponibles();
            PanelNuevoVehiculo p1 = new PanelNuevoVehiculo(bID, bMarca, bTipoVehiculo, bColor, bMatricula, bPrecio, bDisponibles);
            mostrarContenido(p1);

        }
    }//GEN-LAST:event_BotonEditarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBorrar;
    private javax.swing.JPanel BotonEditar;
    private javax.swing.JPanel BotonNuevo;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVehiculo;
    // End of variables declaration//GEN-END:variables
}
