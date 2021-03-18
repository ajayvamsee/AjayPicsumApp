package com.example.samplepicsumapp;

public class CourseModal {

    // variables for our course
    // name and description.
    private String authurName;
    private String authorimg;


    // creating constructor for our variables.
    public CourseModal(String authurName, String authorimg) {
        this.authurName = authurName;
        this.authorimg = authorimg;

    }

    // creating getter and setter methods.
    public String getAuthurName() {
        return authurName;
    }

    public void setAuthurName(String courseName) {
        this.authurName = courseName;
    }

    public String getAuthorimg() {
        return authorimg;
    }

    public void setAuthorimg(String courseimg) {
        this.authorimg = courseimg;
    }


}
