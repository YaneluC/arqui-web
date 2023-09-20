package pe.edu.upc.aaw.demo1_202302_sv64.dtos;

import pe.edu.upc.aaw.demo1_202302_sv64.entities.University;

public class CourseDTO {
    private int idCourse;
    private String nameCourse;
    private int creditsCourse;
    private String typeCourse;

    private int semesterCourse;
    private University university;

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getCreditsCourse() {
        return creditsCourse;
    }

    public void setCreditsCourse(int creditsCourse) {
        this.creditsCourse = creditsCourse;
    }

    public String getTypeCourse() {
        return typeCourse;
    }

    public void setTypeCourse(String typeCourse) {
        this.typeCourse = typeCourse;
    }

    public int getSemesterCourse() {
        return semesterCourse;
    }

    public void setSemesterCourse(int semesterCourse) {
        this.semesterCourse = semesterCourse;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
