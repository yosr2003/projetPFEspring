package com.example.projetCHATBOT.projetchatbot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetCHATBOT.projetchatbot.entities.Transfert;
import com.example.projetCHATBOT.projetchatbot.repositories.TransfertRepository;

@Service
public class TransfertServiceImpl implements ITansfertService {
	@Autowired
	private TransfertRepository transfertRepo;


	@Override
	public Transfert findTransfert(String id) {
		if(transfertRepo.findById(id).isPresent()) {
			return transfertRepo.findById(id).get();
		}else
		{
			return null;
		}
		
	}


	@Override
	public List<Transfert> getAllTransferts() {
		return transfertRepo.findAll();
	}

}
