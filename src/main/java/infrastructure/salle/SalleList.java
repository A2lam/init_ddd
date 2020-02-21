package infrastructure.salle;

import common.dto.salle.CreneauSalleDTO;
import common.dto.salle.SalleDTO;
import model.salle.Salles;

import java.util.ArrayList;

public class SalleList implements Salles
{
    static ArrayList<SalleDTO> salles = new ArrayList<>();

    @Override
    public ArrayList<SalleDTO> recupererSalles()
    {
        return salles;
    }

    @Override
    public SalleDTO trouverSalle(String name)
    {
        return salles
                .stream()
                .filter(salleInList -> salleInList.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    @Override
    public SalleDTO trouverSalleSelonDisponibilite(CreneauSalleDTO creneau, int capacite)
    {
        return salles
                .stream()
                .filter(salleInList -> salleInList.getCapacite() >= capacite)
                .filter(salleInList -> !salleInList.getCreneaux().contains(creneau))
                .findAny()
                .orElse(null);
    }

    @Override
    public void creerSalle(SalleDTO salle)
    {
        salles.add(salle);
    }

    @Override
    public void modifierSalle(SalleDTO salle)
    {
        SalleDTO salleFiltre = this.trouverSalle(salle.getName());

        if (salleFiltre != null)
        {
            int indexConsultantRecruteur = salles.indexOf(salleFiltre);
            salles.set(indexConsultantRecruteur, salle);
        }
    }
}
