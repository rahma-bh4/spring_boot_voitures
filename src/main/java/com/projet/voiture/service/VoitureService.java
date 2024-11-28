package com.projet.voiture.service;
import java.util.List;



import com.projet.voiture.entities.Marque;
import com.projet.voiture.entities.Voiture;
public interface VoitureService {
	Voiture saveVoiture(Voiture v);
	Voiture updateVoiture(Voiture p);
	void deleteVoiture(Voiture p);
	 void deleteVoitureById(Long id);
	 Voiture getVoiture(Long id);
	List<Voiture> getAllVoitures();
	List<Voiture> findByNomVoiture(String nom);
	List<Voiture> findByNomVoitureContains(String nom);
	
	
	List<Voiture> findByNomPrix (String nom, Double prix);
	
	List<Voiture> findByMarque (Marque marque);
	List<Voiture> findByMarqueIdMar(Long id);
	List<Voiture> findByOrderByNomVoitureAsc();
	
	List<Voiture> trierVoituresNomsPrix ();

}
