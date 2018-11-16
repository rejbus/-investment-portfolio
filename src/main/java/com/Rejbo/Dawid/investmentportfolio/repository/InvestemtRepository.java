package com.Rejbo.Dawid.investmentportfolio.repository;

import com.Rejbo.Dawid.investmentportfolio.model.UsersInvestments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface InvestemtRepository extends CrudRepository<UsersInvestments, Integer> {
}
