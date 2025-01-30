package org.ManyToMany;

import org.OneToMany.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory fac = cfg.configure().buildSessionFactory();
        Session s = fac.openSession();

        // Fetching Data
        Project p = s.get(Project.class,2424);
        System.out.println("Project ID: "+p.getpId());
        System.out.println("Project Name: "+p.getpName());
        System.out.println("Associated Employees:");
        p.getEmp().forEach(emp -> System.out.println(emp.geteId()+" "+emp.geteName()));

        Project p2 = s.get(Project.class,4151);
        System.out.println("Project ID: "+p2.getpId());
        System.out.println("Project Name: "+p2.getpName());
        System.out.println("Associated Employees:");
        p2.getEmp().forEach(emp -> System.out.println(emp.geteId()+" "+emp.geteName()));

}
}

