package application;

import java.util.ArrayList;
import java.util.Date;

public class Repas {
	
	private Date date;
	private ArrayList<Produit> produitsConsommee = new ArrayList<Produit>();
	private User user;
	
	public ArrayList<Produit> getProduitsConsommee() {
		return this.produitsConsommee;
	}
	public void setProduitsConsommee(ArrayList<Produit> produitsConsommee) {
		this.produitsConsommee = produitsConsommee;
	}
	public void consommerProduits (Produit prod) {
		this.getProduitsConsommee().add(prod);
	}
	public void listing () {
		System.out.println(this.getDate());
		System.out.println("Repas");
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			System.out.println(this.getProduitsConsommee().get(i).toString());
		}
		System.out.println(this.caloriesConsomeesRepas());
		double fact = this.caloriesConsomeesRepas();
		double norme = user.norme();
		System.out.println(fact);
		if (norme > fact) {
			System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
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
