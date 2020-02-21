package model.entretien;

import common.dto.entretien.CreneauDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

class Creneau
{
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public Creneau(LocalDateTime dateTime, Heure duree)
    {
        this.date = dateTime.toLocalDate();
        this.heureDebut = dateTime.toLocalTime();
        this.heureFin = this.heureDebut.plusHours(duree.getNbHeure());
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

        Creneau creneau = (Creneau) c;

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
