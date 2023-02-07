package com.example.demo.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Employee {
    
    @Id
    //@GenericGenerator(name="emp_id", strategy="ackage com.example.demo.customgenerator")
    //@GeneratedValue(generator="emp_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;

    private String name;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
