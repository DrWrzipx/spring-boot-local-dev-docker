package com.trantorinc.springbootlocaldevdocker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Getter
@EqualsAndHashCode
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String lastName;
    public String firstName;
    public String title;
    
    public String department;

    public Employee(String firstName, String lastName, String title, String deparment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.department = deparment;
    }
}
