package com.mphasis.instructor_app.service;

import com.mphasis.instructor_app.model.Course;
import com.mphasis.instructor_app.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CoursesHardcodedService implements ICourseService {

    @Autowired
    ICourseRepository courseRepository;

    @Transactional
    @Override
    public Course insertCourse(Course course) {
        System.out.println("ID = " + course.getId());
        if (!courseRepository.existsById(course.getId()))
            return courseRepository.save(course);

        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseByID(int id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseRepository.deleteById(id);
    }
}