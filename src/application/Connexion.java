package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Connexion {
	private String DBPath = "D:\\Tableau des calories\\Tableau des calories.db";
	private Connection connection = null;
	private Statement statement = null;
	 
	public Connexion (String DBPath) {
		DBPath = this.DBPath;
	    }
	 
	public void connect() {
		try {
	    	Class.forName("org.sqlite.JDBC");
	        connection = DriverManager.getConnection("jdbc:sqlite:" + DBPath);
	        statement = connection.createStatement();
	        System.out.println("Connexion a " + DBPath + " avec succès");        
	        } 
		catch (ClassNotFoundException notFoundException) {
			notFoundException.printStackTrace();
	        System.out.println("Erreur de connexion");
	    } 
		catch (SQLException sqlException) {
	        sqlException.printStackTrace();
	        System.out.println("Erreur de connexion");
	    }
	}
	 
	    public void close() {
	        try {
	            connection.close();
	            statement.close();
	        } 
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public ResultSet query(String requet) {
	        ResultSet resultat = null;
	        try {
	            resultat = statement.executeQuery(requet);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("Erreur dans la requet : " + requet);
	        }
	        return resultat;
	  
	    }
	

}