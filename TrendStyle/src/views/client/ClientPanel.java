/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.client;

import java.awt.Toolkit;

/**
 *
 * @author Unknown Account
 */
public class ClientPanel extends javax.swing.JFrame {
    int ID = 0;
    
    /**
     * Creates new form ClientPanel
     */
    public ClientPanel(int _ID) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../media/TrendStyleIcon.png")));
        setLocationRelativeTo(null);
        this.ID = _ID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ButtonBack = new javax.swing.JButton();
        ButtonShop = new javax.swing.JButton();
        ButtonWallet = new javax.swing.JButton();
        ButtonConfiguration = new javax.swing.JButton();
        ButtonOrder = new javax.swing.JButton();
        ButtonCart = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TrendStyle - Client Panel");
        setResizable(false);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonBack.setBorderPainted(false);
        ButtonBack.setContentAreaFilled(false);
        ButtonBack.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonBack.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonBack.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        Panel.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 50));

        ButtonShop.setBorderPainted(false);
        ButtonShop.setContentAreaFilled(false);
        ButtonShop.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonShop.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonShop.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShopActionPerformed(evt);
            }
        });
        Panel.add(ButtonShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 140, 180));

        ButtonWallet.setBorderPainted(false);
        ButtonWallet.setContentAreaFilled(false);
        ButtonWallet.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonWallet.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonWallet.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWalletActionPerformed(evt);
            }
        });
        Panel.add(ButtonWallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 140, 160));

        ButtonConfiguration.setBorderPainted(false);
        ButtonConfiguration.setContentAreaFilled(false);
        ButtonConfiguration.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonConfiguration.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonConfiguration.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonConfiguration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfigurationActionPerformed(evt);
            }
        });
        Panel.add(ButtonConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 130, 170));

        ButtonOrder.setBorderPainted(false);
        ButtonOrder.setContentAreaFilled(false);
        ButtonOrder.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonOrder.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonOrder.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOrderActionPerformed(evt);
            }
        });
        Panel.add(ButtonOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 120, 160));

        ButtonCart.setBorderPainted(false);
        ButtonCart.setContentAreaFilled(false);
        ButtonCart.setMaximumSize(new java.awt.Dimension(50, 50));
        ButtonCart.setMinimumSize(new java.awt.Dimension(50, 50));
        ButtonCart.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCartActionPerformed(evt);
            }
        });
        Panel.add(ButtonCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 170, 180));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/clientPanel.png"))); // NOI18N
        Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShopActionPerformed
        ClientShopScreen page = new ClientShopScreen(this.ID);
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonShopActionPerformed

    private void ButtonWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWalletActionPerformed
        ClientWalletScreen page = new ClientWalletScreen(this.ID);
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonWalletActionPerformed

    private void ButtonConfigurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfigurationActionPerformed
        ClientConfigurationScreen page = new ClientConfigurationScreen(this.ID);
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonConfigurationActionPerformed

    private void ButtonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOrderActionPerformed
        ClientOrderScreen page = new ClientOrderScreen(this.ID);
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonOrderActionPerformed

    private void ButtonCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCartActionPerformed
        ClientCartScreen page = new ClientCartScreen(this.ID);
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonCartActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        ClientHomeScreen page = new ClientHomeScreen();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientPanel(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonCart;
    private javax.swing.JButton ButtonConfiguration;
    private javax.swing.JButton ButtonOrder;
    private javax.swing.JButton ButtonShop;
    private javax.swing.JButton ButtonWallet;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
