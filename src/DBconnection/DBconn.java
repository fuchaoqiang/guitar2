package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	private static final String DBDRIVER = "org.sqlite.JDBC";
	private static Connection conn;
public static  Connection getConnection() {
	try {
		Class.forName(DBDRIVER);
		try {
			//閰嶇疆浜嗙郴缁熻矾寰勶紵锛燂紵锛燂紵锛�
			conn = DriverManager.getConnection("jdbc:sqlite://E:/old eclipse/Guitar v2.0/guitar.db"); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return conn;

}
	
	public void close() throws Exception {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}
}
