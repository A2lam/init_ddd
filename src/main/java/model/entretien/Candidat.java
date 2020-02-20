package model.entretien;

import common.dto.entretien.CandidatDTO;

class Candidat {
    private String name;
    private String specialite;
    private int yearOfXP;

    public Candidat(String name, String specialite, int yearOfXP) {
        this.name = name;
        this.specialite = specialite;
        this.yearOfXP = yearOfXP;
    }

    public Candidat(CandidatDTO candidatDTO) {
        this.name = candidatDTO.getName();
        this.specialite = candidatDTO.getSpecialite();
        this.yearOfXP = candidatDTO.getYearOfXP();
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
