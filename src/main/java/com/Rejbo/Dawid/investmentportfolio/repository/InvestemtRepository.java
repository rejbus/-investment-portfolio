package com.Rejbo.Dawid.investmentportfolio.repository;

import com.Rejbo.Dawid.investmentportfolio.model.UsersInvestments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface InvestemtRepository extends JpaRepository<UsersInvestments, Integer> {
}
