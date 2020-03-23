package application;

public class Snack extends Repas{
	public void listing () {
		System.out.println(this.getDate());
		System.out.println("Snack");
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			System.out.println(this.getProduitsConsommee().get(i).toString());
		}
		System.out.println(this.caloriesConsomeesRepas());
	}
}
	