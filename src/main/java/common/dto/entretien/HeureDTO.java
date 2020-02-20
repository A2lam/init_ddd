package common.dto.entretien;

public class HeureDTO
{
    private int nbHeure;

    public HeureDTO(int nbHeure)
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
