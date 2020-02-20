package model.entretien;

class Heure
{
    private int nbHeure;

    public Heure(int nbHeure)
    {
        if (nbHeure <= 0)
            throw new IllegalArgumentException();

        this.nbHeure = nbHeure;
    }

    public int getNbHeure()
    {
        return nbHeure;
    }
}
