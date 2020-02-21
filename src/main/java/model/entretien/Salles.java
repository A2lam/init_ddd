package model.entretien;

import common.dto.entretien.CandidatDTO;
import common.dto.entretien.SalleDTO;
import common.dto.entretien.CreneauDTO;
import model.entretien.Salle;

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
    public SalleDTO trouverSalleSelonDisponibilite(CreneauDTO creneau);

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
