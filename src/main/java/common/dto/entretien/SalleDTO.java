package common.dto.entretien;

import common.dto.entretien.CreneauDTO;

import java.util.ArrayList;

public class SalleDTO {

    String name;
    ArrayList<CreneauDTO> creneaux;
    int capacite;

    public SalleDTO(String name, ArrayList<CreneauDTO> creneaux, int capacite) {
        this.name = name;
        this.creneaux = creneaux;
        this.capacite = capacite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CreneauDTO> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(ArrayList<CreneauDTO> creneaux) {
        this.creneaux = creneaux;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
