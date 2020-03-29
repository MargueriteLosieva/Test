package application;

import java.util.ArrayList;
import java.util.Date;

public class Repas {
	
	private Date date;
	private ArrayList<Produit> produitsConsommee = new ArrayList<Produit>();

	
	public ArrayList<Produit> getProduitsConsommee() {
		return this.produitsConsommee;
	}
	public void setProduitsConsommee(ArrayList<Produit> produitsConsommee) {
		this.produitsConsommee = produitsConsommee;
	}
	public void consommerProduits (Produit prod) {
		this.getProduitsConsommee().add(prod);
	}
	
/*	public void Comparison () {
		double fact = this.caloriesConsomeesRepas();
		double norme = User.getUser().norme();
		System.out.println(fact);
		System.out.println(norme);
		if (norme > fact) {
			System.out.println("Vous avez dépassé votre norme calorique");
			}
		else {
			System.out.println("Vous n'avez pas terminé votre norme calorique");
			}
	}*/
	
	public void listing () {
		System.out.println(this.getDate());
		System.out.println("Repas");
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			System.out.println(this.getProduitsConsommee().get(i).toString());
		}
		System.out.println(this.caloriesConsomeesRepas());
	//	System.out.println(this.Comparison());
	};
		
	

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public double caloriesConsomeesRepas() {
		double result = 0;
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			result = result + this.getProduitsConsommee().get(i).caloriesConsomees();
		}
		return result;
	}
	
	public double proteinsConsomees() {
		double result = 0;
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			result = result + this.getProduitsConsommee().get(i).proteinsConsomees();
		}
		return result;
	}
	
	public double lipidesConsomees() {
		double result = 0;
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			result = result + this.getProduitsConsommee().get(i).lipidesConsomees();
		}
		return result;
	}
	
	public double glucidesConsomees() {
		double result = 0;
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			result = result + this.getProduitsConsommee().get(i).glucidesConsomees();
		}
		return result;
	}
	

}
