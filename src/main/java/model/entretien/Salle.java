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

    public ArrayList<CreneauDTO> constructCreneauxDTO() {
        ArrayList<CreneauDTO> creneauxDTO = new ArrayList<>();
        for (Creneau creneau: this.creneaux) {
            creneauxDTO.add(new CreneauDTO(creneau.getDate(), creneau.getHeureDebut(), creneau.getHeureFin()));
        }
        return creneauxDTO;
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

    public ArrayList<Creneau> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(ArrayList<Creneau> creneaux) {
        this.creneaux = creneaux;
    }

    private void reserverSalle(Creneau creneau){
        for (Creneau creneauOccupied: this.creneaux) {
            if (creneau.equals(creneauOccupied)){
                System.out.println("Cette salle est déjà prise");
                return;
            }
        }
        creneaux.add(creneau);
    }
}
