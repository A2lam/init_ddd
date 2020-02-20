package common.dto.entretien;

import model.entretien.Entretien;
import model.entretien.EntretienID;
import model.entretien.EntretienStatus;

import java.time.LocalDateTime;

public class EntretienDTO
{
    private EntretienID entretienID;
    private EntretienStatus statut;
    private CreneauDTO creneau;
    private String raisonAnnulation;
    private CandidatDTO candidat;

    public EntretienDTO(LocalDateTime date, CandidatDTO candidat)
    {
        this.entretienID = new EntretienID();
        this.creneau = new CreneauDTO(date, new HeureDTO(2));
        this.candidat = candidat;
        this.statut = EntretienStatus.EN_ATTENTE;
    }

    public EntretienDTO(Entretien entretien){
        this.entretienID = entretien.getEntretienID();
        this.creneau = entretien.getCreneauDTO();
        this.candidat = entretien.getCandidatDTO();
        this.raisonAnnulation = entretien.getRaisonAnnulation();
        this.statut = entretien.getStatut();
    }

    public EntretienID getEntretienID()
    {
        return entretienID;
    }

    public void setEntretienID(EntretienID entretienID)
    {
        this.entretienID = entretienID;
    }

    public EntretienStatus getStatut()
    {
        return statut;
    }

    public void setStatut(EntretienStatus statut)
    {
        this.statut = statut;
    }

    public CreneauDTO getCreneau()
    {
        return creneau;
    }

    public void setCreneau(CreneauDTO creneau)
    {
        this.creneau = creneau;
    }

    public String getRaisonAnnulation()
    {
        return raisonAnnulation;
    }

    public void setRaisonAnnulation(String raisonAnnulation)
    {
        this.raisonAnnulation = raisonAnnulation;
    }

    public CandidatDTO getCandidat()
    {
        return candidat;
    }

    public void setCandidat(CandidatDTO candidat)
    {
        this.candidat = candidat;
    }
}
