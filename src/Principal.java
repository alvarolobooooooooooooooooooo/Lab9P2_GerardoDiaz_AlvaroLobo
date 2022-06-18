
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agln7
 */
public class Principal extends javax.swing.JFrame {
int numero1;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregarCarpeta = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_nombreCarpeta = new javax.swing.JTextField();
        crearCarpeta = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tree_carpetas = new javax.swing.JTree();
        jd_AgregarArchivo = new javax.swing.JDialog();
        tf_nombreArchivo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_ext = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tf_tamanoArchivo = new javax.swing.JTextField();
        crearArchivo = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tree_archivos = new javax.swing.JTree();
        jd_miUnidad = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tree_miunidad = new javax.swing.JTree();
        popup_destacado = new javax.swing.JPopupMenu();
        Destacado = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jd_destacados = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree_destacados = new javax.swing.JTree();
        jd_Papelera = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree_papelera = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLabel1.setText("Nombre");

        crearCarpeta.setText("Crear Carpeta");
        crearCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCarpetaMouseClicked(evt);
            }
        });
        crearCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCarpetaActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mi Unidad");
        tree_carpetas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(tree_carpetas);

        javax.swing.GroupLayout jd_agregarCarpetaLayout = new javax.swing.GroupLayout(jd_agregarCarpeta.getContentPane());
        jd_agregarCarpeta.getContentPane().setLayout(jd_agregarCarpetaLayout);
        jd_agregarCarpetaLayout.setHorizontalGroup(
            jd_agregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarCarpetaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jd_agregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearCarpeta)
                    .addComponent(tf_nombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jd_agregarCarpetaLayout.setVerticalGroup(
            jd_agregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarCarpetaLayout.createSequentialGroup()
                .addGroup(jd_agregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregarCarpetaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jd_agregarCarpetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_nombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(crearCarpeta))
                    .addGroup(jd_agregarCarpetaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre");

        jLabel3.setText("Extension");

        cb_ext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "pdf", "txt", "docx", "mp4" }));

        jLabel4.setText("Tamano");

        crearArchivo.setText("Crear Archivo");
        crearArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearArchivoMouseClicked(evt);
            }
        });

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mi Unidad");
        tree_archivos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane5.setViewportView(tree_archivos);

        javax.swing.GroupLayout jd_AgregarArchivoLayout = new javax.swing.GroupLayout(jd_AgregarArchivo.getContentPane());
        jd_AgregarArchivo.getContentPane().setLayout(jd_AgregarArchivoLayout);
        jd_AgregarArchivoLayout.setHorizontalGroup(
            jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarArchivoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearArchivo)
                    .addComponent(tf_tamanoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jd_AgregarArchivoLayout.setVerticalGroup(
            jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarArchivoLayout.createSequentialGroup()
                .addGroup(jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarArchivoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jd_AgregarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_tamanoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(crearArchivo))
                    .addGroup(jd_AgregarArchivoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mi Unidad");
        tree_miunidad.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree_miunidad.setComponentPopupMenu(popup_destacado);
        tree_miunidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_miunidadMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tree_miunidad);

        javax.swing.GroupLayout jd_miUnidadLayout = new javax.swing.GroupLayout(jd_miUnidad.getContentPane());
        jd_miUnidad.getContentPane().setLayout(jd_miUnidadLayout);
        jd_miUnidadLayout.setHorizontalGroup(
            jd_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jd_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jd_miUnidadLayout.setVerticalGroup(
            jd_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jd_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        Destacado.setText("Destacar");
        Destacado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestacadoActionPerformed(evt);
            }
        });
        popup_destacado.add(Destacado);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        popup_destacado.add(eliminar);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Destacados");
        tree_destacados.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(tree_destacados);

        javax.swing.GroupLayout jd_destacadosLayout = new javax.swing.GroupLayout(jd_destacados.getContentPane());
        jd_destacados.getContentPane().setLayout(jd_destacadosLayout);
        jd_destacadosLayout.setHorizontalGroup(
            jd_destacadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jd_destacadosLayout.setVerticalGroup(
            jd_destacadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Papelera");
        tree_papelera.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(tree_papelera);

        javax.swing.GroupLayout jd_PapeleraLayout = new javax.swing.GroupLayout(jd_Papelera.getContentPane());
        jd_Papelera.getContentPane().setLayout(jd_PapeleraLayout);
        jd_PapeleraLayout.setHorizontalGroup(
            jd_PapeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jd_PapeleraLayout.setVerticalGroup(
            jd_PapeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Guardar Datos antes de Desconectar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Mi Unidad");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Destacados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Papelera");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu2.setText("Agregar");

        jMenuItem4.setText("Carpeta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Archivo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1042, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearCarpetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCarpetaMouseClicked
        String nombre = tf_nombreCarpeta.getText();

        Random r = new Random();
        int random = 10000 + r.nextInt(99999);
        String linkaux = "dive.google.com/"+random;

        Carpeta c = new Carpeta(nombre, linkaux);
        carpetas.add(c);
        
        DefaultTreeModel modelo = (DefaultTreeModel) tree_miunidad.getModel();
        DefaultMutableTreeNode carpeta = new DefaultMutableTreeNode(c);
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree_carpetas.getLastSelectedPathComponent();
        node.add(carpeta);
        modelo.reload();
        tree_carpetas.setModel(modelo);
        tree_archivos.setModel(modelo);
        tf_nombreCarpeta.setText("");
        jd_agregarCarpeta.dispose();
    }//GEN-LAST:event_crearCarpetaMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jd_agregarCarpeta.pack();
        jd_agregarCarpeta.setLocationRelativeTo(this);
        jd_agregarCarpeta.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jd_AgregarArchivo.pack();
        jd_AgregarArchivo.setLocationRelativeTo(this);
        jd_AgregarArchivo.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void crearArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearArchivoMouseClicked

        try {
            String nombre = tf_nombreArchivo.getText();
            String extension = (String) cb_ext.getSelectedItem();
            int tamano = Integer.parseInt(tf_tamanoArchivo.getText());
            Random r = new Random();
            int random = 10000 + r.nextInt(99999);
            String linkaux = "dive.google.com/"+random;
            Archivo a = new Archivo(nombre, linkaux, extension, tamano);
            archivos.add(a);

            DefaultTreeModel modelo = (DefaultTreeModel) tree_miunidad.getModel();
            DefaultMutableTreeNode archivo = new DefaultMutableTreeNode(a);
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree_archivos.getLastSelectedPathComponent();
            
            node.add(archivo);
            modelo.reload();
            tree_carpetas.setModel(modelo);
            tree_archivos.setModel(modelo);
            tf_nombreArchivo.setText("");
            tf_tamanoArchivo.setText("");
            cb_ext.setSelectedItem(" ");
            jd_AgregarArchivo.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Seleccione una Carpeta");
        }
        
        
    }//GEN-LAST:event_crearArchivoMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_miUnidad.pack();
        jd_miUnidad.setLocationRelativeTo(this);
        jd_miUnidad.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void crearCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCarpetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearCarpetaActionPerformed

    private void tree_miunidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_miunidadMouseClicked
        if (evt.isMetaDown()) {
            
        }
    }//GEN-LAST:event_tree_miunidadMouseClicked

    private void DestacadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestacadoActionPerformed
        if (tree_miunidad.getSelectionCount() > 0) {
            DefaultTreeModel modelo = (DefaultTreeModel) tree_miunidad.getModel();
            DefaultTreeModel transferir = (DefaultTreeModel) tree_destacados.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) transferir.getRoot();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree_miunidad.getLastSelectedPathComponent();
            raiz.add(node);
            modelo.removeNodeFromParent(node);
            modelo.reload();
            transferir.reload();
            
        }
    }//GEN-LAST:event_DestacadoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_destacados.pack();
        jd_destacados.setLocationRelativeTo(this);
        jd_destacados.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jd_Papelera.pack();
        jd_Papelera.setLocationRelativeTo(this);
        jd_Papelera.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (tree_miunidad.getSelectionCount() > 0) {
            DefaultTreeModel modelo = (DefaultTreeModel) tree_miunidad.getModel();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree_miunidad.getLastSelectedPathComponent();
            modelo.removeNodeFromParent(node);
            modelo.reload();
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            for (int i = 0; i < archivos.size(); i++) {
                agregarABasedeDatos(archivos.get(i).getTamano(), archivos.get(i).getNombre());
            }
            JOptionPane.showMessageDialog(null, "Archivos guardados correctamente");
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Destacado;
    private javax.swing.JComboBox<String> cb_ext;
    private javax.swing.JButton crearArchivo;
    private javax.swing.JButton crearCarpeta;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JDialog jd_AgregarArchivo;
    private javax.swing.JDialog jd_Papelera;
    private javax.swing.JDialog jd_agregarCarpeta;
    private javax.swing.JDialog jd_destacados;
    private javax.swing.JDialog jd_miUnidad;
    private javax.swing.JPopupMenu popup_destacado;
    private javax.swing.JTextField tf_nombreArchivo;
    private javax.swing.JTextField tf_nombreCarpeta;
    private javax.swing.JTextField tf_tamanoArchivo;
    private javax.swing.JTree tree_archivos;
    private javax.swing.JTree tree_carpetas;
    private javax.swing.JTree tree_destacados;
    private javax.swing.JTree tree_miunidad;
    private javax.swing.JTree tree_papelera;
    // End of variables declaration//GEN-END:variables
    ArrayList <Carpeta> carpetas = new ArrayList();
    ArrayList <Archivo> archivos = new ArrayList();
    administrarTiempo HT;
    administrarTiempo AT;
    bitacora b;

    
    
    
    public void agregarABasedeDatos(int tamano, String nombre) throws java.sql.SQLException{
        Dba db = new Dba("./base1.mdb");
        db.conectar();
        try {
            int c;
            String n;
            c = tamano;
            n = nombre;
            db.query.execute("INSERT INTO alumnos"
                    + " (tamano,nombre)"
                    + " VALUES ('" + c + "', '" + n + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        

        


    }
}
