package com.mphasis.instructor_app.controller;

import com.mphasis.instructor_app.model.Course;
import com.mphasis.instructor_app.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
@RestController
public class CourseController {
    @Autowired
    ICourseService courseService;
//    CoursesHardcodedService courseManagementService;

    @PostMapping("/instructors/{username}/courses")
    public ResponseEntity<Void> createCourse(@PathVariable String username, @RequestBody Course course) {

//        System.out.println("id= " + course.getId());
        Course createdCourse = courseService.insertCourse(course);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdCourse.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseService.getAllCourses();
    }

    @GetMapping("/instructors/{username}/courses/{id}")
    public Optional<Course> getAllCourses(@PathVariable String username, @PathVariable long id) {
        return courseService.getCourseByID((int) id);
    }


    @DeleteMapping("/instructors/{username}/courses/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String username, @PathVariable int id) {

        courseService.deleteById(id);

//        if (course != null) {
//            return ResponseEntity.noContent().build();
//        }

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/instructors/{username}/courses/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable int id, @RequestBody Course course) {

        return new ResponseEntity<>(courseService.updateCourse(course), HttpStatus.OK);
    }
}
