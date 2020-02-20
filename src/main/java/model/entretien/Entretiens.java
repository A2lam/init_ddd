package model.entretien;

import common.dto.entretien.EntretienDTO;

import java.util.UUID;

public interface Entretiens
{
    /**
     * Progremmer un nouvel entretien
     * @param entretien
     */
    public void creerEntretien(EntretienDTO entretien);

    /**
     * Trouver un entretien
     * @return
     */
    public EntretienDTO trouverEntretien(UUID uuid);

    /**
     * Modifie un entretien
     * @param entretien
     */
    public void modifierEntretien(EntretienDTO entretien);
}
