package com.projet.voiture.restcontrollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.voiture.entities.Voiture;
import com.projet.voiture.service.VoitureService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class VoitureRestController {

	@Autowired
	VoitureService voitureService;
	@RequestMapping(path="all",method = RequestMethod.GET)
	@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
	public List<Voiture> getAllVoiture(){
		return voitureService.getAllVoitures();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Voiture getVoitureById(@PathVariable("id") Long id) {
	return voitureService.getVoiture(id);
	 }
	
	@RequestMapping(value="/addvoit",method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('ADMIN')")
	public Voiture createoiture(@RequestBody Voiture voiture) {
	return voitureService.saveVoiture(voiture);
	}
	
	@RequestMapping(value="/updatevoit",method = RequestMethod.PUT)
	public Voiture updateVoiture(@RequestBody Voiture voiture ) {
	return voitureService.updateVoiture(voiture );
	}
	@RequestMapping(value="/delvoit/{id}",method = RequestMethod.DELETE)
	public void deleteVoiture(@PathVariable("id") Long id)
	{
		voitureService.deleteVoitureById(id);
	}
	
	@RequestMapping(value="/voitsmar/{idMar}",method = RequestMethod.GET)
	@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
	public List<Voiture> getVoituresByMarId(@PathVariable("idMar") Long idMar) {
	return voitureService.findByMarqueIdMar(idMar);
	}

	
}
