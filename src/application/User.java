package application;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;



public class User {
	private static User uniqueInstance;
	private User () {};
	public static User getUser() {
		if (uniqueInstance == null) {
		uniqueInstance = new User();
		}
		return uniqueInstance;
	}
/*	public static User getInstance() {
	if (instance ==null) {
		instance = new User();
	}
	return instance;
}*/
	private int poids;
	private int taille; 
	private LocalDate dateDeNaissance;
	private String nom;
	private boolean isHomme;
	
/*	public User(String nom, int poids, int taille, LocalDate dateDeNaissance, boolean isHomme) {
		this.nom = nom;
		this.poids = poids;
		this.taille = taille;
		this.dateDeNaissance = dateDeNaissance;
		this.isHomme = isHomme;
	}*/
	
	
	public boolean getGenre() {
		return this.isHomme;
	}

	public void setGenre(boolean isHomme) {
		this.isHomme = isHomme;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	public LocalDate getDateDeNaissance() {
		return this.dateDeNaissance;
	}
	
	public int getPoids() {
		return this.poids;
	} 
	public void setDatedeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
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
	
	
    public int userAge() {
    	LocalDate today = LocalDate.now();
        Period period = Period.between(dateDeNaissance, today);
    	int age =  period.getYears();
		return age;
    }
			
	public double norme (){
		double result = 0;
		if (isHomme == false) {
        	result = 447.6 + 9.2 *this.getPoids() + 3.1 * this.getTaille() -4.3*this.userAge();
		}
		else {
        	result = 88.36 + 13.4 *this.getPoids() + 4.8 * this.getTaille()  -5.7*this.userAge();
        	}
		return result;
    }
	
	public void AfficherNorme() {
		System.out.println(this.norme());
	}
	
	public String toString() {
	    return "User{" +
	            "name='" + this.getNom() + '\'' +
	            ", poids=" + this.getPoids() +
	            ", taille=" + this.getTaille() +
	            ", age=" + this.userAge()+
	            ", norme=" + this.norme()+
	            '}';
	    }
	
}
