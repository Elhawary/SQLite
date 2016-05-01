package com.example.bassemsarhan.sql_lit;

/**
 * Created by Bassem Sarhan on 26-Jan-16.
 */
public class contact {

    String ID;
    String name ;
    String phone;

    public contact(String ID, String name, String phone) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
