package com.example.demo.Services;
import com.example.demo.Entities.Courses;

import java.util.List;


public interface service {
    public List <Courses> allCourses();
    public Courses oneCourse(long findID);

}