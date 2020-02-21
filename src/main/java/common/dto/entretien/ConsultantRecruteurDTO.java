package common.dto.entretien;

public class ConsultantRecruteurDTO
{
    private String name;
    private String specialite;
    private int yearOfXP;

    public ConsultantRecruteurDTO(String name, String specialite, int yearOfXP)
    {
        this.name = name;
        this.specialite = specialite;
        this.yearOfXP = yearOfXP;
    }

    public ConsultantRecruteurDTO() { }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSpecialite()
    {
        return specialite;
    }

    public void setSpecialite(String specialite)
    {
        this.specialite = specialite;
    }

    public int getYearOfXP()
    {
        return yearOfXP;
    }

    public void setYearOfXP(int yearOfXP)
    {
        this.yearOfXP = yearOfXP;
    }
}
