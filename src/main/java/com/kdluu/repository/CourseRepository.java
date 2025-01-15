package com.kdluu.repository;

import com.kdluu.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByName(String name);
    List<Course> findByDescription(String description);

    List<Course> findByTopicId(String topicId);
}
