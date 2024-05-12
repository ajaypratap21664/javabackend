package com.example.demo.Controllers;

import com.example.demo.Entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.Services.service;

@RestController
public class controller {
    @Autowired
    private service courseservices;
    @GetMapping("/Hello")
    public String getOneCourse(){

        return "hello god";
    }
    @GetMapping("/Courses")
    public List<Courses> allCourses(){
        return this.courseservices.allCourses();
    }
    @GetMapping("/oneCourse/{ID}")
    public Courses oneCourse(@PathVariable long ID){
        return this.courseservices.oneCourse(ID);
    }


}
