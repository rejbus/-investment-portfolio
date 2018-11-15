package com.Rejbo.Dawid.investmentportfolio.repository;

import com.Rejbo.Dawid.investmentportfolio.model.Users;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserRepository {

    private UsersRepository usersRepository;

    public UserRepository(UsersRepository usersRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.usersRepository = usersRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    private BCryptPasswordEncoder bCryptPasswordEncoder;
@PostMapping("sign")
    public void sinUP(@RequestBody Users users){
    users.setPass(bCryptPasswordEncoder.encode(users.getPass()));
    usersRepository.save(users);

}
}
