package application;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import bd.Select;
import views.FormeDeRegistration;
import views.Menu;


public class MonAppliFonctionne {

	public static void main(String[] args) throws IOException, InterruptedException, SQLException 
	{
/*		Connexion connexion = new Connexion("Database.db");
	    connexion.connect();
	    ResultSet resultSet = connexion.query("SELECT * FROM Calories");
	    try {
	        while (resultSet.next()) {
	            System.out.println("Aliment : "+resultSet.getString("aliment"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    ResultSet resultSet1 = connexion.query("SELECT aliment FROM Calories WHERE id = '1' or id = '2'");
        while ( resultSet1.next() ) {
            String lastName = resultSet1.getString("aliment");
            System.out.println(lastName);
        }
        */
        
        
         Select prod = new Select();
         prod.selectAll();
         prod.selectAllProd();
      
	    
	    
	
	String fileName = "C:\\Users\\marga\\git\\MarharytaLosieva\\User.json";
	if ((new File(fileName)).exists()) {
		System.out.println("Déjà existant");
//		User.getUser().AfficherNorme();
	} else {
		FormeDeRegistration f = new FormeDeRegistration();
//		User.getUser().AfficherNorme();
	}
	
	while ((new File(fileName)).exists() == false) {
		TimeUnit.SECONDS.sleep(1);
		}
	System.out.println(prod.getResult());
//	prod.getString();
	Menu m = new Menu();
	System.out.println(Arrays.toString(prod.getResult()));
	String[] array = Arrays.toString(prod.getResult()).split(" ,");
	prod.listingProduits();
	
	}
}