/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import Hus.Bangdiem;
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

public class BangdiemModify {

    public static void insert(Bangdiem bd) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach giang vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "insert into bangdiem(hocphan, id, diemthuongxuyen, diemgiuaky, diemcuoiky, diemTBC, diemchu) values(?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, bd.getHocPhan());
            statement.setString(2, bd.getID());
            statement.setFloat(3, bd.getDiemThuongXuyen());
            statement.setFloat(4, bd.getDiemGiuaKy());
            statement.setFloat(5, bd.getDiemCuoiKy());
            statement.setFloat(6, bd.getDiemTBC());
            statement.setString(7, bd.getDiemTuongUng());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<Bangdiem> findAll() {
        List<Bangdiem> bangdiemList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach giang vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "select * from bangdiem";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Bangdiem bd = new Bangdiem(resultSet.getInt("stt"), resultSet.getString("hocphan"),
                        resultSet.getString("id"),
                        resultSet.getFloat("diemthuongxuyen"),
                        resultSet.getFloat("diemgiuaky"),
                        resultSet.getFloat("diemcuoiky"),
                        resultSet.getFloat("diemTBC"),
                        resultSet.getString("diemchu"));
                bangdiemList.add(bd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return bangdiemList;
    }

    public static boolean update(Bangdiem bd) throws Exception {
        String sql = "update bangdiem set hocphan=?,id=?,diemthuongxuyen=?,diemgiuaky=?,diemcuoiky=?,diemTBC=?,diemchu=? where id ='" + bd.getID() + "'";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
//            statement.setInt(8, bd.getStt());
            statement.setString(1, bd.getHocPhan());
            statement.setString(2, bd.getID());
            statement.setFloat(3, bd.getDiemThuongXuyen());
            statement.setFloat(4, bd.getDiemGiuaKy());
            statement.setFloat(5, bd.getDiemCuoiKy());
            statement.setFloat(6, bd.getDiemTBC());
            statement.setString(7, bd.getDiemTuongUng());
            return statement.executeUpdate() > 0;
        }
    }
    public static void delete(int STT) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");

            //query
            String sql = "delete from bangdiem where stt = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, STT);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BangdiemModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static Bangdiem findByHocPhan(int STT) throws Exception {
        String sql = "select * from bangdiem where stt = ?";
        try (
                 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/husapp", "root", "");  PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, STT);
            try ( ResultSet rs = statement.executeQuery();) {
                if (rs.next()) {
                    Bangdiem bd = new Bangdiem();
                    bd.setStt(rs.getInt("stt"));
                    bd.setHocPhan(rs.getString("hocphan"));
                    bd.setID(rs.getString("id"));
                    bd.setDiemThuongXuyen(rs.getFloat("diemthuongxuyen"));
                    bd.setDiemGiuaKy(rs.getFloat("diemgiuaky"));
                    bd.setDiemCuoiKy(rs.getFloat("diemcuoiky"));
                    bd.setDiemTBC(rs.getFloat("diemTBC"));
                    bd.setDiemTuongUng(rs.getString("diemchu"));
                    return bd;
                }
            }
        }
        return null;
    }
}
