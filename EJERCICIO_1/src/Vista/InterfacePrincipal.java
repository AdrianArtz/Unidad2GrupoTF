// @Created by: Hilary Calva | Thais Cartuche | Ronald Cuenca | Karen Gonzaga | Adrián Hernández

package Vista;

import controlador.tda.lista.exception.PosicionException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfacePrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;

    public InterfacePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre", "Octubre", "Noviembre", "Diciemrbre"};
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " del " + year);
        PanelPrincipal p1 = new PanelPrincipal();
        mostrarContenido(p1);

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

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        PrincipalBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PrincipalName = new javax.swing.JLabel();
        VehiculosBtn = new javax.swing.JPanel();
        PrincipalName1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ConfiguracionBtn = new javax.swing.JPanel();
        PrincipalName3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        app_name1 = new javax.swing.JLabel();
        VenderBtn = new javax.swing.JPanel();
        PrincipalName4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        SalirBtn = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        Panelcontenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 20));

        PrincipalBtn.setBackground(new java.awt.Color(13, 72, 160));
        PrincipalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrincipalBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrincipalBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrincipalBtnMousePressed(evt);
            }
        });
        PrincipalBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home-outline.png"))); // NOI18N
        PrincipalBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        PrincipalName.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PrincipalName.setForeground(new java.awt.Color(255, 255, 255));
        PrincipalName.setText("Principal");
        PrincipalBtn.add(PrincipalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        Menu.add(PrincipalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 70));

        VehiculosBtn.setBackground(new java.awt.Color(13, 72, 160));
        VehiculosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VehiculosBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VehiculosBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VehiculosBtnMousePressed(evt);
            }
        });
        VehiculosBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrincipalName1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PrincipalName1.setForeground(new java.awt.Color(255, 255, 255));
        PrincipalName1.setText("Vehículos");
        VehiculosBtn.add(PrincipalName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar-plus.png"))); // NOI18N
        VehiculosBtn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        Menu.add(VehiculosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 70));

        ConfiguracionBtn.setBackground(new java.awt.Color(13, 72, 160));
        ConfiguracionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfiguracionBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfiguracionBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfiguracionBtnMousePressed(evt);
            }
        });
        ConfiguracionBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrincipalName3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PrincipalName3.setForeground(new java.awt.Color(255, 255, 255));
        PrincipalName3.setText("Configuración");
        ConfiguracionBtn.add(PrincipalName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 160, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/account-multiple.png"))); // NOI18N
        ConfiguracionBtn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        Menu.add(ConfiguracionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 70));

        app_name1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        app_name1.setForeground(new java.awt.Color(255, 255, 255));
        app_name1.setText("CONCESONARIA");
        Menu.add(app_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, 40));

        VenderBtn.setBackground(new java.awt.Color(13, 72, 160));
        VenderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VenderBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VenderBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VenderBtnMousePressed(evt);
            }
        });
        VenderBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrincipalName4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PrincipalName4.setForeground(new java.awt.Color(255, 255, 255));
        PrincipalName4.setText("Vender");
        VenderBtn.add(PrincipalName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file-chart.png"))); // NOI18N
        VenderBtn.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        Menu.add(VenderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, 70));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(25, 118, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración/Control");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Fecha Actual");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha)
                    .addComponent(jLabel2))
                .addContainerGap(528, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 750, 150));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        SalirBtn.setBackground(new java.awt.Color(255, 255, 255));
        SalirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalirBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirBtnMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SalirBtnLayout = new javax.swing.GroupLayout(SalirBtn);
        SalirBtn.setLayout(SalirBtnLayout);
        SalirBtnLayout.setHorizontalGroup(
            SalirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        SalirBtnLayout.setVerticalGroup(
            SalirBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 984, Short.MAX_VALUE)
                .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        slogan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        slogan.setText("Created by: Hilary Calva | Thais Cartuche | Ronald Cuenca | Karen Gonzaga | Adrián Hernández");
        Background.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 700, 30));

        Panelcontenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelcontenidoLayout = new javax.swing.GroupLayout(Panelcontenido);
        Panelcontenido.setLayout(PanelcontenidoLayout);
        PanelcontenidoLayout.setHorizontalGroup(
            PanelcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PanelcontenidoLayout.setVerticalGroup(
            PanelcontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(Panelcontenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void SalirBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBtnMousePressed
        System.exit(0);
    }//GEN-LAST:event_SalirBtnMousePressed

    private void SalirBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBtnMouseExited
        SalirBtn.setBackground(new Color(255, 255, 255));
        exit.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_SalirBtnMouseExited

    private void SalirBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirBtnMouseEntered
        SalirBtn.setBackground(new Color(204, 0, 0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_SalirBtnMouseEntered

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        SalirBtn.setBackground(new Color(255, 255, 255));
        exit.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        SalirBtn.setBackground(new Color(204, 0, 0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void PrincipalBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalBtnMouseEntered
        PrincipalBtn.setBackground(new Color(19, 99, 219));
    }//GEN-LAST:event_PrincipalBtnMouseEntered

    private void PrincipalBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalBtnMouseExited
        PrincipalBtn.setBackground(new Color(14, 72, 160));
    }//GEN-LAST:event_PrincipalBtnMouseExited

    private void VehiculosBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VehiculosBtnMouseEntered
        VehiculosBtn.setBackground(new Color(19, 99, 219));
    }//GEN-LAST:event_VehiculosBtnMouseEntered

    private void VehiculosBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VehiculosBtnMouseExited
        VehiculosBtn.setBackground(new Color(14, 72, 160));
    }//GEN-LAST:event_VehiculosBtnMouseExited

    private void PrincipalBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalBtnMousePressed
        PanelPrincipal p2 = new PanelPrincipal();
        mostrarContenido(p2);
    }//GEN-LAST:event_PrincipalBtnMousePressed

    private void VehiculosBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VehiculosBtnMousePressed

        PanelVehiculo pV;
        try {
            pV = new PanelVehiculo();
            mostrarContenido(pV);
        } catch (PosicionException ex) {
        }

    }//GEN-LAST:event_VehiculosBtnMousePressed

    private void ConfiguracionBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionBtnMouseEntered
        ConfiguracionBtn.setBackground(new Color(19, 99, 219));
    }//GEN-LAST:event_ConfiguracionBtnMouseEntered

    private void ConfiguracionBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionBtnMouseExited
        ConfiguracionBtn.setBackground(new Color(14, 72, 160));
    }//GEN-LAST:event_ConfiguracionBtnMouseExited

    private void ConfiguracionBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionBtnMousePressed
        JOptionPane.showMessageDialog(null, "Disponible pronto");
    }//GEN-LAST:event_ConfiguracionBtnMousePressed

    private void VenderBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VenderBtnMouseEntered
        VenderBtn.setBackground(new Color(19, 99, 219));
    }//GEN-LAST:event_VenderBtnMouseEntered

    private void VenderBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VenderBtnMouseExited
        VenderBtn.setBackground(new Color(14, 72, 160));
    }//GEN-LAST:event_VenderBtnMouseExited

    private void VenderBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VenderBtnMousePressed
        JOptionPane.showMessageDialog(null, "Disponible pronto");
    }//GEN-LAST:event_VenderBtnMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new InterfacePrincipal().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel ConfiguracionBtn;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    public static javax.swing.JPanel Panelcontenido;
    private javax.swing.JPanel PrincipalBtn;
    private javax.swing.JLabel PrincipalName;
    private javax.swing.JLabel PrincipalName1;
    private javax.swing.JLabel PrincipalName3;
    private javax.swing.JLabel PrincipalName4;
    private javax.swing.JPanel SalirBtn;
    private javax.swing.JPanel Title;
    private javax.swing.JPanel VehiculosBtn;
    private javax.swing.JPanel VenderBtn;
    private javax.swing.JLabel app_name1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
