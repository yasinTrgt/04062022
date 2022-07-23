package com.company;

import com.company.dao.UserDao;
import com.company.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        UserEntity kullanici1 = new UserEntity();
        kullanici1.setUsername("ahmet");
        kullanici1.setPassword("9999");

        UserDao userDao = new UserDao();
//        userDao.insertUser(kullanici1);

//        userDao.deleteUser(1L);
        List<UserEntity> userEntityList =  userDao.getAllUsers();

        for (UserEntity user : userEntityList) {
            System.out.println(user.getId());
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        }

        userDao.updateUser(kullanici1, 2L);


        List<UserEntity> userEntityList2 =  userDao.getAllUsers();

        for (UserEntity user : userEntityList2) {
            System.out.println(user.getId());
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        }

        UserEntity user = userDao.findById(2L);
        System.out.println(user);

    }
}
