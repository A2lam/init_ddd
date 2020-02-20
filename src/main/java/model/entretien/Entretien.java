package model.entretien;

import common.dto.entretien.CandidatDTO;
import common.dto.entretien.CreneauDTO;
import common.dto.entretien.EntretienDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entretien
{
    private EntretienID entretienID;
    private EntretienStatus statut;
    private Creneau creneau;
    private String raisonAnnulation;
    private Candidat candidat;

    public Entretien(LocalDateTime date, Candidat candidat)
    {
        this.entretienID = new EntretienID();
        this.creneau = new Creneau(date, new Heure(2));
        this.candidat = candidat;
        this.statut = EntretienStatus.EN_ATTENTE;
    }

    public Entretien(EntretienDTO entretienDTO){
        this.entretienID = entretienDTO.getEntretienID();
        this.statut = entretienDTO.getStatut();
        this.creneau = new Creneau(entretienDTO.getCreneau());
        this.raisonAnnulation = entretienDTO.getRaisonAnnulation();
        this.candidat = new Candidat(entretienDTO.getCandidat());
    }

    public EntretienID getEntretienID()
    {
        return entretienID;
    }

    public EntretienStatus getStatut()
    {
        return statut;
    }

    public Creneau getCreneau()
    {
        return creneau;
    }

    public CreneauDTO getCreneauDTO()
    {
        CreneauDTO creneauDTO = new CreneauDTO();
        creneauDTO.setDate(creneau.getDate());
        creneauDTO.setHeureDebut(creneau.getHeureDebut());
        creneauDTO.setHeureFin(creneau.getHeureDebut());
        return creneauDTO;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public CandidatDTO getCandidatDTO(){
        CandidatDTO candidatDTO = new CandidatDTO();
        candidatDTO.setName(candidat.getName());
        candidatDTO.setSpecialite(candidat.getSpecialite());
        candidatDTO.setYearOfXP(candidat.getYearOfXP());
        return candidatDTO;
    }

    public String getRaisonAnnulation()
    {
        return raisonAnnulation;
    }

    public void confirmer()
    {
        if (this.statut == EntretienStatus.ANNULE)
        {
            System.out.println("Impossible de confirmer un model.entretien déjà annulé");
            return;
        }
        else if (this.creneau.getDate().isBefore(LocalDate.now()))
        {
            System.out.println("Impossible de confirmer un model.entretien qui debute dans le passé");
            return;
        }

        this.statut = EntretienStatus.CONFIRME;
    }

    public void annuler(String raison)
    {
        if (raison.equals(""))
            throw new IllegalArgumentException("Vous devez renseigner une raison");

        this.statut = EntretienStatus.ANNULE;
        this.raisonAnnulation = raison;
    }
}
