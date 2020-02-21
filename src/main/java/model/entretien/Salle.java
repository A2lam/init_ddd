package model.entretien;

import common.dto.entretien.SalleDTO;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;

class Salle {
    String name;
    ArrayList<Creneau> creneaux;
    int capacite;
    public Salle(String name, ArrayList<Creneau> disponibilite, int capacite)
    {
        this.name = name;
        this.creneaux = creneaux;
        this.capacite = capacite;
    }

    public Salle(SalleDTO salleDTO){
        this.name = salleDTO.getName();
        this.capacite = salleDTO.getCapacite();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Creneau> getCreneaux() {
        return creneaux;
    }

    public int getCapacite() {
        return capacite;
    }
}
