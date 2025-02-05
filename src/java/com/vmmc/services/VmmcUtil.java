/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import org.hibernate.HibernateException;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author System Devoloper
 */
public class VmmcUtil {
 private static SessionFactory sessionFactory =  buildSessionFactory();
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory buildSessionFactory() {
        try {
            
            Configuration configuration = new Configuration();
            configuration.configure();
            //Use config file path explicitly 
            //configuration.configure("hibernate/hibernate.cfg.xml");
            serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration
                    .buildSessionFactory(serviceRegistry);
            return sessionFactory;
            
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory "
                    + "creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}
