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
import Hus.Giangvien;

public class GiangvienModify {
    public static void insert(Giangvien gv) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach giang vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "insert into giangvien(id, name, email, gender) values(?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, gv.getID());
            statement.setString(2, gv.getName());
            statement.setString(3, gv.getEmail());
            statement.setString(4, gv.getGender());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static List<Giangvien> findAll() {
        List<Giangvien> giangvienList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach giang vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "select * from giangvien";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Giangvien std = new Giangvien(resultSet.getString("id"),
                        resultSet.getString("name"), resultSet.getString("email"),
                        resultSet.getString("gender"));
                giangvienList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return giangvienList;
    }
    public static boolean update(Giangvien gv) throws Exception {
        String sql = "update giangvien set name=?,email=?,gender=?,lophoc=? where id = ?";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(5, gv.getID());
            statement.setString(1, gv.getName());
            statement.setString(2, gv.getEmail());
            statement.setString(3, gv.getGender());
            return statement.executeUpdate() > 0;
        }
    }

    public static void delete(String ID) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach giang vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "delete from giangvien where id = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, ID);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static Giangvien findByID(String ID) throws Exception {
        String sql = "select * from giangvien where id = ?";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1, ID);
            try ( ResultSet rs = statement.executeQuery();) {
                if (rs.next()) {
                    Giangvien gv = new Giangvien();
                    gv.setID(rs.getString("id"));
                    gv.setName(rs.getString("name"));
                    gv.setEmail(rs.getString("email"));
                    gv.setGender(rs.getString("gender"));
                    return gv;
                }
            }
        }
        return null;
    }
}

