package common.dto.entretien;

import model.entretien.EntretienID;
import model.entretien.EntretienStatus;

import java.time.LocalDateTime;

public class EntretienDTO
{
    private EntretienID entretienID;
    private EntretienStatus statut;
    private CreneauEntretienDTO creneau;
    private String raisonAnnulation;
    private CandidatDTO candidat;

    public EntretienDTO(LocalDateTime date, CandidatDTO candidat)
    {
        this.entretienID = new EntretienID();
        this.creneau = new CreneauEntretienDTO(date, new HeureEntretienDTO(2));
        this.candidat = candidat;
        this.statut = EntretienStatus.EN_ATTENTE;
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

    public CreneauEntretienDTO getCreneau()
    {
        return creneau;
    }

    public void setCreneau(CreneauEntretienDTO creneau)
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
