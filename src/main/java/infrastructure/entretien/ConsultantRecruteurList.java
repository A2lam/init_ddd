package infrastructure.entretien;

import common.dto.entretien.CandidatDTO;
import common.dto.entretien.ConsultantRecruteurDTO;
import common.dto.entretien.CreneauEntretienDTO;
import model.entretien.ConsultantsRecruteurs;

import java.util.ArrayList;

public class ConsultantRecruteurList implements ConsultantsRecruteurs
{
    static ArrayList<ConsultantRecruteurDTO> consultantsRecruteurs = new ArrayList<>();

    @Override
    public ArrayList<ConsultantRecruteurDTO> recupererConsultantsRecruteurs()
    {
        return consultantsRecruteurs;
    }

    @Override
    public ConsultantRecruteurDTO trouverConsultantRecruteur(String name)
    {
        return consultantsRecruteurs
                .stream()
                .filter(consultantRecruteurInList -> consultantRecruteurInList.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    @Override
    public ConsultantRecruteurDTO trouverConsultantRecruteurSelonDisponibilteEtCandidat(CreneauEntretienDTO creneau, CandidatDTO candidat)
    {
        return consultantsRecruteurs
                .stream()
                .filter(consultantRecruteurInList -> consultantRecruteurInList.getYearOfXP() >= candidat.getYearOfXP())
                .filter(consultantRecruteurInList -> !consultantRecruteurInList.getCreneaux().contains(creneau))
                .findAny()
                .orElse(null);
    }

    @Override
    public void creerConsultantRecruteur(ConsultantRecruteurDTO consultantRecruteur)
    {
        consultantsRecruteurs.add(consultantRecruteur);
    }

    @Override
    public void modifierConsultantRecruteur(ConsultantRecruteurDTO consultantRecruteur)
    {
        ConsultantRecruteurDTO consultantRecruteurFiltre = this.trouverConsultantRecruteur(consultantRecruteur.getName());

        if (consultantRecruteurFiltre != null)
        {
            int indexConsultantRecruteur = consultantsRecruteurs.indexOf(consultantRecruteurFiltre);
            consultantsRecruteurs.set(indexConsultantRecruteur, consultantRecruteur);
        }
    }
}
