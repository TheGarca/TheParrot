package com.theparrot.Model.Interfaces;

import com.theparrot.Model.Course;
import java.util.List;

public interface ImplementCourse{
    
    public void insert(Course course);
    
    public void update(Course course);
    
    public void delete(int id);
    
    public List<Course> getCourseByName(String name);
    
    public List<Course> getAllCourse();
    
    public Course getOneCourse(int id);
}