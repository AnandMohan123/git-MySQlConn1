package com.mySqlConn.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "Seq_No")
    private Integer Seq_No;
    
    @Column(name = "Employee_Name")
    private String Employee_Name;
    
    @Column(name = "Emplyee_Age")
    private String Emplyee_Age;
    
    @Column(name = "Emplyee_Salary")
    private Integer Emplyee_Salary;

    public Users() {
    }

    public Integer getId() {
        return Seq_No;
    }

    public void setId(Integer Seq_No) {
        this.Seq_No = Seq_No;
    }

    public String getName() {
        return Employee_Name;
    }

    public void setName(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }

    public String getTeamName() {
        return Emplyee_Age;
    }

    public void setTeamName(String Emplyee_Age) {
        this.Emplyee_Age = Emplyee_Age;
    }

    public Integer getSalary() {
        return Emplyee_Salary;
    }

    public void setSalary(Integer Emplyee_Salary) {
        this.Emplyee_Salary = Emplyee_Salary;
    }
}
