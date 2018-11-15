package com.Rejbo.Dawid.investmentportfolio.service.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryService implements IHibernateSessionFactoryService {

    private SessionFactory sessionFactory;
    public HibernateSessionFactoryService(){
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public Session getSession(){
        return this.sessionFactory.openSession();
    }
}
