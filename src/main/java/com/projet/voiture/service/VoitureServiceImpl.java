package com.projet.voiture.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.voiture.entities.Marque;
import com.projet.voiture.entities.Voiture;
import com.projet.voiture.repos.VoitureRepository;
@Service
public class VoitureServiceImpl  implements VoitureService{
    @Autowired
	VoitureRepository voitureRepository;
	
	@Override
	public Voiture saveVoiture(Voiture v) {
		
		return voitureRepository.save(v);
	}

	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureRepository.save(v);
	}

	@Override
	public void deleteVoiture(Voiture v) {
		voitureRepository.delete(v);
		
	}

	@Override
	public void deleteVoitureById(Long id) {
		voitureRepository.deleteById(id);
		
	}

	@Override
	public Voiture getVoiture(Long id) {
		
		return voitureRepository.findById(id).get();
	}

	@Override
	public List<Voiture> getAllVoitures() {
	
		return voitureRepository.findAll();
	}

	@Override
	public List<Voiture> findByNomVoiture(String nom) {
		// TODO Auto-generated method stub
		return voitureRepository.findByNomVoiture(nom);
	}

	@Override
	public List<Voiture> findByNomVoitureContains(String nom) {
		// TODO Auto-generated method stub
		return voitureRepository.findByNomVoitureContains(nom);
	}

	@Override
	public List<Voiture> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return voitureRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Voiture> findByMarque(Marque marque) {
		// TODO Auto-generated method stub
		return voitureRepository.findByMarque(marque);
	}

	@Override
	public List<Voiture> findByMarqueIdMar(Long id) {
		// TODO Auto-generated method stub
		return voitureRepository.findByMarqueIdMar(id);
	}

	@Override
	public List<Voiture> findByOrderByNomVoitureAsc() {
		// TODO Auto-generated method stub
		return voitureRepository.findByOrderByNomVoitureAsc();
	}

	@Override
	public List<Voiture> trierVoituresNomsPrix() {
		
		return voitureRepository.trierVoituresNomsPrix();
	}

}