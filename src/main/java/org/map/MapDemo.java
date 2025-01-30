package org.map;


import com.beust.ah.A;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fac = cfg.buildSessionFactory();
        // Object of Question
        Question q = new Question();
        q.setQuestionId(243);
        q.setQuestion("What is Java?");
        // Object of Answer
        Answer ans = new Answer();
        ans.setAnswerId(343);
        ans.setAnswer("Java is a Programming Language.");
        ans.setQue(q);

        q.setAns(ans);

        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is Collection?");
        // Object of Answer
        Answer ans1 = new Answer();
        ans1.setAnswerId(2424);
        ans1.setAnswer("API to work with objects in Java");
        ans1.setQue(q1);

        q1.setAns(ans1);

        // Session
        Session s = fac.openSession();
        s.save(q);
        s.save(ans);
        s.save(q1);
        s.save(ans1);
        // Transaction
        Transaction tx = s.beginTransaction();
        tx.commit();
        // Fetching
        Question qu = (Question) s.get(Question.class,243);
        System.out.println("Q1-> "+qu.getQuestion());
        System.out.println("Ans-> "+qu.getAns().getAnswer());
        Question qu1 = (Question) s.get(Question.class,1212);
        System.out.println("Q1-> "+qu1.getQuestion());
        System.out.println("Ans-> "+qu1.getAns().getAnswer());



        s.close();
        fac.close();
    }
}
