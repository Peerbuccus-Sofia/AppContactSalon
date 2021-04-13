package com.example.appcontactsalon;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Inscription implements Serializable {
    private Integer id;
    private String firstname;
    private String lastame;
    private SimpleDateFormat birthdate;
    private String adress;
    private String city;
    private Integer postalcode;
    private String phone;
    private String mobilephone;
    private String email;
    private String chosencourse;
    private String lastdiploma;
    private String coursetype;

    public Inscription(Integer id, String firstname, String lastame, SimpleDateFormat birthdate, String adress, String city, Integer postalcode, String phone, String mobilephone, String email, String chosencourse, String lastdiploma, String coursetype) {
        this.id = id;
        this.firstname = firstname;
        this.lastame = lastame;
        this.birthdate = birthdate;
        this.adress = adress;
        this.city = city;
        this.postalcode = postalcode;
        this.phone = phone;
        this.mobilephone = mobilephone;
        this.email = email;
        this.chosencourse = chosencourse;
        this.lastdiploma = lastdiploma;
        this.coursetype = coursetype;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastame() {
        return lastame;
    }

    public void setLastame(String lastame) {
        this.lastame = lastame;
    }

    public SimpleDateFormat getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(SimpleDateFormat birthdate) {
        this.birthdate = birthdate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChosencourse() {
        return chosencourse;
    }

    public void setChosencourse(String chosencourse) {
        this.chosencourse = chosencourse;
    }

    public String getLastdiploma() {
        return lastdiploma;
    }

    public void setLastdiploma(String lastdiploma) {
        this.lastdiploma = lastdiploma;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }
}
