package com.example.projetCHATBOT.projetchatbot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetCHATBOT.projetchatbot.entities.DossierDelegue;
import com.example.projetCHATBOT.projetchatbot.repositories.DossierDelegueRepository;

@Service
public class DossierDelegueServiceImpl implements IDossierDelegueService{
	@Autowired
	private DossierDelegueRepository dossierDelegueRepo;

	@Override
	public List<DossierDelegue> getAllDossierDelegues() {
		// TODO Auto-generated method stub
		return dossierDelegueRepo.findAll();}

}
