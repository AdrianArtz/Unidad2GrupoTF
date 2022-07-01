// @Created by: Hilary Calva | Thais Cartuche | Ronald Cuenca | Karen Gonzaga | Adrián Hernández
package Vista;
import Controlador.ControladorIngreso;
public class PanelPrincipal extends javax.swing.JPanel {
    
    String nombreAdmin = "Adrián Hernández";
    boolean userAct = ControladorIngreso.getPermiso();
    String nombreUser = "Cliente";
    
    public PanelPrincipal() {
        
        initComponents();
        if (userAct) {
            TitleUserTxT.setText("Bienvenido "+MayuscUser(nombreAdmin));
        }else{
            TitleUserTxT.setText("Bienvenido "+MayuscUser(nombreUser));
        }

    }
    
    String MayuscUser(String n){
        return Character.toUpperCase(n.charAt(0)) + n.substring(1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        TitleUserTxT = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TitleUserTxT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TitleUserTxT.setText("Bienvenido Usuario/Admin");
        add(TitleUserTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Este sistema permite vender autos en una concesionaria");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 470, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("tendrá acceso a herramientas especiales para tareas específicas, como lo son:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("• Inicio de sesión (solo puede entrar administrador del sistema, gerente)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 550, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("• Administrar marcas");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 320, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("• Administrar vehículos");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 330, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("• Administrar Clientes  ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 330, -1));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tienda.png"))); // NOI18N
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -120, 310, 700));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("• Facturación");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 330, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel TitleUserTxT;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
