package apps;

import controllers.PMController;
import entities.*;
import models.ProductManager;
import views.*;

public class App {

    private static ProductManager model;
    private static MainFrame mainFrame;
    private static Login loginForm;

    public static void main(String[] args) {
        initialApp();
        startApp();
    }

    private static void initialApp() {
        model = new ProductManager();
        model.addBuku(new Buku("NOV-BUL", "Bulan", "Tere Liye", "Gramedia", 50000));
        model.addBuku(new Buku("NOV-MTH", "Matahari", "Tere Liye", "Gramedia", 60000));
        model.addBuku(new Buku("NOV-BTG", "Bintang", "Tere Liye", "Gramedia", 70000));
        User.addUser(new Admin("dimikarillah", "12345678", "Dimi Karillah", "081238412341", "Marketing"));
        User.addUser(new Customer("zahranputra", "12345678", "Zahran Putra", "081736412384", "zahranp@gmail.com"));
    }

    private static void startApp() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginForm = new Login(model);
                loginForm.setVisible(true);
            }
        });
    }

}
