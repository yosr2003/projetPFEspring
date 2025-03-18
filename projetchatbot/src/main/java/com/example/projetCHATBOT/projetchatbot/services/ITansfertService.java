package com.example.projetCHATBOT.projetchatbot.services;

import java.util.List;

import com.example.projetCHATBOT.projetchatbot.entities.Transfert;

public interface ITansfertService {
	public Transfert findTransfert(String id) ;
	public List<Transfert> getAllTransferts() ;
	

}
