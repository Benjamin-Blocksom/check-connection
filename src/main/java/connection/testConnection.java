package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class testConnection {
   public static void main(String args[]) {
      Connection c = null;
      try {
    	  

         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://postgres.c4kahwlnzjau.us-east-1.rds.amazonaws.com:5432/postgres",
            "postgres", "password");
         
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      
   }
}
