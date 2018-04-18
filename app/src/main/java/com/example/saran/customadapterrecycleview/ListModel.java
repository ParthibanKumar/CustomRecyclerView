package com.example.saran.customadapterrecycleview;

public class ListModel
{
    String name;
    String email;

    public ListModel(String s, String s1, String s2) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    String gender;
    int logo;

    public ListModel(String name, String email, String gender, int logo) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.logo = logo;
    }





}



