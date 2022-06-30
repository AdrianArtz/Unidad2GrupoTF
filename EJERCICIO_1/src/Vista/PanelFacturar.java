package Vista;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelFacturar extends javax.swing.JPanel {
    
    public PanelFacturar() {

        initComponents();
        
        vehiculoTxT.setEditable(false);
        precioVehiculoTxT.setEditable(false);
        descuentoTxT.setEditable(false);
        descuentoTxT.setEditable(false);
        subTotalTxT.setEditable(false);
        ivaTxT.setEditable(false);
        totalTxT.setEditable(false);
        
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    String MayuscUser(String n) {
        return Character.toUpperCase(n.charAt(0)) + n.substring(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        nombreTxT = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        apellidoTxT = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        emailTxT = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        telefonoTxT = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        direccionTxT = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        identificacionTxT = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        vehiculoTxT = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        precioVehiculoTxT = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        subTotalTxT = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        ivaTxT = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        totalTxT = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        descuentoTxT = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        descuentoBox = new javax.swing.JCheckBox();
        CajaTotal = new javax.swing.JPanel();
        TotalPrecioTxT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("FACTURACIÓN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 10, 200));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Datos de la compra");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        nombreTxT.setForeground(new java.awt.Color(102, 102, 102));
        nombreTxT.setText("Ingresar nombres");
        nombreTxT.setBorder(null);
        nombreTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxTMousePressed(evt);
            }
        });
        nombreTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxTActionPerformed(evt);
            }
        });
        add(nombreTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 10));

        apellidoTxT.setForeground(new java.awt.Color(102, 102, 102));
        apellidoTxT.setText("Ingrese apellidos");
        apellidoTxT.setBorder(null);
        apellidoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoTxTMousePressed(evt);
            }
        });
        add(apellidoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 260, 10));

        emailTxT.setForeground(new java.awt.Color(102, 102, 102));
        emailTxT.setText("Ingresar email");
        emailTxT.setBorder(null);
        emailTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailTxTMousePressed(evt);
            }
        });
        add(emailTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 260, 10));

        telefonoTxT.setForeground(new java.awt.Color(102, 102, 102));
        telefonoTxT.setText("Ingresar telefono");
        telefonoTxT.setBorder(null);
        telefonoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telefonoTxTMousePressed(evt);
            }
        });
        add(telefonoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 30));

        jSeparator13.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 10));

        direccionTxT.setForeground(new java.awt.Color(102, 102, 102));
        direccionTxT.setText("Ingresar dirección");
        direccionTxT.setBorder(null);
        direccionTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccionTxTMousePressed(evt);
            }
        });
        add(direccionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 260, 30));

        jSeparator16.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 10));

        identificacionTxT.setForeground(new java.awt.Color(102, 102, 102));
        identificacionTxT.setText("Ingrese identificacion");
        identificacionTxT.setBorder(null);
        identificacionTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                identificacionTxTMousePressed(evt);
            }
        });
        add(identificacionTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, 30));

        jSeparator17.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator17.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Datos del cliente");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        vehiculoTxT.setForeground(new java.awt.Color(102, 102, 102));
        vehiculoTxT.setText("Vehículo");
        vehiculoTxT.setBorder(null);
        vehiculoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vehiculoTxTMousePressed(evt);
            }
        });
        vehiculoTxT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculoTxTActionPerformed(evt);
            }
        });
        add(vehiculoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 260, 10));

        precioVehiculoTxT.setForeground(new java.awt.Color(102, 102, 102));
        precioVehiculoTxT.setText("Precio total del vehículo");
        precioVehiculoTxT.setBorder(null);
        precioVehiculoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioVehiculoTxTMousePressed(evt);
            }
        });
        add(precioVehiculoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 260, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 260, 10));

        subTotalTxT.setForeground(new java.awt.Color(102, 102, 102));
        subTotalTxT.setText("SubTotal");
        subTotalTxT.setBorder(null);
        subTotalTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subTotalTxTMousePressed(evt);
            }
        });
        add(subTotalTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 260, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 260, 10));

        ivaTxT.setForeground(new java.awt.Color(102, 102, 102));
        ivaTxT.setText("Iva");
        ivaTxT.setBorder(null);
        ivaTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ivaTxTMousePressed(evt);
            }
        });
        add(ivaTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 260, 30));

        jSeparator14.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator14.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 260, 10));

        totalTxT.setForeground(new java.awt.Color(102, 102, 102));
        totalTxT.setText("Total");
        totalTxT.setBorder(null);
        totalTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                totalTxTMousePressed(evt);
            }
        });
        add(totalTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 260, 30));

        jSeparator18.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator18.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 260, 10));

        descuentoTxT.setForeground(new java.awt.Color(102, 102, 102));
        descuentoTxT.setText("Descuento");
        descuentoTxT.setBorder(null);
        descuentoTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descuentoTxTMousePressed(evt);
            }
        });
        add(descuentoTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 260, 30));

        jSeparator19.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator19.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 260, 10));

        descuentoBox.setText("Descuento");
        descuentoBox.setBorder(null);
        add(descuentoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 80, -1));

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
        TotalPrecioTxT.setText("Facturar");
        CajaTotal.add(TotalPrecioTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 20));

        add(CajaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 200, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxTMousePressed
        if (nombreTxT.getText().equals("Ingresar nombres")) {
            nombreTxT.setText("");
        }
        if (apellidoTxT.getText().equals("") || apellidoTxT.getText() == null || apellidoTxT.getText().equals(" ")) {
            apellidoTxT.setText("Ingrese apellidos");
        }
        if (emailTxT.getText().equals("") || emailTxT.getText() == null || emailTxT.getText().equals(" ")) {
            emailTxT.setText("Ingresar email");
        }
        if (identificacionTxT.getText().equals("") || identificacionTxT.getText() == null || identificacionTxT.getText().equals(" ")) {
            identificacionTxT.setText("Ingrese identificacion");
        }
        if (direccionTxT.getText().equals("") || direccionTxT.getText() == null || direccionTxT.getText().equals(" ")) {
            direccionTxT.setText("Ingresar dirección");
        }
        if (telefonoTxT.getText().equals("") || telefonoTxT.getText() == null || telefonoTxT.getText().isEmpty())
            telefonoTxT.setText("Ingresar telefono");
    }//GEN-LAST:event_nombreTxTMousePressed

    private void apellidoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoTxTMousePressed
        if (apellidoTxT.getText().equals("Ingrese apellidos")) {
            apellidoTxT.setText("");
        }
        if (nombreTxT.getText().equals("") || nombreTxT.getText() == null || nombreTxT.getText().equals(" ")) {
            nombreTxT.setText("Ingresar nombres");
        }
        if (emailTxT.getText().equals("") || emailTxT.getText() == null || emailTxT.getText().equals(" ")) {
            emailTxT.setText("Ingresar email");
        }
        if (identificacionTxT.getText().equals("") || identificacionTxT.getText() == null || identificacionTxT.getText().equals(" ")) {
            identificacionTxT.setText("Ingrese identificacion");
        }
        if (direccionTxT.getText().equals("") || direccionTxT.getText() == null || direccionTxT.getText().equals(" ")) {
            direccionTxT.setText("Ingresar dirección");
        }
        if (telefonoTxT.getText().equals("") || telefonoTxT.getText() == null || telefonoTxT.getText().isEmpty())
            telefonoTxT.setText("Ingresar telefono");
    }//GEN-LAST:event_apellidoTxTMousePressed

    private void emailTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTxTMousePressed
        if (emailTxT.getText().equals("Ingresar email")) {
            emailTxT.setText("");
        }
        if (nombreTxT.getText().equals("") || nombreTxT.getText() == null || nombreTxT.getText().equals(" ")) {
            nombreTxT.setText("Ingresar nombres");
        }
        if (apellidoTxT.getText().equals("") || apellidoTxT.getText() == null || apellidoTxT.getText().equals(" ")) {
            apellidoTxT.setText("Ingrese apellidos");
        }
        if (identificacionTxT.getText().equals("") || identificacionTxT.getText() == null || identificacionTxT.getText().equals(" ")) {
            identificacionTxT.setText("Ingrese identificacion");
        }
        if (direccionTxT.getText().equals("") || direccionTxT.getText() == null || direccionTxT.getText().equals(" ")) {
            direccionTxT.setText("Ingresar dirección");
        }
        if (telefonoTxT.getText().equals("") || telefonoTxT.getText() == null || telefonoTxT.getText().isEmpty())
            telefonoTxT.setText("Ingresar telefono");
    }//GEN-LAST:event_emailTxTMousePressed

    private void telefonoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoTxTMousePressed
        if (telefonoTxT.getText().equals("Ingresar telefono")) {
            telefonoTxT.setText("");
        }
        if (nombreTxT.getText().equals("") || nombreTxT.getText() == null || nombreTxT.getText().equals(" ")) {
            nombreTxT.setText("Ingresar nombres");
        }
        if (apellidoTxT.getText().equals("") || apellidoTxT.getText() == null || apellidoTxT.getText().equals(" ")) {
            apellidoTxT.setText("Ingrese apellidos");
        }
        if (emailTxT.getText().equals("") || emailTxT.getText() == null || emailTxT.getText().equals(" ")) {
            emailTxT.setText("Ingresar email");
        }
        if (identificacionTxT.getText().equals("") || identificacionTxT.getText() == null || identificacionTxT.getText().equals(" ")) {
            identificacionTxT.setText("Ingrese identificacion");
        }
        if (direccionTxT.getText().equals("") || direccionTxT.getText() == null || direccionTxT.getText().equals(" "))
            direccionTxT.setText("Ingresar dirección");
    }//GEN-LAST:event_telefonoTxTMousePressed

    private void direccionTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionTxTMousePressed
        if (direccionTxT.getText().equals("Ingresar dirección")) {
            direccionTxT.setText("");
        }
        if (nombreTxT.getText().equals("") || nombreTxT.getText() == null || nombreTxT.getText().equals(" ")) {
            nombreTxT.setText("Ingresar nombres");
        }
        if (apellidoTxT.getText().equals("") || apellidoTxT.getText() == null || apellidoTxT.getText().equals(" ")) {
            apellidoTxT.setText("Ingrese apellidos");
        }
        if (emailTxT.getText().equals("") || emailTxT.getText() == null || emailTxT.getText().equals(" ")) {
            emailTxT.setText("Ingresar email");
        }
        if (identificacionTxT.getText().equals("") || identificacionTxT.getText() == null || identificacionTxT.getText().equals(" ")) {
            identificacionTxT.setText("Ingrese identificacion");
        }
        if (telefonoTxT.getText().equals("") || telefonoTxT.getText() == null || telefonoTxT.getText().isEmpty())
            telefonoTxT.setText("Ingresar telefono");
    }//GEN-LAST:event_direccionTxTMousePressed

    private void identificacionTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionTxTMousePressed
        if (identificacionTxT.getText().equals("Ingrese identificacion")) {
            identificacionTxT.setText("");
        }
        if (nombreTxT.getText().equals("") || nombreTxT.getText() == null || nombreTxT.getText().equals(" ")) {
            nombreTxT.setText("Ingresar nombres");
        }
        if (apellidoTxT.getText().equals("") || apellidoTxT.getText() == null || apellidoTxT.getText().equals(" ")) {
            apellidoTxT.setText("Ingrese apellidos");
        }
        if (emailTxT.getText().equals("") || emailTxT.getText() == null || emailTxT.getText().equals(" ")) {
            emailTxT.setText("Ingresar email");
        }
        if (direccionTxT.getText().equals("") || direccionTxT.getText() == null || direccionTxT.getText().equals(" ")) {
            direccionTxT.setText("Ingresar dirección");
        }
        if (telefonoTxT.getText().equals("") || telefonoTxT.getText() == null || telefonoTxT.getText().isEmpty())
            telefonoTxT.setText("Ingresar telefono");
    }//GEN-LAST:event_identificacionTxTMousePressed

    private void nombreTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxTActionPerformed

    private void vehiculoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculoTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculoTxTMousePressed

    private void vehiculoTxTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculoTxTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculoTxTActionPerformed

    private void precioVehiculoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioVehiculoTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVehiculoTxTMousePressed

    private void subTotalTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subTotalTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalTxTMousePressed

    private void ivaTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ivaTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ivaTxTMousePressed

    private void totalTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxTMousePressed

    private void descuentoTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentoTxTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuentoTxTMousePressed

    private void CajaTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaTotalMouseEntered
        setColor(CajaTotal);
    }//GEN-LAST:event_CajaTotalMouseEntered

    private void CajaTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaTotalMouseExited
        resetColor(CajaTotal);
    }//GEN-LAST:event_CajaTotalMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CajaTotal;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel TotalPrecioTxT;
    private javax.swing.JTextField apellidoTxT;
    private javax.swing.JPanel body;
    private javax.swing.JCheckBox descuentoBox;
    private javax.swing.JTextField descuentoTxT;
    private javax.swing.JTextField direccionTxT;
    private javax.swing.JTextField emailTxT;
    private javax.swing.JTextField identificacionTxT;
    private javax.swing.JTextField ivaTxT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombreTxT;
    private javax.swing.JTextField precioVehiculoTxT;
    private javax.swing.JTextField subTotalTxT;
    private javax.swing.JTextField telefonoTxT;
    private javax.swing.JTextField totalTxT;
    private javax.swing.JTextField vehiculoTxT;
    // End of variables declaration//GEN-END:variables
}
