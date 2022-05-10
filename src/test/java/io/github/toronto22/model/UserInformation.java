package io.github.toronto22.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserInformation {
    private String firstName;
    private String lastname;
    private String code;

    public UserInformation(String firstName, String lastname, String code) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
