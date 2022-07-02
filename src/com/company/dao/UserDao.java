package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
    }

    public User search(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> sentList(){
        return userList;
    }

    public void remove(User user) {
        userList.remove(user);
    }
}