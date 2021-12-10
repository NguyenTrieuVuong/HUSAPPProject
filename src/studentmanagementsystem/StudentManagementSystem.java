/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import javax.swing.UIManager;

/**
 *
 * @author admin
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
        try {
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
