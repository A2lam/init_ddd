package common.dto.entretien;

import java.util.ArrayList;

public class SalleDTO {
    String name;
    int capacite;
    ArrayList<CreneauDTO> creneaux;

    public SalleDTO(String name, int capacite, ArrayList<CreneauDTO> creneaux) {
        this.name = name;
        this.capacite = capacite;
        this.creneaux = creneaux;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public ArrayList<CreneauDTO> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(ArrayList<CreneauDTO> creneaux) {
        this.creneaux = creneaux;
    }
}
