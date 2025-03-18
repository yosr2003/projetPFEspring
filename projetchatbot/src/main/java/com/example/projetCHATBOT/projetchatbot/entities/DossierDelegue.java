package com.example.projetCHATBOT.projetchatbot.entities;


import java.time.LocalDateTime;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DossierDelegue {
	@Id
	private String idDossier;
	private String anneedoss;
	private LocalDateTime  dateCre;
	private String etatDoss;
	private LocalDateTime  datclo;
	private String motifclo;
	
	public DossierDelegue() {
		super();
	}
	
	@OneToMany(mappedBy = "dossierDelegue")
	private List<Transfert> transferts;
	
	
/// getters and setters
	public String getIdDossier() {
		return idDossier;
	}

	public void setIdDossier(String idDossier) {
		this.idDossier = idDossier;
	}

	public String getAnneedoss() {
		return anneedoss;
	}

	public void setAnneedoss(String anneedoss) {
		this.anneedoss = anneedoss;
	}

	public LocalDateTime  getDateCre() {
		return dateCre;
	}

	public void setDateCre(LocalDateTime  dateCre) {
		this.dateCre = dateCre;
	}

	public String getEtatDoss() {
		return etatDoss;
	}

	public void setEtatDoss(String etatDoss) {
		this.etatDoss = etatDoss;
	}

	public LocalDateTime  getDatclo() {
		return datclo;
	}

	public void setDatclo(LocalDateTime  datclo) {
		this.datclo = datclo;
	}

	public String getMotifclo() {
		return motifclo;
	}

	public void setMotifclo(String motifclo) {
		this.motifclo = motifclo;
	}
/// getters and setters	
	
	
	

}
