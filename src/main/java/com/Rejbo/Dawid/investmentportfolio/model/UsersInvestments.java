package com.Rejbo.Dawid.investmentportfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "inwestycje")
public class UsersInvestments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iD;
    private int icome;
    private int dailyExpenses;
    private String nameStock;
    private int valueStock;
    private String nameBonds;
    private int valueBonds;

}
