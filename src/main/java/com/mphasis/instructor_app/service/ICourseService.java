package com.mphasis.instructor_app.service;

import com.mphasis.instructor_app.model.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseService {
    public Course insertCourse(Course course);
    public List<Course> getAllCourses();

    public Optional<Course> getCourseByID(int id);

    Course updateCourse(Course course);

    void deleteById(int id);
}
