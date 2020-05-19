/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Boris
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            //Crea el SessionFactory desde el archivo de configuracion estándar (hibernate.cfg.xml)

            sessionFactory = new AnnotationConfiguration().configure("/configuracion/hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            //Lanza la excepción
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
