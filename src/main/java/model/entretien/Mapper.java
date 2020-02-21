package model.entretien;

import common.dto.entretien.*;
import common.dto.salle.SalleDTO;
import model.salle.Salle;
import org.dozer.DozerBeanMapper;

public class Mapper {

    private static DozerBeanMapper mapper = new DozerBeanMapper();

    public static HeureEntretienDTO HeureToHeureDTO(HeureEntretien heure){
        return mapper.map(heure, HeureEntretienDTO.class);
    }

    public static HeureEntretien HeureDTOToHeure(HeureEntretienDTO heure){
        return mapper.map(heure, HeureEntretien.class);
    }

    public static CandidatDTO CandidatToCandidatDTO(Candidat candidat){
        return mapper.map(candidat, CandidatDTO.class);
    }

    public static Candidat CandidatDTOToCandidat(CandidatDTO candidatDTO){
        return mapper.map(candidatDTO, Candidat.class);
    }

    public static CreneauEntretienDTO CreneauToCreneauDTO(CreneauEntretien Creneau){
        return mapper.map(Creneau, CreneauEntretienDTO.class);
    }

    public static CreneauEntretien CreneauDTOToCreneau(CreneauEntretienDTO CreneauEntretienDTO){
        return mapper.map(CreneauEntretienDTO, CreneauEntretien.class);
    }

    public static ConsultantRecruteurDTO ConsultantRecruteurToConsultantRecruteurDTO(ConsultantRecruteur ConsultantRecruteur){
        return mapper.map(ConsultantRecruteur, ConsultantRecruteurDTO.class);
    }

    public static ConsultantRecruteur ConsultantRecruteurDTOToConsultantRecruteur(ConsultantRecruteurDTO ConsultantRecruteurDTO){
        return mapper.map(ConsultantRecruteurDTO, ConsultantRecruteur.class);
    }

    public static EntretienDTO EntretienToEntretienDTO(Entretien Entretien){
        return mapper.map(Entretien, EntretienDTO.class);
    }

    public static Entretien EntretienDTOToEntretien(EntretienDTO EntretienDTO){
        return mapper.map(EntretienDTO, Entretien.class);
    }

    public static SalleDTO SalleToSalleDTO(Salle Salle){
        return mapper.map(Salle, SalleDTO.class);
    }

    public static Salle SalleDTOToSalle(SalleDTO SalleDTO){
        return mapper.map(SalleDTO, Salle.class);
    }
}
