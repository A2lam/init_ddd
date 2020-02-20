package infrastructure.entretien;

import model.entretien.Entretien;
import model.entretien.Entretiens;

import java.util.ArrayList;
import java.util.UUID;

public class EntretienList implements Entretiens
{
    static ArrayList<Entretien> entretiens = new ArrayList<>();

    @Override
    public void creerEntretien(Entretien entretien)
    {
        // TODO : Implémenter les verifs par rapport aux disponibilités
        entretiens.add(entretien);
    }

    @Override
    public Entretien trouverEntretien(UUID uuid)
    {
        return entretiens
                .stream()
                .filter(entretienInList -> entretienInList.getEntretienID().getUuid().equals(uuid))
                .findAny()
                .orElse(null);
    }

    @Override
    public void modifierEntretien(Entretien entretien)
    {
        Entretien entretiensFiltre = this.trouverEntretien(entretien.getEntretienID().getUuid());

        if (entretiensFiltre != null)
        {
            int indexEntretien = entretiens.indexOf(entretiensFiltre);
            entretiens.set(indexEntretien, entretien);
        }
    }
}
