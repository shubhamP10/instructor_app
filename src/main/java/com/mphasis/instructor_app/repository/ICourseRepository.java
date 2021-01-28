package com.mphasis.instructor_app.repository;

import com.mphasis.instructor_app.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Integer> {
//    @Query("INSERT INTO course(`username`,`description`) VALUES(?1,?2)")
//    public Course insert(String username, String description);
//
//    @Query("SELECT * FROM course")
//    public List<Course> getAllCourses();
}
