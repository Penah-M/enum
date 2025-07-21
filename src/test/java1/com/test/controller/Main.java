package test.java1.com.test.controller;

import test.java1.com.test.model.User;
import test.java1.com.test.model.UserRole;

public class Main {
    public static void main(String[] args) {
        User user1 =new User("Nicat", UserRole.USER);
        User user2 =new User("hesen", UserRole.MODERAATOR);
        User user3=new User("Ferman", UserRole.ADMIN);

        user1.show();
        System.out.println("-----");
        user2.show();
        System.out.println("-----");

        user3.show();
        System.out.println("-----");

    }
}
