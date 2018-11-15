package com.Rejbo.Dawid.investmentportfolio.DAO;

import com.Rejbo.Dawid.investmentportfolio.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
@Component
public class UsersDAO {
    private SessionFactory sessionFactory;

    public void addUser(Users users){
        Session session = sessionFactory.getCurrentSession();
            session.save(users);
        }
    }


