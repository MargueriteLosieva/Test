package application;

public class Dejeuner extends Repas{
	public void listing () {
		System.out.println(this.getDate());
		System.out.println("Dejeuner");
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			System.out.println(this.getProduitsConsommee().get(i).toString());
		}
		System.out.println(this.caloriesConsomeesRepas());
	}
}	
