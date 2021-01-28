package com.mphasis.instructor_app.service;

import com.mphasis.instructor_app.model.Course;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ICourseService {
//    @Query("INSERT INTO course(`username`,`description`) VALUES(?1,?2)")
    public Course insertCourse(Course course);

//    @Query("SELECT * FROM course")
    public List<Course> getAllCourses();

//    @Query("SELECT c FROM course c WHERE c.id = ?1")
    public Optional<Course> getCourseByID(int id);

//    @Query("UPDATE course SET description = ?1 WHERE id = ?2")
    Course updateCourse(Course course);

//    @Query("DELETE FROM course WHERE id = ?1")
    void deleteById(int id);
}
