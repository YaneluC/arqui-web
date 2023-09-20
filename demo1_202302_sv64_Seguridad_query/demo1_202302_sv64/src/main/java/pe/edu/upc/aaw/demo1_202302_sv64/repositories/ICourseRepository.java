package pe.edu.upc.aaw.demo1_202302_sv64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aaw.demo1_202302_sv64.entities.Course;

import java.util.List;

public interface ICourseRepository extends JpaRepository<Course, Integer> {
    @Query(value = "select u.name_university,count(c.id_course)\n" +
            "\n" +
            " from university u inner join course c\n" +
            "\n" +
            " on u.id_university=c.id_university\n" +
            "\n" +
            " group by u.name_university",nativeQuery = true)
    public List<String[]> quantityCoursesByUniversity();
}
