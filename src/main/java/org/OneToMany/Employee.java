package org.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String employeeName;
    private String position;
    @ManyToOne()
    private Department dept;

    // Constructors


    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String position, Department dept) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
        this.dept = dept;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
