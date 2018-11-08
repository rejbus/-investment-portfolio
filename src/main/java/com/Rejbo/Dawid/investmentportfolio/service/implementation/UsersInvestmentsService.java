package com.Rejbo.Dawid.investmentportfolio.service.implementation;

import com.Rejbo.Dawid.investmentportfolio.model.UsersInvestments;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class UsersInvestmentsService implements IUsersInvestmentsService {
    private IHibernateSessionFactoryService sessionFactoryService;

    private UsersInvestmentsService (IHibernateSessionFactoryService sessionFactoryService){
        this.sessionFactoryService = sessionFactoryService;
    }

    @Override
    public void saveUserInvestments(UsersInvestments usersInvestments) {
        Session session = this.sessionFactoryService.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(usersInvestments);
        transaction.commit();
        session.close();

    }

    @Override
    public UsersInvestments getUsetsInvestById(int id) {
        Session session = this.sessionFactoryService.getSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<UsersInvestments> query = criteriaBuilder.createQuery(UsersInvestments.class);

        Root<UsersInvestments> root = query.from(UsersInvestments.class);

        query.select(root).where(criteriaBuilder.equal(root.get("id"), id));

        Query<UsersInvestments> q = session.createQuery(query);
        UsersInvestments usersInvestments = q.getSingleResult();

        transaction.commit();
        session.close();
        return usersInvestments;

    }
}
