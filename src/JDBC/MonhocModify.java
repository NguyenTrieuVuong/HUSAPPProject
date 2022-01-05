/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import Hus.Monhoc;
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

/**
 *
 * @author admin
 */
public class MonhocModify {
    public static void insert(Monhoc mh) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach giang vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "insert into monhoc(mahocphan, tenhocphan, sotinchi, giangvien) values(?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, mh.getMaMon());
            statement.setString(2, mh.getTenMon());
            statement.setInt(3, mh.getSoTinChi());
            statement.setString(4, mh.getGiangVien());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static List<Monhoc> findAll() {
        List<Monhoc> monhocList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach giang vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "select * from monhoc";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Monhoc std = new Monhoc(resultSet.getString("mahocphan"),
                        resultSet.getString("tenhocphan"), 
                        resultSet.getInt("sotinchi"),
                        resultSet.getString("giangvien"));
                monhocList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return monhocList;
    }
    public static boolean update(Monhoc mh) throws Exception {
        String sql = "update monhoc set tenhocphan=?,sotinchi=?,giangvien=? where mahocphan = ?";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(4, mh.getMaMon());
            statement.setString(1, mh.getTenMon());
            statement.setInt(2, mh.getSoTinChi());
            statement.setString(3, mh.getGiangVien());
            return statement.executeUpdate() > 0;
        }
    }

    public boolean delete(String maHocPhan) throws Exception{
        String sql = "delete from monhoc where mahocphan = ?";
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");
                PreparedStatement statement = con.prepareStatement(sql);
                )  {
            statement.setString(1, maHocPhan);
            return statement.executeUpdate()>0;
        }      
    }

    public static Monhoc findByID(String maHocPhan) throws Exception {
        String sql = "select * from monhoc where mahocphan = ?";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1, maHocPhan);
            try ( ResultSet rs = statement.executeQuery();) {
                if (rs.next()) {
                    Monhoc mh = new Monhoc();
                    mh.setMaMon(rs.getString("mahocphan"));
                    mh.setTenMon(rs.getString("tenhocphan"));
                    mh.setSoTinChi(rs.getInt("sotinchi"));
                    mh.setGiangVien(rs.getString("giangvien"));
                    return mh;
                }
            }
        }
        return null;
    }
}
