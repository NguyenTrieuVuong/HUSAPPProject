
package ConnectSQL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 20002
 * Nov 27, 2021 1:43:10 PM
 */
public class ConnectToMSSQL {
//        public Connection getConnection()throws Exception {
//        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
//        if(instance == null || instance.trim().isEmpty())
//            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        return DriverManager.getConnection(url, userID, password);
//    }   
//    
//    private final String serverName = "DESKTOP-FUP1GOG\\SQLEXPRESS";
//    private final String dbName = "SchoolApp";
//    private final String portNumber = "1433";
//    private final String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
//    private final String userID = "sa";
//    private final String password = "12345";
    public static void main(String[] args) throws SQLServerException {
        var server = "DESKTOP-FUP1GOG\\\\SQLEXPRESS";
        var user = "sa";
        var pass = "12345";
        var db = "SchoolApp";
        var port = 1433;

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(pass);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);

        try ( Connection conn = ds.getConnection()) {
            System.out.println("Connection successfully");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
