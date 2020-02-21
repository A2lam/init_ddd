package model.entretien;

import common.dto.entretien.CreneauDTO;
import common.dto.entretien.SalleDTO;

import java.util.ArrayList;

public class Salle {
    String name;
    int capacite;
    ArrayList<Creneau> creneaux;

    public Salle(String name, int capacite, ArrayList<Creneau> creneaux) {
        this.name = name;
        this.capacite = capacite;
        this.creneaux = creneaux;
    }

    public Salle(SalleDTO salleDTO){
        this.name = salleDTO.getName();
        this.capacite = salleDTO.getCapacite();
        this.creneaux = constructCreneaux(salleDTO.getCreneaux());
    }

    private ArrayList<Creneau> constructCreneaux(ArrayList<CreneauDTO> creneauxDTO) {
        ArrayList<Creneau> creneaux = new ArrayList<>();
        for (CreneauDTO creneauDTO: creneauxDTO) {
            creneaux.add(new Creneau(creneauDTO));
        }
        return creneaux;
    }
}
