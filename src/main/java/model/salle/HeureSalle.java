package model.salle;

class HeureSalle
{
    private int nbHeure;

    public HeureSalle(int nbHeure)
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
