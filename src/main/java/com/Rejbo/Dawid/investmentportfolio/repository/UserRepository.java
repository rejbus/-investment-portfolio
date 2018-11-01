package com.Rejbo.Dawid.investmentportfolio.repository;

import com.Rejbo.Dawid.investmentportfolio.model.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;

public class UserRepository {
    private static ArrayList<Users> usersList = new ArrayList<>();
    public static Connection connection = null;

    public static void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                UserRepository.connection = DriverManager.getConnection("jdbc:mysql://localhost/portfel-inwestycyjny?user=root&password=");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }


    }

    public static void usersAdd(Users users) {
        UserRepository.usersList.add(users);
    }

    public static boolean usersAuthenticate(Users users) {
        for (Users usersDB : usersList) {
            if (usersDB.getLogin().equals(usersDB.getPass())
                    && usersDB.getPass().equals(users.getPass())) {
                return true;


            }


        }
        return false;

    }
    public static void dataUsers (){
        Users u1 = new Users();
        u1.setLogin("admin");
        u1.setPass(("admin"));

        Users u2 = new Users();
        u2.setLogin("konto premium");
        u2.setPass("konto premium");

        Users u3 = new Users();
        u3.setLogin("user");
        u3.setPass("user");

        UserRepository.usersAdd(u1);
        UserRepository.usersAdd(u2);
        UserRepository.usersAdd(u3);

    }
}
