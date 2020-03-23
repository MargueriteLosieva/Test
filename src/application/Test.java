package application;


import java.util.Calendar;

/*import org.exolab.castor.jdo.Database;
import org.exolab.castor.jdo.JDOManager;*/

//import java.sql.Date;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.sqlite.core.DB;


public class Test {
	public static void main (String [] args) {
	User f1  = new User();
	f1.setSexeFemme();
	f1.setAge(21);
	f1.setNom("Rita");
	f1.setPoids(55);
	f1.setTaille(165);
	f1.AfficherNorme();
	Connexion connexion = new Connexion("Database.db");
    connexion.connect();
    ResultSet resultSet = connexion.query("SELECT * FROM Calories");
    try {
        while (resultSet.next()) {
            System.out.println("Aliment : "+resultSet.getString("Aliment"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    
    
   PetitDejeuner p1 = new PetitDejeuner();
   Produit prod1 = new Produit("10", "Fromage à tartiner", 252, 4.5, 25, 3);
   Produit prod2 = new Produit("11", "Tuiles", 503, 4.8, 26, 61);
   prod2.setPoidsConsomee(115);
   System.out.println(prod2.caloriesConsomees());
   Date today = new Date();
   Date currentDate = new Date();

   // convert date to calendar
   Calendar c = Calendar.getInstance();
   c.setTime(currentDate);

   // manipulate date
   c.add(Calendar.DATE, 1); //same with c.add(Calendar.DAY_OF_MONTH, 1);
   // convert calendar to date
   Date currentDatePlusOne = c.getTime();
   
   
   p1.setDate(today);
   p1.consommerProduits(prod1);
   p1.consommerProduits(prod2);
//   System.out.println(prod1.toString());
   Dejeuner p2 = new Dejeuner();
   p2.setDate(currentDatePlusOne);
   p2.consommerProduits(prod1);
   
   p1.listing();
   p2.listing();
 
   
   Statistiques s = new Statistiques();
   s.ajouterRepas(p1);
   s.ajouterRepas(p2);
   s.statistiques();
   connexion.close();
   
	}
}