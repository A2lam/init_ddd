package common.dto.entretien;

import model.entretien.Salle;

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

    public SalleDTO(Salle salle){
        this.name = salle.getName();
        this.capacite = salle.getCapacite();
        this.creneaux = salle.constructCreneauxDTO();
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
