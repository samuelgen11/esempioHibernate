package com.javawebtutor;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
 
public class Test {
    public static void main(String[] args) {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = entityManagerFactory.createEntityManager();
          
         em.getTransaction().begin();
         User user = new User();
         user.setUserId(5000);
         System.out.println("COMIITING");
         em.persist(user);
         em.getTransaction().commit();
    }
 
}