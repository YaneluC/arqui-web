package pe.edu.upc.aaw.demo1_202302_sv64.entities;

import javax.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCourse;
    @Column(name = "nameCourse",nullable = false,length = 45)
    private String nameCourse;
    @Column(name = "creditsCourse",nullable = false)
    private int creditsCourse;
    @Column(name = "typeCourse",nullable = false,length = 45)
    private String typeCourse;
    @Column(name = "semesterCourse",nullable = false)
    private int semesterCourse;
    @ManyToOne
    @JoinColumn(name = "idUniversity")
    private University university;

    public Course() {
    }

    public Course(int idCourse, String nameCourse, int creditsCourse, String typeCourse, int semesterCourse, University university) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.creditsCourse = creditsCourse;
        this.typeCourse = typeCourse;
        this.semesterCourse = semesterCourse;
        this.university = university;
    }

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
