package model.entretien;

import common.dto.entretien.*;
import org.dozer.DozerBeanMapper;

public class Mapper {

    private static DozerBeanMapper mapper = new DozerBeanMapper();

    public static HeureDTO HeureToHeureDTO(Heure heure){
        return mapper.map(heure, HeureDTO.class);
    }

    public static Heure HeureDTOToHeure(HeureDTO heure){
        return mapper.map(heure, Heure.class);
    }

    public static CandidatDTO CandidatToCandidatDTO(Candidat candidat){
        return mapper.map(candidat, CandidatDTO.class);
    }

    public static Candidat CandidatDTOToCandidat(CandidatDTO candidatDTO){
        return mapper.map(candidatDTO, Candidat.class);
    }

    public static CreneauDTO CreneauToCreneauDTO(Creneau Creneau){
        return mapper.map(Creneau, CreneauDTO.class);
    }

    public static Creneau CreneauDTOToCreneau(CreneauDTO CreneauDTO){
        return mapper.map(CreneauDTO, Creneau.class);
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
