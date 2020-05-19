package views;

import entities.Buku;
import javax.swing.JOptionPane;
import models.Order;
import models.OrderItem;

public class OrderDialog extends javax.swing.JDialog {

    private MainFrame parent;
    private Order order;
    private int total;

    public OrderDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = (MainFrame) parent;
        initComponents();
        createOrder();
    }

    private void createOrder() {
        order = parent.getController().createOrder();
        total = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrderItem = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderedBooksList = new javax.swing.JTextArea();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Order");

        btnOrderItem.setText("Add Order Item");
        btnOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewItem(evt);
            }
        });

        checkoutButton.setText("Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        orderedBooksList.setColumns(20);
        orderedBooksList.setRows(5);
        jScrollPane1.setViewportView(orderedBooksList);

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrderItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOrderItem)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutButton)
                    .addComponent(lblTotal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewItem
        String id = JOptionPane.showInputDialog("Masukkan id product ?");
        if (id != null) {
            Buku book = parent.getController().findProductById(id);
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("jumlah?"));
            OrderItem item = new OrderItem(book, quantity);
            order.addOrderItem(item);
            orderedBooksList.append("\n" + item.getBuku().getTitle() + "\t"
                    + item.getBuku().getPrice() + "\t" + item.getJumlah()
                    + "\t" + item.getSubtotal());
            total += item.getSubtotal();
            lblTotal.setText("" + total);
        }
    }//GEN-LAST:event_addNewItem

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
        parent.getController().getmodel().addOrder(order);
        order.cetakInvoice();
        dispose();
    }//GEN-LAST:event_checkoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OrderDialog dialog = new OrderDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnOrderItem;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextArea orderedBooksList;
    // End of variables declaration//GEN-END:variables

}
