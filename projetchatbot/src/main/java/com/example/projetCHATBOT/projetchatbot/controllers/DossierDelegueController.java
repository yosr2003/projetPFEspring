package com.example.projetCHATBOT.projetchatbot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetCHATBOT.projetchatbot.entities.DossierDelegue;
import com.example.projetCHATBOT.projetchatbot.services.IDossierDelegueService;

@RestController
public class DossierDelegueController {
	@Autowired
	private IDossierDelegueService dossDelRepo;
	
	@GetMapping("/dossiersDelegues")
	public List<DossierDelegue> getAllDossierDelegue() {
		return dossDelRepo.getAllDossierDelegues();	}

	

}
