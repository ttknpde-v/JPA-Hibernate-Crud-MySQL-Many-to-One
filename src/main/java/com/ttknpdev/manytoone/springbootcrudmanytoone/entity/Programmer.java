package com.ttknpdev.manytoone.springbootcrudmanytoone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/* Define Data Model for <<JPA One to Many mapping>> */
@NoArgsConstructor
@Entity
@Table(name = "programmers")
public class Programmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pgm_id")
    @Setter
    @Getter
    private Long pgmId;
    @Column(name = "pgm_fullname")
    @Setter
    @Getter
    private String pgmFullname;
    @Column(name = "pgm_salary")
    @Setter
    @Getter
    private Double pgmSalary;
    @Column(name = "pgm_level")
    @Setter
    @Getter
    private Character pgmLevel ;
    @Column(name = "pgm_experience")
    @Setter
    @Getter
    private Short pgmExperience;
    @Column(name = "currentdatetime")
    @Setter
    @Getter
    private String currentDatetime = String.format(dateFormat().format(new Date()));

    public Programmer(String pgmFullname, Double pgmSalary, Character pgmLevel, Short pgmExperience) {
        this.pgmFullname = pgmFullname;
        this.pgmSalary = pgmSalary;
        this.pgmLevel = pgmLevel;
        this.pgmExperience = pgmExperience;
    }

    private DateFormat dateFormat() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat;
    }


    /*    public static void main(String[] args) {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                System.out.println(dateFormat.format(date));

    }*/
}
