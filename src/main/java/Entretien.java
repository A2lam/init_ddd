import java.time.LocalDate;

public class Entretien
{
    private EntretienID entretienID;
    private EntretienStatus statut;
    private Creneau creneau;
    private String raisonAnnulation;

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

    public String getRaisonAnnulation()
    {
        return raisonAnnulation;
    }

    public Entretien(Creneau creneau)
    {
        this.entretienID = new EntretienID();
        this.creneau = creneau;
        this.statut = EntretienStatus.EN_ATTENTE;
    }

    public void confirmer()
    {
        if (this.statut == EntretienStatus.ANNULE)
        {
            System.out.println("Impossible de confirmer un entretien déjà annulé");
            return;
        }
        else if (this.creneau.getDate().isBefore(LocalDate.now()))
        {
            System.out.println("Impossible de confirmer un entretien qui debute dans le passé");
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
