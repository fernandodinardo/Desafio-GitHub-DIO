package mapaprogramacaoii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author fdinardo
 */
public class PassowordScreen extends javax.swing.JFrame {

    List<Senhas> listaSenhas;
    int numero;

    public PassowordScreen() {
        initComponents();
        numero = 0;
        listaSenhas = new ArrayList<Senhas>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoSenhaPainel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textoCaixaPainel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnComum = new javax.swing.JButton();
        btnRapido = new javax.swing.JButton();
        btnPrioritario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoSuaSenha = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnCaixa1 = new javax.swing.JButton();
        btnCaixa2 = new javax.swing.JButton();
        btnCaixa3 = new javax.swing.JButton();
        btnCaixa4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoSenhaPainel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        textoSenhaPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSenhaPainel.setText("AGUARDEM....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(textoSenhaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(textoSenhaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoCaixaPainel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoCaixaPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCaixaPainel.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(textoCaixaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(textoCaixaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Escolha o seu tipo de atendimento");

        btnComum.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnComum.setText("Comum");
        btnComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComumActionPerformed(evt);
            }
        });

        btnRapido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRapido.setText("Rápido");
        btnRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapidoActionPerformed(evt);
            }
        });

        btnPrioritario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPrioritario.setText("Prioritário");
        btnPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrioritarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("A sua senha é:");

        campoSuaSenha.setEditable(false);
        campoSuaSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        campoSuaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSuaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSuaSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(campoSuaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnComum)
                .addGap(44, 44, 44)
                .addComponent(btnRapido)
                .addGap(44, 44, 44)
                .addComponent(btnPrioritario)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComum)
                    .addComponent(btnRapido)
                    .addComponent(btnPrioritario))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoSuaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCaixa1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnCaixa1.setText("Caixa 01");
        btnCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa1ActionPerformed(evt);
            }
        });

        btnCaixa2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnCaixa2.setText("Caixa 02");
        btnCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa2ActionPerformed(evt);
            }
        });

        btnCaixa3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnCaixa3.setText("Caixa 03");
        btnCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa3ActionPerformed(evt);
            }
        });

        btnCaixa4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnCaixa4.setText("Caixa 04");
        btnCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaixa1)
                    .addComponent(btnCaixa3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaixa2)
                    .addComponent(btnCaixa4))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaixa1)
                    .addComponent(btnCaixa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaixa3)
                    .addComponent(btnCaixa4))
                .addGap(44, 44, 44))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("PARA OS CLIENTES:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("PARA OS CAIXAS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSuaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSuaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSuaSenhaActionPerformed

    private void btnComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComumActionPerformed
        numero++;
        Senhas senhacomum = new Senhas("C", numero);
        listaSenhas.add(senhacomum);
        campoSuaSenha.setText(String.valueOf(senhacomum.getTiposenha() + "-" + String.valueOf(senhacomum.getNumerosenha())));
    }//GEN-LAST:event_btnComumActionPerformed

    private void btnRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapidoActionPerformed
        numero++;
        Senhas senharapido = new Senhas("R", numero);
        listaSenhas.add(senharapido);
        campoSuaSenha.setText(String.valueOf(senharapido.getTiposenha() + "-" + String.valueOf(senharapido.getNumerosenha())));
    }//GEN-LAST:event_btnRapidoActionPerformed

    private void btnPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrioritarioActionPerformed
        numero++;
        Senhas senhaprioritario = new Senhas("P", numero);
        listaSenhas.add(senhaprioritario);
        campoSuaSenha.setText(String.valueOf(senhaprioritario.getTiposenha() + "-" + String.valueOf(senhaprioritario.getNumerosenha())));
    }//GEN-LAST:event_btnPrioritarioActionPerformed

    private void btnCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa1ActionPerformed

        Iterator<Senhas> senhaprioritario = listaSenhas.iterator();
        boolean prioritario = false;
        while (senhaprioritario.hasNext()) {
            Senhas numprioritario = senhaprioritario.next();
            if (numprioritario.getTiposenha().contains("P")) {
                textoSenhaPainel.setText(String.valueOf(numprioritario.getTiposenha() + "-" + String.valueOf(numprioritario.getNumerosenha())));
                senhaprioritario.remove();
                textoCaixaPainel.setText("CAIXA 01");
                prioritario = true;
                break;
            } 
            if (prioritario != false) {
            
                while (senhaprioritario.hasNext()) {
                    Senhas sprioritario = senhaprioritario.next();
                    senhaprioritario.remove();
                    textoSenhaPainel.setText(String.valueOf(sprioritario.getTiposenha() + "-" + String.valueOf(sprioritario.getNumerosenha())));
                    textoCaixaPainel.setText("CAIXA 01");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnCaixa1ActionPerformed

    private void btnCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa2ActionPerformed

        Iterator<Senhas> senharapido = listaSenhas.iterator();
        boolean rapido = false;
        while (senharapido.hasNext()) {
            Senhas numrapido = senharapido.next();
            if (numrapido.getTiposenha().contains("R")) {
                textoSenhaPainel.setText(String.valueOf(numrapido.getTiposenha() + "-" + String.valueOf(numrapido.getNumerosenha())));
                senharapido.remove();
                textoCaixaPainel.setText("CAIXA 02");
                rapido = true;
                break;
            } 
            if (rapido != false) {
            
                while (senharapido.hasNext()) {
                    Senhas srapido = senharapido.next();
                    senharapido.remove();
                    textoSenhaPainel.setText(String.valueOf(srapido.getTiposenha() + "-" + String.valueOf(srapido.getNumerosenha())));
                    textoCaixaPainel.setText("CAIXA 02");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnCaixa2ActionPerformed

    private void btnCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa3ActionPerformed

        Iterator<Senhas> senharapido = listaSenhas.iterator();
        boolean rapido = false;
        while (senharapido.hasNext()) {
            Senhas numrapido = senharapido.next();
            if (numrapido.getTiposenha().contains("R")) {
                textoSenhaPainel.setText(String.valueOf(numrapido.getTiposenha() + "-" + String.valueOf(numrapido.getNumerosenha())));
                senharapido.remove();
                textoCaixaPainel.setText("CAIXA 03");
                rapido = true;
                break;
            } 
            if (rapido != false) {
            
                while (senharapido.hasNext()) {
                    Senhas srapido = senharapido.next();
                    senharapido.remove();
                    textoSenhaPainel.setText(String.valueOf(srapido.getTiposenha() + "-" + String.valueOf(srapido.getNumerosenha())));
                    textoCaixaPainel.setText("CAIXA 03");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnCaixa3ActionPerformed

    private void btnCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa4ActionPerformed

        Iterator<Senhas> senhacomum = listaSenhas.iterator();
        boolean comum = false;
        while (senhacomum.hasNext()) {
            Senhas numcomum = senhacomum.next();
            if (numcomum.getTiposenha().contains("C")) {
                textoSenhaPainel.setText(String.valueOf(numcomum.getTiposenha() + "-" + String.valueOf(numcomum.getNumerosenha())));
                senhacomum.remove();
                textoCaixaPainel.setText("CAIXA 04");
                comum = true;
                break;
            } 
            if (comum != false) {
            
                while (senhacomum.hasNext()) {
                    Senhas scomum = senhacomum.next();
                    senhacomum.remove();
                    textoSenhaPainel.setText(String.valueOf(scomum.getTiposenha() + "-" + String.valueOf(scomum.getNumerosenha())));
                    textoCaixaPainel.setText("CAIXA 04");
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnCaixa4ActionPerformed

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
            java.util.logging.Logger.getLogger(PassowordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassowordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassowordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassowordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassowordScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa1;
    private javax.swing.JButton btnCaixa2;
    private javax.swing.JButton btnCaixa3;
    private javax.swing.JButton btnCaixa4;
    private javax.swing.JButton btnComum;
    private javax.swing.JButton btnPrioritario;
    private javax.swing.JButton btnRapido;
    private javax.swing.JTextField campoSuaSenha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel textoCaixaPainel;
    private javax.swing.JLabel textoSenhaPainel;
    // End of variables declaration//GEN-END:variables
}
