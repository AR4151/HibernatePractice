package org.example;


//import javax.security.auth.login.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/*get() and load() method*/
public class FetchData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fac = cfg.buildSessionFactory();
        Session ses = fac.openSession();
        Student st = (Student) ses.get(Student.class, 103);
        Student st1 = (Student) ses.get(Student.class, 103);
        //Student st1 = (Student) ses.get(Student.class, 10);

        Student stt =  ses.load(Student.class, 103);
        Student stt1 = ses.load(Student.class, 103);
        //Student stt1 = (Student) ses.load(Student.class, 10);
//        System.out.println(st.getName() +" "+st.getAge());
//        System.out.println(st);
//        System.out.println(st1);
//        System.out.println(st1.getName() +" "+st.getAge());
        //System.out.println(st1.getAge());
        /* get() method */
        /*System.out.println(st.getName() +" "+st.getAge());
        System.out.println(st1.getName() +" "+st1.getAge());*/

        /* load() method */
        System.out.println(stt.getName() +" "+stt.getAge());
        System.out.println(stt1.getName() +" "+stt1.getAge());



    }
}
