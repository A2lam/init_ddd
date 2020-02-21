package model.salle;

import common.dto.salle.CreneauSalleDTO;
import common.dto.salle.SalleDTO;

import java.util.ArrayList;

public class Salle {
    String name;
    int capacite;
    ArrayList<CreneauSalle> creneaux;

    public Salle(String name, int capacite, ArrayList<CreneauSalle> creneaux) {
        this.name = name;
        this.capacite = capacite;
        this.creneaux = creneaux;
    }

    public Salle(SalleDTO salleDTO){
        this.name = salleDTO.getName();
        this.capacite = salleDTO.getCapacite();
        this.creneaux = constructCreneaux(salleDTO.getCreneaux());
    }

    private ArrayList<CreneauSalle> constructCreneaux(ArrayList<CreneauSalleDTO> creneauxDTO) {
        ArrayList<CreneauSalle> creneaux = new ArrayList<>();
        for (CreneauSalleDTO creneauSalleDTO : creneauxDTO) {
            creneaux.add(new CreneauSalle(creneauSalleDTO));
        }
        return creneaux;
    }

    public ArrayList<CreneauSalleDTO> constructCreneauxDTO() {
        ArrayList<CreneauSalleDTO> creneauxDTO = new ArrayList<>();
        for (CreneauSalle creneau: this.creneaux) {
            creneauxDTO.add(new CreneauSalleDTO(creneau.getDate(), creneau.getHeureDebut(), creneau.getHeureFin()));
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

    public ArrayList<CreneauSalle> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(ArrayList<CreneauSalle> creneaux) {
        this.creneaux = creneaux;
    }

    public void reserverSalle(CreneauSalle creneau){
        for (CreneauSalle creneauOccupied: this.creneaux) {
            if (creneau.equals(creneauOccupied)){
                System.out.println("Cette salle est déjà prise");
                return;
            }
        }
        creneaux.add(creneau);
    }

    public CreneauSalle creneauSalleDTOToCreneauSalle(CreneauSalleDTO creneauSalleDTO)
    {
        return new CreneauSalle(creneauSalleDTO);
    }
}
