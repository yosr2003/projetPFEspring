package com.example.projetCHATBOT.projetchatbot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetCHATBOT.projetchatbot.entities.Transfert;
import com.example.projetCHATBOT.projetchatbot.services.ITansfertService;

@RestController
public class TransfertController {
	@Autowired
	private ITansfertService transfertService;
	
	@GetMapping("/transferts/{id}")
	public Transfert findTransfert(@PathVariable ("id") String id) {
		return transfertService.findTransfert(id);	}
	
	@GetMapping("/transferts")
	public List<Transfert> getAllTransfert() {
		return transfertService.getAllTransferts();	}

}
