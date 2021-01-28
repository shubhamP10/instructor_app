//package com.mphasis.instructor_app;
//
//import com.mphasis.instructor_app.model.Course;
//import com.mphasis.instructor_app.repository.ICourseRepository;
//import com.mphasis.instructor_app.service.ICourseService;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import java.util.List;
//
//@DataJpaTest
//class InstructorAppApplicationTests {
//
//	@Autowired
//	private ICourseService courseRepository;
//	Course course1, course2;
//	private List<Course> courseList;
//
//	@BeforeEach
//	void setUp() {
//		course1.setDescription("Learn Java From Test1");
//		course1.setUsername("Test1");
//
//		course2.setDescription("Learn Java From Test2");
//		course2.setUsername("Test2");
//
//		courseRepository.insert(course1.getUsername(), course1.getDescription());
//		courseRepository.insert(course2.getUsername(), course2.getDescription());
//	}
//
//	@AfterEach
//	void tearDown() {
//		courseRepository.deleteAll();
//	}
//
//	@Test
//	void retrieveAllDataFromTable() {
//		courseList = courseRepository.getAllCourses();
//		courseList.forEach(System.out::println);
//	}
//
//}
