package model.entretien;

import common.dto.entretien.CandidatDTO;
import common.dto.entretien.ConsultantRecruteurDTO;
import common.dto.entretien.CreneauDTO;

import java.util.ArrayList;

public interface ConsultantsRecruteurs
{
    /**
     * Récupère une liste des consultants recruteurs
     * @return
     */
    public ArrayList<ConsultantRecruteurDTO> recupererConsultantsRecruteurs();

    /**
     * Trouve un consultant rectruteur
     * @return
     */
    public ConsultantRecruteurDTO trouverConsultantRecruteur(String name);

    /**
     * Trouve un consultant recruteur selon une disponibilité et un candidat donné
     * @param creneau
     * @param candidat
     * @return
     */
    public ConsultantRecruteurDTO trouverConsultantRecruteurSelonDisponibilteEtCandidat(CreneauDTO creneau, CandidatDTO candidat);

    /**
     * Crée un nouveau consultant rectruteur
     * @return
     */
    public void creerConsultantRecruteur(ConsultantRecruteurDTO consultantRecruteur);

    /**
     * Modifier un consultant rectruteur
     * @return
     */
    public void modifierConsultantRecruteur(ConsultantRecruteurDTO consultantRecruteur);
}
