package za.co.wethinkcode.springstart.springstart.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }
}
