package bd;

import java.sql.DriverManager;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
 

public class Select {
 
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D://Tableau des calories/Tableau des calories.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
    
    
    public void selectAll(){
        String sql = "SELECT id, aliment, calories FROM calories";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("id") +  "\t" + 
                                   rs.getString("aliment") + "\t"+
                                   rs.getDouble("calories"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    ArrayList<String> list= new ArrayList<String>();
    private String[] result = new String[list.size()];
    public void selectAllProd(){
        String sql = "SELECT aliment FROM calories";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
            	list.add(rs.getString("aliment")); 
     //           System.out.println(rs.getString("aliment"));
            }
            
            setResult(list.toArray(getResult()));
            for(int i =0; i<getResult().length; i++){
    //        	System.out.println("Hey");
                System.out.println(getResult()[i]);
            }
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
   

	public String[] getResult() {
		return this.result;
	}



	public void setResult(String[] result) {
		this.result = result;
	}
	
	public void listingProduits() {
		 for(int i =0; i<getResult().length; i++){
			 if(this.result[i] != null) {
				 System.out.println(getResult()[i]);
			 }
		}
	}
    
	

    
/*    public void selectAllProd(){
        String sql = "SELECT aliment FROM calories";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
        	while (rs.next()) {
        	    Array z = rs.getArray("ZIPS");
        	    String[] zips = (String[])z.getArray();
        	    for (int i = 0; i < zips.length; i++) {
    //    	        if (!ZipCode.isValid(zips[i])) {
        	            // ...
        	            // Code to display warning
        	        }
        	    
        	    }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public String[] getZip() {
		return zips;
	}
    	*/
    
    

    
    
    

    /**
     * @param args the command line arguments
     */
  
 
}
