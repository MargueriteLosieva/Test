package application;

public class PetitDejeuner extends Repas{
	public void listing () {
		System.out.println(this.getDate());
		System.out.println("Petit dejeuner");
		for (int i = 0; i<this.getProduitsConsommee().size(); i++) {
			System.out.println(this.getProduitsConsommee().get(i).toString());
		}
		System.out.println(this.caloriesConsomeesRepas());
	}
}	