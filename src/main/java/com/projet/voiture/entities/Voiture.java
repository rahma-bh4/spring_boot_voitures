package com.projet.voiture.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity

public class Voiture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long idVoiture;
 private String nomVoiture;
 private Double prixVoiture;
 private Date dateCreation;
 private String email;
 @ManyToOne
 private Marque marque;
 
 public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voiture(String nomVoiture, Double prixVoiture, Date dateCreation, String email) {
		super();
		this.nomVoiture = nomVoiture;
		this.prixVoiture = prixVoiture;
		this.dateCreation = dateCreation;
		this.email=email;
	}
	 
 
public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
public Long getIdVoiture() {
	return idVoiture;
}
public void setIdVoiture(Long idVoiture) {
	this.idVoiture = idVoiture;
}
public String getNomVoiture() {
	return nomVoiture;
}
public void setNomVoiture(String nomVoiture) {
	this.nomVoiture = nomVoiture;
}
public Double getPrixVoiture() {
	return prixVoiture;
}
public void setPrixVoiture(Double prixVoiture) {
	this.prixVoiture = prixVoiture;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
@Override
public String toString() {
	return "Voiture [idVoiture=" + idVoiture + ", nomVoiture=" + nomVoiture + ", prixVoiture=" + prixVoiture
			+ ", dateCreation=" + dateCreation + ", email="+email+"]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
