package com.example.demo.Services;

import com.example.demo.Entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class courseServiceImpl implements service {
    List<Courses>list;
    public courseServiceImpl(){
        list= new ArrayList<>();
        list.add( new Courses(1,"doramon","cartoon"));
        list.add( new Courses(2,"ninja","cartoon"));
    }

    @Override
    public List<Courses> allCourses(){
        return list;
    }

    @Override
    public Courses oneCourse(long findID) {
        for (Courses course:list){

            if(course.getID()==findID){
                return course;
            }

        }
        return null;


    }
}
