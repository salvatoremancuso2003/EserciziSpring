package co.develhope.Esercizio14.entities;

import javax.persistence.*;

@Entity
@Table
public class ProgrammingLanguages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int yearOfFirstAppearance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguages(Long id, String name, int yearOfFirstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.yearOfFirstAppearance = yearOfFirstAppearance;
        this.inventor = inventor;
    }

    public ProgrammingLanguages() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFirstAppearance() {
        return yearOfFirstAppearance;
    }

    public void setYearOfFirstAppearance(int yearOfFirstAppearance) {
        this.yearOfFirstAppearance = yearOfFirstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
