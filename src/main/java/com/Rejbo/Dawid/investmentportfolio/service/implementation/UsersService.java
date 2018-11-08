package com.Rejbo.Dawid.investmentportfolio.service.implementation;

import com.Rejbo.Dawid.investmentportfolio.model.Users;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UsersService implements IUsersService {
    private IHibernateSessionFactoryService sessionFactoryService;

    public UsersService (IHibernateSessionFactoryService sessionFactoryService){
        this.sessionFactoryService = sessionFactoryService;
    }



    @Override
    public void saveUsers(Users users) {
        Session session = this.sessionFactoryService.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(users);
        transaction.commit();
        session.close();


    }

    @Override
    public Users getUsersById(int id) {
        Session session = this.sessionFactoryService.getSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Users.class);
        criteria.add(Restrictions.eq("id", id));
        Users users = (Users) criteria.uniqueResult();

        transaction.commit();
        session.close();
        return users;
    }

    }

