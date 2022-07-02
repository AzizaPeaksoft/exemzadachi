package com.company;

import com.company.dao.UserDao;
import com.company.model.Gender;
import com.company.model.User;
import com.company.service.imple.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Datka", 20, Gender.FEMALE);
        User user2 = new User(2, "Mavlyan", 23, Gender.MALE);
        User user3 = new User(3, "Beksultan", 20, Gender.MALE);

        UserServiceImpl userService = new UserServiceImpl();
        userService.userAdd(user1);
        userService.userAdd(user2);
        userService.userAdd(user3);

        System.out.println("найти по ID 1: ");
        userService.searchId(1);
        System.out.println("Вывести все Users: ");
        userService.getAllUsers();
        System.out.println("Удалить user c помощью ID 2");
        userService.removeId(2);
        userService.getAllUsers();
    }
}
