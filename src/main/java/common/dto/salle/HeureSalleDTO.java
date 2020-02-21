package common.dto.salle;

public class HeureSalleDTO
{
    private int nbHeure;

    public HeureSalleDTO(int nbHeure)
    {
        if (nbHeure <= 0)
            throw new IllegalArgumentException();

        this.nbHeure = nbHeure;
    }

    public int getNbHeure()
    {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure)
    {
        this.nbHeure = nbHeure;
    }
}
