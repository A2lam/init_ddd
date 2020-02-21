package model.entretien;

import common.dto.entretien.CreneauEntretienDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

class CreneauEntretien
{
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public CreneauEntretien(LocalDateTime dateTime, HeureEntretien duree)
    {
        this.date = dateTime.toLocalDate();
        this.heureDebut = dateTime.toLocalTime();
        this.heureFin = this.heureDebut.plusHours(duree.getNbHeure());
    }

    public CreneauEntretien(CreneauEntretienDTO creneauEntretienDTO){
        this.date = creneauEntretienDTO.getDate();
        this.heureDebut = creneauEntretienDTO.getHeureDebut();
        this.heureFin = creneauEntretienDTO.getHeureFin();
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

        CreneauEntretien creneau = (CreneauEntretien) c;

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
