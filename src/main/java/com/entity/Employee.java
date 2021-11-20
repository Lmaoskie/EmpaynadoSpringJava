package com.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employees")
@Data
public class Employee {

    private int Id;
    private String name;
    private String location;
    private String department;

    public Employee (int id, int name, int location, int department)
    {
        Id = id;
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }





}
