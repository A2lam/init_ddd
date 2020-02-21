package model.salle;

import common.dto.entretien.CreneauEntretienDTO;
import common.dto.salle.CreneauSalleDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

class CreneauSalle
{
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public CreneauSalle(LocalDateTime dateTime, HeureSalle duree)
    {
        this.date = dateTime.toLocalDate();
        this.heureDebut = dateTime.toLocalTime();
        this.heureFin = this.heureDebut.plusHours(duree.getNbHeure());
    }

    public CreneauSalle(CreneauSalleDTO creneauSalleDTO){
        this.date = creneauSalleDTO.getDate();
        this.heureDebut = creneauSalleDTO.getHeureDebut();
        this.heureFin = creneauSalleDTO.getHeureFin();
    }

    public LocalDate getDate()
    {
        return date;
    }

    public LocalTime getHeureDebut()
    {
        return heureDebut;
    }

    public LocalTime getHeureFin()
    {
        return heureFin;
    }

    @Override
    public boolean equals(Object c)
    {
        if (this == c)
            return true;

        if (c == null || getClass() != c.getClass())
            return false;

        CreneauSalle creneau = (CreneauSalle) c;

        return Objects.equals(date, creneau.date) &&
            Objects.equals(heureDebut, creneau.heureDebut) &&
            Objects.equals(heureFin, creneau.heureFin);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(date, heureDebut, heureFin);
    }
}
