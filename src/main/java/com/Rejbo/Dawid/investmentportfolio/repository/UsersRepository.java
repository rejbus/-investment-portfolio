package com.Rejbo.Dawid.investmentportfolio.repository;

import com.Rejbo.Dawid.investmentportfolio.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
