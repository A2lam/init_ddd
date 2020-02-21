package model.salle;

import common.dto.salle.SalleDTO;
import common.dto.entretien.CreneauEntretienDTO;

import java.util.ArrayList;

public interface Salles
{
    /**
     * Récupère une liste des selles
     * @return
     */
    public ArrayList<Salle> recupererSalles();

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
    public SalleDTO trouverSalleSelonDisponibilite(CreneauEntretienDTO creneau);

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
