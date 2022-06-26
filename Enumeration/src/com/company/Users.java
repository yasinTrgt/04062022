package com.company;

import com.company.enums.EnumRole;
import com.company.enums.Permission;

import java.util.List;

public class Users {

    private String username;
    private String password;
    private EnumRole role;
    private List<Permission> permissionList;

    public Users() {
    }

    public Users(String username, String password, EnumRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EnumRole getRole() {
        return role;
    }

    public void setRole(EnumRole role) {
        this.role = role;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", permissionList=" + permissionList +
                '}';
    }
}
