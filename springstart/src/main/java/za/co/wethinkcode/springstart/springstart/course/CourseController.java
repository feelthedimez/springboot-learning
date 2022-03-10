package za.co.wethinkcode.springstart.springstart.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable("id") String topicId) {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses")
    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
