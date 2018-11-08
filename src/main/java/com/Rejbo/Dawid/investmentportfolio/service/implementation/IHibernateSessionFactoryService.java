package com.Rejbo.Dawid.investmentportfolio.service.implementation;

import org.hibernate.Session;

public interface IHibernateSessionFactoryService {
    Session getSession();
}
