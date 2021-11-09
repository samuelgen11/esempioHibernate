package com.javawebtutor;
 
import org.hibernate.Session;
 
public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        User user = new User();
 
        user.setUserId(1000);
 
        session.save(user);
        session.getTransaction().commit();
 
    }
 
}