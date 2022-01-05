/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Hus.Sinhvien;

public class SinhvienModify {

    public static void insert(Sinhvien sv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "insert into sinhvien(id, name, email, gender, lophoc) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, sv.getID());
            statement.setString(2, sv.getName());
            statement.setString(3, sv.getEmail());
            statement.setString(4, sv.getGender());
            statement.setString(5, sv.getLophoc());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<Sinhvien> findAll() {
        List<Sinhvien> sinhvienList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "select * from sinhvien";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Sinhvien std = new Sinhvien(resultSet.getString("id"),
                        resultSet.getString("name"), resultSet.getString("email"),
                        resultSet.getString("gender"), resultSet.getString("lophoc"));
                sinhvienList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return sinhvienList;
    }

    public static boolean update(Sinhvien sv) throws Exception {
        String sql = "update sinhvien set name=?,email=?,gender=?,lophoc=? where id = ?";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(5, sv.getID());
            statement.setString(1, sv.getName());
            statement.setString(2, sv.getEmail());
            statement.setString(3, sv.getGender());
            statement.setString(4, sv.getLophoc());
            return statement.executeUpdate() > 0;
        }
    }

//    public static void delete(String ID) {
//        Connection connection = null;
//        PreparedStatement statement = null;
//
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");
//
//            //query
//            String sql = "delete from sinhvien where id = ?";
//            statement = connection.prepareCall(sql);
//
//            statement.setString(1, ID);
//
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ket thuc.
//    }
    public boolean delete(String ID) throws Exception{
        String sql = "delete from sinhvien where id = ?";
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");
                PreparedStatement statement = con.prepareStatement(sql);
                )  {
            statement.setString(1, ID);
            return statement.executeUpdate()>0;
        }      
    }

    public static Sinhvien findByID(String ID) throws Exception {
//        Connection connection = null;
//        PreparedStatement statement = null;
        String sql = "select * from sinhvien where id = ?";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1, ID);
            try ( ResultSet rs = statement.executeQuery();) {
                if (rs.next()) {
                    Sinhvien sv = new Sinhvien();
                    sv.setID(rs.getString("id"));
                    sv.setName(rs.getString("name"));
                    sv.setEmail(rs.getString("email"));
                    sv.setGender(rs.getString("gender"));
                    sv.setLophoc(rs.getString("lophoc"));
                    return sv;
                }
            }
        }
        return null;
    }
}
