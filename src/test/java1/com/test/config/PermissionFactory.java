package test.java1.com.test.config;

import test.java1.com.test.model.UserRole;
import test.java1.com.test.service.PermissionService;
import test.java1.com.test.service.impl.AdminPermissionImpl;
import test.java1.com.test.service.impl.ModeratorPermissionImpl;
import test.java1.com.test.service.impl.UserPermissionImpl;

public class PermissionFactory {
    public static PermissionService getPermission(UserRole role){
        return switch (role){
            case ADMIN -> new AdminPermissionImpl();
            case MODERAATOR -> new ModeratorPermissionImpl();
            case USER ->  new UserPermissionImpl();
        };




    }
}
