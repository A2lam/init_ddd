package use_case.entretien;

import common.dto.entretien.EntretienDTO;
import infrastructure.entretien.EntretienList;
import model.entretien.Entretien;
import model.entretien.Entretiens;
import model.entretien.Mapper;

import java.util.Map;
import java.util.UUID;

public class AnnulerEntretien
{
    Entretiens entretiens;

    public AnnulerEntretien()
    {
        this.entretiens = new EntretienList();
    }

    public void annuler(UUID uuid, String raison)
    {
        EntretienDTO entretienDTO = entretiens.trouverEntretien(uuid);
        Entretien entretien = Mapper.EntretienDTOToEntretien(entretienDTO);
        entretien.annuler(raison);
        entretienDTO = Mapper.EntretienToEntretienDTO(entretien);
        entretiens.modifierEntretien(entretienDTO);
    }
}
