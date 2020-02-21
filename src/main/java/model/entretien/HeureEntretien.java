package model.entretien;

class HeureEntretien
{
    private int nbHeure;

    public HeureEntretien(int nbHeure)
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
