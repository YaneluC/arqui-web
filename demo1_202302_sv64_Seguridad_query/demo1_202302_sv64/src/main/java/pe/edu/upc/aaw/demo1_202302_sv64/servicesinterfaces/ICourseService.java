package pe.edu.upc.aaw.demo1_202302_sv64.servicesinterfaces;

import pe.edu.upc.aaw.demo1_202302_sv64.entities.Course;

import java.util.List;

public interface ICourseService {
    public void insert(Course course);
    public List<Course> list();
    public List<String[]> quantityCoursesByUniversity();


}
