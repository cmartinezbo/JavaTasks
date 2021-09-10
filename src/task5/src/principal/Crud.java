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
public class Crud extends javax.swing.JFrame {

    /**
     * Creates new form Crud
     */
    public Crud() {
        initComponents();
        
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        
        Funciones.setListar("");
        
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        rSPanelShadow2 = new necesario.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtMisProductos = new javax.swing.JLabel();
        btnCerrrar = new rojerusan.RSButtonRound();
        imgProductos = new rojerusan.RSLabelIcon();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new rojerusan.RSTableMetro();
        btnNuevo = new rojerusan.RSButtonRound();
        btnEditar = new rojerusan.RSButtonRound();
        btnEliminar = new rojerusan.RSButtonRound();
        btnEliminarTodo = new rojerusan.RSButtonRound();
        txtBuscar = new RSMaterialComponent.RSTextFieldIconDos();

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButton1.setBackground(new java.awt.Color(60, 60, 60));
        rSButton1.setText("rSButton1");
        rSButton1.setColorHover(new java.awt.Color(102, 102, 102));
        menu.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rSButton2.setText("rSButton1");
        menu.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(55, 55, 55));

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));

        txtMisProductos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtMisProductos.setForeground(new java.awt.Color(255, 255, 255));
        txtMisProductos.setText("MIS PRODUCTOS");
        txtMisProductos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCerrrar.setBackground(new java.awt.Color(60, 60, 60));
        btnCerrrar.setText("X");
        btnCerrrar.setColorHover(new java.awt.Color(162, 10, 10));
        btnCerrrar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCerrrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrrarMouseClicked(evt);
            }
        });

        imgProductos.setForeground(new java.awt.Color(255, 255, 255));
        imgProductos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOPPING_CART);
        imgProductos.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMisProductos)
                .addGap(76, 76, 76)
                .addComponent(btnCerrrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtMisProductos)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tablaProducto.setBackground(new java.awt.Color(69, 73, 74));
        tablaProducto.setForeground(new java.awt.Color(255, 255, 255));
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "VALOR", "CANTIDAD", "MATERIAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.setAltoHead(30);
        tablaProducto.setColorBackgoundHead(new java.awt.Color(60, 60, 60));
        tablaProducto.setColorBordeFilas(new java.awt.Color(60, 60, 60));
        tablaProducto.setColorBordeHead(new java.awt.Color(100, 100, 100));
        tablaProducto.setColorFilasBackgound1(new java.awt.Color(69, 73, 74));
        tablaProducto.setColorFilasBackgound2(new java.awt.Color(69, 73, 74));
        tablaProducto.setColorFilasForeground1(new java.awt.Color(255, 255, 255));
        tablaProducto.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        tablaProducto.setColorSelBackgound(new java.awt.Color(100, 100, 100));
        tablaProducto.setComponentPopupMenu(jPopupMenu1);
        tablaProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaProducto.setGridColor(new java.awt.Color(100, 100, 100));
        tablaProducto.setSelectionBackground(new java.awt.Color(100, 100, 100));
        tablaProducto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaProducto);

        btnNuevo.setBackground(new java.awt.Color(60, 60, 60));
        btnNuevo.setText("NUEVO");
        btnNuevo.setColorHover(new java.awt.Color(102, 102, 102));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(60, 60, 60));
        btnEditar.setText("EDITAR");
        btnEditar.setColorHover(new java.awt.Color(102, 102, 102));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(60, 60, 60));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setColorHover(new java.awt.Color(102, 102, 102));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEliminarTodo.setBackground(new java.awt.Color(60, 60, 60));
        btnEliminarTodo.setText("ELIMINAR TODO");
        btnEliminarTodo.setColorHover(new java.awt.Color(102, 102, 102));
        btnEliminarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarTodoMouseClicked(evt);
            }
        });
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(60, 60, 60));
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorderColor(new java.awt.Color(60, 60, 60));
        txtBuscar.setColorIcon(new java.awt.Color(255, 255, 255));
        txtBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtBuscar.setPhColor(new java.awt.Color(204, 204, 204));
        txtBuscar.setPlaceholder("BUSCAR POR CÓDIGO");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        rSPanelShadow2.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrrarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        Formulario_AgregarProd f = new Formulario_AgregarProd(this, true);
        f.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
  
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarTodoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarTodoMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tablaProducto.getSelectedRow();
        
        try {
            Formulario_Update f = new Formulario_Update(this, true);
            f.txtNombre.setText(tablaProducto.getValueAt(fila, 1).toString());
            f.txtValor.setText(tablaProducto.getValueAt(fila, 2).toString());
            f.txtCantidad.setText(tablaProducto.getValueAt(fila, 3).toString());
            f.txtMaterial.setText(tablaProducto.getValueAt(fila, 4).toString());
            f.lblCodigo.setText(tablaProducto.getValueAt(fila, 0).toString());
            f.setVisible(true);
        } catch(ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "SELECCIONE UN PRODUCTO PARA EDITAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaProducto.getSelectedRow();
        
        Sentencias s = new Sentencias();
        s.setProd_codigo(Integer.parseInt(tablaProducto.getValueAt(fila, 0).toString()));
        
        if (JOptionPane.showConfirmDialog(this, "¿ELIMINAR PRODUCTO?", "", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (Funciones.isDelete(s)) {
                Funciones.setListar("");
                JOptionPane.showMessageDialog(this, "PRODUCTO ELIMINADO EXITOSAMENTE", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "ALGO SALIÓ MAL", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
       
        if (JOptionPane.showConfirmDialog(this, "¿ELIMINAR TODOS LOS PRODUCTOS?", "", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (Funciones.isTruncate()) {
                Funciones.setListar("");
                JOptionPane.showMessageDialog(this, "PRODUCTOS ELIMINADOS EXITOSAMENTE", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "ALGO SALIÓ MAL", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Funciones.setListar(this.txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased
    
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
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonRound btnCerrrar;
    private rojerusan.RSButtonRound btnEditar;
    private rojerusan.RSButtonRound btnEliminar;
    private rojerusan.RSButtonRound btnEliminarTodo;
    private rojerusan.RSButtonRound btnNuevo;
    private rojerusan.RSLabelIcon imgProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private necesario.RSPanelShadow rSPanelShadow2;
    public static rojerusan.RSTableMetro tablaProducto;
    private RSMaterialComponent.RSTextFieldIconDos txtBuscar;
    private javax.swing.JLabel txtMisProductos;
    // End of variables declaration//GEN-END:variables
}