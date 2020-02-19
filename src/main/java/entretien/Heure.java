package entretien;

class Heure
{
    private int nbHeure;

    public int getNbHeure()
    {
        return nbHeure;
    }

    public Heure(int nbHeure)
    {
        if (nbHeure <= 0)
            throw new IllegalArgumentException();

        this.nbHeure = nbHeure;
    }
}
