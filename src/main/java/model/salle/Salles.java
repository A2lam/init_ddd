package model.salle;

import common.dto.salle.CreneauSalleDTO;
import common.dto.salle.SalleDTO;

import java.util.ArrayList;

public interface Salles
{
    /**
     * Récupère une liste des selles
     * @return
     */
    public ArrayList<SalleDTO> recupererSalles();

    /**
     * Trouve une salle
     * @return
     */
    public SalleDTO trouverSalle(String name);

    /**
     * Trouve une salle selon une disponibilité 
     * @param creneau
     * @return
     */
    public SalleDTO trouverSalleSelonDisponibilite(CreneauSalleDTO creneau, int capacite);

    /**
     * Créer une nouvelle salle
     * @return
     */
    public void creerSalle(SalleDTO salle);

    /**
     * Modifier une salle
     * @return
     */
    public void modifierSalle(SalleDTO salle);
}
