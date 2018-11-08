package com.Rejbo.Dawid.investmentportfolio.service.implementation;

import com.Rejbo.Dawid.investmentportfolio.model.Users;

public interface IUsersService {
    void saveUsers(Users users);
    Users getUsersById (int id);
    }

