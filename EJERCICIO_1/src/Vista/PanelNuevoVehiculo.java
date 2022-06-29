/**
 * @Author: Adrián Hernández  || 2A || POO
 * TRABAJO FINAL DE ASIGNATURA|| SISTEMA DE GESTION DE INVENTARIO
 */
package Vista;

import Controlador.ControladorIngreso;
import Controlador.ControladorVehiculos;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import static Vista.InterfacePrincipal.Panelcontenido;
import javax.swing.JOptionPane;

public class PanelNuevoVehiculo extends javax.swing.JPanel {

    boolean edition;
    Integer origId;

    public PanelNuevoVehiculo() {
        initComponents();
        edition = false;
    }

    public PanelNuevoVehiculo(String id, String bMarca, String bTipoVehiculo, String bColor, String bMatricula, String bPrecio, String bDisp) {
        initComponents();
        edition = true;
        this.origId = Integer.valueOf(id);
        marcaTxT.setText(bMarca);
        tipoVehiculosTxT.setText(bTipoVehiculo);
        matriculaTxT.setText(bMatricula);
        colorTxT.setText(bColor);
        PrecioTxT.setText(bPrecio);
        vehiculosDisponiblesTxT.setText(bDisp);

        label.setText("Guardar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        BotonGuardar = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        marcaTxT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        tipoVehiculosTxT = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        matriculaTxT = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text12 = new javax.swing.JLabel();
        colorTxT = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        vehiculosDisponiblesTxT = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        Text15 = new javax.swing.JLabel();
        Text16 = new javax.swing.JLabel();
        PrecioTxT = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Nuevo Vehículo");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 10, 200));

        BotonGuardar.setBackground(new java.awt.Color(18, 90, 173));
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGuardarMousePressed(evt);
            }
        });
        BotonGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Subir");
        BotonGuardar.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 200, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Marca");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        marcaTxT.setForeground(new java.awt.Color(102, 102, 102));
        marcaTxT.setText("Ingrese la marca del vehiculo");
        marcaTxT.setBorder(null);
        marcaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                marcaTxTMousePressed(evt);
            }
        });
        add(marcaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Tipo de Vehiculo");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        tipoVehiculosTxT.setForeground(new java.awt.Color(102, 102, 102));
        tipoVehiculosTxT.setText("Ingrese el tipo de vehiculo");
        tipoVehiculosTxT.setBorder(null);
        tipoVehiculosTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tipoVehiculosTxTMousePressed(evt);
            }
        });
        add(tipoVehiculosTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Matricula");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        matriculaTxT.setForeground(new java.awt.Color(102, 102, 102));
        matriculaTxT.setText("Ingrese la matricula del vehiculo");
        matriculaTxT.setBorder(null);
        matriculaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                matriculaTxTMousePressed(evt);
            }
        });
        add(matriculaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 10));

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Color");
        add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 50, -1));

        colorTxT.setForeground(new java.awt.Color(102, 102, 102));
        colorTxT.setText("Ingrese el color del vehiculo");
        colorTxT.setBorder(null);
        colorTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorTxTMousePressed(evt);
            }
        });
        add(colorTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 260, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 260, 10));

        vehiculosDisponiblesTxT.setForeground(new java.awt.Color(102, 102, 102));
        vehiculosDisponiblesTxT.setText("Cantidad de Productos");
        vehiculosDisponiblesTxT.setBorder(null);
        vehiculosDisponiblesTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vehiculosDisponiblesTxTMousePressed(evt);
            }
        });
        add(vehiculosDisponiblesTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 140, 30));

        jSeparator16.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 260, 10));

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Disponibles");
        add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        Text16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text16.setText("Precio");
        add(Text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        PrecioTxT.setForeground(new java.awt.Color(102, 102, 102));
        PrecioTxT.setText("Ingrese el precio del Producto");
        PrecioTxT.setBorder(null);
        PrecioTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrecioTxTMousePressed(evt);
            }
        });
        add(PrecioTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 180, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseEntered
        setColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseEntered

    private void BotonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMouseExited
        resetColor(BotonGuardar);
    }//GEN-LAST:event_BotonGuardarMouseExited

    private void marcaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcaTxTMousePressed
        if (marcaTxT.getText().equals("Ingrese la marca del vehiculo")) {
            marcaTxT.setText("");
        }
        if (tipoVehiculosTxT.getText().equals("") || tipoVehiculosTxT.getText() == null || tipoVehiculosTxT.getText().equals(" ")) {
            tipoVehiculosTxT.setText("Ingrese el tipo de vehiculo");
        }
        if (matriculaTxT.getText().equals("") || matriculaTxT.getText() == null || matriculaTxT.getText().equals(" ")) {
            matriculaTxT.setText("Ingrese la matricula del vehiculo");
        }
        if (PrecioTxT.getText().equals("") || PrecioTxT.getText() == null || PrecioTxT.getText().equals(" ")) {
            PrecioTxT.setText("Ingrese el precio del vehiculo");
        }
        if (vehiculosDisponiblesTxT.getText().equals("") || vehiculosDisponiblesTxT.getText() == null || vehiculosDisponiblesTxT.getText().equals(" ")) {
            vehiculosDisponiblesTxT.setText("Cantidad de vehiculos");
        }
        if (colorTxT.getText().equals("") || colorTxT.getText() == null || colorTxT.getText().isEmpty())
            colorTxT.setText("Ingrese el color del vehiculo");
    }//GEN-LAST:event_marcaTxTMousePressed

    private void tipoVehiculosTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoVehiculosTxTMousePressed
        if (tipoVehiculosTxT.getText().equals("Ingrese el tipo de vehiculo")) {
            tipoVehiculosTxT.setText("");
        }
        if (marcaTxT.getText().equals("") || marcaTxT.getText() == null || marcaTxT.getText().equals(" ")) {
            marcaTxT.setText("Ingrese la marca del vehiculo");
        }
        if (matriculaTxT.getText().equals("") || matriculaTxT.getText() == null || matriculaTxT.getText().equals(" ")) {
            matriculaTxT.setText("Ingrese la matricula del vehiculo");
        }
        if (PrecioTxT.getText().equals("") || PrecioTxT.getText() == null || PrecioTxT.getText().equals(" ")) {
            PrecioTxT.setText("Ingrese el precio del vehiculo");
        }
        if (vehiculosDisponiblesTxT.getText().equals("") || vehiculosDisponiblesTxT.getText() == null || vehiculosDisponiblesTxT.getText().equals(" ")) {
            vehiculosDisponiblesTxT.setText("Cantidad de vehiculos");
        }
        if (colorTxT.getText().equals("") || colorTxT.getText() == null || colorTxT.getText().isEmpty())
            colorTxT.setText("Ingrese el color del vehiculo");
    }//GEN-LAST:event_tipoVehiculosTxTMousePressed

    private void matriculaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matriculaTxTMousePressed
        if (matriculaTxT.getText().equals("Ingrese la matricula del vehiculo")) {
            matriculaTxT.setText("");
        }
        if (marcaTxT.getText().equals("") || marcaTxT.getText() == null || marcaTxT.getText().equals(" ")) {
            marcaTxT.setText("Ingrese la marca del vehiculo");
        }
        if (tipoVehiculosTxT.getText().equals("") || tipoVehiculosTxT.getText() == null || tipoVehiculosTxT.getText().equals(" ")) {
            tipoVehiculosTxT.setText("Ingrese el tipo de vehiculo");
        }
        if (PrecioTxT.getText().equals("") || PrecioTxT.getText() == null || PrecioTxT.getText().equals(" ")) {
            PrecioTxT.setText("Ingrese el precio del vehiculo");
        }
        if (vehiculosDisponiblesTxT.getText().equals("") || vehiculosDisponiblesTxT.getText() == null || vehiculosDisponiblesTxT.getText().equals(" ")) {
            vehiculosDisponiblesTxT.setText("Cantidad de vehiculos");
        }
        if (colorTxT.getText().equals("") || colorTxT.getText() == null || colorTxT.getText().isEmpty())
            colorTxT.setText("Ingrese el color del vehiculo");
    }//GEN-LAST:event_matriculaTxTMousePressed

    private void vehiculosDisponiblesTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculosDisponiblesTxTMousePressed
        if (vehiculosDisponiblesTxT.getText().equals("Cantidad de vehiculos")) {
            vehiculosDisponiblesTxT.setText("");
        }
        if (marcaTxT.getText().equals("") || marcaTxT.getText() == null || marcaTxT.getText().equals(" ")) {
            marcaTxT.setText("Ingrese la marca del vehiculo");
        }
        if (tipoVehiculosTxT.getText().equals("") || tipoVehiculosTxT.getText() == null || tipoVehiculosTxT.getText().equals(" ")) {
            tipoVehiculosTxT.setText("Ingrese el tipo de vehiculo");
        }
        if (matriculaTxT.getText().equals("") || matriculaTxT.getText() == null || matriculaTxT.getText().equals(" ")) {
            matriculaTxT.setText("Ingrese la matricula del vehiculo");
        }
        if (PrecioTxT.getText().equals("") || PrecioTxT.getText() == null || PrecioTxT.getText().equals(" ")) {
            PrecioTxT.setText("Ingrese el precio del vehiculo");
        }
        if (colorTxT.getText().equals("") || colorTxT.getText() == null || colorTxT.getText().isEmpty())
            colorTxT.setText("Ingrese el color del vehiculo");
    }//GEN-LAST:event_vehiculosDisponiblesTxTMousePressed

    // SUBIR
    private void BotonGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarMousePressed

        if (marcaTxT.getText().equals("Ingrese la marca del vehiculo") || tipoVehiculosTxT.getText().equals("Ingrese el tipo de vehiculo")
                || matriculaTxT.getText().equals("Ingrese la matricula del vehiculo") || PrecioTxT.getText().equals("Ingrese el precio del vehiculo")
                || colorTxT.getText().equals("Ingrese el color del vehiculo") || vehiculosDisponiblesTxT.getText().equals("Cantidad de vehiculos")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            marcaTxT.requestFocus();
        } else {
            String bMarca = marcaTxT.getText();
            String bTipoVehiculo = tipoVehiculosTxT.getText();
            String bColor = colorTxT.getText();
            String bMatricula = matriculaTxT.getText();
            String bPrecio = PrecioTxT.getText();
            String bDisponibles = vehiculosDisponiblesTxT.getText();
            int disponibles = 0;
            double precio = 0.0;
            if (bMarca == null || "".equals(bMarca) || bTipoVehiculo == null || "".equals(bTipoVehiculo) || bColor == null || "".equals(bColor) || bMatricula == null || "".equals(bMatricula)
                    || bPrecio == null || "".equals(bPrecio) || bDisponibles == null || "".equals(bDisponibles)) {
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                marcaTxT.requestFocus();
            } else {
                try {
                    disponibles = Integer.parseInt(bDisponibles);
                    precio = Double.parseDouble(bPrecio);

                    if (edition) {
                        ControladorVehiculos.editarVehiculo(origId, bMarca, bTipoVehiculo, bColor, bMatricula, precio, disponibles);
                        JOptionPane.showMessageDialog(this, "¡Vehiculo editado correctamente! \n", "HECHO", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        ControladorVehiculos.crearVehiculo(bMarca, bTipoVehiculo, bColor, bMatricula, precio, disponibles);
                        JOptionPane.showMessageDialog(this, "¡Vehiculo registrado correctamente! \n", "HECHO", JOptionPane.INFORMATION_MESSAGE);
                    }

                    if (edition) {
                        PanelVehiculo p1 = new PanelVehiculo();
                        p1.setSize(750, 430);
                        p1.setLocation(5, 5);

                        Panelcontenido.removeAll();
                        Panelcontenido.add(p1, BorderLayout.CENTER);
                        Panelcontenido.revalidate();
                        Panelcontenido.repaint();
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "La cantidad de vehiculos deben ser números enteros. \n", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    marcaTxT.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_BotonGuardarMousePressed

    private void PrecioTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrecioTxTMousePressed
        if (PrecioTxT.getText().equals("Ingrese el precio del vehiculo")) {
            PrecioTxT.setText("");
        }
        if (marcaTxT.getText().equals("") || marcaTxT.getText() == null || marcaTxT.getText().equals(" ")) {
            marcaTxT.setText("Ingrese la marca del vehiculo");
        }
        if (tipoVehiculosTxT.getText().equals("") || tipoVehiculosTxT.getText() == null || tipoVehiculosTxT.getText().equals(" ")) {
            tipoVehiculosTxT.setText("Ingrese el tipo de vehiculo");
        }
        if (matriculaTxT.getText().equals("") || matriculaTxT.getText() == null || matriculaTxT.getText().equals(" ")) {
            matriculaTxT.setText("Ingrese la matricula del vehiculo");
        }
        if (vehiculosDisponiblesTxT.getText().equals("") || vehiculosDisponiblesTxT.getText() == null || vehiculosDisponiblesTxT.getText().equals(" ")) {
            vehiculosDisponiblesTxT.setText("Cantidad de vehiculos");
        }
        if (colorTxT.getText().equals("") || colorTxT.getText() == null || colorTxT.getText().isEmpty())
            colorTxT.setText("Ingrese el color del vehiculo");
    }//GEN-LAST:event_PrecioTxTMousePressed

    private void colorTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorTxTMousePressed
        if (colorTxT.getText().equals("Ingrese el color del vehiculo")) {
            colorTxT.setText("");
        }
        if (marcaTxT.getText().equals("") || marcaTxT.getText() == null || marcaTxT.getText().equals(" ")) {
            marcaTxT.setText("Ingrese la marca del vehiculo");
        }
        if (tipoVehiculosTxT.getText().equals("") || tipoVehiculosTxT.getText() == null || tipoVehiculosTxT.getText().equals(" ")) {
            tipoVehiculosTxT.setText("Ingrese el nombre del Producto");
        }
        if (matriculaTxT.getText().equals("") || matriculaTxT.getText() == null || matriculaTxT.getText().equals(" ")) {
            matriculaTxT.setText("Ingrese la Fecha de Expiración");
        }
        if (PrecioTxT.getText().equals("") || PrecioTxT.getText() == null || PrecioTxT.getText().equals(" ")) {
            PrecioTxT.setText("Ingrese el precio del Producto");
        }
        if (vehiculosDisponiblesTxT.getText().equals("") || vehiculosDisponiblesTxT.getText() == null || vehiculosDisponiblesTxT.getText().equals(" "))
            vehiculosDisponiblesTxT.setText("Cantidad de Productos");
    }//GEN-LAST:event_colorTxTMousePressed

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonGuardar;
    private javax.swing.JTextField PrecioTxT;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text16;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTextField colorTxT;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel label;
    private javax.swing.JTextField marcaTxT;
    private javax.swing.JTextField matriculaTxT;
    private javax.swing.JTextField tipoVehiculosTxT;
    private javax.swing.JTextField vehiculosDisponiblesTxT;
    // End of variables declaration//GEN-END:variables
}
