package com.company.service;

import com.company.model.User;

import java.util.List;


public interface UserService {
   void userAdd(User user);
   void searchId(int id);
   void removeId(int id);
   void getAllUsers();
}
