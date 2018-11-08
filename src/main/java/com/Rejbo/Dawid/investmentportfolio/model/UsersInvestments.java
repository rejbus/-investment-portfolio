package com.Rejbo.Dawid.investmentportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inwestycje")
public class UsersInvestments {

    public int getIcome() {
        return icome;
    }

    public void setIcome(int icome) {
        this.icome = icome;
    }

    public int getDailyExpenses() {
        return dailyExpenses;
    }

    public void setDailyExpenses(int dailyExpenses) {
        this.dailyExpenses = dailyExpenses;
    }

    public String getNameStock() {
        return nameStock;
    }

    public void setNameStock(String nameStock) {
        this.nameStock = nameStock;
    }

    public int getValueStock() {
        return valueStock;
    }

    public void setValueStock(int valueStock) {
        this.valueStock = valueStock;
    }

    public String getNameBonds() {
        return nameBonds;
    }

    public void setNameBonds(String nameBonds) {
        this.nameBonds = nameBonds;
    }

    public int getValueBonds() {
        return valueBonds;
    }

    public void setValueBonds(int valueBonds) {
        this.valueBonds = valueBonds;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    @Id
    @GeneratedValue
    private int iD;
    private int icome;
    private int dailyExpenses;
    private String nameStock;
    private int valueStock;
    private String nameBonds;
    private int valueBonds;

}
