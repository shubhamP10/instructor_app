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


//    private static List<Course> courses = new ArrayList<>();
//    private static long idCounter = 0;
//
//    static {
//        courses.add(new Course(++idCounter, "shubham", "Learn Full stack with Spring Boot and Angular"));
//        courses.add(new Course(++idCounter, "shubham", "Learn Full stack with Spring Boot and React"));
//        courses.add(new Course(++idCounter, "shubham", "Master Microservices with Spring Boot and Spring Cloud"));
//        courses.add(new Course(++idCounter, "shubham",
//                "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
//    }
//
//    /**
//     * Returns All Courses From List
//     * */
//    public List<Course> findAll() {
//        Collections.sort(courses, Comparator.comparingLong(Course::getId));
//        return courses;
//    }
//
//    public Course deleteById(long id) {
//        Course course = findById(id);
//
//        if (course == null)
//            return null;
//
//        if (courses.remove(course)) {
//            return course;
//        }
//
//        return null;
//    }
//
//    public Course findById(long id) {
//        return courses.stream().filter(course -> course.getId() == id).findFirst().orElse(null);
//    }
//
//    public Course save(Course course) {
//        if (course.getId() == -1 || course.getId() == 0) {
//            course.setId(++idCounter);
//            courses.add(course);
//        } else {
//            deleteById(course.getId());
//            courses.add(course);
//        }
//        return course;
//    }
}