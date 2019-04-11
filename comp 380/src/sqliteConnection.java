
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class sqliteConnection {
Connection conn=null;
public static Connection dbConnector()
{
	try{
		Class.forName("org.sqlite.JDBC");
		Connection connection= DriverManager.getConnection("jdbc:sqlite:database.db");
		JOptionPane.showMessageDialog(null, "Connection is Successfull");
		return connection;
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
}
}