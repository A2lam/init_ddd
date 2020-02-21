package common.dto.salle;

import common.dto.entretien.CreneauEntretienDTO;
import model.salle.Salle;

import java.util.ArrayList;

public class SalleDTO {
    String name;
    int capacite;
    ArrayList<CreneauSalleDTO> creneaux;

    public SalleDTO(String name, int capacite, ArrayList<CreneauSalleDTO> creneaux) {
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

    public ArrayList<CreneauSalleDTO> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(ArrayList<CreneauSalleDTO> creneaux) {
        this.creneaux = creneaux;
    }
}
