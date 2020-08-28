package com.example.demo;


import javax.persistence.*;

@Entity
@Table(name="Dm_Clinic_Master")
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="clinic_name")
    private String clinic_name;

    @Column(name="no_of_beds")
    private long no_of_beds;

    @Column(name="no_of_doctors")
    private long no_of_doctors;

    @Column(name="description")
    private String description;


    public Clinic(String clinic_name, long no_of_beds, long no_of_doctors, String description) {
        this.clinic_name = clinic_name;
        this.no_of_beds = no_of_beds;
        this.no_of_doctors = no_of_doctors;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClinic_name() {
        return clinic_name;
    }

    public void setClinic_name(String clinic_name) {
        this.clinic_name = clinic_name;
    }

    public long getNo_of_beds() {
        return no_of_beds;
    }

    public void setNo_of_beds(long no_of_beds) {
        this.no_of_beds = no_of_beds;
    }

    public long getNo_of_doctors() {
        return no_of_doctors;
    }

    public void setNo_of_doctors(long no_of_doctors) {
        this.no_of_doctors = no_of_doctors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
