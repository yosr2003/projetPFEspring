package com.example.projetCHATBOT.projetchatbot.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transfert {
	@Id
	private String refTransfert;
	private Double montantTransfert;
	private String deviseTransfert;
	private LocalDateTime  datecre;
	private EtatDoss etat;

	public Transfert() {
		super();
	}
	
	@ManyToOne
	@JoinColumn(name = "idDossDelegue")
	private DossierDelegue dossierDelegue;

/// getters and setters 
	public String getRefTransfert() {
		return refTransfert;
	}


	public void setRefTransfert(String refTransfert) {
		this.refTransfert = refTransfert;
	}


	public Double getMontantTransfert() {
		return montantTransfert;
	}


	public void setMontantTransfert(Double montantTransfert) {
		this.montantTransfert = montantTransfert;
	}


	public String getDeviseTransfert() {
		return deviseTransfert;
	}


	public void setDeviseTransfert(String deviseTransfert) {
		this.deviseTransfert = deviseTransfert;
	}


	public LocalDateTime  getDatecre() {
		return datecre;
	}


	public void setDatecre(LocalDateTime  datecre) {
		this.datecre = datecre;
	}


	public EtatDoss getEtat() {
		return etat;
	}


	public void setEtat(EtatDoss etat) {
		this.etat = etat;
	}
	
/// getters and setters 

}
