package com.douggschwind.example.jsonbean;

/**
 * Only used when attempting to register a new User with the system.
 */
public class NewUserJsonBean {
    private String emailAddress;
    private String plainTextPassword;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPlainTextPassword() {
        return plainTextPassword;
    }

    public void setPlainTextPassword(String plainTextPassword) {
        this.plainTextPassword = plainTextPassword;
    }
}
