package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/*
*Session session = fac.openSession();: Opens a new Hibernate session.
Transaction tx = session.beginTransaction();: Begins a transaction.
session.save(d);: Saves the Demo object to the database.
tx.commit();: Commits the transaction to persist the data.
session.close();: Closes the session to free resources.
fac.close();: Closes the SessionFactory when no further database operations are expected.
*
*
* public class StandardServiceRegistryBuilder {
    public static final String DEFAULT_CFG_RESOURCE_NAME = "hibernate.cfg.xml";
 In this class the default name for configuration file.so if you don't provide config file name then this class
 *  by default provide above name.But if you are giving another name then you have to configure it.
 */

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        //cfg.configure("hibernate.cfg.xml");
        cfg.configure();

        SessionFactory fac = cfg.buildSessionFactory();
        System.out.println(fac);
        // Creating Object of Student Class
        //Student s = new Student(101,"Raj",18);
        //Student s = new Student(103,"Yash",26);
        Student s = new Student(103,"Roshan",25);
        System.out.println(s);
        // Creating Object of Address Class
        Address ad = new Address();
        ad.setCity("Pune");
        ad.setStreet("Kohinoor Road Park");
        ad.setSociety("Charbhuja Villa");
        ad.setOpen(true);
        ad.setX(1234.525);
        ad.setAddDate(new Date());
        System.out.println(ad);

        Session ses = fac.openSession();
        Transaction tx = ses.beginTransaction();
        ses.save(s);
        ses.save(ad);

        tx.commit();
        fac.close();
        ses.close();

    }
}
