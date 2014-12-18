package ethan.v15.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @since 2014-9-16
 * @author ethan
 */

public class MySqlQuery {
	 public static void main(String[] args) throws Exception {
	      Class.forName("org.apache.hadoop.hive.jdbc.HiveDriver");
//	      Connection con = DriverManager.getConnection("jdbc:hive://host001:10000/default");
//	      Connection con = DriverManager.getConnection("jdbc:mysql://u1:3306/hive");
	      Connection con = DriverManager.getConnection("jdbc:mysql://u1:3306/nutch?user=hive&password=hive");
//	      Connection con = DriverManager.getConnection("jdbc:mysql://u1:3306/nutch?user=hive&password=hive&autoReconnect=true&failOverReadOnly=false&maxReconnects=10 ");
	      String sql = "select * from webpage";
	      PreparedStatement pst = con.prepareStatement(sql);
	      ResultSet rs = pst.executeQuery();
	      while(rs.next()){
	         System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	      }
	      System.exit(-1);
	   }
}

