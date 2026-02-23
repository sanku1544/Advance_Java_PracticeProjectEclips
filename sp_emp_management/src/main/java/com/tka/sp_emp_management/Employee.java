package com.tka.sp_emp_management;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Employee {

    @Id
    private int eid;
    private String name;
    private String role;
    private LocalDate dateOfJoining;  // CORRECT TYPE
    private int salary;

    public Employee() { }

    public Employee(int eid, String name, String role, LocalDate dateOfJoining, int salary) {
        this.eid = eid;
        this.name = name;
        this.role = role;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getDateOfJoining() {   // FIXED
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) { // FIXED
        this.dateOfJoining = dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", role=" + role + 
               ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
    }
}