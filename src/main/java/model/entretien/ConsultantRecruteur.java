package model.entretien;

import common.dto.entretien.CandidatDTO;
import common.dto.entretien.ConsultantRecruteurDTO;

import java.time.LocalDate;

class ConsultantRecruteur {
    private String name;
    private String specialite;
    private int yearOfXP;

    public ConsultantRecruteur(String name, String specialite, int yearOfXP) {
        this.name = name;
        this.specialite = specialite;
        this.yearOfXP = yearOfXP;
    }

    public ConsultantRecruteur(ConsultantRecruteurDTO consultantRecruteurDTO) {
        this.name = consultantRecruteurDTO.getName();
        this.specialite = consultantRecruteurDTO.getSpecialite();
        this.yearOfXP = consultantRecruteurDTO.getYearOfXP();
    }

    public ConsultantRecruteur() {
        
    }

    public String getName() {
        return name;
    }

    public String getSpecialite() {
        return specialite;
    }

    public int getYearOfXP() {
        return yearOfXP;
    }
}
