/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Principal;

import javax.swing.JMenuItem;

/**
 *
 * @author motal
 */
public class FigurasG extends javax.swing.JFrame {

    /**
     * Creates new form FigurasG
     */
    public FigurasG() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmFigura1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jmFigura2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jmFigura3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmFigura4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmFigura5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmFigura6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 204));
        jDesktopPane1.setToolTipText("");

        jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jInternalFrame2)
                .addGap(57, 57, 57))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 153));

        jMenu2.setText("Archivo");

        jmFigura1.setText("Figura1");
        jmFigura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFigura1ActionPerformed(evt);
            }
        });
        jMenu2.add(jmFigura1);
        jMenu2.add(jSeparator6);

        jmFigura2.setText("Figura2");
        jMenu2.add(jmFigura2);
        jMenu2.add(jSeparator5);

        jmFigura3.setText("Figura3");
        jMenu2.add(jmFigura3);
        jMenu2.add(jSeparator4);

        jmFigura4.setText("Figura4");
        jMenu2.add(jmFigura4);
        jMenu2.add(jSeparator3);

        jmFigura5.setText("Figura5");
        jMenu2.add(jmFigura5);
        jMenu2.add(jSeparator2);

        jmFigura6.setText("Figura6");
        jMenu2.add(jmFigura6);
        jMenu2.add(jSeparator1);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jmSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void jmFigura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFigura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmFigura1ActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmSalirActionPerformed

    public JMenuItem getJmFigura1() {
        return jmFigura1;
    }

    public void setJmFigura1(JMenuItem jmFigura1) {
        this.jmFigura1 = jmFigura1;
    }

    public JMenuItem getJmFigura2() {
        return jmFigura2;
    }

    public void setJmFigura2(JMenuItem jmFigura2) {
        this.jmFigura2 = jmFigura2;
    }

    public JMenuItem getJmFigura3() {
        return jmFigura3;
    }

    public void setJmFigura3(JMenuItem jmFigura3) {
        this.jmFigura3 = jmFigura3;
    }

    public JMenuItem getJmFigura4() {
        return jmFigura4;
    }

    public void setJmFigura4(JMenuItem jmFigura4) {
        this.jmFigura4 = jmFigura4;
    }

    public JMenuItem getJmFigura5() {
        return jmFigura5;
    }

    public void setJmFigura5(JMenuItem jmFigura5) {
        this.jmFigura5 = jmFigura5;
    }

    public JMenuItem getJmFigura6() {
        return jmFigura6;
    }

    public void setJmFigura6(JMenuItem jmFigura6) {
        this.jmFigura6 = jmFigura6;
    }

    public JMenuItem getJmSalir() {
        return jmSalir;
    }

    public void setJmSalir(JMenuItem jmSalir) {
        this.jmSalir = jmSalir;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem jmFigura1;
    private javax.swing.JMenuItem jmFigura2;
    private javax.swing.JMenuItem jmFigura3;
    private javax.swing.JMenuItem jmFigura4;
    private javax.swing.JMenuItem jmFigura5;
    private javax.swing.JMenuItem jmFigura6;
    private javax.swing.JMenuItem jmSalir;
    // End of variables declaration//GEN-END:variables

}
