package com.company;

import com.company.enums.EnumRole;
import com.company.enums.Permission;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        String gun = "PAZARTESI";
//
//        System.out.println(gun);
//
//        System.out.println(HaftaninGunler.PAZARTESI);
//        System.out.println(HaftaninGunler.PAZARTESI.getDeger());


        List<Users> usersList = new ArrayList<>();

        List<Permission> userPersmisions = new ArrayList<>();
        userPersmisions.add(Permission.UPDATE_USER);
        userPersmisions.add(Permission.READ_USER);
        userPersmisions.add(Permission.DELETE_USER);


        Users user = new Users();
        user.setUsername("mnozturk");
        user.setPassword("12");
        user.setRole(EnumRole.MODERATOR);
        user.setPermissionList(userPersmisions);
        usersList.add(user);


        Users user2 = new Users();
        user2.setUsername("hkan");
        user2.setPassword("54");
        user2.setRole(EnumRole.ADMIN);
        usersList.add(user2);


        Users user3 = new Users();
        user3.setUsername("bba");
        user3.setPassword("6547");
        user3.setRole(EnumRole.USER);
        usersList.add(user3);

        Users user4 = new Users();
        user4.setUsername("kka");
        user4.setPassword("65a74sd");
        user4.setRole(EnumRole.DEVELOPER);
        usersList.add(user4);


        for (Users users : usersList) {
            System.out.println(users.getUsername());
            System.out.println(users.getRole().getDisplayValue());
            if (users.getPermissionList().size() > 0) {
                for (Permission permission : users.getPermissionList()) {
                    System.out.println(permission);
                }
            }
        }



    }
}
