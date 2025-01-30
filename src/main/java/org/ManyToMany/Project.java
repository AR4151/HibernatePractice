package org.ManyToMany;

import org.OneToMany.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Project {
    @Id
    private int pId;
    private String pName;
    @ManyToMany(mappedBy = "projects")
    private List<Emp> emp;

    public Project() {
    }

    public Project(int pId, String pName, List<Emp> emp) {
        this.pId = pId;
        this.pName = pName;
        this.emp = emp;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<Emp> getEmp() {
        return emp;
    }

    public void setEmp(List<Emp> emp) {
        this.emp = emp;
    }
}
