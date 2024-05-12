package com.example.demo.Entities;

public class Courses {
    private long ID;
    private String Title;
    private String Description;

    public Courses(long ID, String Title, String Description) {
        super();
        this.ID = ID;
        this.Title=Title;
        this.Description=Description;
    }
    public Courses(){
        super();

    }

    public String getDescription() {
        return Description;
    }

    public long getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
