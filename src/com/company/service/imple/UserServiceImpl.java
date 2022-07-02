package com.company.service.imple;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();

    @Override
    public void userAdd(User user) {
        userDao.addUser(user);
    }

    @Override
    public void searchId(int userIdSearch) {
       if (!yesOrNo(userIdSearch)) {
           try {
               throw new RuntimeException("мындай id жок: " + userIdSearch);
           }catch (RuntimeException e) {
               System.out.println(e.getMessage());
           }
       }
       User user = userDao.search(userIdSearch);
        System.out.println(user);
    }

    @Override
    public void removeId(int id) {
        if (!yesOrNo(id)) {
            try {
                throw new RuntimeException("мындай id жок: " + id);
            }catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        User user = userDao.search(id);
        userDao.remove(user);
    }

    @Override
    public void getAllUsers() {
        userDao.sentList().forEach(System.out::println);
    }

    public boolean yesOrNo(int id) {
        for (User user : userDao.sentList()) {
            if (user.getId() == id){
                return true;
            }
        }
        return false;
    }
}
