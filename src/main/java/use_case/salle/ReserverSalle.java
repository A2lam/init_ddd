package use_case.salle;

import common.dto.salle.CreneauSalleDTO;
import common.dto.salle.SalleDTO;
import infrastructure.salle.SalleList;
import model.salle.Salle;
import model.salle.Salles;

public class ReserverSalle
{
    Salles salles;

    public ReserverSalle()
    {
        this.salles = new SalleList();
    }

    public void reserver(CreneauSalleDTO creneau, int capacite)
    {
        SalleDTO salleDTO = this.salles.trouverSalleSelonDisponibilite(creneau, capacite);

        Salle salle = new Salle(salleDTO);
        salle.reserverSalle(salle.creneauSalleDTOToCreneauSalle(creneau));

        salleDTO = new SalleDTO(salle);
        salles.modifierSalle(salleDTO);
    }
}
