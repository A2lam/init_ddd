package model.entretien;

import common.dto.entretien.ConsultantRecruteurDTO;

import java.util.ArrayList;

class ConsultantRecruteur
{
    private String name;
    private String specialite;
    private int yearOfXP;
    private ArrayList<CreneauEntretien> creneaux;


    /**
     * Constructeur ConsultantRecruteur
     * @param name
     * @param specialite
     * @param yearOfXP
     */
    public ConsultantRecruteur(String name, String specialite, int yearOfXP)
    {
        this.name = name;
        this.specialite = specialite;
        this.yearOfXP = yearOfXP;
    }

    /**
     * Constructeur ConsultantRecruteur
     * @param consultantRecruteurDTO
     */
    public ConsultantRecruteur(ConsultantRecruteurDTO consultantRecruteurDTO)
    {
        this.name = consultantRecruteurDTO.getName();
        this.specialite = consultantRecruteurDTO.getSpecialite();
        this.yearOfXP = consultantRecruteurDTO.getYearOfXP();
    }

    /**
     * Getter name
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     * Getter specialite
     * @return
     */
    public String getSpecialite()
    {
        return specialite;
    }

    /**
     * Getter années d'exoeriences
     * @return
     */
    public int getYearOfXP()
    {
        return yearOfXP;
    }

    /**
     * Getter crenaux
     * @return
     */
    public ArrayList<CreneauEntretien> getCreneaux()
    {
        return this.creneaux;
    }

    /**
     *
     * @param candidat
     * @return
     */
    public boolean peutTester(Candidat candidat)
    {
        return this.yearOfXP >= candidat.getYearOfXP();
    }
}
