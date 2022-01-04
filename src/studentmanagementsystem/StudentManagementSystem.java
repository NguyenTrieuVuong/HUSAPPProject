/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.UIManager;

/**
 *
 * @author admin
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            LoginFrame lf = new LoginFrame();
            lf.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
