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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iD;
    private int icome;
    private int dailyExpenses;
    private String nameStock;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

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

    @Override
    public String toString() {
        return "UsersInvestments{" +
                "iD=" + iD +
                ", icome=" + icome +
                ", dailyExpenses=" + dailyExpenses +
                ", nameStock='" + nameStock + '\'' +
                ", valueStock=" + valueStock +
                ", nameBonds='" + nameBonds + '\'' +
                ", valueBonds=" + valueBonds +
                '}';
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

    private int valueStock;
    private String nameBonds;
    private int valueBonds;

}
