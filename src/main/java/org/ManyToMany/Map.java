package org.ManyToMany;

import org.OneToMany.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Map {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fac = cfg.buildSessionFactory();

        // Object of Project
        Project p1 = new Project();
        p1.setpName("ChatBot");
        p1.setpId(2424);

        Project p2 = new Project();
        p2.setpId(4151);
        p2.setpName("Healthcare");

        // Object of Emp
        Emp e1 = new Emp();
        e1.seteId(101);
        e1.seteName("Jai");

        Emp e2 = new Emp();
        e2.seteId(105);
        e2.seteName("Veer");

        Emp e3 = new Emp();
        e3.seteId(110);
        e3.seteName("Shyam");

        List<Project> list1 = new ArrayList<>();
        List<Emp> list2 = new ArrayList<>();
        List<Project> list3 = new ArrayList<>();
        List<Emp> list4 = new ArrayList<>();

        list1.add(p1);
        list2.add(e1);
        list2.add(e2);

        p1.setEmp(list2);
        e1.setProjects(list1);
        //e2.setProjects(list1);
        List<Project> veerProjects = new ArrayList<>();
        veerProjects.add(p1); // ChatBot
        veerProjects.add(p2); // Healthcare
        e2.setProjects(veerProjects); // Veer associated with both projects

        //list3.add(p1);
        list3.add(p2);
        list4.add(e2);
        list4.add(e3);
        p2.setEmp(list4);
        //e2.setProjects(list3);
        e3.setProjects(list3);

        // Session
        Session s = fac.openSession();
        s.save(p1);
        s.save(p2);
        s.save(e1);
        s.save(e2);
        s.save(e3);
        Transaction tx = s.beginTransaction();
        tx.commit();


        fac.close();
        s.close();


    }

}


