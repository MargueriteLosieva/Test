package application;



public class User {
	private int poids, taille, age; 
	private String nom;
	public enum Genre {
		femme, homme
	}
	
	private Genre sexe;
	
	public void setSexeFemme() {
		this.sexe = Genre.femme;
	}
	public void setSexeHomme() {
		this.sexe = Genre.homme;
	}
	
	public Genre getSexe() {
		return this.sexe;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	public int getAge() {
		return this.age;
	}
	
	public int getPoids() {
		return this.poids;
	} 
	public void setAge(int age) {
		this.age = age;
	};
	public int getTaille() {
		return this.taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	};
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	};
	
	public double norme (){
		double result = 0;
		switch (sexe) {
        case  femme:
        	result = 447.6 + 9.2 *this.getPoids() + 3.1 * this.getTaille() -4.3*this.getAge();
        	break;
        case  homme:
        	result = 88.36 + 13.4 *this.getPoids() + 4.8 * this.getTaille()  -5.7*this.getAge();
        	break;
        	}
		return result;
    }
	
	public void AfficherNorme() {
		System.out.println(this.norme());
	}
}
