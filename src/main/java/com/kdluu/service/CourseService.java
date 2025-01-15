package com.kdluu.service;

import com.kdluu.model.Course;
import com.kdluu.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){
        return new ArrayList<>(courseRepository.findByTopicId(topicId));
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course Course) {
        courseRepository.save(Course);
    }

    public void updateCourse(Course newCourse){
        courseRepository.save(newCourse);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }
}
