package src.Enums;

import src.UserSystem.Manager;
import src.UserSystem.Teacher;

public enum Role {
    ADMIN("admin", null),
    STUDENT("student", null),
    TEACHER("teacher", Teacher.class),
    MANAGER("manager", Manager.class),
    EMPLOYEE("employee", null),
    LIBRARIAN("librarian", null),
    TECH_SUPPORT("tech_support", null);

    private final String roleName;
    private final Class<?> associatedClass;

    Role(String roleName, Class<?> associatedClass) {
        this.roleName = roleName;
        this.associatedClass = associatedClass;
    }

    public String getRoleName() {
        return roleName;
    }

    public Class<?> getAssociatedClass() {
        return associatedClass;
    }

    public static Role of(String roleName) {
        for (Role role : Role.values()) {
            if (role.getRoleName().equalsIgnoreCase(roleName)) {
                return role;
            }
        }
        return null;
    }
}
