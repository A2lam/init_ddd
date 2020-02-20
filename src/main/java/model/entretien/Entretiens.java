package model.entretien;

import java.util.UUID;

public interface Entretiens
{
    /**
     * Progremmer un nouvel entretien
     * @param entretien
     */
    public void creerEntretien(Entretien entretien);

    /**
     * Trouver un entretien
     * @return
     */
    public Entretien trouverEntretien(UUID uuid);

    /**
     * Modifie un entretien
     * @param entretien
     */
    public void modifierEntretien(Entretien entretien);
}
