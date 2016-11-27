package com.devcolibri;

import com.devcolibri.entity.User;
import com.devcolibri.persistense.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by Админ on 25.11.2016.
 */
public class EnterPoint {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Alexander");
        user.setLastName("Barchuk");

        session.save(user);
        session.getTransaction().commit();
    }

}
