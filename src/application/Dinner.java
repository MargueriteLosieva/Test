package application;

public class Dinner extends Repas{
	public void listing () {
		System.out.println(this.getDate());
		System.out.println("Dinner");
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			System.out.println(this.getProduitsConsommee().get(i).toString());
		}
		System.out.println(this.caloriesConsomeesRepas());
	}
}	