package com.alexspring.alexboot;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table

public class student {
    @Id
    @SequenceGenerator (
        name = "student_sequence",
        sequenceName = "student_name",
        allocationSize = 1
    )
    private Long id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String email;

    public student(Long id, String name,
                   LocalDate dob, String email,
                    Integer age) {
                        this.id = id;
                        this.name = name;
                        this.dob = dob;
                        this.email = email;
                    }
    
    public student(String name, LocalDate dob,
                   String email, Integer age) {
                        this.name = name;
                        this.dob = dob;
                        this.email = email;                   
                   } 
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public LocalDate getdob() {
        return dob;
    }

    public void setdob(LocalDate dob) {
        this.dob = dob;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + 
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob + 
                ", age=" + age + 
                '}';
    }

}
