package common.dto.salle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class CreneauSalleDTO
{
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public CreneauSalleDTO(LocalDateTime dateTime, HeureSalleDTO duree)
    {
        this.date = dateTime.toLocalDate();
        this.heureDebut = dateTime.toLocalTime();
        this.heureFin = this.heureDebut.plusHours(duree.getNbHeure());
    }

    public CreneauSalleDTO(LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public LocalTime getHeureDebut()
    {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut)
    {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin()
    {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin)
    {
        this.heureFin = heureFin;
    }

    @Override
    public boolean equals(Object c)
    {
        if (this == c)
            return true;

        if (c == null || getClass() != c.getClass())
            return false;

        CreneauSalleDTO creneau = (CreneauSalleDTO) c;

        return Objects.equals(date, creneau.date) &&
                Objects.equals(heureDebut, creneau.heureDebut) &&
                Objects.equals(heureFin, creneau.heureFin);
    }
}
