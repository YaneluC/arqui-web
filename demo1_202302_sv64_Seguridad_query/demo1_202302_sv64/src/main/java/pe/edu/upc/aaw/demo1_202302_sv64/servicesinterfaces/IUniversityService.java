package pe.edu.upc.aaw.demo1_202302_sv64.servicesinterfaces;

import pe.edu.upc.aaw.demo1_202302_sv64.entities.University;

import java.time.LocalDate;
import java.util.List;

public interface IUniversityService {
    public void insert(University university);
    public List<University> list();
    public void delete(int idUniversity);
    public University listarId(int idUniversity);
    List<University> findByCreationDateUniversity(LocalDate creationDateUniversity);
    List<String[]> creditsByUniversity();

}
