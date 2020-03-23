package application;

public class Produit {
	private String id, aliment;
	private double calories, proteins, glucides, lipides;
	private int poidsConsomee;

	 
	public Produit(String id, String aliment, double calories, double proteins, double glucides, double lipides) {
		this.id = id;
		this.aliment = aliment;
		this.calories = calories;
		this.proteins = proteins;
		this.glucides = glucides;
		this.lipides = lipides;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAliment() {
		return this.aliment;
	}

	public void setAliment(String aliment) {
		this.aliment = aliment;
	}

	public double getCalories() {
		return this.calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getProteins() {
		return this.proteins;
	}

	public void setProteins(double proteins) {
		this.proteins = proteins;
	}

	public double getGlucides() {
		return this.glucides;
	}

	public void setGlucides(double glucides) {
		this.glucides = glucides;
	}

	public double getLipides() {
		return this.lipides;
	}

	public void setLipides(double lipides) {
		this.lipides = lipides;
	}
	
/*	public String toString() {
        return "Product{" +
                "id=" + this.id +
                ", name='" + this.aliment + '\'' +
                ", kkal=" + this.calories +
                ", proteins=" + this.proteins +
                ", fats=" + this.lipides+
                ", carbohydrates=" + this.glucides+
                '}';
    }*/

	public int getPoidsConsomee() {
		return this.poidsConsomee;
	}

	public void setPoidsConsomee(int poidsConsomee) {
		this.poidsConsomee = poidsConsomee;
	}
	
	public double caloriesConsomees() {
		double result = 0;
		result = this.getPoidsConsomee()/100*this.getCalories();
		return result;
	}
	
	public double proteinsConsomees() {
		double result = 0;
		result = this.getPoidsConsomee()/100*this.getProteins();
		return result;
	}
	
	public double lipidesConsomees() {
		double result = 0;
		result = this.getPoidsConsomee()/100*this.getLipides();
		return result;
	}
	
	public double glucidesConsomees() {
		double result = 0;
		result = this.getPoidsConsomee()/100*this.getGlucides();
		return result;
	}
	
	public String toString() {
    return "Product{" +
            "name='" + this.aliment + '\'' +
            ", kkal=" + this.caloriesConsomees() +
            ", proteins=" + this.proteinsConsomees() +
            ", fats=" + this.lipidesConsomees()+
            ", carbohydrates=" + this.glucidesConsomees()+
            '}';
    }

}
