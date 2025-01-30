package org.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class MapDept {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fac = cfg.buildSessionFactory();
        // Department Object
        Department dep = new Department();
        dep.setDepartmentId(101);
        dep.setDepartmentName("IT");
        // Employee Object
        Employee emp = new Employee();
        emp.setDept(dep);
        emp.setEmployeeId(1001);
        emp.setEmployeeName("Roshan Alte");
        emp.setPosition("Junior Developer");

        Employee emp1 = new Employee();
        emp1.setDept(dep);
        emp1.setEmployeeId(1005);
        emp1.setEmployeeName("Rohan Jadhav");
        emp1.setPosition("Ass.DevOps Engg.");

        List<Employee> list = new ArrayList<Employee>();
        list.add(emp);
        list.add(emp1);

        dep.setEmp(list);

        // Session
        Session s = fac.openSession();

        s.save(dep);
        s.save(emp);
        s.save(emp1);
        // Fetching
        Department dt = (Department) s.get(Department.class,101);
        System.out.println(dt.getDepartmentName());
        for(Employee e : dt.getEmp()){
            System.out.println(e.getEmployeeName());
        }

        // Transaction
        Transaction tx = s.beginTransaction();
        tx.commit();

        s.close();
        fac.close();
    }
}
