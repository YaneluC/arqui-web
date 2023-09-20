package pe.edu.upc.aaw.demo1_202302_sv64.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demo1_202302_sv64.dtos.CourseDTO;
import pe.edu.upc.aaw.demo1_202302_sv64.dtos.CoursesUniversityDTO;
import pe.edu.upc.aaw.demo1_202302_sv64.entities.Course;
import pe.edu.upc.aaw.demo1_202302_sv64.servicesinterfaces.ICourseService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos")
public class CourseController {
    @Autowired
    private ICourseService cS;

    @PostMapping
    public void registrar(@RequestBody CourseDTO dto) {
        ModelMapper m = new ModelMapper();
        Course c = m.map(dto, Course.class);
        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CourseDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CourseDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidadcursos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CoursesUniversityDTO> cantidadCursosPorUniversidad() {
        List<String[]> lista = cS.quantityCoursesByUniversity();
        List<CoursesUniversityDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            CoursesUniversityDTO dto = new CoursesUniversityDTO();
            dto.setNameUniversity(data[0]);
            dto.setQuantityCourses(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
