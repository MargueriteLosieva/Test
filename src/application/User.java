package application;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
//import java.util.ArrayList;


import org.json.simple.JSONObject;


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
	private int age;
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
	
	public int getPoids() {
		return this.poids;
	} 
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	} 
	
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
		if (isHomme == false) {
        	result = 447.6 + 9.2 *this.getPoids() + 3.1 * this.getTaille() -4.3*this.getAge();
		}
		else {
        	result = 88.36 + 13.4 *this.getPoids() + 4.8 * this.getTaille()  -5.7*this.getAge();
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
	            ", age=" + this.getAge()+
	            ", norme=" + this.norme()+
	            '}';
	    }
	public void cerateJsonUser () throws IOException{
		JSONObject jsonob = new JSONObject();
		jsonob.put("nom", this.getNom());
		jsonob.put("genre", this.getGenre());
		jsonob.put("age", this.getAge());
		jsonob.put("taille", this.getTaille());
		jsonob.put("poids", this.getPoids());
		jsonob.put("norme", this.norme());
		
		FileWriter file = new FileWriter("User.json");
		file.write(jsonob.toString());
		file.flush();
		file.close();
		System.out.println(jsonob);
	}
}

