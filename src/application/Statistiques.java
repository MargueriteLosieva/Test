package application;

import java.util.ArrayList;

public class Statistiques {
	private ArrayList<Repas> repasStat = new ArrayList<Repas>();
	
	public ArrayList<Repas> getRepasStat() {
		return this.repasStat;
	}
	public void setProduitsConsommee(ArrayList<Repas> repasStat) {
		this.repasStat = repasStat;
	}
	public void ajouterRepas (Repas repas) {
		this.getRepasStat().add(repas);
	}
	public void statistiques () {
		System.out.println("Stat");
		for (int i = 0; i<this.getRepasStat().size(); i++) {
			this.getRepasStat().get(i).listing();
			}
		 
		}

}
