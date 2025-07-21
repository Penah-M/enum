package test.java1.com.test.model;

import test.java1.com.test.config.PermissionFactory;
import test.java1.com.test.service.PermissionService;

public class User {
    private String name;
    private UserRole role;


    public void show(){
        PermissionService permissionService= PermissionFactory.getPermission(role);
        System.out.println("Istifadeci adi"+name+" Rolu"+ role);
        permissionService.printPermissions();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public User(String name, UserRole role){
        this.name=name;
        this.role=role;
    }
}
