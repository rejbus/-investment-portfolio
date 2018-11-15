package com.Rejbo.Dawid.investmentportfolio.service;

import com.Rejbo.Dawid.investmentportfolio.model.Users;
import com.Rejbo.Dawid.investmentportfolio.repository.UsersRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class IusersService implements UserDetailsService {
    private UsersRepository usersRepository;

    public IusersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public Users loadUsersById (Integer id) throws UsernameNotFoundException {
        Optional<Users> users = usersRepository.findById(id);
        return new Users(users.getLogin);


    }
}
