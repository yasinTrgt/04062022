package com.company.enums;

public enum EnumRole {

    ADMIN("Admin"),
    MODERATOR("Moderator"),
    USER("User"),
    DEVELOPER("Developer");


    private String displayValue;

    EnumRole(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
