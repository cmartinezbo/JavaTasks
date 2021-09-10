/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Formulario_AgregarProd extends javax.swing.JDialog {

    /**
     * Creates new form Formulario
     */
    public Formulario_AgregarProd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        
        setClean();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new necesario.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtAnadirProducto = new javax.swing.JLabel();
        btnCerrarForm = new rojerusan.RSButtonRound();
        txtNombre = new RSMaterialComponent.RSTextFieldIconUno();
        txtValor = new RSMaterialComponent.RSTextFieldIconUno();
        txtCantidad = new RSMaterialComponent.RSTextFieldIconUno();
        txtMaterial = new RSMaterialComponent.RSTextFieldIconUno();
        imgCheckForm = new rojerusan.RSLabelIcon();
        btnAgregarForm = new rojerusan.RSButtonRound();
        lblCodigo = new javax.swing.JLabel();
        llblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(55, 55, 55));

        jPanel2.setBackground(new java.awt.Color(60, 60, 60));

        txtAnadirProducto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtAnadirProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtAnadirProducto.setText("AÑADIR PRODUCTO");
        txtAnadirProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCerrarForm.setBackground(new java.awt.Color(60, 60, 60));
        btnCerrarForm.setText("X");
        btnCerrarForm.setColorHover(new java.awt.Color(162, 10, 10));
        btnCerrarForm.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCerrarForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarFormMouseClicked(evt);
            }
        });
        btnCerrarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAnadirProducto)
                .addGap(61, 61, 61)
                .addComponent(btnCerrarForm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnadirProducto))
                .addContainerGap())
        );

        txtNombre.setBackground(new java.awt.Color(69, 73, 74));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorderColor(new java.awt.Color(55, 55, 55));
        txtNombre.setColorIcon(new java.awt.Color(255, 255, 255));
        txtNombre.setPhColor(new java.awt.Color(204, 204, 204));
        txtNombre.setPlaceholder("NOMBRE");

        txtValor.setBackground(new java.awt.Color(69, 73, 74));
        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setToolTipText("");
        txtValor.setBorderColor(new java.awt.Color(55, 55, 55));
        txtValor.setColorIcon(new java.awt.Color(255, 255, 255));
        txtValor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);
        txtValor.setPhColor(new java.awt.Color(204, 204, 204));
        txtValor.setPlaceholder("VALOR");

        txtCantidad.setBackground(new java.awt.Color(69, 73, 74));
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorderColor(new java.awt.Color(55, 55, 55));
        txtCantidad.setColorIcon(new java.awt.Color(255, 255, 255));
        txtCantidad.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RECEIPT);
        txtCantidad.setPhColor(new java.awt.Color(204, 204, 204));
        txtCantidad.setPlaceholder("CANTIDAD");

        txtMaterial.setBackground(new java.awt.Color(69, 73, 74));
        txtMaterial.setForeground(new java.awt.Color(255, 255, 255));
        txtMaterial.setBorderColor(new java.awt.Color(55, 55, 55));
        txtMaterial.setColorIcon(new java.awt.Color(255, 255, 255));
        txtMaterial.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LABEL);
        txtMaterial.setPhColor(new java.awt.Color(204, 204, 204));
        txtMaterial.setPlaceholder("MATERIAL");

        imgCheckForm.setForeground(new java.awt.Color(255, 255, 255));
        imgCheckForm.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK_BOX);

        btnAgregarForm.setBackground(new java.awt.Color(60, 60, 60));
        btnAgregarForm.setText("AGREGAR");
        btnAgregarForm.setColorHover(new java.awt.Color(102, 102, 102));
        btnAgregarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFormActionPerformed(evt);
            }
        });

        lblCodigo.setText("codigo");

        llblError.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        llblError.setForeground(new java.awt.Color(255, 0, 0));
        llblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        llblError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(imgCheckForm, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(btnAgregarForm, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMaterial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(llblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(imgCheckForm, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llblError)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarFormMouseClicked
        
    }//GEN-LAST:event_btnCerrarFormMouseClicked

    private void btnCerrarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarFormActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarFormActionPerformed

    private void btnAgregarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFormActionPerformed
        if(this.txtNombre.getText().length() == 0 || this.txtValor.getText().length() == 0
                || this.txtCantidad.getText().length() == 0 || this.txtMaterial.getText().length() == 0) {
            this.llblError.setText("TODOS LOS CAMPOS DEBEN ESTAR COMPLETOS");
        } else {
            Sentencias s = new Sentencias();
            
            s.setProd_codigo(Integer.parseInt(this.lblCodigo.getText()));
            s.setProd_nombre(this.txtNombre.getText());
            s.setProd_valor(Integer.parseInt(this.txtValor.getText()));
            s.setProd_cantidad(Integer.parseInt(this.txtCantidad.getText()));
            s.setProd_material(this.txtMaterial.getText());
            
            if(Funciones.isRegister(s)) {
                setClean();
                Funciones.setListar("");
                JOptionPane.showMessageDialog(this, "PRODUCTO REGISTRADO EXITOSAMENTE");
            } else {
               JOptionPane.showMessageDialog(this, "ALGO SALIÓ MAL", "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
            
        }
    }//GEN-LAST:event_btnAgregarFormActionPerformed
    
    public void setClean() {
        this.txtNombre.setText("");
        this.txtValor.setText("");
        this.txtCantidad.setText("");
        this.txtMaterial.setText("");
        
        this.lblCodigo.setText(Funciones.extraerCodigoMax());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_AgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_AgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_AgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_AgregarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formulario_AgregarProd dialog = new Formulario_AgregarProd(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonRound btnAgregarForm;
    private rojerusan.RSButtonRound btnCerrarForm;
    private rojerusan.RSLabelIcon imgCheckForm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel llblError;
    private necesario.RSPanelShadow rSPanelShadow1;
    private javax.swing.JLabel txtAnadirProducto;
    private RSMaterialComponent.RSTextFieldIconUno txtCantidad;
    private RSMaterialComponent.RSTextFieldIconUno txtMaterial;
    private RSMaterialComponent.RSTextFieldIconUno txtNombre;
    private RSMaterialComponent.RSTextFieldIconUno txtValor;
    // End of variables declaration//GEN-END:variables
}
