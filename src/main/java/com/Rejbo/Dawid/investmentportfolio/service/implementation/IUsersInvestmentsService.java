package com.Rejbo.Dawid.investmentportfolio.service.implementation;

import com.Rejbo.Dawid.investmentportfolio.model.UsersInvestments;

public interface IUsersInvestmentsService {
    void saveUserInvestments (UsersInvestments usersInvestments);
    UsersInvestments getUsetsInvestById (int id);
}
