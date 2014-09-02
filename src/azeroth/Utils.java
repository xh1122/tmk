package azeroth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {

	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
	    String url="jdbc:oracle:thin:@zzhangxh-PC:1521:ORCL";
	    //orcl为数据库的SID
	    String user="plan";
	    String password="plan";
	    Connection conn= DriverManager.getConnection(url,user,password);
	    return conn;
	}
}
