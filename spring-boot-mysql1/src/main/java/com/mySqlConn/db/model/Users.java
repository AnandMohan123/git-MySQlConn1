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
    
    @Column(name = "Employee_Age")
    private String  Employee_Age;
    
    @Column(name = "Employee_Salary")
    private Integer Employee_Salary;

    public Users() {
    }

    public Integer getSeq_No() {
        return Seq_No;
    }

    public void setSeq_No(Integer Seq_No) {
        this.Seq_No = Seq_No;
    }

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public void setEmployee_Name(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }

    public String getEmployee_Age() {
        return Employee_Age;
    }

    public void setEmployee_Age(String Employee_Age) {
        this.Employee_Age = Employee_Age;
    }

    public Integer getEmployee_Salary() {
        return Employee_Salary;
    }

    public void setEmployee_Salary(Integer Employee_Salary) {
        this.Employee_Salary = Employee_Salary;
    }
}